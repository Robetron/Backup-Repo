package com.psl.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.beans.Employee;
import com.psl.dao.IEmpDAO;
@Service
public class EmployeeService {
	@Autowired
	private IEmpDAO dao;

	public IEmpDAO getDao() {
		return dao;
	}

	public void setDao(IEmpDAO dao) {
		this.dao = dao;
	}

	public void createEmployee(Employee e) {
		dao.createEmployee(e);
	}
	
	public void updateEmployee(int id,String name,String email){
		dao.updateEmployee(id, name,email);
	}
	
	public void deleteEmployee(int id){
		dao.deleteEmployee(id);
	}
	
	public List<Employee> getAllEmployees(){
		return dao.getAllEmployees();
	}
}
