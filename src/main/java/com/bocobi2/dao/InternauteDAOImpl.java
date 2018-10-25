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

import com.bocobi2.model.Internaute;

public class InternauteDAOImpl implements InternauteDAO{

	private JdbcTemplate	jdbcTemplate;
	private Internaute		internaute;

	public InternauteDAOImpl(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@SuppressWarnings({ "finally", "rawtypes" })
	@Override
	public Internaute findByLogin(String login){
		internaute = null;
		String sql = "SELECT * FROM INTERNAUTE WHERE LOGIN='" + login+"'";

		return jdbcTemplate.query(sql, new ResultSetExtractor<Internaute>() {
			
			@Override
			public Internaute extractData(ResultSet rs) throws SQLException,
			DataAccessException {
				System.out.println("query preparing2...");
				if (rs.next()) {
					internaute = new Internaute();
					internaute.setLogin((String) rs.getString("LOGIN"));
					internaute.setRole((String) rs.getString("ROLE"));
					internaute.setPassword((String) rs.getString("PASSWORD"));
					internaute.setTelephone((String) rs.getString("TELEPHONE"));
					internaute.setEmail((String) rs.getString("EMAIL"));
					internaute.setIdUtilisateur(rs.getLong("IDUTILISATEUR") );
					internaute.setConnectionStatus(rs.getString("CONNECTIONSTATUS"));
					return internaute;
				}
				return null;
			}

		});
	}

	@SuppressWarnings("finally")
	@Override
	public long save(Internaute internaute)	{
		long ret = -1;
		// System.out.println("1");
		System.out.println(internaute);
		String sql = "INSERT INTO INTERNAUTE (ROLE,LOGIN, PASSWORD,"
				+ " TELEPHONE,EMAIL,CONNECTIONSTATUS) VALUES (?, ?, ?, ?,?,?)";

		try{
			// System.out.println(article);
			jdbcTemplate.update(sql,  internaute.getRole(), internaute.getLogin(),
					internaute.getPassword(), internaute.getTelephone(), internaute.getEmail(),
					internaute.getConnectionStatus());
			ret =  findByLogin(internaute.getLogin()).getIdUtilisateur();
			System.out.println("L'ID de l'utilisateur enregistré est *****************" + ret);

		} catch (Exception e){
			e.printStackTrace();
		} finally{
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

	@Override
	public long update(Internaute internaute) {
		long ret = -1;
		// System.out.println("1");
		System.out.println(internaute);
		String sql = "UPDATE INTERNAUTE set ROLE=? ,LOGIN=?, PASSWORD=?,"
				+ " TELEPHONE=?,EMAIL=?,CONNECTIONSTATUS=? WHERE IDUTILISATEUR=?";
				
		try{
			// System.out.println(article);
			jdbcTemplate.update(sql,  internaute.getRole(), internaute.getLogin(),
					internaute.getPassword(), internaute.getTelephone(), internaute.getEmail(),
					internaute.getConnectionStatus(),internaute.getIdUtilisateur());
			ret =  findByLogin(internaute.getLogin()).getIdUtilisateur();
			System.out.println("Internaute mis à jour avec succès le voilà : *****************" + findByLogin(internaute.getLogin()));

		} catch (Exception e){
			e.printStackTrace();
		} finally{
			return ret;
		}
	}

}