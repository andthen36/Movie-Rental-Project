package edu.wccnet.emeyer.springMVC.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.wccnet.emeyer.springMVC.entity.Checkout;
import edu.wccnet.emeyer.springMVC.entity.Customer;


@Repository
public class CheckoutDAOImpl implements CheckoutDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Checkout> getCheckouts() {
		Session session = sessionFactory.getCurrentSession();
		Query<Checkout> query = session.createQuery("from Checkout", 
				Checkout.class);
		return query.getResultList();
	}

	@Override
	public void saveCheckout(Checkout newCheckout) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		//session.save(theStudent);
		session.saveOrUpdate(newCheckout);
	}
	@Override
	public Checkout getCheckout(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.get(Checkout.class, id);
		return null;
	}
	@Override
	public void deleteCheckout(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Checkout checkout = session.get(Checkout.class, id);
		session.remove(checkout);
	}

}
