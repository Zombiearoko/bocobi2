package com.bocobi2.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/retrieve", method = RequestMethod.GET)
	public Object retrieve(String error, String logout, Authentication authenticationg, Principal principal,
			HttpServletRequest request) {
		String userDetails = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println("je suis en session toto " + userDetails);
		/*
		 * if (userDetails instanceof UserDetails) { return ((UserDetails)
		 * userDetails).getUsername(); }
		 */

		return userDetails;

}
	@RequestMapping(value = { "/connectionChercheurEmploi" }, method = RequestMethod.POST)
	public String login(Model model, @RequestParam("login") String login1,
			@RequestParam("motdepasse")String password1,
			HttpServletRequest req)	{
		String login = login1;
		String password = password1.trim();
		try{
			System.out.println("c'est le try");
			Internaute internaute = new Internaute();
			internaute = internauteDAO.findByLogin(login);
			System.out.println(internaute);
			req.setAttribute("oldLogin", login);
			if (internaute != null)			{
				if (password.equals(internaute.getPassword())){
					UserDetails users = userDetailsService.loadUserByUsername(login);
					Authentication authToken = new UsernamePasswordAuthenticationToken(users, null,
							users.getAuthorities());
					SecurityContextHolder.getContext().setAuthentication(authToken);
					Authentication auth = SecurityContextHolder.getContext().getAuthentication();
					if (!(auth instanceof AnonymousAuthenticationToken)){
						logger.info("Connexion Réussie pour {}. ",
								SecurityContextHolder.getContext().getAuthentication().getName());
						model.addAttribute("user", SecurityContextHolder.getContext().getAuthentication().getName());
						req.setAttribute("succes", SecurityContextHolder.getContext().getAuthentication().getName());
						return "chercheur/mesCVs";
					}
					return "chercheur/mesCVs";
				} else{
					logger.error("Internaute with password {} not found. ", password);
					model.addAttribute("errorPassword", "Password not found.");
					req.setAttribute("errorLogin", "Password not found.");
				}
			} else{
				logger.error("User with login {} not found.", login);
				model.addAttribute("errorLogin", "login not found, user " + login + " doesn't exist1");
				req.setAttribute("errorLogin", "login not found, user " + login + " doesn't exist1");
			}
		} catch (Exception ex){
			logger.error("User with login {} not found.", login);
			model.addAttribute("errorLogin", "login not found, user " + login + " doesn't exist2");
			req.setAttribute("errorLogin", "login not found, user " + login + " doesn't exist2");
			ex.printStackTrace();
		}
		System.out.println("ma petite laisse tomber c'est pas a ton niveau ma fille");
		return "connection";
	}
	
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@RequestMapping(value = "/logout", method = RequestMethod.POST)
//	public Map<String, String> logoutMemberPost(HttpServletRequest request, HttpServletResponse response) {
//		
//		Map<String,String> message= new HashMap<>();
//		try {
//			String userDetails = SecurityContextHolder.getContext().getAuthentication().getName();
//			Internaute internaute = internauteDAO.findByLogin(userDetails);
//			Status status = statusRepository.findByStatusName("disconnected");
//			member.setStatus(status);
//			member.setMeetingNameConnexion(null);
//			
//		
//			
//			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//			if (auth != null) {
//
//				memberRepository.save(member);
//				new SecurityContextLogoutHandler().logout(request, response, auth);
//				message.put("Message", "succes");
//				return message;
//			}
//		} catch (Exception ex) {
//			message.put("Message", "failed");
//			return message;
//		}
//		message.put("Message", "failed");
//		return message;
//}
}
