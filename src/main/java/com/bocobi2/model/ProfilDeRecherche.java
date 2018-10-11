package com.bocobi2.model;

import java.util.Set;

public class ProfilDeRecherche
{
	private Integer					idProfilRecherche;
	private String					competence;
	private Set<ProfilDeRecherche>	profiles;

	public Integer getIdProfilRecherche()
	{
		return idProfilRecherche;
	}

	public void setIdProfilRecherche(Integer idProfilRecherche)
	{
		this.idProfilRecherche = idProfilRecherche;
	}

	public String getCompetence()
	{
		return competence;
	}

	public void setCompetence(String competence)
	{
		this.competence = competence;
	}

	public Set<ProfilDeRecherche> getProfils()
	{
		return profiles;
	}

}
