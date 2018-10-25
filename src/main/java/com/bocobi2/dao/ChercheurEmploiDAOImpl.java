package com.bocobi2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import com.bocobi2.model.ChercheurEmploi;
import com.bocobi2.model.Internaute;

public class ChercheurEmploiDAOImpl implements ChercheurEmploiDAO{

	@Autowired 
	InternauteDAO		internauteDAO;
	private JdbcTemplate	jdbcTemplate;

	private String			sqlInternaute		= "INSERT INTO INTERNAUTE (ROLE, LOGIN, PASSWORD, TELEPHONE, EMAIL) VALUES (?, ?, ?, ?, ?)";
	private String			sqlChercheurEmploi	= "INSERT INTO CHERCHEUREMPLOI (IDUTILISATEUR, NOM, PRENOM, SEXE, STATUTMARITAL, NATURECONTRAT, NIVEAUETUDE, ANCIENNETE, DUREECONTRATSOUHAITE, ROLE, LOGIN, PASSWORD, TELEPHONE, EMAIL,CONNECTIONSTATUS) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private ChercheurEmploi	chercheur;

	public ChercheurEmploiDAOImpl(DataSource dataSource){
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public ChercheurEmploi findByLogin(String login)
	{
		chercheur=null;
		// System.out.println("1");
		System.out.println("query preparing1...");
		String sql = "SELECT * FROM CHERCHEUREMPLOI WHERE LOGIN = \"" + login + "\"";

		try{
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

			if (rows.size() != 0)			{
				chercheur = new ChercheurEmploi();
				for (Map row : rows){
					chercheur.setIdChercheurEmploi((int) row.get("IDCHERCHEUREMPLOI"));
					chercheur.setDureeContratSouhaite((String) row.get("DUREECONTRATSOUHAITE"));
					chercheur.setAnciennete((String) row.get("ANCIENNETE"));
					chercheur.setNiveauEtude((String) row.get("NIVEAUETUDE"));
					chercheur.setNatureContrat((String) row.get("NATURECONTRAT"));
					chercheur.setStatutMarital((String) row.get("STATUTMARITAL"));
					chercheur.setSexe((String) row.get("SEXE"));
					chercheur.setPrenom((String) row.get("PRENOM"));;
					chercheur.setNom((String) row.get("NOM"));;
					chercheur.setAnciennete((String) row.get("ANCIENNETE"));
					chercheur.setLogin((String) row.get("LOGIN"));
					chercheur.setRole((String) row.get("ROLE"));
					chercheur.setPassword((String) row.get("PASSWORD"));
					chercheur.setTelephone((String) row.get("TELEPHONE"));
					chercheur.setEmail((String) row.get("EMAIL"));
					chercheur.setIdUtilisateur((long) row.get("IDUTILISATEUR"));
					chercheur.setConnectionStatus((String) row.get("CONNECTIONSTATUS"));
					break;
				}
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			return chercheur;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public long save(ChercheurEmploi chercheurEmploi) throws Exception{
		long ret = -1;
		KeyHolder holder = new GeneratedKeyHolder();
		// System.out.println("1");
		chercheur = chercheurEmploi;
		long n=internauteDAO.save((Internaute)chercheurEmploi);
		if(n!=-1){
			try
			{
				int i = jdbcTemplate.update(sqlChercheurEmploi, n, chercheurEmploi.getNom(),
						chercheurEmploi.getPrenom(), chercheurEmploi.getSexe(), chercheurEmploi.getStatutMarital(),
						chercheurEmploi.getNatureContrat(), chercheurEmploi.getNiveauEtude(),
						chercheurEmploi.getAnciennete(), chercheurEmploi.getDureeContratSouhaite(),
						chercheurEmploi.getRole(), chercheurEmploi.getLogin(), chercheurEmploi.getPassword(),
						chercheurEmploi.getTelephone(), chercheurEmploi.getEmail(),
						chercheurEmploi.getConnectionStatus());
				ret = this.findByLogin(chercheurEmploi.getLogin()).getIdChercheurEmploi();
				System.out.println("la valeur de retour est *****************" + ret);
			} catch (Exception e){
				e.printStackTrace();
			} finally{
				return ret;
			}
		}
		else{
			return -2;
		}
	}
}
