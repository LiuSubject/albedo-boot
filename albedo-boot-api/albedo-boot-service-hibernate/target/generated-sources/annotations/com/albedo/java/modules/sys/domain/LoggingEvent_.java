package com.albedo.java.modules.sys.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LoggingEvent.class)
public abstract class LoggingEvent_ {

	public static volatile SingularAttribute<LoggingEvent, String> levelString;
	public static volatile SingularAttribute<LoggingEvent, String> callerLine;
	public static volatile SingularAttribute<LoggingEvent, String> callerFilename;
	public static volatile SingularAttribute<LoggingEvent, Long> timestmp;
	public static volatile SingularAttribute<LoggingEvent, String> threadName;
	public static volatile SingularAttribute<LoggingEvent, String> callerClass;
	public static volatile SingularAttribute<LoggingEvent, String> arg3;
	public static volatile SingularAttribute<LoggingEvent, String> referenceFlag;
	public static volatile SingularAttribute<LoggingEvent, String> arg2;
	public static volatile SingularAttribute<LoggingEvent, String> callerMethod;
	public static volatile SingularAttribute<LoggingEvent, String> formattedMessage;
	public static volatile SingularAttribute<LoggingEvent, String> arg1;
	public static volatile SingularAttribute<LoggingEvent, String> arg0;
	public static volatile SingularAttribute<LoggingEvent, Long> id;
	public static volatile SingularAttribute<LoggingEvent, String> loggerName;

}

