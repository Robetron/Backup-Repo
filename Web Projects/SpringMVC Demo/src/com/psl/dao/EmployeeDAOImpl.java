package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.psl.beans.Employee;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	@Autowired
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	//Replace template with getJdbcTemplate()
	@Override
	public void createEmployee(Employee e) {
		//template.update("INSERT INTO employee VALUES(" + e.getId() + ", '" + e.getName() + "', '" + e.getEmail() + "');");
		template.update("INSERT INTO employee VALUES(" + e.getId() + ", '" + e.getName() + "', '" + e.getEmail() + "');");
		System.out.println("Inserted " + e);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return template.query("SELECT * FROM employee;", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
			}
		});
	}

	@Override
	public void updateEmployee(int id, String name) {
		template.update("UPDATE employee SET name = '" + name + "' WHERE id = "
				+ id);
		System.out.println("Updated record " + id);
	}

	@Override
	public void deleteEmployee(int id) {
		template.update("DELETE FROM employee WHERE id=" + id);
		System.out.println("Deleted record " + id);
	}
}
