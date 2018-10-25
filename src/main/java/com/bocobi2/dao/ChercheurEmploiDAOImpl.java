package com.bocobi2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import com.bocobi2.model.ChercheurEmploi;
import com.bocobi2.model.Internaute;

public class ChercheurEmploiDAOImpl implements ChercheurEmploiDAO
{

	@Autowired
	InternauteDAO			internauteDAO;
	private JdbcTemplate	jdbcTemplate;

	@SuppressWarnings("unused")
	private String			sqlInternaute		= "INSERT INTO INTERNAUTE (ROLE, LOGIN, PASSWORD, TELEPHONE, EMAIL) VALUES (?, ?, ?, ?, ?)";
	private String			sqlChercheurEmploi	= "INSERT INTO CHERCHEUREMPLOI (IDUTILISATEUR, NOM, PRENOM, SEXE, STATUTMARITAL, NATURECONTRAT, NIVEAUETUDE, ANCIENNETE, DUREECONTRATSOUHAITE, ROLE, LOGIN, PASSWORD, TELEPHONE, EMAIL,CONNECTIONSTATUS) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private ChercheurEmploi	chercheur;

	public ChercheurEmploiDAOImpl(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public ChercheurEmploi findByLogin(String login)
	{
		chercheur = null;
		// System.out.println("1");
		System.out.println("query preparing1...");
		String sql = "SELECT * FROM CHERCHEUREMPLOI WHERE LOGIN = \"" + login + "\"";

		return jdbcTemplate.query(sql, new ResultSetExtractor<ChercheurEmploi>()
		{

			@Override
			public ChercheurEmploi extractData(ResultSet rs) throws SQLException, DataAccessException
			{
				System.out.println("query preparing2...");
				if (rs.next())
				{
					chercheur = new ChercheurEmploi();
					chercheur.setLogin((String) rs.getString("LOGIN"));
					chercheur.setRole((String) rs.getString("ROLE"));
					chercheur.setPassword((String) rs.getString("PASSWORD"));
					chercheur.setTelephone((String) rs.getString("TELEPHONE"));
					chercheur.setEmail((String) rs.getString("EMAIL"));
					chercheur.setIdUtilisateur(rs.getLong("IDUTILISATEUR"));
					chercheur.setIdChercheurEmploi(rs.getLong("IDCHERCHEUREMPLOI"));
					chercheur.setConnectionStatus(rs.getString("CONNECTIONSTATUS"));
					chercheur.setDureeContratSouhaite(rs.getString("DUREECONTRATSOUHAITE"));
					chercheur.setAnciennete(rs.getString("ANCIENNETE"));
					chercheur.setNiveauEtude(rs.getString("NIVEAUETUDE"));
					chercheur.setNatureContrat(rs.getString("NATURECONTRAT"));
					chercheur.setStatutMarital(rs.getString("STATUTMARITAL"));
					chercheur.setSexe(rs.getString("SEXE"));
					chercheur.setPrenom(rs.getString("PRENOM"));
					chercheur.setNom(rs.getString("NOM"));
					chercheur.setAnciennete(rs.getString("ANCIENNETE"));
					return chercheur;
				}
				return null;
			}

		});

	}

	@SuppressWarnings("finally")
	@Override
	public long save(ChercheurEmploi chercheurEmploi)
	{
		long ret = -1;
		@SuppressWarnings("unused")
		KeyHolder holder = new GeneratedKeyHolder();
		// System.out.println("1");
		chercheur = chercheurEmploi;
		long n = internauteDAO.save((Internaute) chercheurEmploi);
		if (n != -1)
		{
			try
			{
				@SuppressWarnings("unused")
				int i = jdbcTemplate.update(sqlChercheurEmploi, n, chercheurEmploi.getNom(),
						chercheurEmploi.getPrenom(), chercheurEmploi.getSexe(), chercheurEmploi.getStatutMarital(),
						chercheurEmploi.getNatureContrat(), chercheurEmploi.getNiveauEtude(),
						chercheurEmploi.getAnciennete(), chercheurEmploi.getDureeContratSouhaite(),
						chercheurEmploi.getRole(), chercheurEmploi.getLogin(), chercheurEmploi.getPassword(),
						chercheurEmploi.getTelephone(), chercheurEmploi.getEmail(),
						chercheurEmploi.getConnectionStatus());
				ret = this.findByLogin(chercheurEmploi.getLogin()).getIdChercheurEmploi();
				System.out.println("la valeur de retour est *****************" + ret);
			} catch (Exception e)
			{
				e.printStackTrace();
			} finally
			{
				return ret;
			}
		} else
		{
			return -2;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public long update(ChercheurEmploi chercheurEmploi)
	{
		long ret = -1;
		// System.out.println("1");
		System.out.println(chercheurEmploi);
		String sql = "UPDATE CHERCHEUREMPLOI set IDUTILISATEUR=? ,NOM=?, PRENOM=?,"
				+ " SEXE=?,STATUTMARITAL=?,NATURECONTRAT=?,NIVEAUETUDE=?,ANCIENNETE=?"
				+ ",DUREECONTRATSOUHAITE=?,ROLE=?" + ",LOGIN=?,PASSWORD=?"
				+ ",TELEPHONE=?,EMAIL=?,CONNECTIONSTATUS=? WHERE IDCHERCHEUREMPLOI=?";
		try
		{
			@SuppressWarnings("unused")
			int i = jdbcTemplate.update(sql, chercheurEmploi.getIdUtilisateur(), chercheurEmploi.getNom(),
					chercheurEmploi.getPrenom(), chercheurEmploi.getSexe(), chercheurEmploi.getStatutMarital(),
					chercheurEmploi.getNatureContrat(), chercheurEmploi.getNiveauEtude(),
					chercheurEmploi.getAnciennete(), chercheurEmploi.getDureeContratSouhaite(),
					chercheurEmploi.getRole(), chercheurEmploi.getLogin(), chercheurEmploi.getPassword(),
					chercheurEmploi.getTelephone(), chercheurEmploi.getEmail(), chercheurEmploi.getConnectionStatus(),
					chercheurEmploi.getIdChercheurEmploi());
			ret = this.findByLogin(chercheurEmploi.getLogin()).getIdChercheurEmploi();
			System.out.println("CHERCHEUREMPLOI mis � jour avec succ�s, le voil�: *****************"
					+ this.findByLogin(chercheurEmploi.getLogin()));

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			return ret;
		}
	}
}
