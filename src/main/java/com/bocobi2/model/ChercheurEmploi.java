/**************************************************************************
* Source File	:  chercheurEmploi.java
* Author                   :  MFOGO  
* Project name         :  Emploi* Created                 :  29/08/2018
* Modified   	:  04/10/2018
* Description	:  Definition of the class chercheurEmploi
**************************************************************************/
package com.bocobi2.model;

import java.util.Set;

public class ChercheurEmploi extends Internaute
{
	public ChercheurEmploi(Integer idUtilisateur, String role, String login, String password, String telephone,
			String email, SuiviUtilisateur[] detenir, Historique[] effectuer, Set<Role> roles, String connectionStatus)
	{
		super(idUtilisateur, role, login, password, telephone, email, detenir, effectuer, roles,connectionStatus);
		// TODO Auto-generated constructor stub
	}

	public ChercheurEmploi(String nom, String prenom, String sexe, String statutMarital, String natureContrat,
			String niveauEtude, String anciennete, String dureeSouhaitee, String role, String login, String password,
			String telephone, String email, String connectionStatus)
	{
		super(role, login, password, telephone, email,connectionStatus);
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.statutMarital = statutMarital;
		this.natureContrat = natureContrat;
		this.niveauEtude = niveauEtude;
		this.Anciennete = anciennete;
		this.DureeContratSouhaite = dureeSouhaitee;
		this.setRole(role);
		this.setLogin(login);
		this.setPassword(password);
		this.setEmail(email);
		this.setConnectionStatus(connectionStatus);	
		}

	private long	idChercheurEmploi;
	private String	nom;
	private String	prenom;
	private String	sexe;
	private String	statutMarital;
	private String	role;
	private String	natureContrat;
	private String	niveauEtude;
	private String	Anciennete;
	private String	DureeContratSouhaite;
	CV				soumettre[];

	/**
	 * @return the idChercheurEmploi
	 */
	public long getIdChercheurEmploi()
	{
		return idChercheurEmploi;
	}

	public String getRole()
	{
		return role;
	}

	public void setRole(String role)
	{
		this.role = role;
	}

	/**
	 * @param l
	 *            the idChercheurEmploi to set
	 */
	public void setIdChercheurEmploi(long l)
	{
		this.idChercheurEmploi = l;
	}

	/**
	 * @return the nom
	 */
	public String getNom()
	{
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom)
	{
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom()
	{
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	/**
	 * @return the sexe
	 */
	public String getSexe()
	{
		return sexe;
	}

	/**
	 * @param sexe
	 *            the sexe to set
	 */
	public void setSexe(String sexe)
	{
		this.sexe = sexe;
	}

	/**
	 * @return the statutMarital
	 */
	public String getStatutMarital()
	{
		return statutMarital;
	}

	/**
	 * @param statutMarital
	 *            the statutMarital to set
	 */
	public void setStatutMarital(String statutMarital)
	{
		this.statutMarital = statutMarital;
	}

	/**
	 * @return the natureContrat
	 */
	public String getNatureContrat()
	{
		return natureContrat;
	}

	/**
	 * @param natureContrat
	 *            the natureContrat to set
	 */
	public void setNatureContrat(String natureContrat)
	{
		this.natureContrat = natureContrat;
	}

	/**
	 * @return the niveauEtude
	 */
	public String getNiveauEtude()
	{
		return niveauEtude;
	}

	/**
	 * @param niveauEtude
	 *            the niveauEtude to set
	 */
	public void setNiveauEtude(String niveauEtude)
	{
		this.niveauEtude = niveauEtude;
	}

	/**
	 * @return the anciennete
	 */
	public String getAnciennete()
	{
		return Anciennete;
	}

	/**
	 * @param anciennete
	 *            the anciennete to set
	 */
	public void setAnciennete(String anciennete)
	{
		Anciennete = anciennete;
	}

	/**
	 * @return the dureeContratSouhaite
	 */
	public String getDureeContratSouhaite()
	{
		return DureeContratSouhaite;
	}

	/**
	 * @param dureeContratSouhaite
	 *            the dureeContratSouhaite to set
	 */
	public void setDureeContratSouhaite(String dureeContratSouhaite)
	{
		DureeContratSouhaite = dureeContratSouhaite;
	}

	/**
	 * @return the soumettre
	 */
	public CV[] getSoumettre()
	{
		return soumettre;
	}

	/**
	 * @param soumettre
	 *            the soumettre to set
	 */
	public void setSoumettre(CV[] soumettre)
	{
		this.soumettre = soumettre;
	}

	public ChercheurEmploi()
	{
		super();
	}

} // End Class chercheurEmploi
