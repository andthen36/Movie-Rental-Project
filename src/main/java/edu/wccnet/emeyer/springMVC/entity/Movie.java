package edu.wccnet.emeyer.springMVC.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "movie")
public class Movie {
	
	@JsonIgnore
	@OneToMany(mappedBy = "movie", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Checkout> checkoutList = new ArrayList<Checkout>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "movie_title")
	private String title;
	
	@Column(name = "movie_year")
	private int year;
	
	@Column(name = "movie_length")
	private int length;
	
	@Column(name = "movie_genre")
	private String genre;
	
	@Column(name = "movie_release")
	private String release;
	
	@Column(name = "movie_rating")
	private String rating;
	
	@Column(name = "movie_description")
	private String description;
	
	@Column(name = "movie_totalCopies")
	private int totalCopies;
	
	@Column(name = "movie_availableCopies")
	private int availableCopies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public Movie(String title, int year, int length, String genre, String release, String rating, String description,
			int totalCopies, int availableCopies) {
		super();
		this.title = title;
		this.year = year;
		this.length = length;
		this.genre = genre;
		this.release = release;
		this.rating = rating;
		this.description = description;
		this.totalCopies = totalCopies;
		this.availableCopies = availableCopies;
	}

	public Movie() {
		
	}
	
	public Movie(List<Checkout> checkoutList, String title, int year, int length, String genre, String release,
			String rating, String description, int totalCopies, int availableCopies) {
		super();
		this.checkoutList = checkoutList;
		this.title = title;
		this.year = year;
		this.length = length;
		this.genre = genre;
		this.release = release;
		this.rating = rating;
		this.description = description;
		this.totalCopies = totalCopies;
		this.availableCopies = availableCopies;
	}

	public List<Checkout> getCheckoutList() {
		return checkoutList;
	}

	public void setCheckoutList(List<Checkout> checkoutList) {
		this.checkoutList = checkoutList;
	}

	@Override
	public String toString() {
		return "Movie [checkoutList=" + checkoutList + ", id=" + id + ", title=" + title + ", year=" + year
				+ ", length=" + length + ", genre=" + genre + ", release=" + release + ", rating=" + rating
				+ ", description=" + description + ", totalCopies=" + totalCopies + ", availableCopies="
				+ availableCopies + "]";
	}
	
	

}
