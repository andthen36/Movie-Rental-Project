package edu.wccnet.emeyer.springMVC.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.wccnet.emeyer.springMVC.dao.MovieDAO;
import edu.wccnet.emeyer.springMVC.entity.Customer;
import edu.wccnet.emeyer.springMVC.entity.Movie;

@Service
public class MovieServiceImp implements MovieService {

	@Autowired
	private MovieDAO movieDAO;
	@Transactional
	public List<Movie> getMovies() {
		// TODO Auto-generated method stub
		return movieDAO.getMovies();
	}
	
	@Transactional
	public Movie rentMovie(int movieId) {
		// TODO Auto-generated method stub
		return movieDAO.rentMovie(movieId);
	}

	@Transactional
	public void saveMovie(Movie newMovie) {
		// TODO Auto-generated method stub
		movieDAO.saveMovie(newMovie);
		
	}

	@Transactional
	public Movie getMovie(int id) {
		// TODO Auto-generated method stub
		return movieDAO.getMovie(id);
	}
	
	@Transactional
	public Movie getMovie(String title) {
		// TODO Auto-generated method stub
		return movieDAO.getMovie(title);
	}
	
	@Transactional
	public List<Movie> searchMovie(String searchString) {
		// TODO Auto-generated method stub
		return movieDAO.seachMovie(searchString);
	}


	@Transactional
	public void deleteMovie(int id) {
		// TODO Auto-generated method stub
		movieDAO.deleteMovie(id);
	}

}
