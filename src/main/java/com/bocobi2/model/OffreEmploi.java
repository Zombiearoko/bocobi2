/**************************************************************************
* Source File	:  OffreEmploi.java
* Author                   :  OUAMBO  
* Project name         :  Emploi* Created                 :  09/10/2018
* Modified   	:  11/10/2018
* Description	:  Definition of the class OffreEmploi
**************************************************************************/
package com.bocobi2.model;

import java.util.Date;

public class OffreEmploi
{
	private Integer	idOffreEmploi;
	private Integer	idProfildeRecherche;
	private Integer	idOffreurEmploi;
	private String	nomEmploi;
	private String	lieuxEmploi;
	private String	descriptionEmploi;
	private String	typeEmploi;
	private Integer	salaireEmploi;
	private Date	datePublication;
	private Date	heurePublication;
	private String	logoEntreprise;

	public OffreEmploi(Integer idOffreEmploi, String nomEmploi, String lieuxEmploi, String descriptionEmploi,
			String typeEmploi, Date datePublication, Date heurePublication, Integer salaireEmploi,
			String logoEntreprise, Integer idProfildeRecherche, Integer idOffreurEmploi)
	{
		super();
		this.idOffreEmploi = idOffreEmploi;
		this.nomEmploi = nomEmploi;
		this.lieuxEmploi = lieuxEmploi;
		this.descriptionEmploi = descriptionEmploi;
		this.typeEmploi = typeEmploi;
		this.salaireEmploi = salaireEmploi;
		this.datePublication = datePublication;
		this.heurePublication = heurePublication;
		this.logoEntreprise = logoEntreprise;
		this.idProfildeRecherche = idProfildeRecherche;
		this.idOffreurEmploi = idOffreurEmploi;
	}

	public OffreEmploi(Integer idOffreEmploi, String nomEmploi, String lieuxEmploi, String descriptionEmploi,
			String typeEmploi, Integer salaireEmploi, String logoEntreprise, Integer idProfildeRecherche,
			Integer idOffreurEmploi)
	{
		super();
		this.idOffreEmploi = idOffreEmploi;
		this.nomEmploi = nomEmploi;
		this.lieuxEmploi = lieuxEmploi;
		this.descriptionEmploi = descriptionEmploi;
		this.typeEmploi = typeEmploi;
		this.salaireEmploi = salaireEmploi;
		this.logoEntreprise = logoEntreprise;
		this.idProfildeRecherche = idProfildeRecherche;
		this.idOffreurEmploi = idOffreurEmploi;
	}

	public OffreEmploi()
	{
		super();
	}

	public Integer getIdOffreEmploi()
	{
		return idOffreEmploi;
	}

	public void setIdOffreEmploi(Integer idOffreEmploi)
	{
		this.idOffreEmploi = idOffreEmploi;
	}

	public Integer getIdProfildeRecherche()
	{
		return idProfildeRecherche;
	}

	public Integer getIdOffreurEmploi()
	{
		return idOffreurEmploi;
	}

	public void setIdOffreurEmploi(Integer idOffreurEmploi)
	{
		this.idOffreurEmploi = idOffreurEmploi;
	}

	public void setIdProfildeRecherche(Integer ifProfildeRecherche)
	{
		this.idProfildeRecherche = ifProfildeRecherche;
	}

	public String getNomEmploi()
	{
		return nomEmploi;
	}

	public Integer getSalaireEmploi()
	{
		return salaireEmploi;
	}

	public void setSalaireEmploi(Integer salaireEmploi)
	{
		this.salaireEmploi = salaireEmploi;
	}

	public void setNomEmploi(String nomEmploi)
	{
		this.nomEmploi = nomEmploi;
	}

	public String getLieuxEmploi()
	{
		return lieuxEmploi;
	}

	public void setLieuxEmploi(String lieuxEmploi)
	{
		this.lieuxEmploi = lieuxEmploi;
	}

	public String getDescriptionEmploi()
	{
		return descriptionEmploi;
	}

	public void setDescriptionEmploi(String descriptionEmploi)
	{
		this.descriptionEmploi = descriptionEmploi;
	}

	public String getTypeEmploi()
	{
		return typeEmploi;
	}

	public void setTypeEmploi(String typeEmploi)
	{
		this.typeEmploi = typeEmploi;
	}

	public Date getDatePublication()
	{
		return datePublication;
	}

	public void setDatePublication(Date datePublication)
	{
		this.datePublication = datePublication;
	}

	public Date getHeurePublication()
	{
		return heurePublication;
	}

	public void setHeurePublication(Date heurePublication)
	{
		this.heurePublication = heurePublication;
	}

	public String getLogoEntreprise()
	{
		return logoEntreprise;
	}

	public void setLogoEntreprise(String logoEntreprise)
	{
		this.logoEntreprise = logoEntreprise;
	}

} // End Class OffreEmploi
