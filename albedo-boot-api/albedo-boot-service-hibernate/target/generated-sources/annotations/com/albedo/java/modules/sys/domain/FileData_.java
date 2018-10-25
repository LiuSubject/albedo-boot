package com.albedo.java.modules.sys.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FileData.class)
public abstract class FileData_ extends com.albedo.java.common.persistence.domain.IdEntity_ {

	public static volatile SingularAttribute<FileData, String> path;
	public static volatile SingularAttribute<FileData, Long> size;
	public static volatile SingularAttribute<FileData, String> name;
	public static volatile SingularAttribute<FileData, String> type;

}

