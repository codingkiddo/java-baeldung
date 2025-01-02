package com.mysql.sakiladb;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(City.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class City_ {

	public static final String COUNTRY = "country";
	public static final String CITY = "city";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String CITY_ID = "cityId";

	
	/**
	 * @see com.mysql.sakiladb.City#country
	 **/
	public static volatile SingularAttribute<City, Country> country;
	
	/**
	 * @see com.mysql.sakiladb.City#city
	 **/
	public static volatile SingularAttribute<City, String> city;
	
	/**
	 * @see com.mysql.sakiladb.City#lastUpdate
	 **/
	public static volatile SingularAttribute<City, Date> lastUpdate;
	
	/**
	 * @see com.mysql.sakiladb.City#cityId
	 **/
	public static volatile SingularAttribute<City, Short> cityId;
	
	/**
	 * @see com.mysql.sakiladb.City
	 **/
	public static volatile EntityType<City> class_;

}

