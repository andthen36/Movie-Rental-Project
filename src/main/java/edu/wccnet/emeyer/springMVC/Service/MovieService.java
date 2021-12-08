package edu.wccnet.emeyer.springMVC.Service;

import java.util.List;


import edu.wccnet.emeyer.springMVC.entity.Customer;
import edu.wccnet.emeyer.springMVC.entity.Movie;

public interface MovieService {

	public List<Movie> getMovies();
	
	public Movie rentMovie(int movieId);

	public void saveMovie(Movie newMovie);

	public Movie getMovie(int id);
	
	public Movie getMovie(String title);

	public List<Movie> searchMovie(String searchString);

	public void deleteMovie(int id);
 
}
