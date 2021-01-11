package remote.bean.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Notification.class)
public abstract class Notification_ {

	public static volatile SingularAttribute<Notification, Account> accountId;
	public static volatile SingularAttribute<Notification, Date> dateCreated;
	public static volatile SingularAttribute<Notification, String> description;
	public static volatile SingularAttribute<Notification, Integer> id;
	public static volatile SingularAttribute<Notification, String> type;
	public static volatile SingularAttribute<Notification, String> status;

}

