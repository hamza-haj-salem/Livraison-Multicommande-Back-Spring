package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Role {
	@Id
	private String role;

	public Role(String role) {
		super();
		this.role = role;
	}

	public Role() {
		super();
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
