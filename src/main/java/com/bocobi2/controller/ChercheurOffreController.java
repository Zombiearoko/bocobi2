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
public class ChercheurOffreController
{

	@Autowired
	OffreEmploiDAO offreEmploiDAO;

	@RequestMapping(value = "/trouver_une_offre", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest req)
	{
		String category = req.getParameter("category");

		List<OffreEmploi> offreEmplois = offreEmploiDAO.listeOffres();

		req.setAttribute("listeOffres", offreEmplois);

		return "chercheur/liste_offres";
	}

	@RequestMapping(value = "/details_offre", method = RequestMethod.GET)
	public String details(Model model, HttpServletRequest req)
	{
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
	public String mesCV(Model model)
	{
		return "chercheur/mesCVs";
	}

	@RequestMapping(value = "/mes_demandes", method = RequestMethod.GET)
	public String mesDemandes(Model model)
	{
		return "chercheur/mes_offres";
	}
}
