package com.bocobi2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OffreEmploiController
{
	@RequestMapping(value = "/poster_une_offre", method = RequestMethod.GET)
	public String index(Model model)
	{
		return "offreur/nouvelle_offre";
	}

}
