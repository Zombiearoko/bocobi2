package com.bocobi2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import com.bocobi2.model.OffreurEmploi;

public class OffreurEmploiDAOImpl implements OffreurEmploiDAO
{
	private String			sqlInternaute		= "INSERT INTO INTERNAUTE (ROLE, LOGIN, PASSWORD, TELEPHONE, EMAIL) VALUES (?, ?, ?, ?, ?)";
	private String			sqlOffreurEmploi	= "INSERT INTO OFFREUREMPLOI (IDUTILISATEUR, RAISONSOCIALE, SITUATIONGEOGRAPHIQUE, DESCRIPTIONENTREPRISE, ADRESSE, ROLE, LOGIN, PASSWORD, TELEPHONE, EMAIL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	private JdbcTemplate	jdbcTemplate;

	private OffreurEmploi	offreur;

	public OffreurEmploiDAOImpl(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@SuppressWarnings("finally")
	@Override
	public int save(OffreurEmploi offreurEmploi) throws Exception
	{
		int ret = -1;
		KeyHolder holder = new GeneratedKeyHolder();
		// System.out.println("1");
		offreur = offreurEmploi;

		jdbcTemplate.update(new PreparedStatementCreator()
		{
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException
			{
				final PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sqlInternaute,
						Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, offreur.getRole());
				ps.setString(2, offreur.getLogin());
				ps.setString(3, offreur.getPassword());
				ps.setString(4, offreur.getTelephone());
				ps.setString(5, offreur.getEmail());
				return ps;
			}
		}, holder);

		Integer oldId = holder.getKey().intValue();
		System.out.println("----------------------------------------------" + oldId);

		try
		{
			int i = jdbcTemplate.update(sqlOffreurEmploi, oldId, offreurEmploi.getRaisonSociale(),
					offreurEmploi.getSituationGeographique(), offreurEmploi.getDescriptionEntreprise(),
					offreurEmploi.getAdresse(), offreurEmploi.getRole(), offreurEmploi.getLogin(),
					offreurEmploi.getPassword(), offreurEmploi.getTelephone(), offreurEmploi.getEmail());
			ret = i;
			System.out.println("la valeur de retour est *****************" + ret);
		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			return ret;
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
}
