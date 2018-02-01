package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "employee_details")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private int id;

	@Column(name = "emp_name")
	private String name;

	
	@JoinColumn(name = "emp_skill")
	@OneToOne
	private Skill skill;

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public Employee(int id, String name, Skill skill) {
		super();
		this.id = id;
		this.name = name;
		this.skill = skill;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", skill=" + skill
				+ "]";
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

//	public String getSkills() {
//		return skills;
//	}
//
//	public void setSkills(String skills) {
//		this.skills = skills;
//	}

	/*
	 * @Embedded private Address homeAddress;
	 * 
	 * @Embedded
	 * 
	 * @AttributeOverrides({
	 * 
	 * @AttributeOverride(column = @Column(name="office_no"), name = "hNo"),
	 * 
	 * @AttributeOverride(column = @Column(name="office_city"), name = "city"),
	 * 
	 * @AttributeOverride(column = @Column(name="office_state"), name =
	 * "state"),
	 * 
	 * @AttributeOverride(column = @Column(name="office_pincode"), name =
	 * "pincode") }) private Address officeAddress;
	 */

//	@ElementCollection
//	// Annotation to rename Table and Foreign Key
//	@JoinTable(name = "address_details", joinColumns = @JoinColumn(name = "emp_ID"))
//	// Create a generator of type increment
//	@GenericGenerator(name = "addressIdGen", strategy = "increment")
//	// Add Primary Key
//	@CollectionId(columns = { @Column(name = "address_ID") }, generator = "addressIdGen", type = @Type(type = "int"))
//	// Annotations to get auto incremented values for column address_ID using
//	// generator "addressIdGen"
//	@GeneratedValue(generator = "addressIdGen")
//	private List<Address> addresses = new ArrayList<Address>();
//
//	public List<Address> getAddresses() {
//		return addresses;
//	}
//
//	public void setAddresses(List<Address> addresses) {
//		this.addresses = addresses;
//	}

}
