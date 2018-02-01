package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Employee;
import com.psl.service.EmployeeService;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		EmployeeService empService = context.getBean("service", EmployeeService.class);
		Employee emp = context.getBean("employee", Employee.class);

		empService.createEmployee(emp);
		empService.updateEmployee(4, "Lerisa Gomes");
		empService.deleteEmployee(2);
		
		System.out.println(empService.getAllEmployees());
	}
}
 