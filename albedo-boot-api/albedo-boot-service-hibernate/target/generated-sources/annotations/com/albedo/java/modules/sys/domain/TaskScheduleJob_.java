package com.albedo.java.modules.sys.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TaskScheduleJob.class)
public abstract class TaskScheduleJob_ extends com.albedo.java.common.persistence.domain.DataEntity_ {

	public static volatile SingularAttribute<TaskScheduleJob, String> cronExpression;
	public static volatile SingularAttribute<TaskScheduleJob, String> sourceId;
	public static volatile SingularAttribute<TaskScheduleJob, String> jobStatus;
	public static volatile SingularAttribute<TaskScheduleJob, String> methodParams;
	public static volatile SingularAttribute<TaskScheduleJob, String> beanClass;
	public static volatile SingularAttribute<TaskScheduleJob, String> name;
	public static volatile SingularAttribute<TaskScheduleJob, String> methodName;
	public static volatile SingularAttribute<TaskScheduleJob, String> id;
	public static volatile SingularAttribute<TaskScheduleJob, String> jobGroup;
	public static volatile SingularAttribute<TaskScheduleJob, Integer> isConcurrent;
	public static volatile SingularAttribute<TaskScheduleJob, String> springId;

}

