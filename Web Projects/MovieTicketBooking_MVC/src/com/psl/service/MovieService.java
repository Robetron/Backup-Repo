package com.psl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






import com.psl.beans.Booking;
import com.psl.beans.Movie;
import com.psl.dao.IMovieDao;

@Service
public class MovieService {

	@Autowired
	private IMovieDao dao;
	
	public MovieService() {
		// TODO Auto-generated constructor stub
	}

	public IMovieDao getDao() {
		return dao;
	}

	public void setDao(IMovieDao dao) {
		this.dao = dao;
	}
	
	public List<Movie> showDetails(String city){
		return dao.getMovies(city);
	}
	
	public void bookTicket(Booking b){
		dao.bookTicket(b);
	}
	
}
