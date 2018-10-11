package com.bocobi2.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.bocobi2.model.OffreEmploi;

public class OffreEmploiDAOImpl implements OffreEmploiDAO
{
	private JdbcTemplate jdbcTemplate;

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

}
