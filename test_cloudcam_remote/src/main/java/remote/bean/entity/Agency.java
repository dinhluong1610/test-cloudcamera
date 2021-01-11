/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.bean.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Luong
 */
@Entity
@Table(name = "AGENCY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agency.findAll", query = "SELECT a FROM Agency a")
    , @NamedQuery(name = "Agency.findById", query = "SELECT a FROM Agency a WHERE a.id = :id")
    , @NamedQuery(name = "Agency.findByName", query = "SELECT a FROM Agency a WHERE a.name = :name")
    , @NamedQuery(name = "Agency.findByEmail", query = "SELECT a FROM Agency a WHERE a.email = :email")
    , @NamedQuery(name = "Agency.findByPhoneNumber", query = "SELECT a FROM Agency a WHERE a.phoneNumber = :phoneNumber")
    , @NamedQuery(name = "Agency.findByTaxCode", query = "SELECT a FROM Agency a WHERE a.taxCode = :taxCode")})
public class Agency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 300)
    @Column(name = "NAME")
    private String name;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 200)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 30)
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Size(max = 30)
    @Column(name = "TAX_CODE")
    private String taxCode;
    @OneToMany(mappedBy = "agencyId")
    private Collection<Camera> cameraCollection;

    public Agency() {
    }

    public Agency(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @XmlTransient
    public Collection<Camera> getCameraCollection() {
        return cameraCollection;
    }

    public void setCameraCollection(Collection<Camera> cameraCollection) {
        this.cameraCollection = cameraCollection;
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
        if (!(object instanceof Agency)) {
            return false;
        }
        Agency other = (Agency) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.Agency[ id=" + id + " ]";
    }
    
}
