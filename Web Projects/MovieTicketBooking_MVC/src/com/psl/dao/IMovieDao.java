
package com.psl.dao;

import java.util.List;



import com.psl.beans.Booking;
import com.psl.beans.Movie;

public interface IMovieDao {
	
	//void createEmployee(Employee e);
	List<Movie> getMovies(String city);
	void bookTicket(Booking b);
	//void updateEmployee(int id,String name);
	//void deleteEmployee(int id);

}
