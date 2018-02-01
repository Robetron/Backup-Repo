package com.app.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;
import com.app.model.Skill;


public class Application {
	public static void main(String[] args) {
		List<Skill> skillList = populateSkills();
		List<Employee> empList = populateEmployees(skillList);
		System.out.println(empList);

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
//		System.out.println(list);
//		
//		Transaction Begins
		session.beginTransaction();

//		CREATE
		for (Skill skill : skillList) {
			session.save(skill);
		}
		for (Employee employee : empList) {
			session.save(employee);
		}
		
//		READ
//		Single Row
//		emp = (Employee) session.get(Employee.class, 2);
//		System.out.println(emp);
//		Multiple Rows
//		for (int i = 1; i <= 3; i++) {
//			emp = (Employee) session.get(Employee.class, i);
//			System.out.println(emp);
//		}
//		
//		UPDATE
//		Employee emp = (Employee) session.get(Employee.class, 3);
//		emp.setSkills("AWS, IOT");
//		session.update(emp);
//		
//		DELETE
//		Employee emp = (Employee) session.get(Employee.class, 1);
//		session.delete(emp);
		
		
//		Transaction Ends
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	private static List<Skill> populateSkills() {
		List<Skill> returnList = new ArrayList<Skill>();
		Skill skill = null;		
		
		skill = new Skill();
		skill.setName("Java");
		skill.setVersion(1.8);
		returnList.add(skill);
		
		skill = new Skill();
		skill.setName("Angular");
		skill.setVersion(4);
		returnList.add(skill);
		
		skill = new Skill();
		skill.setName("Android");
		skill.setVersion(8.0);
		returnList.add(skill);
		
		return returnList;
	}

	private static List<Employee> populateEmployees(List<Skill> skillList) {
		List<Employee> returnList = new ArrayList<Employee>();
		//System.out.println(skillList);
		Employee emp = null;
		
		emp = new Employee();
		emp.setName("Yvens");
		emp.setSkill(skillList.get(1));
		//emp.getAddresses().add(new Address(123, "Calangute", "Goa", 403516));
		//emp.getAddresses().add(new Address(124, "Candolim", "Goa", 403515));
		//emp.getAddresses().add(new Address(127, "Calangute", "Goa", 403516));
		//emp.getAddresses().add(new Address(140, "Baga", "Goa", 403517));
		//emp.setHomeAddress();
		//emp.setOfficeAddress(new Address(001, "Verna", "Goa", 403510));
		//emp.setSkills("Python, ML");
		returnList.add(emp);
		

		emp = new Employee();
		emp.setName("Vishal");
		emp.setSkill(skillList.get(2));
		//emp.getAddresses().add(new Address(461, "Moira", "Goa", 403507));
		//emp.getAddresses().add(new Address(490, "Aldona", "Goa", 403507));
		//emp.setHomeAddress(new Address(461, "Moira", "Goa", 403507));
		//emp.setOfficeAddress(new Address(001, "Verna", "Goa", 403510));
		//emp.setSkills("Android, Java");
		returnList.add(emp);
		

		emp = new Employee();
		emp.setName("Lerisa");
		emp.setSkill(skillList.get(1));
		//emp.getAddresses().add(new Address(111, "Rachol", "Goa", 403719));
		//emp.setHomeAddress(new Address(111, "Rachol", "Goa", 403719));
		//emp.setOfficeAddress(new Address(001, "Verna", "Goa", 403722));
		//emp.setSkills("Meteor, Angular");
		returnList.add(emp);
		

		emp = new Employee();
		emp.setName("Troy");
		emp.setSkill(skillList.get(0));
		//emp.getAddresses().add(new Address(200, "Moira", "Goa", 403507));
		//emp.getAddresses().add(new Address(234, "Aldona", "Goa", 403508));
		//emp.setHomeAddress(new Address(234, "Aldona", "Goa", 403508));
		//emp.setOfficeAddress(new Address(002, "Vasco", "Goa", 403511));
		//emp.setSkills("IMS");
		returnList.add(emp);
		
		return returnList;
	}
}
