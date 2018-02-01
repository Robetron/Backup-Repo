package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skill_details")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "skill_id")
	private int id;

	@Column(name = "skill_name")
	private String name;

	@Column(name = "skill_version")
	private double version;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", version=" + version
				+ "]";
	}

	public Skill(int id, String name, double version) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
	}

	public Skill() {
		super();
	}
	
}