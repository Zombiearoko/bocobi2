package com.bocobi2.dao;

import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.bocobi2.model.Internaute;

public class InternauteDAOImpl implements InternauteDAO
{
	private JdbcTemplate	jdbcTemplate;
	private Internaute		internaute;

	public InternauteDAOImpl(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@SuppressWarnings("finally")
	@Override
	public Internaute findByLogin(String login)
	{
		internaute = null;
		// System.out.println("1");
		System.out.println("query preparing...");
		String sql = "SELECT * FROM INTERNAUTE WHERE LOGIN = \"" + login + "\"";

		try
		{
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

			if (rows.size() != 0)
			{
				internaute = new Internaute();
				for (Map row : rows)
				{
					internaute.setLogin((String) row.get("LOGIN"));
					internaute.setRole((String) row.get("ROLE"));
					internaute.setPassword((String) row.get("PASSWORD"));
					internaute.setTelephone((String) row.get("TELEPHONE"));
					internaute.setEmail((String) row.get("EMAIL"));
					internaute.setIdUtilisateur((Integer) row.get("IDUTILISATEUR"));
				}
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			return internaute;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public int save(Internaute internaute)
	{
		int ret = -1;
		// System.out.println("1");
		System.out.println(internaute);
		String sql = "INSERT INTO INTERNAUTE (IDUTILISATEUR,ROLE,LOGIN, PASSWORD,"
				+ " TELEPHONE,EMAIL) VALUES (?,?, ?, ?, ?,?)";

		try
		{
			// System.out.println(article);
			int i = jdbcTemplate.update(sql, internaute.getIdUtilisateur(), internaute.getRole(), internaute.getLogin(),
					internaute.getPassword(), internaute.getTelephone(), internaute.getEmail());
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

	@Override
	public void delete(int userId)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Internaute get(int userId)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Internaute> list()
	{
		// TODO Auto-generated method stub
		return null;
	}

}