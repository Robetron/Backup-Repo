package model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Politician extends Person implements Serializable {

	private static final long serialVersionUID = 5169977235267833956L;

	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
