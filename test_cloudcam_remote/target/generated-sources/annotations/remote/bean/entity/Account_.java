package remote.bean.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static volatile CollectionAttribute<Account, Transaction> transactionCollection;
	public static volatile SingularAttribute<Account, Integer> parent;
	public static volatile CollectionAttribute<Account, Notification> notificationCollection;
	public static volatile SingularAttribute<Account, String> personalId;
	public static volatile SingularAttribute<Account, String> address;
	public static volatile CollectionAttribute<Account, AccountCamera> accountCameraCollection;
	public static volatile SingularAttribute<Account, String> fullName;
	public static volatile CollectionAttribute<Account, Token> tokenCollection;
	public static volatile SingularAttribute<Account, String> type;
	public static volatile SingularAttribute<Account, String> password;
	public static volatile SingularAttribute<Account, Date> dateCreated;
	public static volatile SingularAttribute<Account, String> phoneNumber;
	public static volatile CollectionAttribute<Account, Bunch> bunchCollection;
	public static volatile SingularAttribute<Account, Integer> customerId;
	public static volatile SingularAttribute<Account, Integer> id;
	public static volatile SingularAttribute<Account, String> saleEmail;
	public static volatile SingularAttribute<Account, String> email;
	public static volatile SingularAttribute<Account, String> username;
	public static volatile SingularAttribute<Account, String> status;

}

