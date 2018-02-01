package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee_details")
public class Employee implements Serializable{

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", skills=" + skills
				+ "]";
	}
	private static final long serialVersionUID = -4093530936580029251L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private int id;
	@Column(name="emp_name")
	private String name;
	
	//@ManyToMany(mappedBy="employees", cascade=CascadeType.ALL/*,fetch=FetchType.EAGER*/)
	@ManyToMany(cascade=CascadeType.ALL/*,fetch=FetchType.EAGER*/)
	private List<Skill> skills = new ArrayList<Skill>();
	
	
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
	
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
}
