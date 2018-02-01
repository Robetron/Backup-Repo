package com.psl;

public class Address2 {
	String city, state, zip, landmark;

	public Address2() {
		System.out.println("Default Constructor of Address");
	}

	
	public Address2(String city, String state, String zip, String landmark) {
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.landmark = landmark;
	}


	public String getLandmark() {
		return landmark;
	}


	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}


	public Address2(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Setter of City");
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		System.out.println("Setter of State");
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		System.out.println("Setter of Zip");
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zip=" + zip
				+ "]";
	}
}
