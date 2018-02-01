package com.psl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.beans.Employee;
import com.psl.service.EmployeeService;

//http://localhost:8080/SpringMVC/home
// http://localhost:8080/SpringMVC context pattern
// /home is called url pattern
@Controller
@RequestMapping(value="/employee")//this get appened to all the urls i.e /employee/home
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@RequestMapping(value={"/","/home"},method=RequestMethod.GET)// handler mapping checks for these two value
	public String showHomePage(Model model){
	
		System.out.println("In employee controller.showHomePage()");
		model.addAttribute("message", "Hello World");
		model.addAttribute("employee", new Employee());
		List<Employee> list=service.getAllEmployees();
		model.addAttribute("list",list);
		return "home";
		
	}
	
	@RequestMapping(value={"/","/home"},method=RequestMethod.POST)// handler mapping checks for these two value
	public String register(Model model,@Valid @ModelAttribute Employee e,BindingResult result){
	
		System.out.println("In employee controller.showHomePage() "+e);
//		model.addAttribute("message", "Hello World");
//		model.addAttribute("employee", new Employee());
		if(result.hasErrors())
			return "home";
		service.createEmployee(e);
	//return "home";
		return"redirect:/employee/home";
	}
	//to reduce this below code rewritting we use @PathVariable
	//to pass parameter from url use @RequestParam
	@RequestMapping(value="/{empName}",method=RequestMethod.GET)
	public String showSruthiPage(Model model,@PathVariable String empName,@RequestParam(required=false)String dept){
		System.out.println("In employee controller.showHomePage()");
		model.addAttribute("message", "Hello "+empName);
		model.addAttribute("dept", " from department"+dept);
		return "emp";
	}
	
}
