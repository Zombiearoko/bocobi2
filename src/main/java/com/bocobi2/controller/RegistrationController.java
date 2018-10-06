package com.bocobi2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This controller routes accesses to the application to the appropriate hanlder
 * methods.
 * 
 * @author www.codejava.net
 *
 */
@Controller
public class RegistrationController
{
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String index(Model model)
	{
		return "registration";
	}
}
