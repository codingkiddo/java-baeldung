package com.mysql.sakiladb;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HibernateSakilaDbFilmMain {

private static final Logger LOGGER = LoggerFactory.getLogger(HibernateSakilaDbFilmMain.class);
	
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
		
		List<Film> result = session.createQuery("from Film", Film.class).list();
		result.forEach( film -> {
			System.out.println(film.getTitle() + " : " + film.getDescription());
		});
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
	
}
