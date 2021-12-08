package edu.wccnet.emeyer.springMVC.dao;

import java.util.List;


import edu.wccnet.emeyer.springMVC.entity.Checkout;
import edu.wccnet.emeyer.springMVC.entity.Customer;


public interface CheckoutDAO {
	
	public List<Checkout> getCheckouts(int id);

	public void saveCheckout(Checkout newCheckout);

	public Checkout getCheckout(int id);

	public Checkout returnCheckout(int id);
		
}
