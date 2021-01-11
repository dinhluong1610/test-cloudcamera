package remote.bean.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Camera.class)
public abstract class Camera_ {

	public static volatile CollectionAttribute<Camera, Stream> streamCollection;
	public static volatile SingularAttribute<Camera, Model> modelId;
	public static volatile SingularAttribute<Camera, String> secureCode;
	public static volatile CollectionAttribute<Camera, AccountCamera> accountCameraCollection;
	public static volatile SingularAttribute<Camera, Agency> agencyId;
	public static volatile SingularAttribute<Camera, String> deviceStatus;
	public static volatile SingularAttribute<Camera, String> deviceSerial;
	public static volatile SingularAttribute<Camera, String> password;
	public static volatile SingularAttribute<Camera, Date> dateCreated;
	public static volatile SingularAttribute<Camera, String> provider;
	public static volatile SingularAttribute<Camera, Integer> port;
	public static volatile SingularAttribute<Camera, GroupServer> groupServerId;
	public static volatile SingularAttribute<Camera, Location> locationId;
	public static volatile SingularAttribute<Camera, String> cloudId;
	public static volatile SingularAttribute<Camera, String> connectionStatus;
	public static volatile SingularAttribute<Camera, String> host;
	public static volatile SingularAttribute<Camera, String> name;
	public static volatile SingularAttribute<Camera, Integer> id;
	public static volatile CollectionAttribute<Camera, CameraPackage> cameraPackageCollection;
	public static volatile CollectionAttribute<Camera, Record> recordCollection;
	public static volatile SingularAttribute<Camera, String> username;

}

