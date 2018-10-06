package com.bocobi2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChercheurOffreController
{
	@RequestMapping(value = "/trouver_une_offre", method = RequestMethod.GET)
	public String index(Model model)
	{
		return "chercheur/liste_offres";
	}

	@RequestMapping(value = "/details_offre", method = RequestMethod.GET)
	public String details(Model model)
	{
		return "chercheur/details";
	}
}
