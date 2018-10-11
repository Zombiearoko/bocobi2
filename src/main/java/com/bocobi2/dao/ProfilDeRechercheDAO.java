package com.bocobi2.dao;

import java.util.List;
import com.bocobi2.model.ProfilDeRecherche;

public interface ProfilDeRechercheDAO
{

	public ProfilDeRecherche findById(String id);

	public int save(ProfilDeRecherche profilDeRecherche);/*
															 * 1=Insertion Success and 2=Insertion Failed
															 */

	public void delete(int profileId);

	public ProfilDeRecherche get(int profileId);

	public List<ProfilDeRecherche> list();
}