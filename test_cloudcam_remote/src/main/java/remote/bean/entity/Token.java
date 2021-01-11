/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.bean.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Luong
 */
@Entity
@Table(name = "TOKEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Token.findAll", query = "SELECT t FROM Token t")
    , @NamedQuery(name = "Token.findById", query = "SELECT t FROM Token t WHERE t.id = :id")
    , @NamedQuery(name = "Token.findByValue", query = "SELECT t FROM Token t WHERE t.value = :value")
    , @NamedQuery(name = "Token.findByDeviceId", query = "SELECT t FROM Token t WHERE t.deviceId = :deviceId")
    , @NamedQuery(name = "Token.findByDateCreated", query = "SELECT t FROM Token t WHERE t.dateCreated = :dateCreated")
    , @NamedQuery(name = "Token.findByType", query = "SELECT t FROM Token t WHERE t.type = :type")
    , @NamedQuery(name = "Token.findByDeviceType", query = "SELECT t FROM Token t WHERE t.deviceType = :deviceType")
    , @NamedQuery(name = "Token.findByClientIp", query = "SELECT t FROM Token t WHERE t.clientIp = :clientIp")
    , @NamedQuery(name = "Token.findByApplicationId", query = "SELECT t FROM Token t WHERE t.applicationId = :applicationId")
    , @NamedQuery(name = "Token.findByDateModified", query = "SELECT t FROM Token t WHERE t.dateModified = :dateModified")
    , @NamedQuery(name = "Token.findByStatus", query = "SELECT t FROM Token t WHERE t.status = :status")})
public class Token implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 300)
    @Column(name = "VALUE")
    private String value;
    @Size(max = 100)
    @Column(name = "DEVICE_ID")
    private String deviceId;
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Size(max = 100)
    @Column(name = "TYPE")
    private String type;
    @Size(max = 50)
    @Column(name = "DEVICE_TYPE")
    private String deviceType;
    @Size(max = 50)
    @Column(name = "CLIENT_IP")
    private String clientIp;
    @Size(max = 100)
    @Column(name = "APPLICATION_ID")
    private String applicationId;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;
    @Size(max = 30)
    @Column(name = "STATUS")
    private String status;
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Account accountId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "refreshTokenId")
    private Collection<Fcm> fcmCollection;

    public Token() {
    }

    public Token(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    @XmlTransient
    public Collection<Fcm> getFcmCollection() {
        return fcmCollection;
    }

    public void setFcmCollection(Collection<Fcm> fcmCollection) {
        this.fcmCollection = fcmCollection;
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
        if (!(object instanceof Token)) {
            return false;
        }
        Token other = (Token) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.Token[ id=" + id + " ]";
    }
    
}
