package com.bocobi2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import com.bocobi2.model.ChercheurEmploi;

public class ChercheurEmploiDAOImpl implements ChercheurEmploiDAO
{
	private JdbcTemplate	jdbcTemplate;

	private String			sqlInternaute		= "INSERT INTO INTERNAUTE (ROLE, LOGIN, PASSWORD, TELEPHONE, EMAIL) VALUES (?, ?, ?, ?, ?)";
	private String			sqlChercheurEmploi	= "INSERT INTO CHERCHEUREMPLOI (IDUTILISATEUR, NOM, PRENOM, SEXE, STATUTMARITAL, NATURECONTRAT, NIVEAUETUDE, ANCIENNETE, DUREECONTRATSOUHAITE, ROLE, LOGIN, PASSWORD, TELEPHONE, EMAIL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private ChercheurEmploi	chercheur;

	public ChercheurEmploiDAOImpl(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public ChercheurEmploi findByLogin(String login)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("finally")
	@Override
	public int save(ChercheurEmploi chercheurEmploi) throws Exception
	{
		int ret = -1;
		KeyHolder holder = new GeneratedKeyHolder();
		// System.out.println("1");
		chercheur = chercheurEmploi;

		jdbcTemplate.update(new PreparedStatementCreator()
		{
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException
			{
				final PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sqlInternaute,
						Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, chercheur.getRole());
				ps.setString(2, chercheur.getLogin());
				ps.setString(3, chercheur.getPassword());
				ps.setString(4, chercheur.getTelephone());
				ps.setString(5, chercheur.getEmail());
				return ps;
			}
		}, holder);

		Integer oldId = holder.getKey().intValue();
		System.out.println("----------------------------------------------" + oldId);

		try
		{
			int i = jdbcTemplate.update(sqlChercheurEmploi, oldId, chercheurEmploi.getNom(),
					chercheurEmploi.getPrenom(), chercheurEmploi.getSexe(), chercheurEmploi.getStatutMarital(),
					chercheurEmploi.getNatureContrat(), chercheurEmploi.getNiveauEtude(),
					chercheurEmploi.getAnciennete(), chercheurEmploi.getDureeContratSouhaite(),
					chercheurEmploi.getRole(), chercheurEmploi.getLogin(), chercheurEmploi.getPassword(),
					chercheurEmploi.getTelephone(), chercheurEmploi.getEmail());
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
}
