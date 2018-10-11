package com.bocobi2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bocobi2.dao.InternauteDAO;

/**
 * This controller routes accesses to the application to the appropriate hanlder
 * methods.
 * 
 * @author www.codejava.net
 *
 */
@Controller
public class HomeController
{

	@Autowired
	InternauteDAO internauteDAO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model)
	{
		return "index";
	}

}
