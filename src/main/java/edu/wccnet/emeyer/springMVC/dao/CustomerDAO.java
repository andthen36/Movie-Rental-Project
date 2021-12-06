package edu.wccnet.emeyer.springMVC.dao;

import java.util.List;


import edu.wccnet.emeyer.springMVC.entity.Customer;

public interface CustomerDAO {

	public void saveCustomer(Customer theStudent);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);

	List<Customer> getCustomers();
		
}
