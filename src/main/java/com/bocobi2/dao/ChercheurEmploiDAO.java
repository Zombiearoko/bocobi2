package com.bocobi2.dao;

import com.bocobi2.model.ChercheurEmploi;

public interface ChercheurEmploiDAO
{
	public ChercheurEmploi findByLogin(String login);

	public long save(ChercheurEmploi chercheurEmploi) ; 
	public long update (ChercheurEmploi chercheurEmploi);
}
