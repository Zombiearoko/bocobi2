package com.bocobi2.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ChercheurEmploiDAOImpl implements ChercheurEmploiDAO {
	private JdbcTemplate jdbcTemplate;

	public ChercheurEmploiDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
}
