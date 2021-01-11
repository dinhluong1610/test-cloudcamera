package remote.bean.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Stream.class)
public abstract class Stream_ {

	public static volatile SingularAttribute<Stream, String> streamingProtocol;
	public static volatile SingularAttribute<Stream, Camera> cameraId;
	public static volatile SingularAttribute<Stream, GroupServer> groupServerId;
	public static volatile SingularAttribute<Stream, Integer> byteIn;
	public static volatile SingularAttribute<Stream, String> host;
	public static volatile SingularAttribute<Stream, String> inputStream;
	public static volatile SingularAttribute<Stream, Integer> id;
	public static volatile SingularAttribute<Stream, String> outputStream;

}

