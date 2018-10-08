package com.bocobi2.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bocobi2.model.ChercheurEmploi;

public class ChercheurEmploiDAOImpl implements ChercheurEmploiDAO {
	private JdbcTemplate jdbcTemplate;

	public ChercheurEmploiDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public ChercheurEmploi findByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}
}
