package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="employee_details")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	private int id;
	@Column(name="emp_name")
	private String name;
	
	/*@OneToOne
	@JoinColumn(name="skillId")
	private Skill skills;*/
	
	@OneToMany(mappedBy="employee")
	/*@JoinTable(name="empSkill_details",joinColumns=@JoinColumn(name="empId"),
	inverseJoinColumns=@JoinColumn(name="skillId"))
	@CollectionId(columns = {@Column(name="empSkill_id")}, generator = "empSkillIdGen", 
				  type = @Type(type = "int"))
	@GenericGenerator(name = "empSkillIdGen", strategy = "sequence") */ 
	private List<Skill> skills = new ArrayList<Skill>();
	
	/*@Column(name="emp_skills")
	private String skills;*/
	
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
	/*public Skill getSkills() {
		return skills;
	}
	public void setSkills(Skill skills) {
		this.skills = skills;
	}
	*/
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
	/*public String getSkills() {
		return skills;
	}
	
	public void setSkills(String skills) {
		this.skills = skills;
	}*/
}
