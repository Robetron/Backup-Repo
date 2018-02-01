package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="skill_details")
public class Skill implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="skill_id")
	private int id;
	private String name;
	private double version;
	
	@ManyToMany(cascade=CascadeType.ALL/*,fetch=FetchType.EAGER*/)
	private List<Employee> employees = new ArrayList<Employee>();
	
	public Skill(int id, String name, double version) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
	}
	
	

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", version=" + version
				+ ", employees=" + employees + "]";
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
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
