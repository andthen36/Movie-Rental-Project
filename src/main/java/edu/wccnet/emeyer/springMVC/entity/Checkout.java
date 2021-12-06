package edu.wccnet.emeyer.springMVC.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
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

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "checkout")
public class Checkout {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	@ManyToOne( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	@ManyToOne( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "movieId")
	private Movie movie;
	
	
	@Column(name = "outDate")
	private LocalDateTime outDate;
	
	@Column(name = "returnDate")
	private LocalDateTime returnDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public LocalDateTime getOutDate() {
		return outDate;
	}

	public void setOutDate(LocalDateTime outDate) {
		this.outDate = outDate;
	}

	public LocalDateTime getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}


	public Checkout(Customer customer, Movie movie, LocalDateTime outDate, LocalDateTime returnDate) {
		super();
		this.customer = customer;
		this.movie = movie;
		this.outDate = outDate;
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "Checkout [id=" + id + ", customer=" + customer + ", movie=" + movie + ", outDate=" + outDate
				+ ", returnDate=" + returnDate + "]";
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	
	
	

}
