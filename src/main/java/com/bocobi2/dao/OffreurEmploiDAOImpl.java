package com.bocobi2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import com.bocobi2.model.Internaute;
import com.bocobi2.model.OffreurEmploi;

public class OffreurEmploiDAOImpl implements OffreurEmploiDAO
{
	@SuppressWarnings("unused")
	private String			sqlInternaute		= "INSERT INTO INTERNAUTE (ROLE, LOGIN, PASSWORD, TELEPHONE, EMAIL) VALUES (?, ?, ?, ?, ?)";
	private String			sqlOffreurEmploi	= "INSERT INTO OFFREUREMPLOI (IDUTILISATEUR, RAISONSOCIALE, SITUATIONGEOGRAPHIQUE, DESCRIPTIONENTREPRISE, ADRESSE, ROLE, LOGIN, PASSWORD, TELEPHONE, EMAIL,CONNECTIONSTATUS) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	private JdbcTemplate	jdbcTemplate;

	private OffreurEmploi	offreur;

	public OffreurEmploiDAOImpl(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Autowired
	InternauteDAO internauteDAO;

	@SuppressWarnings("finally")
	@Override
	public long save(OffreurEmploi offreurEmploi) throws Exception
	{
		long ret = -1;
		@SuppressWarnings("unused")
		KeyHolder holder = new GeneratedKeyHolder();
		// System.out.println("1");
		offreur = offreurEmploi;
		long n = internauteDAO.save((Internaute) offreurEmploi);
		if (n != -1)
		{
			try
			{
				@SuppressWarnings("unused")
				int i = jdbcTemplate.update(sqlOffreurEmploi, n, offreurEmploi.getRaisonSociale(),
						offreurEmploi.getSituationGeographique(), offreurEmploi.getDescriptionEntreprise(),
						offreurEmploi.getAdresse(), offreurEmploi.getRole(), offreurEmploi.getLogin(),
						offreurEmploi.getPassword(), offreurEmploi.getTelephone(), offreurEmploi.getEmail(),
						offreurEmploi.getConnectionStatus());
				ret = this.findByLogin(offreurEmploi.getLogin()).getIdOffreurEmploi();
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

	@SuppressWarnings({ "rawtypes", "finally" })
	@Override
	public OffreurEmploi findById(int id)
	{
		offreur = null;
		// System.out.println("1");
		System.out.println("query preparing...");
		String sql = "SELECT * FROM OFFREUREMPLOI WHERE IDOFFREUREMPLOI = \"" + id + "\"";

		try
		{
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

			if (rows.size() != 0)
			{
				offreur = new OffreurEmploi();
				for (Map row : rows)
				{
					offreur.setRaisonSociale((String) row.get("RAISONSOCIALE"));
					offreur.setSituationGeographique((String) row.get("SITUATIONGEOGRAPHIQUE"));
					offreur.setDescriptionEntreprise((String) row.get("DESCRIPTIONENTREPRISE"));
					offreur.setAdresse((String) row.get("ADRESSE"));
					offreur.setTelephone((String) row.get("TELEPHONE"));
					offreur.setEmail((String) row.get("EMAIL"));
					break;
				}
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			return offreur;
		}
	}

	@Override
	public OffreurEmploi findByLogin(String login)
	{
		offreur = null;
		// System.out.println("1");
		System.out.println("query preparing1...");
		String sql = "SELECT * FROM OFFREUREMPLOI WHERE LOGIN = \"" + login + "\"";

		return jdbcTemplate.query(sql, new ResultSetExtractor<OffreurEmploi>()
		{

			@Override
			public OffreurEmploi extractData(ResultSet rs) throws SQLException, DataAccessException
			{
				System.out.println("query preparing2...");
				if (rs.next())
				{
					offreur = new OffreurEmploi();
					offreur.setLogin((String) rs.getString("LOGIN"));
					offreur.setRole((String) rs.getString("ROLE"));
					offreur.setPassword((String) rs.getString("PASSWORD"));
					offreur.setTelephone((String) rs.getString("TELEPHONE"));
					offreur.setEmail((String) rs.getString("EMAIL"));
					offreur.setIdUtilisateur(rs.getLong("IDUTILISATEUR"));
					offreur.setIdOffreurEmploi(rs.getInt("IDOFFREUREMPLOI"));
					offreur.setConnectionStatus(rs.getString("CONNECTIONSTATUS"));
					offreur.setRaisonSociale((String) rs.getString("RAISONSOCIALE"));
					offreur.setSituationGeographique((String) rs.getString("SITUATIONGEOGRAPHIQUE"));
					offreur.setDescriptionEntreprise((String) rs.getString("DESCRIPTIONENTREPRISE"));
					offreur.setAdresse(rs.getString("ADRESSE"));
					return offreur;
				}
				return null;
			}

		});

	}

	@SuppressWarnings("finally")
	@Override
	public long update(OffreurEmploi offreurEmploi)
	{
		long ret = -1;
		// System.out.println("1");
		System.out.println(offreurEmploi);
		String sql = "UPDATE OFFREUREMPLOI set IDUTILISATEUR=?,ROLE=?, RAISONSOCIALE=?, SITUATIONGEOGRAPHIQUE=?, DESCRIPTIONENTREPRISE=?, ADRESSE=? ,LOGIN=?,PASSWORD=? ,TELEPHONE=?,EMAIL=?,CONNECTIONSTATUS=? WHERE IDOFFREUREMPLOI=?";
		try
		{
			@SuppressWarnings("unused")
			int i = jdbcTemplate.update(sql, offreurEmploi.getIdUtilisateur(), offreurEmploi.getRole(),
					offreurEmploi.getRaisonSociale(), offreurEmploi.getSituationGeographique(),
					offreurEmploi.getDescriptionEntreprise(), offreurEmploi.getAdresse(), offreurEmploi.getLogin(),
					offreurEmploi.getPassword(), offreurEmploi.getTelephone(), offreurEmploi.getEmail(),
					offreurEmploi.getConnectionStatus(), offreurEmploi.getIdOffreurEmploi());
			ret = this.findByLogin(offreurEmploi.getLogin()).getIdOffreurEmploi();
			System.out.println("OFFREUREMPLOI mis � jour avec succ�s, le voil�: *****************"
					+ this.findByLogin(offreurEmploi.getLogin()));

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			return ret;
		}
	}
}
