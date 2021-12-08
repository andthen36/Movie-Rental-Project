package edu.wccnet.emeyer.springMVC.Service;

import java.util.List;


import edu.wccnet.emeyer.springMVC.entity.Checkout;
import edu.wccnet.emeyer.springMVC.entity.Customer;


public interface CheckoutService {
	
	public List<Checkout> getCheckouts(int id);

	public void saveCheckout(Checkout newCheckout);

	public Checkout getCheckout(int id);

	public Checkout returnCheckout(int id);

}
