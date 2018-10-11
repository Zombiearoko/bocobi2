package com.bocobi2.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.bocobi2.dao.ChercheurEmploiDAO;
import com.bocobi2.dao.InternauteDAO;
import com.bocobi2.dao.OffreurEmploiDAO;
import com.bocobi2.model.ChercheurEmploi;
import com.bocobi2.model.Internaute;

/**
 * This controller routes accesses to the application to the appropriate hanlder
 * methods.
 * 
 * @author www.codejava.net
 *
 */
@Controller
public class ConnectionController
{
	public static final Logger	logger	= LoggerFactory.getLogger(RegistrationController.class);
	@Autowired
	ChercheurEmploiDAO			chercheurEmploiDAO;
	@Autowired
	OffreurEmploiDAO			offreurEmploiDAO;
	@Autowired
	InternauteDAO				internauteDAO;
	@Autowired
	UserDetailsService			userDetailsService;

	@RequestMapping(value = "/connection", method = RequestMethod.GET)
	public String index(Model model)
	{
		return "connection";
	}

	@RequestMapping(value = "/deconnection", method = RequestMethod.GET)
	public String logout(Model model, HttpServletRequest req)
	{
		req.setAttribute("logout_ok", 1);
		return "connection";
	}

	@RequestMapping(value = "/connection", method = RequestMethod.POST)
	public String login(Model model, HttpServletRequest req, @RequestParam("login") String login,
			@RequestParam("motdepasse") String motdepasse)
	{
		if (login.equals("true") && motdepasse.equals("true"))
		{
			return "registration";
		} else
		{
			req.setAttribute("error", "errordf");
			req.setAttribute("oldLogin", login);
			return "connection";
		}
	}

	@RequestMapping(value = { "/connectionChercheurEmploi" }, method = RequestMethod.POST)
	public String login(Model model, @ModelAttribute("loginChercheurEmploi") ChercheurEmploi chercheurEmploi,
			HttpServletRequest req)
	{
		System.out.println("connexion  d'un chercheur d'emploie");
		String login = req.getParameter("login");
		String password = req.getParameter("motdepasse");
		System.out.println("-------------------------------");
		System.out.println(login);
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println(password);
		// recherche du membre dans la base de donnees
		try
		{
			System.out.println("c'est le try");
			Internaute internaute = new Internaute();
			internaute = internauteDAO.findByLogin(login);
			System.out.println(internaute);
			req.setAttribute("oldLogin", login);
			if (internaute != null)
			{
				if (password.equals(internaute.getPassword()))
				{
					System.out.println("deuxieme if c'est moi");
					UserDetails users = userDetailsService.loadUserByUsername(login);
					// System.out.println("Humm tu as reussi a me mettre en session tu es forte ma
					// petite 11111111111" + users);
					Authentication authToken = new UsernamePasswordAuthenticationToken(users, null,
							users.getAuthorities());
					// SecurityContextHolder.getContext().setAuthentication(authToken);
					SecurityContextHolder.getContext().setAuthentication(authToken);
					// SecurityContextHolder.getContext().getAuthentication().getPrincipal();
					// Authentication request = new UsernamePasswordAuthenticationToken(users,
					// users.getAuthorities());
					// Authentication result = am.authenticate(request);
					// SecurityContextHolder.getContext().setAuthentication(result);
					Authentication auth = SecurityContextHolder.getContext().getAuthentication();
					if (!(auth instanceof AnonymousAuthenticationToken))
					{
						System.out.println(users.getAuthorities()
								+ " Humm tu as reussi a me mettre en session tu es forte ma petite "
								+ SecurityContextHolder.getContext().getAuthentication().getName());
						model.addAttribute("Administrators", "You have been login successfully."
								+ SecurityContextHolder.getContext().getAuthentication().getName());
						req.setAttribute("succes", "You have been login successfully."
								+ SecurityContextHolder.getContext().getAuthentication().getName());
						return "/";
					}
					return "connection";
				} else
				{
					logger.error("Administrator with password {} not found. ", password);
					model.addAttribute("errorPassword", "Password not found.");
					req.setAttribute("errorLogin", "Password not found.");
				}
			} else
			{
				logger.error("User with login {} not found.", login);
				model.addAttribute("errorLogin", "login not found, user " + login + " doesn't exist");
				req.setAttribute("errorLogin", "login not found, user " + login + " doesn't exist");
			}
		} catch (Exception ex)
		{
			logger.error("User with login {} not found.", login);
			model.addAttribute("errorLogin", "login not found, user " + login + " doesn't exist");
			req.setAttribute("errorLogin", "login not found, user " + login + " doesn't exist");
		}
		System.out.println("ma petite laisse tomber c'est pas a ton niveau ma fille");
		// return "redirect:/administratorHome";
		return "connection";
	}
}
