package com.mysql.sakiladb;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateAnnotationUtil {

	private static final SessionFactory SESSION_FACTORY = buildSessionFactory();
	
	/**
     * Utility class
     */
    private HibernateAnnotationUtil() {
    }
    
    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }

    
    private static SessionFactory buildSessionFactory() { 
    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
    			.applySettings(dbSettings()).build();
    	Metadata metadata = new MetadataSources(serviceRegistry)
    	          .addAnnotatedClass(Country.class)
    	          .buildMetadata();

    	        return metadata.buildSessionFactory();
    }
    
    private static Map<String, Object> dbSettings() {
        Map<String, Object> dbSettings = new HashMap<>();
        dbSettings.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC");
        dbSettings.put(Environment.JAKARTA_JDBC_USER, "root");
        dbSettings.put(Environment.JAKARTA_JDBC_PASSWORD, "12345678");
        dbSettings.put(Environment.JAKARTA_JDBC_DRIVER, "com.mysql.cj.jdbc.Driver");
        dbSettings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        dbSettings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
        dbSettings.put(Environment.SHOW_SQL, "true");
        dbSettings.put(Environment.HBM2DDL_AUTO, "update");
        return dbSettings;
    }

}
