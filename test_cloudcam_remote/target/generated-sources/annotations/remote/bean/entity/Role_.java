package remote.bean.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Role.class)
public abstract class Role_ {

	public static volatile CollectionAttribute<Role, RoleFeature> roleFeatureCollection;
	public static volatile CollectionAttribute<Role, AccountCamera> accountCameraCollection;
	public static volatile SingularAttribute<Role, String> name;
	public static volatile SingularAttribute<Role, Integer> id;

}

