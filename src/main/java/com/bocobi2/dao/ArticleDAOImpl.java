package com.bocobi2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.bocobi2.model.Article;



public class ArticleDAOImpl implements ArticleDAO {

	private JdbcTemplate jdbcTemplate;

	public ArticleDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void delete(int articleId) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public List<Article> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int saveOrUpdate(Article article) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Article get(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
