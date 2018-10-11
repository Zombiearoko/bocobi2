package com.bocobi2.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.bocobi2.dao.OffreEmploiDAO;
import com.bocobi2.dao.ProfilDeRechercheDAO;
import com.bocobi2.model.OffreEmploi;
import com.bocobi2.model.ProfilDeRecherche;

/**
 * This controller routes accesses to the application to the appropriate handler
 * methods.
 * 
 * @author www.codejava.net
 *
 */
@Controller
public class OffreEmploiController
{
	@Autowired
	OffreEmploiDAO				offreEmploiDAO;
	@Autowired
	ProfilDeRechercheDAO		profilDeRechercheDAO;

	List<ProfilDeRecherche>		profiles;

	private static final Logger	logger	= LoggerFactory.getLogger(OffreEmploiController.class);

	@RequestMapping(value = "/poster_une_offre", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest req)
	{
		profiles = profilDeRechercheDAO.list();

		req.setAttribute("profiles", profiles);

		return "offreur/nouvelle_offre";
	}

	@RequestMapping(value = "/poster_une_offre", method = RequestMethod.POST)
	public String registration(Model model, @RequestParam("name") String name,
			@RequestParam("location") String location, @RequestParam("type") String type,
			@RequestParam("salary") Integer salary, @RequestParam("file") MultipartFile file,
			@RequestParam("description") String description, @RequestParam("profile") Integer profile)
	{
		try
		{
			byte[] bytes = file.getBytes();

			// Creating the directory to store file
			// String rootPath = System.getProperty("catalina.home");
			// File dir = new File(rootPath + File.separator + "tmpFiles");
			// if (!dir.exists())
			// dir.mkdirs();

			// Create the file on server
			File serverFile = new File("/home/BOCOBI2/src/main/webapp/WEB-INF/logoOffre/" + file.getName());
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
			stream.write(bytes);
			stream.close();

			logger.info("Server File Location=" + serverFile.getAbsolutePath());
		} catch (Exception e)
		{
			e.getMessage();
		}

		OffreEmploi offreEmploi = new OffreEmploi((Integer) 1, name, location, description, type, salary,
				file.getName(), profile, (Integer) 1);
		offreEmploiDAO.save(offreEmploi);
		return "offreur/nouvelle_offre";
	}
}
