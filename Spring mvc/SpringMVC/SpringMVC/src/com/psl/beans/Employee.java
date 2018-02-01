package com.psl.beans;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Employee {
	@Min(value = 1)
	private int id;
	@Size(min = 5, max = 15, message = "Name should be 5-15 long")
	private String name;

	private String email;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email
				+ "]";
	}

}
