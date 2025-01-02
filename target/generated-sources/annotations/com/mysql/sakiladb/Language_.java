package com.mysql.sakiladb;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(Language.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Language_ {

	public static final String LAST_UPDATE = "lastUpdate";
	public static final String LANGUAGE_ID = "languageId";
	public static final String NAME = "name";

	
	/**
	 * @see com.mysql.sakiladb.Language#lastUpdate
	 **/
	public static volatile SingularAttribute<Language, Date> lastUpdate;
	
	/**
	 * @see com.mysql.sakiladb.Language#languageId
	 **/
	public static volatile SingularAttribute<Language, Short> languageId;
	
	/**
	 * @see com.mysql.sakiladb.Language#name
	 **/
	public static volatile SingularAttribute<Language, String> name;
	
	/**
	 * @see com.mysql.sakiladb.Language
	 **/
	public static volatile EntityType<Language> class_;

}

