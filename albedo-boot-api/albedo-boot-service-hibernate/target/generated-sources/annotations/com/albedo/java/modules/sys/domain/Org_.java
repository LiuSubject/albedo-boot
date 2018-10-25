package com.albedo.java.modules.sys.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Org.class)
public abstract class Org_ extends com.albedo.java.common.persistence.domain.TreeEntity_ {

	public static volatile SingularAttribute<Org, String> code;
	public static volatile SingularAttribute<Org, String> grade;
	public static volatile SingularAttribute<Org, String> en;
	public static volatile SingularAttribute<Org, String> type;
	public static volatile SetAttribute<Org, User> users;

}

