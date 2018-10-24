package com.bocobi2.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.bocobi2.dao.ChercheurEmploiDAO;
import com.bocobi2.dao.InternauteDAO;
import com.bocobi2.dao.OffreurEmploiDAO;
import com.bocobi2.model.ChercheurEmploi;
import com.bocobi2.model.OffreurEmploi;

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
	InternauteDAO		internauteDAO;

	@Autowired
	ChercheurEmploiDAO	chercheurEmploiDAO;

	@Autowired
	OffreurEmploiDAO	offreurEmploiDAO;

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String index(Model model)
	{
		return "registration";
	}

	@RequestMapping(value = "/registration_12114", method = RequestMethod.POST)
	public String registrationChercheur(Model model, HttpServletRequest req, @RequestParam("nom") String name,
			@RequestParam("prenom") String surname, @RequestParam("sexe") String sex,
			@RequestParam("maritalStatus") String statutMarital, @RequestParam("contactNature") String natureContrat,
			@RequestParam("studyLevel") String niveauEtude, @RequestParam("seniority") String anciennete,
			@RequestParam("timeOfContact") String dureeContratSouhaitee, @RequestParam("login") String login,
			@RequestParam("password") String password, @RequestParam("phone") String telephone,
			@RequestParam("email") String email){
		ChercheurEmploi chercheurEmploi = new ChercheurEmploi(name, surname, sex, statutMarital, natureContrat,
				niveauEtude, anciennete, dureeContratSouhaitee, "CHERCHEUREMPLOI", login, password, telephone, email);
		long j;
		try		{
			j = chercheurEmploiDAO.save(chercheurEmploi);

		} catch (Exception e)		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			req.setAttribute("error", 1);
			req.setAttribute("type", 0);
			return "registration";
		}
		if (j != 0){ // value 1 means that registration succeed.

			req.setAttribute("registration_ok", 1);
			return "connection";
		} else	{
			req.setAttribute("error", 1);
			req.setAttribute("type", 0);
			return "registration";
		}
	}

	@RequestMapping(value = "/registration_12115", method = RequestMethod.POST)
	public String registrationOffreur(Model model, HttpServletRequest req, @RequestParam("raison") String raison,
			@RequestParam("situation_geograpique") String situation_geograpique, @RequestParam("login") String login,
			@RequestParam("mdp") String mdp, @RequestParam("tel") String tel, @RequestParam("mail") String mail,
			@RequestParam("addr") String addr, @RequestParam("desc") String desc){
		OffreurEmploi offreurEmploi = new OffreurEmploi(raison, situation_geograpique, desc, addr, "Offreur Emploi",
				login, mdp, tel, mail);
		int j;
		try	{
			j = offreurEmploiDAO.save(offreurEmploi);

		} catch (Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
			req.setAttribute("error", 1);
			req.setAttribute("type", 1);
			return "registration";
		}		if (j == 1){ // value 1 means that registration succeed.

			req.setAttribute("registration_ok", 1);
			return "connection";
		} else{
			req.setAttribute("error", 1);
			req.setAttribute("type", 1);
			return "registration";
		}
	}

}
