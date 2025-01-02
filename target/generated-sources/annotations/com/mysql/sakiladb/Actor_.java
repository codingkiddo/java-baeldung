package com.mysql.sakiladb;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(Actor.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Actor_ {

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String ACTOR_ID = "actorId";
	public static final String LAST_UPDATE = "lastUpdate";

	
	/**
	 * @see com.mysql.sakiladb.Actor#firstName
	 **/
	public static volatile SingularAttribute<Actor, String> firstName;
	
	/**
	 * @see com.mysql.sakiladb.Actor#lastName
	 **/
	public static volatile SingularAttribute<Actor, String> lastName;
	
	/**
	 * @see com.mysql.sakiladb.Actor#actorId
	 **/
	public static volatile SingularAttribute<Actor, Short> actorId;
	
	/**
	 * @see com.mysql.sakiladb.Actor#lastUpdate
	 **/
	public static volatile SingularAttribute<Actor, Date> lastUpdate;
	
	/**
	 * @see com.mysql.sakiladb.Actor
	 **/
	public static volatile EntityType<Actor> class_;

}

