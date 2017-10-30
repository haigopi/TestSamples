package com.hibernate.dao;

import java.io.InputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.User;

public class HibernateSessionFactory
{
	private static SessionFactory sessionFactory;
	
	static {
		
		try {
			sessionFactory = buildSessionFactory();
			
		}catch(Exception ex) {
			System.out.println("Caught exception...");
			ex.printStackTrace();
		}
	}
    
	public static SessionFactory getSesionFactory() {
		return sessionFactory;
	}
	
	private static SessionFactory buildSessionFactory() throws Exception
	{			
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(User.class);
		
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream settingsFile = classLoader.getResourceAsStream("hibernate.properties");
		Properties hibernateProperties = new Properties();
		hibernateProperties.load(settingsFile);
		
		if (hibernateProperties.isEmpty()) {
			throw new Exception("Hibernate configuration is empty");
		}
		configuration.setProperties(hibernateProperties);
		sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
		
	}
}
