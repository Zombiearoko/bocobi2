package com.bocobi2.dao;

import java.util.List;
import com.bocobi2.model.Internaute;

public interface InternauteDAO
{

	public Internaute findByLogin(String login);

	public long save(Internaute internaute);
	public long update(Internaute internaute);

	public void delete(int userId);

	public Internaute get(int userId);

	public List<Internaute> list();
}
