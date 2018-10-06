package com.bocobi2.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bocobi2.dao.ArticleDAO;




/**
 * This controller routes accesses to the application to the appropriate
 * hanlder methods. 
 * @author www.codejava.net
 *
 */
@Controller
public class HomeController {

	@Autowired
	private ArticleDAO articleDAO;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		System.out.println("c'est le home");
		return "tour-index";
	}
	
}
