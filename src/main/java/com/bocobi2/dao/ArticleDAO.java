package com.bocobi2.dao;

import java.util.List;

import com.bocobi2.model.Article;

public interface ArticleDAO {
	public int saveOrUpdate(Article article);/*1=Update Success, 2=Update failed, 3=Insertion Success and 
	4=Insertion Failed*/

	public void delete(int userId);

	public Article get(int 	userId);
	public List<Article> list();
}
