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
public class RegistrationController{
	@Autowired
	InternauteDAO internauteDAO;
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String index(Model model){
		return "registration";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String regiqtration(Model model,@RequestParam("nom") String name
			,@RequestParam("prenom") String surname
			,@RequestParam("sexe") String sex
			,@RequestParam("maritalStatus") String statutMarital
			,@RequestParam("contactNature") String natureContrat
			,@RequestParam("studyLevel") String niveauEtude
			,@RequestParam("seniority") String anciennete
			,@RequestParam("timeOfContact") String dureeContratSouhaitee
			,@RequestParam("login") String login
			,@RequestParam("password") String motDePass
			,@RequestParam("phone") String telephone
			,@RequestParam("email") String email){
		Internaute internaute=new Internaute(8,"Chercheur Emploi", login,motDePass,telephone,email);
		internauteDAO.save(internaute);
		return "registration";
	}
	
	
}
