package com.bocobi2.dao;

import java.util.List;
import com.bocobi2.model.OffreEmploi;

public interface OffreEmploiDAO
{
	public int save(OffreEmploi offreEmploi);

	public List<OffreEmploi> listeOffres();

	public OffreEmploi details(int id);
}
