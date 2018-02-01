package com.psl.dao;

import java.util.List;

import com.psl.beans.Employee;

public interface IEmpDAO {

	void createEmployee(Employee e);

	List<Employee> getAllEmployees();

	void updateEmployee(int id, String name,String email);

	void deleteEmployee(int id);
}
