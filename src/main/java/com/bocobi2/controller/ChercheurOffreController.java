package com.bocobi2.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bocobi2.dao.OffreEmploiDAO;
import com.bocobi2.model.OffreEmploi;

@Controller
public class ChercheurOffreController{

	@Autowired
	OffreEmploiDAO offreEmploiDAO;

	@RequestMapping(value = "/trouver_une_offre", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest req){
		List<OffreEmploi> offreEmplois = offreEmploiDAO.listeOffres();

		req.setAttribute("listeOffres", offreEmplois);

		req.setAttribute("cdd", "ok");
		req.setAttribute("cdi", "ok");
		req.setAttribute("freelance", "ok");
		req.setAttribute("stage", "ok");

		return "chercheur/liste_offres";
	}

	@RequestMapping(value = "/recherche", method = RequestMethod.POST)
	public String recherche(Model model, HttpServletRequest req){
		String category = req.getParameter("categorie");
		String location = req.getParameter("location");
		String cdd = req.getParameter("cdd");
		String cdi = req.getParameter("cdi");
		String freelance = req.getParameter("freelance");
		String stage = req.getParameter("stage");

		List<OffreEmploi> offreEmplois = offreEmploiDAO.rechercheOffre(category, location, cdd != null ? "CDD" : "",
				cdi != null ? "CDI" : "", freelance != null ? "FREELANCE" : "", stage != null ? "STAGE" : "");

		req.setAttribute("listeOffres", offreEmplois);
		req.setAttribute("category", category);
		req.setAttribute("location", location);

		if (cdd != null)
			req.setAttribute("cdd", cdd);
		if (cdi != null)
			req.setAttribute("cdi", cdi);
		if (freelance != null)
			req.setAttribute("freelance", freelance);
		if (stage != null)
			req.setAttribute("stage", stage);

		return "chercheur/liste_offres";
	}

	@RequestMapping(value = "/rechercheCle", method = RequestMethod.POST)
	public String rechercheCle(Model model, HttpServletRequest req)
	{
		String keyword = req.getParameter("keyword");

		List<OffreEmploi> offreEmplois = offreEmploiDAO.rechercheOffreCle(keyword);

		req.setAttribute("listeOffres", offreEmplois);
		req.setAttribute("keyword", keyword);

		return "chercheur/liste_offres";
	}

	/*
	 * @RequestMapping(value = "/rechercheV", method = RequestMethod.POST) public
	 * String rechercheV(Model model, HttpServletRequest req) { String location =
	 * req.getParameter("location");
	 * 
	 * List<OffreEmploi> offreEmplois =
	 * offreEmploiDAO.listeOffresParVille(location);
	 * 
	 * req.setAttribute("listeOffres", offreEmplois);
	 * 
	 * return "chercheur/liste_offres"; }
	 */

	@RequestMapping(value = "/details_offre", method = RequestMethod.GET)
	public String details(Model model, HttpServletRequest req){
		try
		{
			int id = Integer.valueOf(req.getParameter("id")).intValue();

			OffreEmploi offre = offreEmploiDAO.details(id);

			req.setAttribute("offre", offre);

			return "chercheur/details";
		} catch (Exception e)
		{
			e.printStackTrace();
			return "/";
		}

	}

	@RequestMapping(value = "/mes_cvs", method = RequestMethod.GET)
	public String mesCV(Model model)	{
		return "chercheur/mesCVs";
	}

	@RequestMapping(value = "/mes_demandes", method = RequestMethod.GET)
	public String mesDemandes(Model model){
		return "chercheur/mes_offres";
	}
}
