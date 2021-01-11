package remote.bean.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(NlBankingTransaction.class)
public abstract class NlBankingTransaction_ {

	public static volatile SingularAttribute<NlBankingTransaction, BigDecimal> totalAmount;
	public static volatile SingularAttribute<NlBankingTransaction, String> nlTransactionId;
	public static volatile SingularAttribute<NlBankingTransaction, String> buyerEmail;
	public static volatile SingularAttribute<NlBankingTransaction, String> orderCode;
	public static volatile SingularAttribute<NlBankingTransaction, Integer> id;
	public static volatile SingularAttribute<NlBankingTransaction, Long> timeExpiration;
	public static volatile SingularAttribute<NlBankingTransaction, Long> transactionId;
	public static volatile SingularAttribute<NlBankingTransaction, String> token;
	public static volatile SingularAttribute<NlBankingTransaction, String> status;

}

