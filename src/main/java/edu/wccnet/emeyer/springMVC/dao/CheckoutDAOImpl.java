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
	public List<Checkout> getCheckouts(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query<Checkout> query = session.createQuery("from Checkout where customerId = :customerId", 
				Checkout.class);
		query.setParameter("customerId", id);
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
		Query<Checkout> query = session.createQuery("from Checkout where customerId = :customerId", 
				Checkout.class);
		query.setParameter("customerId", id);
		return query.getSingleResult();
	}
	
	@Override
	public Checkout returnCheckout(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Checkout> query = session.createQuery("from Checkout where id = :id", 
				Checkout.class);
		query.setParameter("id", id);
		return query.getSingleResult();
	}

}
