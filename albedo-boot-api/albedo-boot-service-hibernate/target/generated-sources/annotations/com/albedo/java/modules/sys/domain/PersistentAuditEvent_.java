package com.albedo.java.modules.sys.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PersistentAuditEvent.class)
public abstract class PersistentAuditEvent_ extends com.albedo.java.common.persistence.domain.GeneralEntity_ {

	public static volatile SingularAttribute<PersistentAuditEvent, String> principal;
	public static volatile SingularAttribute<PersistentAuditEvent, Date> auditEventDate;
	public static volatile MapAttribute<PersistentAuditEvent, String, String> data;
	public static volatile SingularAttribute<PersistentAuditEvent, Long> id;
	public static volatile SingularAttribute<PersistentAuditEvent, String> auditEventType;

}

