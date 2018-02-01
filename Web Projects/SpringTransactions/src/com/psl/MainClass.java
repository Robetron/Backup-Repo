package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		ClassA a = context.getBean("a",ClassA.class); 
//		a.method1();
		
		ClassC c = context.getBean("c", ClassC.class);
		c.method1();
		
		
	}

}
