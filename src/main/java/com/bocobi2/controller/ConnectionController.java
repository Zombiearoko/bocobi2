package com.bocobi2.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	@RequestMapping(value = "/connection", method = RequestMethod.GET)
	public String index(Model model)
	{
		return "connection";
	}

	@RequestMapping(value = "/deconnection", method = RequestMethod.GET)
	public String logout(Model model)
	{
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
}
