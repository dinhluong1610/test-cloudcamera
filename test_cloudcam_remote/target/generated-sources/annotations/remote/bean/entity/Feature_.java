package remote.bean.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Feature.class)
public abstract class Feature_ {

	public static volatile SingularAttribute<Feature, String> code;
	public static volatile CollectionAttribute<Feature, RoleFeature> roleFeatureCollection;
	public static volatile SingularAttribute<Feature, String> name;
	public static volatile SingularAttribute<Feature, Integer> id;

}

