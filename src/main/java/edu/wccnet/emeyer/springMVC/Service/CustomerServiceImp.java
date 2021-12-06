package edu.wccnet.emeyer.springMVC.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.wccnet.emeyer.springMVC.dao.CustomerDAO;
import edu.wccnet.emeyer.springMVC.entity.Customer;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.saveCustomer(theCustomer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(id);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerDAO.deleteCustomer(id);
	}

}
