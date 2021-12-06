package edu.wccnet.emeyer.springMVC.entity;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Checkout> checkoutList = new ArrayList<Checkout>();
	
	public Customer(int id, List<Checkout> checkoutList, String name) {
		super();
		this.id = id;
		this.checkoutList = checkoutList;
		this.name = name;
	}


	public List<Checkout> getCheckoutList() {
		return checkoutList;
	}


	public void setCheckoutList(List<Checkout> checkoutList) {
		this.checkoutList = checkoutList;
	}


	@Column(name = "name")
	private String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
 

	@Override
	public String toString() {
		return "Customer [id=" + id + ", checkoutList=" + checkoutList + ", name=" + name + "]";
	}


	public Customer(String name) {
		super();
		this.name = name;
	}


	public Customer() {
		
	}
	
	

}
