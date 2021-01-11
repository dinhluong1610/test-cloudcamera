package remote.bean.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Service.class)
public abstract class Service_ {

	public static volatile CollectionAttribute<Service, Transaction> transactionCollection;
	public static volatile SingularAttribute<Service, String> code;
	public static volatile SingularAttribute<Service, String> name;
	public static volatile SingularAttribute<Service, Integer> id;
	public static volatile SingularAttribute<Service, String> type;

}

