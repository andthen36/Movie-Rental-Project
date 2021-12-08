package edu.wccnet.emeyer.springMVC.Service;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.wccnet.emeyer.springMVC.dao.MovieDAO;
import edu.wccnet.emeyer.springMVC.dao.CheckoutDAO;
import edu.wccnet.emeyer.springMVC.entity.Checkout;
import edu.wccnet.emeyer.springMVC.entity.Customer;


@Service
public class CheckoutServiceImp implements CheckoutService {
	
	@Autowired
	private CheckoutDAO checkoutDAO;
	
	@Override
	@Transactional
	public List<Checkout> getCheckouts(int id) {
		// TODO Auto-generated method stub
		return checkoutDAO.getCheckouts(id);
	}

	@Override
	@Transactional
	public void saveCheckout(Checkout newCheckout) {
		// TODO Auto-generated method stub
		checkoutDAO.saveCheckout(newCheckout);
		
	}

	@Override
	@Transactional
	public Checkout getCheckout(int id) {
		// TODO Auto-generated method stub
		return checkoutDAO.getCheckout(id);
	}

	@Override
	@Transactional
	public Checkout returnCheckout(int id) {
		// TODO Auto-generated method stub
		return checkoutDAO.returnCheckout(id);
	}

	
}


