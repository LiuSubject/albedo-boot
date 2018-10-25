package com.albedo.java.modules.sys.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Role.class)
public abstract class Role_ extends com.albedo.java.common.persistence.domain.IdEntity_ {

	public static volatile SingularAttribute<Role, Org> org;
	public static volatile SingularAttribute<Role, String> name;
	public static volatile SingularAttribute<Role, String> en;
	public static volatile SingularAttribute<Role, Integer> sort;
	public static volatile SetAttribute<Role, Org> orgs;
	public static volatile SingularAttribute<Role, String> type;
	public static volatile SingularAttribute<Role, Integer> sysData;
	public static volatile SingularAttribute<Role, Integer> dataScope;
	public static volatile SingularAttribute<Role, String> orgId;
	public static volatile SetAttribute<Role, Module> modules;
	public static volatile SetAttribute<Role, User> users;

}

