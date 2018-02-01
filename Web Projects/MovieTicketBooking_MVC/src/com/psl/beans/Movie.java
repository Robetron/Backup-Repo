package com.psl.beans;

import org.springframework.stereotype.Component;

@Component("movie")
public class Movie {
	
	private int id;
	private String name;
	private String city;
	private String Status;
	private int discount;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	public Movie(int id, String name, String city, String status, int discount) {
		
		this.id = id;
		this.name = name;
		this.city = city;
		Status = status;
		this.discount = discount;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	

}
