package edu.wccnet.emeyer.springMVC.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.wccnet.emeyer.springMVC.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("from Customer c order by name", 
				Customer.class);
		return query.getResultList();
	}
	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		//session.save(theStudent);
		session.saveOrUpdate(theCustomer);
	}
	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Customer.class, id);
	
	}
	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Customer where id = :id");
		query.setParameter("id", id);
		query.executeUpdate();
	}
	

}

