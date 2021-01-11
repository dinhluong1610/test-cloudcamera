package remote.bean.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CameraPackage.class)
public abstract class CameraPackage_ {

	public static volatile SingularAttribute<CameraPackage, Date> dateCreated;
	public static volatile SingularAttribute<CameraPackage, Date> dateExpiration;
	public static volatile SingularAttribute<CameraPackage, Camera> cameraId;
	public static volatile SingularAttribute<CameraPackage, Package> packageId;
	public static volatile SingularAttribute<CameraPackage, Integer> id;
	public static volatile CollectionAttribute<CameraPackage, Record> recordCollection;
	public static volatile SingularAttribute<CameraPackage, String> status;

}

