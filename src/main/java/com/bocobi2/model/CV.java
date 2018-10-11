/**************************************************************************
* Source File	:  CV.java
* Author                   :  MFOGO  
* Project name         :  Emploi* Created                 :  29/08/2018
* Modified   	:  06/10/2018
* Description	:  Definition of the class CV
**************************************************************************/
package com.bocobi2.model;

public class CV
{
	private Integer	idCV;
	private String	fichierCV;
	private String	dateSoumission;
	private String	formation;
	private String	competences;
	private String	experienceProfessionel;
	private String	reference;
	ChercheurEmploi	soumettre;
	ProfilRecherche	correspondre[];

	public CV(Integer idCV, String fichierCV, String dateSoumission, String formation, String competences,
			String experienceProfessionel, String reference, ChercheurEmploi soumettre, ProfilRecherche correspondre[])
	{
		super();
		this.idCV = idCV;
		this.fichierCV = fichierCV;
		this.dateSoumission = dateSoumission;
		this.formation = formation;
		this.competences = competences;
		this.experienceProfessionel = experienceProfessionel;
		this.reference = reference;
		this.soumettre = soumettre;
		this.correspondre = correspondre;
	}

	public CV()
	{
		super();
	}

	public Integer getIdCV()
	{
		return idCV;
	}

	public void setIdCV(Integer idCV)
	{
		this.idCV = idCV;
	}

	public String getFichierCV()
	{
		return fichierCV;
	}

	public void setFichierCV(String fichierCV)
	{
		this.fichierCV = fichierCV;
	}

	public String getDateSoumission()
	{
		return dateSoumission;
	}

	public void setDateSoumission(String dateSoumission)
	{
		this.dateSoumission = dateSoumission;
	}

	public String getFormation()
	{
		return formation;
	}

	public void setFormation(String formation)
	{
		this.formation = formation;
	}

	public String getCompetences()
	{
		return competences;
	}

	public void setCompetences(String competences)
	{
		this.competences = competences;
	}

	public String getExperienceProfessionel()
	{
		return experienceProfessionel;
	}

	public void setExperienceProfessionel(String experienceProfessionel)
	{
		this.experienceProfessionel = experienceProfessionel;
	}

	public String getReference()
	{
		return reference;
	}

	public void setReference(String reference)
	{
		this.reference = reference;
	}

	public ChercheurEmploi getSoumettre()
	{
		return soumettre;
	}

	public void setSoumettre(ChercheurEmploi soumettre)
	{
		this.soumettre = soumettre;
	}

	public ProfilRecherche[] getCorrespondre()
	{
		return correspondre;
	}

	public void setCorrespondre(ProfilRecherche[] correspondre)
	{
		this.correspondre = correspondre;
	}

} // End Class CV
