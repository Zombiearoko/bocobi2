package com.bocobi2.dao;

import com.bocobi2.model.OffreurEmploi;

public interface OffreurEmploiDAO
{

	public long save(OffreurEmploi offreurEmploi) throws Exception;

	public OffreurEmploi findById(int id);

	public OffreurEmploi findByLogin(String login);

	public long update(OffreurEmploi offreurEmploi);
}
