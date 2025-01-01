package com.mysql.sakiladb;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HibernateSakilaDbCountryMain {

	private static final Logger LOGGER = LoggerFactory.getLogger(HibernateSakilaDbCountryMain.class);
	
	public static void main(String[] args) {

		SessionFactory sessionFactory = null;
		// configures settings from hibernate.cfg.xml 
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build(); 
		try {
		    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory(); 
		} catch (Exception e) {
		    LOGGER.info(e.getMessage());
		}

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		List<Country> result = session.createQuery("from Country", Country.class).list();
		result.forEach( country -> {
			System.out.println(country.getCountry() + " : " + country.getLastUpdate());
		});
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
