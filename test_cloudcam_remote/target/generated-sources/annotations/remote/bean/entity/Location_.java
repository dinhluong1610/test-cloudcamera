package remote.bean.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Location.class)
public abstract class Location_ {

	public static volatile CollectionAttribute<Location, Camera> cameraCollection;
	public static volatile SingularAttribute<Location, BigDecimal> latitude;
	public static volatile SingularAttribute<Location, String> description;
	public static volatile SingularAttribute<Location, Integer> id;
	public static volatile SingularAttribute<Location, BigDecimal> longitude;

}

