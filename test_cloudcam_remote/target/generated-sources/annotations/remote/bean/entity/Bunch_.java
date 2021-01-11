package remote.bean.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bunch.class)
public abstract class Bunch_ {

	public static volatile CollectionAttribute<Bunch, BunchCamera> bunchCameraCollection;
	public static volatile SingularAttribute<Bunch, Account> accountId;
	public static volatile SingularAttribute<Bunch, Date> dateCreated;
	public static volatile SingularAttribute<Bunch, String> name;
	public static volatile SingularAttribute<Bunch, Integer> id;

}

