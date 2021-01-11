package remote.bean.entity;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StreamingServer.class)
public abstract class StreamingServer_ {

	public static volatile SingularAttribute<StreamingServer, Long> heapUsed;
	public static volatile SingularAttribute<StreamingServer, Integer> connectionCount;
	public static volatile SingularAttribute<StreamingServer, Long> memoryFree;
	public static volatile SingularAttribute<StreamingServer, Date> dateModified;
	public static volatile SingularAttribute<StreamingServer, Long> memoryUsed;
	public static volatile SingularAttribute<StreamingServer, Integer> connectionMax;
	public static volatile SingularAttribute<StreamingServer, Long> diskFree;
	public static volatile SingularAttribute<StreamingServer, BigInteger> groupServerId;
	public static volatile SingularAttribute<StreamingServer, Long> diskUsed;
	public static volatile SingularAttribute<StreamingServer, String> name;
	public static volatile SingularAttribute<StreamingServer, String> host;
	public static volatile SingularAttribute<StreamingServer, Long> heapFree;
	public static volatile SingularAttribute<StreamingServer, Integer> id;
	public static volatile SingularAttribute<StreamingServer, Long> serverUptime;
	public static volatile SingularAttribute<StreamingServer, String> hostPrivate;
	public static volatile SingularAttribute<StreamingServer, Long> bytesInMax;
	public static volatile SingularAttribute<StreamingServer, Long> bytesIn;
	public static volatile SingularAttribute<StreamingServer, Long> bytesOut;
	public static volatile SingularAttribute<StreamingServer, Long> bytesOutMax;
	public static volatile SingularAttribute<StreamingServer, String> status;

}

