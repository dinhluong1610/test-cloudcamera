package remote.bean.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(GroupServer.class)
public abstract class GroupServer_ {

	public static volatile CollectionAttribute<GroupServer, Stream> streamCollection;
	public static volatile CollectionAttribute<GroupServer, Camera> cameraCollection;
	public static volatile CollectionAttribute<GroupServer, Storage> storageCollection;
	public static volatile SingularAttribute<GroupServer, String> name;
	public static volatile SingularAttribute<GroupServer, Integer> id;

}

