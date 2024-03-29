package com.psl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	@Value(value="Mumbai")
	String city;

	@Value(value="Maharashtra")
	String state;
	
	@Value(value="400007")
	String zip;

	public Address() {
		System.out.println("Address: Default Constructor");
	}

	public Address(String city, String state, String zip) {
		System.out.println("Address: Paramatrized Constructor");
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Address: Setter of City");
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		System.out.println("Address: Setter of State");
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		System.out.println("Address: Setter of Zip");
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zip=" + zip
				+ "]";
	}
	public void myInit() {
		System.out.println("Address: Custom Initialized");
	}
	public void myDestroy() {
		System.out.println("Address: Custom Destroyed");
	}
}
