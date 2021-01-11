package remote.bean.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CameraStatus.class)
public abstract class CameraStatus_ {

	public static volatile SingularAttribute<CameraStatus, Date> dateCreated;
	public static volatile SingularAttribute<CameraStatus, Integer> cameraId;
	public static volatile SingularAttribute<CameraStatus, Date> startTime;
	public static volatile SingularAttribute<CameraStatus, Long> id;
	public static volatile SingularAttribute<CameraStatus, Date> endTime;
	public static volatile SingularAttribute<CameraStatus, String> status;

}

