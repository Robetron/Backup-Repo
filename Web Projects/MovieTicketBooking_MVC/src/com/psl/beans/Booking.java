package com.psl.beans;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component("booking")
public class Booking {

	private int id;
	
	@Size(min=5,max=15,message="UserName should be atleast 5 character long or max 15 character")
	private String username;
	
	private String moviename;
	private String hallname;
	private String city;

	@Min(value=1,message="Please select appropriate number of tickets!! ")
	private int numoftickets;

	public Booking(int id, String username, String moviename, String hallname,
			String city, int numoftickets) {

		this.id = id;
		this.username = username;
		this.moviename = moviename;
		this.hallname = hallname;
		this.city = city;
		this.numoftickets = numoftickets;
	}

	public int getId() {
		return id;
	}

	public Booking() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", username=" + username + ", moviename="
				+ moviename + ", hallname=" + hallname + ", city=" + city
				+ ", numoftickets=" + numoftickets + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getHallname() {
		return hallname;
	}

	public void setHallname(String hallname) {
		this.hallname = hallname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNumoftickets() {
		return numoftickets;
	}

	public void setNumoftickets(int numoftickets) {
		this.numoftickets = numoftickets;
	}

	// Id, Username, Movie, City, Cinema Hall name, Num of tickets booked.

}
