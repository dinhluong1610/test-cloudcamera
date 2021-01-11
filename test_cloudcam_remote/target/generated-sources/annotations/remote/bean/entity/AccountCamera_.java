package remote.bean.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AccountCamera.class)
public abstract class AccountCamera_ {

	public static volatile CollectionAttribute<AccountCamera, BunchCamera> bunchCameraCollection;
	public static volatile SingularAttribute<AccountCamera, Account> accountId;
	public static volatile SingularAttribute<AccountCamera, Date> dateCreated;
	public static volatile SingularAttribute<AccountCamera, Camera> cameraId;
	public static volatile SingularAttribute<AccountCamera, Role> roleId;
	public static volatile SingularAttribute<AccountCamera, String> name;
	public static volatile SingularAttribute<AccountCamera, Integer> id;

}

