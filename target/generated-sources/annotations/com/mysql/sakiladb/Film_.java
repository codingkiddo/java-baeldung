package com.mysql.sakiladb;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.sql.Date;

@StaticMetamodel(Film.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Film_ {

	public static final String RENTAL_RATE = "rentalRate";
	public static final String RENTAL_DURATION = "rentalDuration";
	public static final String RELEASE_YEAR = "release_year";
	public static final String LENGTH = "length";
	public static final String RATING = "rating";
	public static final String DESCRIPTION = "description";
	public static final String REPLACEMENT_COST = "replacementCost";
	public static final String LANGUAGE = "language";
	public static final String TITLE = "title";
	public static final String ORIGINAL_LANGUAGE = "originalLanguage";
	public static final String SPECIAL_FEATURES = "specialFeatures";
	public static final String FILM_ID = "filmId";
	public static final String LAST_UPDATE = "lastUpdate";

	
	/**
	 * @see com.mysql.sakiladb.Film#rentalRate
	 **/
	public static volatile SingularAttribute<Film, Double> rentalRate;
	
	/**
	 * @see com.mysql.sakiladb.Film#rentalDuration
	 **/
	public static volatile SingularAttribute<Film, Byte> rentalDuration;
	
	/**
	 * @see com.mysql.sakiladb.Film#release_year
	 **/
	public static volatile SingularAttribute<Film, Date> release_year;
	
	/**
	 * @see com.mysql.sakiladb.Film#length
	 **/
	public static volatile SingularAttribute<Film, Short> length;
	
	/**
	 * @see com.mysql.sakiladb.Film#rating
	 **/
	public static volatile SingularAttribute<Film, Character> rating;
	
	/**
	 * @see com.mysql.sakiladb.Film#description
	 **/
	public static volatile SingularAttribute<Film, String> description;
	
	/**
	 * @see com.mysql.sakiladb.Film#replacementCost
	 **/
	public static volatile SingularAttribute<Film, Double> replacementCost;
	
	/**
	 * @see com.mysql.sakiladb.Film#language
	 **/
	public static volatile SingularAttribute<Film, Language> language;
	
	/**
	 * @see com.mysql.sakiladb.Film#title
	 **/
	public static volatile SingularAttribute<Film, String> title;
	
	/**
	 * @see com.mysql.sakiladb.Film#originalLanguage
	 **/
	public static volatile SingularAttribute<Film, Language> originalLanguage;
	
	/**
	 * @see com.mysql.sakiladb.Film#specialFeatures
	 **/
	public static volatile SingularAttribute<Film, Character> specialFeatures;
	
	/**
	 * @see com.mysql.sakiladb.Film#filmId
	 **/
	public static volatile SingularAttribute<Film, Short> filmId;
	
	/**
	 * @see com.mysql.sakiladb.Film#lastUpdate
	 **/
	public static volatile SingularAttribute<Film, java.util.Date> lastUpdate;
	
	/**
	 * @see com.mysql.sakiladb.Film
	 **/
	public static volatile EntityType<Film> class_;

}

