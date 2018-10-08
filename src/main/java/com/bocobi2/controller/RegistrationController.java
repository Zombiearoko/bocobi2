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

import com.bocobi2.dao.ChercheurEmploiDAO;
import com.bocobi2.model.ChercheurEmploi;



/**
 * This controller routes accesses to the application to the appropriate hanlder
 * methods.
 * 
 * @author www.codejava.net
 *
 */
@Controller
public class RegistrationController{
	public static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	@Autowired
	ChercheurEmploiDAO chercheurEmploiDAO;
	@Autowired
	UserDetailsService userDetailsService;
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String index(Model model){
		return "registration";
	}
	
	@RequestMapping(value = { "/connectionChercheurEmploi" }, method = RequestMethod.POST)
	public String login(Model model,@ModelAttribute("loginChercheurEmploi") ChercheurEmploi chercheurEmploi, HttpServletRequest req) {
		System.out.println("connexion  d'un chercheur d'emploie");
		String loginChercheurEmploi = req.getParameter("login");
		String passwordChercheurEmploi = req.getParameter("password");
		System.out.println("-------------------------------");
		System.out.println(loginChercheurEmploi);
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println(passwordChercheurEmploi);
		// recherche du membre dans la base de donnees
		try {
			System.out.println("c'est le try");
			ChercheurEmploi chercheurEmploi1 = new ChercheurEmploi();
			chercheurEmploi1 = chercheurEmploiDAO.findByLogin(loginChercheurEmploi);
			System.out.println(chercheurEmploi1);
			if (chercheurEmploi1 != null) {
				if (passwordChercheurEmploi.equals(chercheurEmploi1.getPassword())) {
					System.out.println("deuxieme if c'est moi");
					UserDetails users = userDetailsService.loadUserByUsername(loginChercheurEmploi);
					//System.out.println("Humm tu as reussi a me mettre en session tu es forte ma petite 11111111111" + users);
					Authentication authToken = new UsernamePasswordAuthenticationToken(users, null,
							users.getAuthorities());
					//SecurityContextHolder.getContext().setAuthentication(authToken);
					SecurityContextHolder.getContext().setAuthentication(authToken);
					//SecurityContextHolder.getContext().getAuthentication().getPrincipal();
					Authentication request = new UsernamePasswordAuthenticationToken(users,users.getAuthorities());
			       // Authentication result = am.authenticate(request);
			       // SecurityContextHolder.getContext().setAuthentication(result);
					Authentication auth = SecurityContextHolder.getContext().getAuthentication();
					if (!(auth instanceof AnonymousAuthenticationToken)) {
						System.out.println(users.getAuthorities()+" Humm tu as reussi a me mettre en session tu es forte ma petite " + SecurityContextHolder.getContext().getAuthentication().getName());
						model.addAttribute("Administrators", "You have been login successfully."
								+SecurityContextHolder.getContext().getAuthentication().getName());
						req.setAttribute("succes", "You have been login successfully."
								+SecurityContextHolder.getContext().getAuthentication().getName());
						return "homeAdministrator";
					}
					return "connectionAdministrator";
				} else {
					logger.error("Administrator with password {} not found.", passwordChercheurEmploi);
					model.addAttribute("errorPassword", "Password not found.");
					req.setAttribute("errorPassword", "Password not found.");
				}
			} else {
				logger.error("Administrator with password {} not found.", loginChercheurEmploi);
				model.addAttribute("errorLogin", "login not found, adminstrator"+ loginChercheurEmploi + "doesn't exist");
				req.setAttribute("errorLogin", "login not found, adminstrator"+ loginChercheurEmploi + "doesn't exist");
			}
		} catch (Exception ex) {
			logger.error("Administrator with pseudonym {} not found.", loginChercheurEmploi);
			model.addAttribute("errorLogin", "login not found, adminstrator"+ loginChercheurEmploi + "doesn't exist");
			req.setAttribute("errorLogin", "login not found, adminstrator"+ loginChercheurEmploi + "doesn't exist");
		}
		System.out.println("ma petite laisse tomber c'est pas a ton niveau ma fille" );
		//return "redirect:/administratorHome";
		return "connectionAdministrator";
	}
}
