package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="skill_details")
public class Skill {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="skill_id")
	private int id;
	private String name;
	private double version;
	
	@ManyToOne
	@JoinColumn(name="empId")
	private Employee employee;
	
	public Skill(int id, String name, double version) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
	}
	
	public Skill() {
		super();
	}
	
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
