package com.bocobi2.dao;

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
	
}
