package edu.wccnet.emeyer.springMVC.Service;

import java.util.List;


import edu.wccnet.emeyer.springMVC.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);
}
