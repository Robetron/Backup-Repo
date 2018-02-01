package main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Actor;
import model.Person;
import model.Politician;

public class Application {

	public static void main(String[] args) {
		
		List<Person> personList = getListOfPerson();
		List<Actor> actorList = getListOfActors();
		List<Politician> politicianList = getListOfPoliticians();
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").
				buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		for (Person person : personList) {
			session.save(person);
		}
		
		for (Actor actor : actorList) {
			session.save(actor);
		}
		
		for (Politician politician : politicianList) {
			session.save(politician);
		}
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}
	
	private static List<Person> getListOfPerson() {
		List<Person> personList = new ArrayList<Person>();
		
		Person p1 = new Person();
		p1.setName("Virat");
		personList.add(p1);
		
		Person p2 = new Person();
		p2.setName("Anushka");
		personList.add(p2);
		
		return personList;
	}

	private static List<Politician> getListOfPoliticians() {
		
		List<Politician> politicianList = new ArrayList<Politician>();
		
		Politician p1 = new Politician();
		p1.setName("Modi");
		p1.setDesignation("PM");
		politicianList.add(p1);
		
		Politician p2 = new Politician();
		p2.setName("Rahul Baba");
		p2.setDesignation("Congress VP");
		politicianList.add(p2);
		
		return politicianList;
	}

	private static List<Actor> getListOfActors() {
		
		List<Actor> actorList = new ArrayList<Actor>();
		
		Actor p1 = new Actor();
		p1.setName("Akshay");
		p1.setPerformance("Excellant");
		actorList.add(p1);
		
		Actor p2 = new Actor();
		p2.setName("Sonakshi");
		p2.setPerformance("Average");
		actorList.add(p2);
		
		return actorList;
	}

	

}










