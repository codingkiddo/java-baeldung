package com.mysql.sakiladb;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(Country.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Country_ {

	public static final String COUNTRY = "country";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String COUNTRY_ID = "countryId";

	
	/**
	 * @see com.mysql.sakiladb.Country#country
	 **/
	public static volatile SingularAttribute<Country, String> country;
	
	/**
	 * @see com.mysql.sakiladb.Country#lastUpdate
	 **/
	public static volatile SingularAttribute<Country, Date> lastUpdate;
	
	/**
	 * @see com.mysql.sakiladb.Country
	 **/
	public static volatile EntityType<Country> class_;
	
	/**
	 * @see com.mysql.sakiladb.Country#countryId
	 **/
	public static volatile SingularAttribute<Country, Short> countryId;

}

