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
@Table(name = "ACCOUNT_CAMERA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccountCamera.findAll", query = "SELECT a FROM AccountCamera a")
    , @NamedQuery(name = "AccountCamera.findById", query = "SELECT a FROM AccountCamera a WHERE a.id = :id")
    , @NamedQuery(name = "AccountCamera.findByName", query = "SELECT a FROM AccountCamera a WHERE a.name = :name")
    , @NamedQuery(name = "AccountCamera.findByDateCreated", query = "SELECT a FROM AccountCamera a WHERE a.dateCreated = :dateCreated")})
public class AccountCamera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 300)
    @Column(name = "NAME")
    private String name;
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountCameraId")
    private Collection<BunchCamera> bunchCameraCollection;
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Account accountId;
    @JoinColumn(name = "CAMERA_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Camera cameraId;
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Role roleId;

    public AccountCamera() {
    }

    public AccountCamera(Integer id) {
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @XmlTransient
    public Collection<BunchCamera> getBunchCameraCollection() {
        return bunchCameraCollection;
    }

    public void setBunchCameraCollection(Collection<BunchCamera> bunchCameraCollection) {
        this.bunchCameraCollection = bunchCameraCollection;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public Camera getCameraId() {
        return cameraId;
    }

    public void setCameraId(Camera cameraId) {
        this.cameraId = cameraId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
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
        if (!(object instanceof AccountCamera)) {
            return false;
        }
        AccountCamera other = (AccountCamera) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.AccountCamera[ id=" + id + " ]";
    }
    
}
