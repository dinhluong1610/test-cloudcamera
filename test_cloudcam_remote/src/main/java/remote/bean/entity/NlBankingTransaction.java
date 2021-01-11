/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luong
 */
@Entity
@Table(name = "NL_BANKING_TRANSACTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NlBankingTransaction.findAll", query = "SELECT n FROM NlBankingTransaction n")
    , @NamedQuery(name = "NlBankingTransaction.findById", query = "SELECT n FROM NlBankingTransaction n WHERE n.id = :id")
    , @NamedQuery(name = "NlBankingTransaction.findByOrderCode", query = "SELECT n FROM NlBankingTransaction n WHERE n.orderCode = :orderCode")
    , @NamedQuery(name = "NlBankingTransaction.findByNlTransactionId", query = "SELECT n FROM NlBankingTransaction n WHERE n.nlTransactionId = :nlTransactionId")
    , @NamedQuery(name = "NlBankingTransaction.findByToken", query = "SELECT n FROM NlBankingTransaction n WHERE n.token = :token")
    , @NamedQuery(name = "NlBankingTransaction.findByTimeExpiration", query = "SELECT n FROM NlBankingTransaction n WHERE n.timeExpiration = :timeExpiration")
    , @NamedQuery(name = "NlBankingTransaction.findByTransactionId", query = "SELECT n FROM NlBankingTransaction n WHERE n.transactionId = :transactionId")
    , @NamedQuery(name = "NlBankingTransaction.findByStatus", query = "SELECT n FROM NlBankingTransaction n WHERE n.status = :status")
    , @NamedQuery(name = "NlBankingTransaction.findByBuyerEmail", query = "SELECT n FROM NlBankingTransaction n WHERE n.buyerEmail = :buyerEmail")
    , @NamedQuery(name = "NlBankingTransaction.findByTotalAmount", query = "SELECT n FROM NlBankingTransaction n WHERE n.totalAmount = :totalAmount")})
public class NlBankingTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "ORDER_CODE")
    private String orderCode;
    @Size(max = 50)
    @Column(name = "NL_TRANSACTION_ID")
    private String nlTransactionId;
    @Size(max = 50)
    @Column(name = "TOKEN")
    private String token;
    @Column(name = "TIME_EXPIRATION")
    private Long timeExpiration;
    @Column(name = "TRANSACTION_ID")
    private Long transactionId;
    @Size(max = 50)
    @Column(name = "STATUS")
    private String status;
    @Size(max = 300)
    @Column(name = "BUYER_EMAIL")
    private String buyerEmail;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_AMOUNT")
    private BigDecimal totalAmount;

    public NlBankingTransaction() {
    }

    public NlBankingTransaction(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getNlTransactionId() {
        return nlTransactionId;
    }

    public void setNlTransactionId(String nlTransactionId) {
        this.nlTransactionId = nlTransactionId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getTimeExpiration() {
        return timeExpiration;
    }

    public void setTimeExpiration(Long timeExpiration) {
        this.timeExpiration = timeExpiration;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NlBankingTransaction)) {
            return false;
        }
        NlBankingTransaction other = (NlBankingTransaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.NlBankingTransaction[ id=" + id + " ]";
    }
    
}
