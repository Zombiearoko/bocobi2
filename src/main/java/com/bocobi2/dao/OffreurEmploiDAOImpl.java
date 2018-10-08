package com.bocobi2.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class OffreurEmploiDAOImpl implements OffreurEmploiDAO {
	private JdbcTemplate jdbcTemplate;

	public OffreurEmploiDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
}
