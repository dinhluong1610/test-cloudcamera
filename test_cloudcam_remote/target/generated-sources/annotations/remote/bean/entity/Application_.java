package remote.bean.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Application.class)
public abstract class Application_ {

	public static volatile SingularAttribute<Application, String> code;
	public static volatile SingularAttribute<Application, Date> dateCreated;
	public static volatile SingularAttribute<Application, String> secretKey;
	public static volatile SingularAttribute<Application, String> os;
	public static volatile SingularAttribute<Application, String> description;
	public static volatile SingularAttribute<Application, Short> id;
	public static volatile SingularAttribute<Application, String> updateLink;
	public static volatile SingularAttribute<Application, String> version;
	public static volatile CollectionAttribute<Application, CustomerApplication> customerApplicationCollection;
	public static volatile SingularAttribute<Application, String> updateType;

}

