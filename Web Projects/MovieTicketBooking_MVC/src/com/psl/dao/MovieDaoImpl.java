package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.psl.beans.Booking;
import com.psl.beans.Movie;

@Repository
public class MovieDaoImpl implements IMovieDao {

	@Autowired
	private JdbcTemplate template;

	// public JdbcTemplate getTemplate() {
	// return template;
	// }
	//
	// public void setTemplate(JdbcTemplate template) {
	// this.template = template;
	// }

	// @Override
	// public void createEmployee(Employee e) {
	// // TODO Auto-generated method stub
	// String
	// query="insert into employee values("+e.getId()+",'"+e.getName()+"','"+e.getEmail()+"')";
	// System.out.println(query);
	// template.update(query);
	// }

	@Override
	public List<Movie> getMovies(String city) {
		// TODO Auto-generated method stub

		return template.query("Select * from moviedetails where city='" + city
				+ "'", new RowMapper<Movie>() {

			@Override
			public Movie mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub

				Movie e = new Movie();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setCity(rs.getString("city"));
				e.setStatus(rs.getString("status"));
				e.setDiscount(rs.getInt("discount"));
				return e;
			}

		});
	}

	@Override
	public void bookTicket(Booking b) {
	// TODO Auto-generated method stub
	
		//System.out.println("inside bookTicket");
		String query="insert into Bookings values("+b.getId()+",'"+b.getMoviename()+"','"+b.getUsername()+"','"+b.getHallname()+"','"+b.getCity()+"',"+b.getNumoftickets()+")";
		System.out.println(query);
		template.update(query);
		System.out.println("done");
	}

	// @Override
	// public void updateEmployee(int id, String name) {
	// // TODO Auto-generated method stub
	// String query="update employee set id="+id+" where name='"+name+"'";
	// System.out.println(query);
	// template.update(query);
	// }
	//
	// @Override
	// public void deleteEmployee(int id) {
	// // TODO Auto-generated method stub
	// String query="delete from employee where id="+id;
	// System.out.println(query);
	// template.update(query);
	//
	// }

}
