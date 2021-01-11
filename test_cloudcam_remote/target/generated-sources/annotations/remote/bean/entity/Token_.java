package remote.bean.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Token.class)
public abstract class Token_ {

	public static volatile SingularAttribute<Token, String> deviceType;
	public static volatile SingularAttribute<Token, Account> accountId;
	public static volatile CollectionAttribute<Token, Fcm> fcmCollection;
	public static volatile SingularAttribute<Token, Date> dateCreated;
	public static volatile SingularAttribute<Token, String> clientIp;
	public static volatile SingularAttribute<Token, Date> dateModified;
	public static volatile SingularAttribute<Token, Long> id;
	public static volatile SingularAttribute<Token, String> type;
	public static volatile SingularAttribute<Token, String> applicationId;
	public static volatile SingularAttribute<Token, String> value;
	public static volatile SingularAttribute<Token, String> deviceId;
	public static volatile SingularAttribute<Token, String> status;

}

