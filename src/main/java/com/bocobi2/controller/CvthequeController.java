package com.bocobi2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CvthequeController
{
	@RequestMapping(value = "/cv_theque", method = RequestMethod.GET)
	public String index(Model model)
	{
		return "offreur/cvtheque";
	}

}
