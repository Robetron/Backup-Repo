package main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Employee;
import model.Skill;

public class Application {

	public static void main(String[] args) {
		List<Skill> skills = populateSkills();
		List<Employee> employees = populateEmployee(skills);
		
		setSkills(skills,employees);
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").
				buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		for (Skill skill : skills) {
			session.save(skill);
		}
		
		for (Employee employee : employees) {
			session.save(employee);
		}
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

	private static void setSkills(List<Skill> skills,List<Employee> employees) {
		skills.get(0).setEmployee(employees.get(2));
		skills.get(1).setEmployee(employees.get(0));
		skills.get(2).setEmployee(employees.get(1));
		skills.get(3).setEmployee(employees.get(1));
		skills.get(4).setEmployee(employees.get(0));	
	}

	private static List<Skill> populateSkills() {
		List<Skill> skills = new ArrayList<Skill>();
		
		Skill skill1 = new Skill();
		skill1.setName("Java");
		skill1.setVersion(1.8);
		skills.add(skill1);
		
		Skill skill2 = new Skill();
		skill2.setName("JavaScript");
		skill2.setVersion(5);
		skills.add(skill2);
		
		Skill skill3 = new Skill();
		skill3.setName("Hibernate");
		skill3.setVersion(5.2);
		skills.add(skill3);
		
		Skill skill4 = new Skill();
		skill4.setName("Spring");
		skill4.setVersion(4);
		skills.add(skill4);
		
		Skill skill5 = new Skill();
		skill5.setName("Angular.js");
		skill5.setVersion(5);
		skills.add(skill5);
		
		return skills;
	}

	private static List<Employee> populateEmployee(List<Skill> skills) {
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		// emp1.setId(1);
		emp1.setName("Rohit");
		emp1.getSkills().add(skills.get(1));
		emp1.getSkills().add(skills.get(4));
		employees.add(emp1);
		
		Employee emp2 = new Employee();
		// emp2.setId(2);
		emp2.setName("Shikhar");
		emp2.getSkills().add(skills.get(2));
		emp2.getSkills().add(skills.get(3));
		//emp2.setSkills(skills.get(2));
		employees.add(emp2);
		
		Employee emp3 = new Employee();
		// emp3.setId(3);
		emp3.setName("Ashwin");
		emp3.getSkills().add(skills.get(0));
		//emp3.setSkills(skills.get(0));
		employees.add(emp3);
		
		return employees;
	}

}










