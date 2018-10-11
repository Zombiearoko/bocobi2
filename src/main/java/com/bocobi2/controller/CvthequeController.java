package com.bocobi2.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bocobi2.dao.CVDAO;
import com.bocobi2.model.CV;

@Controller
public class CvthequeController
{
	@Autowired
	CVDAO		cvDAO;

	List<CV>	CVs;

	@RequestMapping(value = "/cv_theque", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest req)
	{
		CVs = cvDAO.list();

		req.setAttribute("CVs", CVs);

		return "offreur/cvtheque";
	}

}
