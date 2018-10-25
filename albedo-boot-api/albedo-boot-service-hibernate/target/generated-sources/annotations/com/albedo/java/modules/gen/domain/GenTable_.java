package com.albedo.java.modules.gen.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(GenTable.class)
public abstract class GenTable_ extends com.albedo.java.common.persistence.domain.IdEntity_ {

	public static volatile SingularAttribute<GenTable, GenTable> parent;
	public static volatile SingularAttribute<GenTable, String> comments;
	public static volatile SingularAttribute<GenTable, String> parentTableFk;
	public static volatile SingularAttribute<GenTable, String> name;
	public static volatile ListAttribute<GenTable, GenTableColumn> columnList;
	public static volatile SingularAttribute<GenTable, String> className;
	public static volatile SingularAttribute<GenTable, String> parentTable;

}

