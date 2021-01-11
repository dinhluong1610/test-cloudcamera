/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.bean.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luong
 */
@Entity
@Table(name = "RECORD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Record.findAll", query = "SELECT r FROM Record r")
    , @NamedQuery(name = "Record.findById", query = "SELECT r FROM Record r WHERE r.id = :id")
    , @NamedQuery(name = "Record.findByFilePath", query = "SELECT r FROM Record r WHERE r.filePath = :filePath")
    , @NamedQuery(name = "Record.findByDateCreated", query = "SELECT r FROM Record r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "Record.findByStartTime", query = "SELECT r FROM Record r WHERE r.startTime = :startTime")
    , @NamedQuery(name = "Record.findByEndTime", query = "SELECT r FROM Record r WHERE r.endTime = :endTime")
    , @NamedQuery(name = "Record.findByStorage", query = "SELECT r FROM Record r WHERE r.storage = :storage")})
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 300)
    @Column(name = "FILE_PATH")
    private String filePath;
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "START_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "END_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Size(max = 30)
    @Column(name = "STORAGE")
    private String storage;
    @JoinColumn(name = "CAMERA_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Camera cameraId;
    @JoinColumn(name = "CAMERA_PACKAGE_ID", referencedColumnName = "ID")
    @ManyToOne
    private CameraPackage cameraPackageId;

    public Record() {
    }

    public Record(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Camera getCameraId() {
        return cameraId;
    }

    public void setCameraId(Camera cameraId) {
        this.cameraId = cameraId;
    }

    public CameraPackage getCameraPackageId() {
        return cameraPackageId;
    }

    public void setCameraPackageId(CameraPackage cameraPackageId) {
        this.cameraPackageId = cameraPackageId;
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
        if (!(object instanceof Record)) {
            return false;
        }
        Record other = (Record) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.Record[ id=" + id + " ]";
    }
    
}
