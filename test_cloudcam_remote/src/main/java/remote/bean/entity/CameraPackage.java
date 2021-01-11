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
@Table(name = "CAMERA_PACKAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CameraPackage.findAll", query = "SELECT c FROM CameraPackage c")
    , @NamedQuery(name = "CameraPackage.findById", query = "SELECT c FROM CameraPackage c WHERE c.id = :id")
    , @NamedQuery(name = "CameraPackage.findByDateCreated", query = "SELECT c FROM CameraPackage c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CameraPackage.findByDateExpiration", query = "SELECT c FROM CameraPackage c WHERE c.dateExpiration = :dateExpiration")
    , @NamedQuery(name = "CameraPackage.findByStatus", query = "SELECT c FROM CameraPackage c WHERE c.status = :status")})
public class CameraPackage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "DATE_EXPIRATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateExpiration;
    @Size(max = 30)
    @Column(name = "STATUS")
    private String status;
    @JoinColumn(name = "CAMERA_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Camera cameraId;
    @JoinColumn(name = "PACKAGE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Package packageId;
    @OneToMany(mappedBy = "cameraPackageId")
    private Collection<Record> recordCollection;

    public CameraPackage() {
    }

    public CameraPackage(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Camera getCameraId() {
        return cameraId;
    }

    public void setCameraId(Camera cameraId) {
        this.cameraId = cameraId;
    }

    public Package getPackageId() {
        return packageId;
    }

    public void setPackageId(Package packageId) {
        this.packageId = packageId;
    }

    @XmlTransient
    public Collection<Record> getRecordCollection() {
        return recordCollection;
    }

    public void setRecordCollection(Collection<Record> recordCollection) {
        this.recordCollection = recordCollection;
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
        if (!(object instanceof CameraPackage)) {
            return false;
        }
        CameraPackage other = (CameraPackage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.CameraPackage[ id=" + id + " ]";
    }
    
}
