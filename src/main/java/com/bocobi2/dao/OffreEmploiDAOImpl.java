package com.bocobi2.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.bocobi2.model.OffreEmploi;

public class OffreEmploiDAOImpl implements OffreEmploiDAO
{
	private JdbcTemplate	jdbcTemplate;

	@Autowired
	OffreurEmploiDAO		offreurEmploiDAO;

	OffreEmploi				offre;

	public OffreEmploiDAOImpl(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@SuppressWarnings("finally")
	@Override
	public int save(OffreEmploi offreEmploi)
	{

		int ret = -1; // System.out.println("1"); System.out.println(offreEmploi);
		String sql = "INSERT INTO OFFREEMPLOI (IDOFFREEMPLOI,IDPROFILRECHERCHE,IDOFFREUREMPLOI,NOMEMPLOI,"
				+ " LIEUXEMPLOI,DESCRIPTIONEMPLOI, SALAIREEMPLOI, TYPEEMPLOI, DATEPUBLICATION, HEUREPUBLICATION, LOGOENTREPRISE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try
		{
			DateFormat formatDate = new SimpleDateFormat("yyy-MM-dd");
			Calendar date = Calendar.getInstance();
			String nowDate = formatDate.format(date.getTime());
			DateFormat formatHour = new SimpleDateFormat("HH:mm:ss");
			Calendar hour = Calendar.getInstance();
			String nowHour = formatHour.format(hour.getTime());
			System.out.println("Debut de l'enregistrement");
			int i = jdbcTemplate.update(sql, offreEmploi.getIdOffreEmploi(), offreEmploi.getIdProfildeRecherche(),
					offreEmploi.getIdOffreurEmploi(), offreEmploi.getNomEmploi(), offreEmploi.getLieuxEmploi(),
					offreEmploi.getDescriptionEmploi(), offreEmploi.getSalaireEmploi(), offreEmploi.getTypeEmploi(),
					nowDate, nowHour, offreEmploi.getLogoEntreprise());
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
	public List<OffreEmploi> listeOffres()
	{
		List<OffreEmploi> list = new ArrayList<OffreEmploi>();
		// System.out.println("1");
		System.out.println("query preparing...");
		String sql = "SELECT * FROM OFFREEMPLOI";

		try
		{
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

			for (Map row : rows)
			{
				OffreEmploi offreEmploi = new OffreEmploi();
				offreEmploi.setNomEmploi((String) row.get("NOMEMPLOI"));
				offreEmploi.setLieuxEmploi((String) row.get("LIEUXEMPLOI"));
				offreEmploi.setDescriptionEmploi((String) row.get("DESCRIPTIONEMPLOI"));
				offreEmploi.setOffreurEmploi(offreurEmploiDAO.findById((Integer) row.get("IDOFFREUREMPLOI")));
				offreEmploi.setLogoEntreprise((String) row.get("LOGOENTREPRISE"));
				offreEmploi.setIdOffreEmploi((Integer) row.get("IDOFFREEMPLOI"));

				list.add(offreEmploi);
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			return list;
		}
	}

	@SuppressWarnings({ "rawtypes", "finally" })
	@Override
	public List<OffreEmploi> rechercheOffreCle(String keyword)
	{
		List<OffreEmploi> list = new ArrayList<OffreEmploi>();
		// System.out.println("1");
		System.out.println("query preparing...");
		String sql = "SELECT * FROM OFFREEMPLOI WHERE NOMEMPLOI LIKE '%" + keyword + "%' OR LIEUXEMPLOI LIKE '%"
				+ keyword + "%' OR DESCRIPTIONEMPLOI LIKE '%" + keyword + "%'";

		try
		{
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

			for (Map row : rows)
			{
				OffreEmploi offreEmploi = new OffreEmploi();
				offreEmploi.setNomEmploi((String) row.get("NOMEMPLOI"));
				offreEmploi.setLieuxEmploi((String) row.get("LIEUXEMPLOI"));
				offreEmploi.setDescriptionEmploi((String) row.get("DESCRIPTIONEMPLOI"));
				offreEmploi.setOffreurEmploi(offreurEmploiDAO.findById((Integer) row.get("IDOFFREUREMPLOI")));
				offreEmploi.setLogoEntreprise((String) row.get("LOGOENTREPRISE"));
				offreEmploi.setIdOffreEmploi((Integer) row.get("IDOFFREEMPLOI"));

				list.add(offreEmploi);
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			return list;
		}
	}

	@SuppressWarnings({ "rawtypes", "finally" })
	@Override
	public List<OffreEmploi> rechercheOffre(String category, String location, String cdd, String cdi, String freelance,
			String stage)
	{
		List<OffreEmploi> list = new ArrayList<OffreEmploi>();
		// System.out.println("1");
		System.out.println("query preparing..." + cdd + " " + cdi + " " + freelance + " " + stage);
		String sql = "SELECT * FROM OFFREEMPLOI WHERE LIEUXEMPLOI LIKE '%" + location + "%' AND CATEGORIE LIKE '%"
				+ category + "%' AND (TYPEEMPLOI LIKE '" + cdd + "' OR TYPEEMPLOI LIKE '" + cdi
				+ "' OR TYPEEMPLOI LIKE '" + freelance + "' OR TYPEEMPLOI LIKE '" + stage + "')";

		try
		{
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

			for (Map row : rows)
			{
				OffreEmploi offreEmploi = new OffreEmploi();
				offreEmploi.setNomEmploi((String) row.get("NOMEMPLOI"));
				offreEmploi.setLieuxEmploi((String) row.get("LIEUXEMPLOI"));
				offreEmploi.setDescriptionEmploi((String) row.get("DESCRIPTIONEMPLOI"));
				offreEmploi.setOffreurEmploi(offreurEmploiDAO.findById((Integer) row.get("IDOFFREUREMPLOI")));
				offreEmploi.setLogoEntreprise((String) row.get("LOGOENTREPRISE"));
				offreEmploi.setIdOffreEmploi((Integer) row.get("IDOFFREEMPLOI"));

				list.add(offreEmploi);
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			return list;
		}
	}

	@SuppressWarnings({ "rawtypes", "finally" })
	@Override
	public OffreEmploi details(int id)
	{
		offre = null;
		// System.out.println("1");
		System.out.println("query preparing...");
		String sql = "SELECT * FROM OFFREEMPLOI WHERE IDOFFREEMPLOI = \"" + id + "\"";

		try
		{
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

			if (rows.size() != 0)
			{
				offre = new OffreEmploi();
				for (Map row : rows)
				{
					offre.setNomEmploi((String) row.get("NOMEMPLOI"));
					offre.setLieuxEmploi((String) row.get("LIEUXEMPLOI"));
					offre.setDescriptionEmploi((String) row.get("DESCRIPTIONEMPLOI"));
					offre.setOffreurEmploi(offreurEmploiDAO.findById((Integer) row.get("IDOFFREUREMPLOI")));
					offre.setLogoEntreprise((String) row.get("LOGOENTREPRISE"));
					offre.setIdOffreEmploi((Integer) row.get("IDOFFREEMPLOI"));
					offre.setSalaireEmploi((Integer) row.get("SALAIREEMPLOI"));
					offre.setDatePublication((String) row.get("DATEPUBLICATION"));
					offre.setHeurePublication((String) row.get("HEUREPUBLICATION"));

					break;
				}
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			return offre;
		}
	}

}
