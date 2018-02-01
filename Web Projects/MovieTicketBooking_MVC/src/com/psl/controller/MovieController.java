package com.psl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;








import com.psl.beans.Booking;
import com.psl.beans.Movie;
import com.psl.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService service;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String showHomePage(Model model){
		
		System.out.println("In EmployeeController.showHomePage()");
		model.addAttribute("movie", new Movie());
		return "home";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.POST)
	public String showMovieDeails(Model model,@ModelAttribute Movie m){
		
		System.out.println("Inside Movie details)");
		List<Movie> list=service.showDetails(m.getCity());
		model.addAttribute("list", list);
		return "showdetails";
	}
	
	@RequestMapping(value="/{moviename}/{id}/{city}",method=RequestMethod.GET)
	public String showTicketBooking(Model model,@PathVariable String moviename,@PathVariable int id,@PathVariable String city){
		
		model.addAttribute("movie", new Movie());
		System.out.println("Inside ShowTicketBooking!!!)"+moviename+","+id+","+city);
		model.addAttribute("moviename", moviename);
		model.addAttribute("id", id);
		model.addAttribute("city", city);
		model.addAttribute("booking", new Booking());
		//serice.bookTicket(b);
		return "ticketbooking";
	}
	
	@RequestMapping(value="/{moviename}/{id}/{city}",method=RequestMethod.POST)
	public String bookMovieDeails(Model model,@Valid @ModelAttribute Booking b,BindingResult br){
		
		if(br.hasErrors())
			return "ticketbooking";
		System.out.println("Inside Book Movie details)");
		System.out.println(b);
		service.bookTicket(b);
		model.addAttribute("movie", new Movie());

//		List<Movie> list=service.showDetails(m.getCity());
//		model.addAttribute("list", list);
		return "home";
	}
}
