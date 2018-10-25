package com.albedo.java.modules.sys.domain;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ extends com.albedo.java.common.persistence.domain.IdEntity_ {

	public static volatile SingularAttribute<User, String> loginId;
	public static volatile SingularAttribute<User, ZonedDateTime> resetDate;
	public static volatile SingularAttribute<User, Org> org;
	public static volatile SetAttribute<User, Role> roles;
	public static volatile SetAttribute<User, PersistentToken> persistentTokens;
	public static volatile SingularAttribute<User, String> avatar;
	public static volatile SingularAttribute<User, String> activationKey;
	public static volatile SingularAttribute<User, String> resetKey;
	public static volatile SingularAttribute<User, String> orgId;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> langKey;
	public static volatile SingularAttribute<User, String> phone;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, Boolean> activated;

}

