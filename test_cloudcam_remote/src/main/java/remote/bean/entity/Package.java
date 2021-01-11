/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PACKAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Package.findAll", query = "SELECT p FROM Package p")
    , @NamedQuery(name = "Package.findById", query = "SELECT p FROM Package p WHERE p.id = :id")
    , @NamedQuery(name = "Package.findByName", query = "SELECT p FROM Package p WHERE p.name = :name")
    , @NamedQuery(name = "Package.findByPrice", query = "SELECT p FROM Package p WHERE p.price = :price")
    , @NamedQuery(name = "Package.findByUsagePeriod", query = "SELECT p FROM Package p WHERE p.usagePeriod = :usagePeriod")
    , @NamedQuery(name = "Package.findByPlaybackDuration", query = "SELECT p FROM Package p WHERE p.playbackDuration = :playbackDuration")
    , @NamedQuery(name = "Package.findByStartTime", query = "SELECT p FROM Package p WHERE p.startTime = :startTime")
    , @NamedQuery(name = "Package.findByEndTime", query = "SELECT p FROM Package p WHERE p.endTime = :endTime")
    , @NamedQuery(name = "Package.findByStatus", query = "SELECT p FROM Package p WHERE p.status = :status")
    , @NamedQuery(name = "Package.findByDateCreated", query = "SELECT p FROM Package p WHERE p.dateCreated = :dateCreated")
    , @NamedQuery(name = "Package.findByType", query = "SELECT p FROM Package p WHERE p.type = :type")
    , @NamedQuery(name = "Package.findByShareLimit", query = "SELECT p FROM Package p WHERE p.shareLimit = :shareLimit")
    , @NamedQuery(name = "Package.findByPriority", query = "SELECT p FROM Package p WHERE p.priority = :priority")})
public class Package implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 300)
    @Column(name = "NAME")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private BigDecimal price;
    @Column(name = "USAGE_PERIOD")
    private Integer usagePeriod;
    @Column(name = "PLAYBACK_DURATION")
    private Integer playbackDuration;
    @Column(name = "START_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "END_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Size(max = 20)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Size(max = 30)
    @Column(name = "TYPE")
    private String type;
    @Column(name = "SHARE_LIMIT")
    private Integer shareLimit;
    @Column(name = "PRIORITY")
    private Integer priority;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "packageId")
    private Collection<CameraPackage> cameraPackageCollection;

    public Package() {
    }

    public Package(Integer id) {
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getUsagePeriod() {
        return usagePeriod;
    }

    public void setUsagePeriod(Integer usagePeriod) {
        this.usagePeriod = usagePeriod;
    }

    public Integer getPlaybackDuration() {
        return playbackDuration;
    }

    public void setPlaybackDuration(Integer playbackDuration) {
        this.playbackDuration = playbackDuration;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getShareLimit() {
        return shareLimit;
    }

    public void setShareLimit(Integer shareLimit) {
        this.shareLimit = shareLimit;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @XmlTransient
    public Collection<CameraPackage> getCameraPackageCollection() {
        return cameraPackageCollection;
    }

    public void setCameraPackageCollection(Collection<CameraPackage> cameraPackageCollection) {
        this.cameraPackageCollection = cameraPackageCollection;
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
        if (!(object instanceof Package)) {
            return false;
        }
        Package other = (Package) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.Package[ id=" + id + " ]";
    }
    
}
