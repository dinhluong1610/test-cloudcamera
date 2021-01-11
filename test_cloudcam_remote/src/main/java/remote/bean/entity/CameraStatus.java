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
@Table(name = "CAMERA_STATUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CameraStatus.findAll", query = "SELECT c FROM CameraStatus c")
    , @NamedQuery(name = "CameraStatus.findById", query = "SELECT c FROM CameraStatus c WHERE c.id = :id")
    , @NamedQuery(name = "CameraStatus.findByStartTime", query = "SELECT c FROM CameraStatus c WHERE c.startTime = :startTime")
    , @NamedQuery(name = "CameraStatus.findByEndTime", query = "SELECT c FROM CameraStatus c WHERE c.endTime = :endTime")
    , @NamedQuery(name = "CameraStatus.findByStatus", query = "SELECT c FROM CameraStatus c WHERE c.status = :status")
    , @NamedQuery(name = "CameraStatus.findByDateCreated", query = "SELECT c FROM CameraStatus c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CameraStatus.findByCameraId", query = "SELECT c FROM CameraStatus c WHERE c.cameraId = :cameraId")})
public class CameraStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Column(name = "START_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "END_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Size(max = 30)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "CAMERA_ID")
    private Integer cameraId;

    public CameraStatus() {
    }

    public CameraStatus(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Integer getCameraId() {
        return cameraId;
    }

    public void setCameraId(Integer cameraId) {
        this.cameraId = cameraId;
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
        if (!(object instanceof CameraStatus)) {
            return false;
        }
        CameraStatus other = (CameraStatus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.CameraStatus[ id=" + id + " ]";
    }
    
}
