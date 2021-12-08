package edu.wccnet.emeyer.springMVC.dao;

import java.util.List;


import edu.wccnet.emeyer.springMVC.entity.Customer;
import edu.wccnet.emeyer.springMVC.entity.Movie;

public interface MovieDAO {

	public List<Movie> getMovies();

	public void saveMovie(Movie newMovie);

	public Movie getMovie(int id);
	
	public Movie getMovie(String title);
	
	public List<Movie> seachMovie(String searchString);

	public void deleteMovie(int id);

	public Movie rentMovie(int movieId);
		
}
