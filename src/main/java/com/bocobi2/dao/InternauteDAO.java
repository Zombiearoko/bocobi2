package com.bocobi2.dao;

import java.util.List;
import com.bocobi2.model.Internaute;

public interface InternauteDAO
{

	public Internaute findByLogin(String login);

	public int save(Internaute internaute);/*
											 * 1=Insertion Success and 2=Insertion Failed
											 */

	public void delete(int userId);

	public Internaute get(int userId);

	public List<Internaute> list();
}
