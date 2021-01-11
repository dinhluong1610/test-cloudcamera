package remote.bean.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Agency.class)
public abstract class Agency_ {

	public static volatile SingularAttribute<Agency, String> phoneNumber;
	public static volatile CollectionAttribute<Agency, Camera> cameraCollection;
	public static volatile SingularAttribute<Agency, String> name;
	public static volatile SingularAttribute<Agency, Integer> id;
	public static volatile SingularAttribute<Agency, String> taxCode;
	public static volatile SingularAttribute<Agency, String> email;

}

