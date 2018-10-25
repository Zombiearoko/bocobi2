package com.bocobi2.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CompteController
{
	@RequestMapping(value = "/mon_compte", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest req)
	{

		return "chercheur/account";
	}
}
