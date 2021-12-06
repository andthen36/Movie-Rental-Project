package edu.wccnet.emeyer.springMVC.controller;

import java.time.LocalDate;

import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.wccnet.emeyer.springMVC.Service.CustomerService;
import edu.wccnet.emeyer.springMVC.Service.MovieService;
import edu.wccnet.emeyer.springMVC.Service.CheckoutService;
import edu.wccnet.emeyer.springMVC.dao.MovieDAO;
import edu.wccnet.emeyer.springMVC.entity.Checkout;
import edu.wccnet.emeyer.springMVC.entity.Customer;
import edu.wccnet.emeyer.springMVC.entity.Movie;
import edu.wccnet.emeyer.springMVC.entity.MoviePop;

@Controller
public class MainController {
	
	@Autowired
	private MoviePop moviePop;
	
	@Autowired
	private CheckoutService checkoutService;
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private CustomerService customerService;

	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("customers",customerService.getCustomers());
		return "login";
	}
	
	@GetMapping("/list")
	public String listMovies(Model model) {
		model.addAttribute("movies",movieService.getMovies());
		return "list-movies";
	}
	
	@PostMapping("/list")
	public String listMovies(Model model, @RequestParam("customerId") int id) {
		model.addAttribute("movies",movieService.getMovies());
		Customer customer = customerService.getCustomer(id);
		model.addAttribute("customerId", customer.getId());
		return "list-movies";
	}
	
	@PostMapping("/rentMovie")
	public String rentMovies(@ModelAttribute("checkout")Checkout newCheckout, @RequestParam("customerId") int customerId, @RequestParam("movieId") int movieId) {
		System.out.println(newCheckout);
		checkoutService.saveCheckout(newCheckout);
		return "redirect:/customer";
	}
	
	@PostMapping("/search")
	public String search(Model model) {
		model.addAttribute("movies",movieService.getMovies());
		return "search";
	}
	
	@PostMapping("/searchMovie")
	public String searchMovie(@RequestParam("seachString")String searchString) {
		movieService.searchMovie(searchString);
		return "searchList";
	}
	
	@GetMapping("/newMovie")
	public String newMovie(Model model) {
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "add-movie";
	}
	@PostMapping("/processMovie")
	public String processMovie(@ModelAttribute("movie")Movie newMovie) {
		System.out.println(newMovie);
		movieService.saveMovie(newMovie);
		return "redirect:/list";
		
	}
	
	@PostMapping("/loginCustomer")
	public String loginCustomer(Model model, @RequestParam("customerId") int id) {
		model.addAttribute("movies", movieService.getMovie(id));
		Customer customer = customerService.getCustomer(id);
		model.addAttribute("customerName", customer.getName());
		model.addAttribute("customerId", customer.getId());
		return "customer";
		
	}
	@ModelAttribute
	public void populateFormWithData(Model model) {
		model.addAttribute("ratingList", moviePop.populateRating());
		model.addAttribute("genreList", moviePop.populateGenre());
		model.addAttribute("toppingList", moviePop.populateTopping());
	}
}