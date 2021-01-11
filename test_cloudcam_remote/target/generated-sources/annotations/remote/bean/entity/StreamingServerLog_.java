package remote.bean.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StreamingServerLog.class)
public abstract class StreamingServerLog_ {

	public static volatile SingularAttribute<StreamingServerLog, Date> dateCreated;
	public static volatile SingularAttribute<StreamingServerLog, Integer> streamingServerId;
	public static volatile SingularAttribute<StreamingServerLog, Date> startTime;
	public static volatile SingularAttribute<StreamingServerLog, Integer> id;
	public static volatile SingularAttribute<StreamingServerLog, Date> endTime;
	public static volatile SingularAttribute<StreamingServerLog, String> status;

}

