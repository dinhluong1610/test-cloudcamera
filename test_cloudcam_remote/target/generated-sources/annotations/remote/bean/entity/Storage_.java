package remote.bean.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Storage.class)
public abstract class Storage_ {

	public static volatile SingularAttribute<Storage, String> basePath;
	public static volatile SingularAttribute<Storage, GroupServer> groupServerId;
	public static volatile SingularAttribute<Storage, BigDecimal> id;
	public static volatile SingularAttribute<Storage, Long> totalSpace;
	public static volatile SingularAttribute<Storage, Long> usableSpace;
	public static volatile SingularAttribute<Storage, Short> priority;
	public static volatile SingularAttribute<Storage, String> status;

}

