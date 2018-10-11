package com.bocobi2.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.bocobi2.model.CV;

public class CVDAOImpl implements CVDAO
{
	private JdbcTemplate jdbcTemplate;

	public CVDAOImpl(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@SuppressWarnings("finally")
	public List<CV> list()
	{
		List<CV> list = new ArrayList<CV>();
		// System.out.println("1");
		System.out.println("query preparing...");
		String sql = "SELECT * FROM CV";

		try
		{
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

			for (Map row : rows)
			{
				CV cv = new CV();
				cv.setIdCV((Integer) row.get("IDCV"));
				cv.setDateSoumission((String) row.get("DATESOUMISSION"));
				cv.setFormation((String) row.get("FORMATION"));
				cv.setCompetences((String) row.get("COMPETENCE"));
				cv.setExperienceProfessionel((String) row.get("EXPERIENCEPROFESSIONEL"));
				cv.setFichierCV((String) row.get("FICHIERCV"));

				list.add(cv);
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			return list;
		}
	}
}
