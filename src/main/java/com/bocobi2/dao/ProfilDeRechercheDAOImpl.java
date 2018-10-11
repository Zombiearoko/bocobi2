package com.bocobi2.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.bocobi2.model.ProfilDeRecherche;

public class ProfilDeRechercheDAOImpl implements ProfilDeRechercheDAO
{
	private JdbcTemplate jdbcTemplate;

	public ProfilDeRechercheDAOImpl(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@SuppressWarnings("finally")
	public List<ProfilDeRecherche> list()
	{
		List<ProfilDeRecherche> list = new ArrayList<ProfilDeRecherche>();
		// System.out.println("1");
		System.out.println("query preparing...");
		String sql = "SELECT * FROM PROFILRECHERCHE";

		try
		{
			// System.out.println(article);

			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

			for (Map row : rows)
			{
				ProfilDeRecherche profil = new ProfilDeRecherche();
				profil.setCompetence((String) row.get("COMPETENCE"));
				profil.setIdProfilRecherche((Integer) row.get("IDPROFILRECHERCHE"));
				list.add(profil);
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			return list;
		}
	}

	@Override
	public ProfilDeRecherche findById(String id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(ProfilDeRecherche profilDeRecherche)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int profileId)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public ProfilDeRecherche get(int profileId)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
