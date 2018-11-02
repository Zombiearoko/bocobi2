package com.bocobi2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bocobi2.model.ChercheurEmploi;
import com.bocobi2.model.OffreurEmploi;

@Controller
public class CompteController
{
	@RequestMapping(value = "/mon_compte", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		ChercheurEmploi chercheur = (ChercheurEmploi) session.getAttribute("current_user");
		if (chercheur != null)
		{
			return "chercheur/personalPage";
		} else
		{
			return "redirect:/mon_compte2";
		}
	}

	@RequestMapping(value = "/infos_chercheur_emploi", method = RequestMethod.GET)
	public String infoChercheur(Model model, HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		ChercheurEmploi chercheur = (ChercheurEmploi) session.getAttribute("current_user");
		if (chercheur != null)
		{
			return "chercheur/account";
		} else
		{
			return "redirect:/mon_compte2";
		}
	}

	@RequestMapping(value = "/infos_offreur_emploi", method = RequestMethod.GET)
	public String infoOffreur(Model model, HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		OffreurEmploi offreur = (OffreurEmploi) session.getAttribute("current_user");
		if (offreur != null)
		{
			return "offreur/account";
		} else
		{
			return "redirect:/mon_compte2";
		}
	}

	@RequestMapping(value = "/mon_compte_offreur", method = RequestMethod.GET)
	public String indexOffreur(Model model, HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		OffreurEmploi offreur = (OffreurEmploi) session.getAttribute("current_user");
		if (offreur != null)
		{
			return "offreur/personalPage";
		} else
		{
			return "redirect:/mon_compte2";
		}
	}

	@RequestMapping(value = "/mon_compte2", method = RequestMethod.GET)
	public String index2(Model model, HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		ChercheurEmploi chercheur = (ChercheurEmploi) session.getAttribute("current_user");
		return "redirect:/";
	}
}
