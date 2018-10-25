package com.albedo.java.modules.sys.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PersistentToken.class)
public abstract class PersistentToken_ {

	public static volatile SingularAttribute<PersistentToken, Date> tokenDate;
	public static volatile SingularAttribute<PersistentToken, String> series;
	public static volatile SingularAttribute<PersistentToken, String> ipAddress;
	public static volatile SingularAttribute<PersistentToken, String> userAgent;
	public static volatile SingularAttribute<PersistentToken, String> id;
	public static volatile SingularAttribute<PersistentToken, String> tokenValue;
	public static volatile SingularAttribute<PersistentToken, String> userId;
	public static volatile SingularAttribute<PersistentToken, User> user;

}

