/**************************************************************************
* Source File	:  Internaute.java
* Author                   :  MFOGO  
* Project name         :  Emploi* Created                 :  04/10/2018
* Modified   	:  04/10/2018
* Description	:  Definition of the class Internaute
**************************************************************************/
package com.bocobi2.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Internaute
{
	private long		idUtilisateur;
	private String		role;
	private String		login;
	private String		password;
	private String		telephone;
	private String		email;
	SuiviUtilisateur	detenir[];
	Historique			effectuer[];
	private String      connectionStatus;

	/**
	 * @return the connectionStatus
	 */
	public String getConnectionStatus() {
		return connectionStatus;
	}

	/**
	 * @param connectionStatus the connectionStatus to set
	 */
	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	private Set<Role>	roles=new HashSet<>();

	
	public Internaute(long idUtilisateur, String role, String login, String password, String telephone, String email,
			SuiviUtilisateur[] detenir, Historique[] effectuer, Set<Role> roles, String connectionStatus) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.role = role;
		this.login = login;
		this.password = password;
		this.telephone = telephone;
		this.email = email;
		this.detenir = detenir;
		this.effectuer = effectuer;
		this.connectionStatus = connectionStatus;
		this.roles = roles;
	}

	public Internaute(Integer idUtilisateur, String role, String login, String password, String telephone, String email, String connectionStatus)
	{
		super();
		this.idUtilisateur = idUtilisateur;
		this.role = role;
		this.login = login;
		this.password = password;
		this.telephone = telephone;
		this.email = email;
		this.detenir = detenir;
		this.effectuer = effectuer;
		this.connectionStatus = connectionStatus;
		this.roles = roles;
	}

	public Internaute(String role, String login, String password, String telephone, String email, String connectionStatus)
	{
		super();
		this.idUtilisateur = idUtilisateur;
		this.role = role;
		this.login = login;
		this.password = password;
		this.telephone = telephone;
		this.email = email;
		this.detenir = detenir;
		this.effectuer = effectuer;
		this.connectionStatus = connectionStatus;
		this.roles = roles;
	}

	public Internaute()
	{
		super();
	}

	/**
	 * @return the idUtilisateur
	 */
	public long getIdUtilisateur()
	{
		return idUtilisateur;
	}

	/**
	 * @param l
	 *            the idUtilisateur to set
	 */
	public void setIdUtilisateur(long l)
	{
		this.idUtilisateur = l;
	}

	/**
	 * @return the role
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(String role)
	{
		this.role = role;
	}

	/**
	 * @return the login
	 */
	public String getLogin()
	{
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login)
	{
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone()
	{
		return telephone;
	}

	/**
	 * @param telephone
	 *            the telephone to set
	 */
	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * @return the detenir
	 */
	public SuiviUtilisateur[] getDetenir()
	{
		return detenir;
	}

	/**
	 * @param detenir
	 *            the detenir to set
	 */
	public void setDetenir(SuiviUtilisateur[] detenir)
	{
		this.detenir = detenir;
	}

	/**
	 * @return the effectuer
	 */
	public Historique[] getEffectuer()
	{
		return effectuer;
	}

	/**
	 * @param effectuer
	 *            the effectuer to set
	 */
	public void setEffectuer(Historique[] effectuer)
	{
		this.effectuer = effectuer;
	}

	/**
	 * @return the roles
	 */
	public Set<Role> getRoles()	{
		Set<Internaute> setInternaute=new HashSet<>();
		setInternaute.add(this);
		Role r=new Role("CHERCHEUREMPLOI",setInternaute);
		roles.add(r);
		return roles;
	}

	/**
	 * @param roles
	 *            the roles to set
	 */
	public void setRoles(Set<Role> roles)
	{
		this.roles = roles;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Internaute [idUtilisateur=" + idUtilisateur + ", role=" + role + ", login=" + login + ", password="
				+ password + ", telephone=" + telephone + ", email=" + email + ", detenir=" + Arrays.toString(detenir)
				+ ", effectuer=" + Arrays.toString(effectuer) + ", connectionStatus=" + connectionStatus + ", roles="
				+ roles + "]";
	}

	
	// Operations

} // End Class Internaute
