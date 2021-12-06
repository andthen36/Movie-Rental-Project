package edu.wccnet.emeyer.springMVC.entity;

import java.util.LinkedHashMap;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MoviePop {
	
	public Map<String, String>populateRating(){
		Map<String,String> ratingList = new LinkedHashMap<String,String>();
		ratingList.put("G", "G");
		ratingList.put("PG", "PG");
		ratingList.put("PG-13", "PG-13");
		ratingList.put("R", "R");
		ratingList.put("NC-17", "NC-17");
		return ratingList;
	}
	
	public Map<String, String>populateGenre(){
		Map<String,String> genreList = new LinkedHashMap<String,String>();
		genreList.put("Action", "Action");
		genreList.put("Animation", "Animation");
		genreList.put("Comedy", "Comedy");
		genreList.put("Drama", "Drama");
		genreList.put("Documentry", "Documentry");
		genreList.put("Family", "Family");
		genreList.put("Fantasy", "Fantasy");
		genreList.put("Horror", "Horror");
		genreList.put("Mystery", "Mystery");
		genreList.put("Romance", "Romance");
		genreList.put("Sci-fi", "Sci-fi");
		genreList.put("Thriller", "Thriller");
		return genreList;
	}

	public Map<String, String>populateTopping(){
		Map<String,String> toppingList = new LinkedHashMap<String,String>();
		toppingList.put("Mushroom", "Mushroom");
		toppingList.put("Pepperoni", "Pepperoni");
		toppingList.put("Pineapple", "Pineapple");
		toppingList.put("Black Olives", "Black Olives");
		toppingList.put("Bacon", "Bacon");
		return toppingList;
	}
}
