package com.bocobi2.model;

import java.util.Set;



public class Role {

	
	private String id;
	private String name;
	private Set<Internaute> internautes;
	

	public Role() {

	}

	public Role(String name, Set<Internaute> internautes) {

		this.name = name;
		this.internautes = internautes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the internautes
	 */
	public Set<Internaute> getInternautes() {
		return internautes;
	}

	/**
	 * @param internautes the internautes to set
	 */
	public void setInternautes(Set<Internaute> internautes) {
		this.internautes = internautes;
	}

	
	

}
