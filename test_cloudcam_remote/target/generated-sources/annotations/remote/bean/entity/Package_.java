package remote.bean.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Package.class)
public abstract class Package_ {

	public static volatile SingularAttribute<Package, Integer> shareLimit;
	public static volatile SingularAttribute<Package, Integer> usagePeriod;
	public static volatile SingularAttribute<Package, String> type;
	public static volatile SingularAttribute<Package, Integer> priority;
	public static volatile SingularAttribute<Package, Integer> playbackDuration;
	public static volatile SingularAttribute<Package, Date> dateCreated;
	public static volatile SingularAttribute<Package, BigDecimal> price;
	public static volatile SingularAttribute<Package, String> name;
	public static volatile SingularAttribute<Package, Date> startTime;
	public static volatile SingularAttribute<Package, Integer> id;
	public static volatile SingularAttribute<Package, Date> endTime;
	public static volatile CollectionAttribute<Package, CameraPackage> cameraPackageCollection;
	public static volatile SingularAttribute<Package, String> status;

}

