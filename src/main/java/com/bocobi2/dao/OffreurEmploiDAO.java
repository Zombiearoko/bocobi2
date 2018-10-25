package com.bocobi2.dao;

import com.bocobi2.model.OffreurEmploi;

public interface OffreurEmploiDAO
{

	public long save(OffreurEmploi offreurEmploi) throws Exception; /*
																	 * 1=Insertion Success and 2=Insertion Failed
																	 */

	public OffreurEmploi findById(int id);

	public OffreurEmploi findByLogin(String login);
}
