package remote.bean.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Record.class)
public abstract class Record_ {

	public static volatile SingularAttribute<Record, Date> dateCreated;
	public static volatile SingularAttribute<Record, Camera> cameraId;
	public static volatile SingularAttribute<Record, CameraPackage> cameraPackageId;
	public static volatile SingularAttribute<Record, String> filePath;
	public static volatile SingularAttribute<Record, Date> startTime;
	public static volatile SingularAttribute<Record, Long> id;
	public static volatile SingularAttribute<Record, Date> endTime;
	public static volatile SingularAttribute<Record, String> storage;

}

