package com.bocobi2.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bocobi2.model.Internaute;

public class InternauteDAOImpl implements InternauteDAO {
	private JdbcTemplate jdbcTemplate;

	public InternauteDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Internaute findByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Internaute internaute) {
		int ret=-1;
//		System.out.println("1");
		System.out.println(internaute);
		String sql = "INSERT INTO internaute (idutilisateur,role,login, password,"
				+ " telephone,email) VALUES (?,?, ?, ?, ?,?)";
		
		try{
//			System.out.println(article);
			int i=jdbcTemplate.update(sql,internaute.getIdUtilisateur(),internaute.getRole()
					,internaute.getLogin(),internaute.getPassword(),internaute.getTelephone(),
					internaute.getEmail());
			ret= i;
			System.out.println("la valeur de retour est *****************"+ ret);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			return ret;
		}
		
	}

	@Override
	public void delete(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Internaute get(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Internaute> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
