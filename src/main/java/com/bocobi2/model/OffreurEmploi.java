/**************************************************************************
* Source File	:  OffreurEmploi.java
* Author                   :  MFOGO  
* Project name         :  Emploi* Created                 :  29/08/2018
* Modified   	:  04/10/2018
* Description	:  Definition of the class OffreurEmploi
**************************************************************************/
package com.bocobi2.model;


import java.util.*;



public  class OffreurEmploi  extends Internaute { 
	public OffreurEmploi(String idUtilisateur, String role, String login, String password, String telephone,
			String email, SuiviUtilisateur[] detenir, Historique[] effectuer, Set<Role> roles) {
		super(idUtilisateur, role, login, password, telephone, email, detenir, effectuer, roles);
		// TODO Auto-generated constructor stub
	}
	private Integer idOffreurEmploi;
	private String raisonSociale;
	private String situationGeographique;
	private String descriptionEntreprise;
	private String adresse;
	OffreEmploi publierPour[];
	/**
	 * @return the idOffreurEmploi
	 */
	public Integer getIdOffreurEmploi() {
		return idOffreurEmploi;
	}
	/**
	 * @param idOffreurEmploi the idOffreurEmploi to set
	 */
	public void setIdOffreurEmploi(Integer idOffreurEmploi) {
		this.idOffreurEmploi = idOffreurEmploi;
	}
	/**
	 * @return the raisonSociale
	 */
	public String getRaisonSociale() {
		return raisonSociale;
	}
	/**
	 * @param raisonSociale the raisonSociale to set
	 */
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	/**
	 * @return the situationGeographique
	 */
	public String getSituationGeographique() {
		return situationGeographique;
	}
	/**
	 * @param situationGeographique the situationGeographique to set
	 */
	public void setSituationGeographique(String situationGeographique) {
		this.situationGeographique = situationGeographique;
	}
	/**
	 * @return the descriptionEntreprise
	 */
	public String getDescriptionEntreprise() {
		return descriptionEntreprise;
	}
	/**
	 * @param descriptionEntreprise the descriptionEntreprise to set
	 */
	public void setDescriptionEntreprise(String descriptionEntreprise) {
		this.descriptionEntreprise = descriptionEntreprise;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the publierPour
	 */
	public OffreEmploi[] getPublierPour() {
		return publierPour;
	}
	/**
	 * @param publierPour the publierPour to set
	 */
	public void setPublierPour(OffreEmploi[] publierPour) {
		this.publierPour = publierPour;
	}
	 
	
} //End Class OffreurEmploi


