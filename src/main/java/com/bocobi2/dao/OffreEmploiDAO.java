package com.bocobi2.dao;

import java.util.List;
import com.bocobi2.model.OffreEmploi;

public interface OffreEmploiDAO
{
	public int save(OffreEmploi offreEmploi);

	public List<OffreEmploi> listeOffres();

	public List<OffreEmploi> rechercheOffre(String category, String location, String cdd, String cdi, String freelance,
			String stage);

	// public List<OffreEmploi> listeOffresParVille(String nom);

	public OffreEmploi details(int id);
}
