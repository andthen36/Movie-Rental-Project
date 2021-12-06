package edu.wccnet.emeyer.springMVC.controller;

import java.util.ArrayList;




import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.wccnet.emeyer.springMVC.Service.MovieService;
import edu.wccnet.emeyer.springMVC.Service.CheckoutService;
import edu.wccnet.emeyer.springMVC.entity.Customer;
import edu.wccnet.emeyer.springMVC.entity.Movie;




@RestController
@RequestMapping("/api")
public class MyRestController {
	@Autowired
	private MovieService movieService;
	@Autowired
	private CheckoutService checkoutService;
	
	private List<Movie> movies;
	
	
	@PostConstruct
	public void loadMovies() {
		movies = new ArrayList<>();
	}
	
	// Getting all customers from JSON
	@GetMapping("/movies")
	public List<Movie> getMovies(){
		return movieService.getMovies();
	}
	
	//Getting a specific customer
	@GetMapping("movies/{title}")
	public Movie getMovie(@PathVariable String title) {
		return movieService.getMovie(title);
	}
	
	
}
