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
@Table(name = "APPLICATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Application.findAll", query = "SELECT a FROM Application a")
    , @NamedQuery(name = "Application.findById", query = "SELECT a FROM Application a WHERE a.id = :id")
    , @NamedQuery(name = "Application.findByCode", query = "SELECT a FROM Application a WHERE a.code = :code")
    , @NamedQuery(name = "Application.findBySecretKey", query = "SELECT a FROM Application a WHERE a.secretKey = :secretKey")
    , @NamedQuery(name = "Application.findByVersion", query = "SELECT a FROM Application a WHERE a.version = :version")
    , @NamedQuery(name = "Application.findByOs", query = "SELECT a FROM Application a WHERE a.os = :os")
    , @NamedQuery(name = "Application.findByDescription", query = "SELECT a FROM Application a WHERE a.description = :description")
    , @NamedQuery(name = "Application.findByUpdateLink", query = "SELECT a FROM Application a WHERE a.updateLink = :updateLink")
    , @NamedQuery(name = "Application.findByUpdateType", query = "SELECT a FROM Application a WHERE a.updateType = :updateType")
    , @NamedQuery(name = "Application.findByDateCreated", query = "SELECT a FROM Application a WHERE a.dateCreated = :dateCreated")})
public class Application implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Short id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE")
    private String code;
    @Size(max = 300)
    @Column(name = "SECRET_KEY")
    private String secretKey;
    @Size(max = 20)
    @Column(name = "VERSION")
    private String version;
    @Size(max = 20)
    @Column(name = "OS")
    private String os;
    @Size(max = 500)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 300)
    @Column(name = "UPDATE_LINK")
    private String updateLink;
    @Size(max = 10)
    @Column(name = "UPDATE_TYPE")
    private String updateType;
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicationId")
    private Collection<CustomerApplication> customerApplicationCollection;

    public Application() {
    }

    public Application(Short id) {
        this.id = id;
    }

    public Application(Short id, String code) {
        this.id = id;
        this.code = code;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUpdateLink() {
        return updateLink;
    }

    public void setUpdateLink(String updateLink) {
        this.updateLink = updateLink;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @XmlTransient
    public Collection<CustomerApplication> getCustomerApplicationCollection() {
        return customerApplicationCollection;
    }

    public void setCustomerApplicationCollection(Collection<CustomerApplication> customerApplicationCollection) {
        this.customerApplicationCollection = customerApplicationCollection;
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
        if (!(object instanceof Application)) {
            return false;
        }
        Application other = (Application) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.Application[ id=" + id + " ]";
    }
    
}
