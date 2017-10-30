package com.hibernate.dao.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.dao.HibernateSessionFactory;
import com.hibernate.model.User;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	    User user = new User();
	    user.setName("ABC1");
	    user.setEmailAddress("ABC@zzz.com");
	    user.setUserId("ABC_XYZ1");
	    Session session = null;
	    SessionFactory sessionFactory = HibernateSessionFactory.getSesionFactory();
	    session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user);
	    session.getTransaction().commit();
	    session.flush();
	    session.close();

	}

}
