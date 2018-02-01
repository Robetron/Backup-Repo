package com.psl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.beans.Employee;
import com.psl.dao.IEmployeeDAO;

@Service
public class EmployeeService {
	
	@Autowired
	private IEmployeeDAO dao;
	public IEmployeeDAO getDao() {
		return dao;
	}
	public void setDao(IEmployeeDAO dao) {
		this.dao = dao;
	}
	public void createEmployee(Employee emp) {
		dao.createEmployee(emp);
	}
	public void updateEmployee(int id, String name) {
		dao.updateEmployee(id, name);
	}
	public void deleteEmployee(int id) {
		dao.deleteEmployee(id);
	}
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}
}
