package com.bocobi2.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
import com.bocobi2.model.OffreurEmploi;
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

	@RequestMapping(value = "/mes_offres", method = RequestMethod.GET)
	public String mesOffres(Model model, HttpServletRequest req)
	{
		HttpSession session = req.getSession();

		List<OffreEmploi> offreEmplois = offreEmploiDAO
				.maListeOffres(((OffreurEmploi) session.getAttribute("current_user")).getIdOffreurEmploi());

		req.setAttribute("listeOffres", offreEmplois);
		req.setAttribute("cdd", "ok");
		req.setAttribute("cdi", "ok");
		req.setAttribute("freelance", "ok");
		req.setAttribute("stage", "ok");

		return "offreur/mes_offres";
	}

	@RequestMapping(value = "/poster_une_offre", method = RequestMethod.POST)
	public String registration(Model model, HttpServletRequest req, @RequestParam("name") String name,
			@RequestParam("location") String location, @RequestParam("type") String type,
			@RequestParam("salary") Integer salary, @RequestParam("file") MultipartFile file,
			@RequestParam("description") String description, @RequestParam("profile") Integer profile)
	{
		profiles = profilDeRechercheDAO.list();

		req.setAttribute("profiles", profiles);
		String relativeWebPath = "/home/descartes/jee-eclipse-workspace/BOCOBI2/src/main/webapp/resources/images/logoOffre";
		String absoluteDiskPath = req.getServletContext().getRealPath(relativeWebPath);

		// ClassLoader classLoader = getClass().getClassLoader();

		try
		{
			byte[] bytes = file.getBytes();

			// Creating the directory to store file
			// String rootPath = System.getProperty("catalina.home");
			// File dir = new File(rootPath + File.separator + "tmpFiles");
			// if (!dir.exists())
			// dir.mkdirs();
			// ClassLoader classLoader = getClass().getClassLoader();

			// Create the file on server
			String fileName = file.getOriginalFilename();
			String rootPath = System.getProperty("user.dir");
			System.out.println("========================================" + rootPath);

			if (!fileName.isEmpty() && !fileName.equals("") && fileName != null)
			{
				File serverFile = new File(relativeWebPath + System.getProperty("file.separator") + fileName);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Server File Location=" + serverFile.getAbsolutePath());

			} else
			{
				fileName = "shema1.jpg";
			}

			OffreEmploi offreEmploi = new OffreEmploi(name, location, description, type, salary, fileName, profile,
					(Integer) 1);
			offreEmploiDAO.save(offreEmploi);

			return "offreur/nouvelle_offre";

		} catch (Exception e)
		{
			e.printStackTrace();
			req.setAttribute("name", name);
			req.setAttribute("location", location);
			req.setAttribute("type", type);
			req.setAttribute("salary", salary);
			req.setAttribute("description", description);
			req.setAttribute("profileString", profile);
			req.setAttribute("error", "error");
			return "offreur/nouvelle_offre";
		}

	}
}
