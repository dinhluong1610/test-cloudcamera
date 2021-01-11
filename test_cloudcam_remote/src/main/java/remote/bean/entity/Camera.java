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
@Table(name = "CAMERA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Camera.findAll", query = "SELECT c FROM Camera c")
    , @NamedQuery(name = "Camera.findById", query = "SELECT c FROM Camera c WHERE c.id = :id")
    , @NamedQuery(name = "Camera.findByCloudId", query = "SELECT c FROM Camera c WHERE c.cloudId = :cloudId")
    , @NamedQuery(name = "Camera.findBySecureCode", query = "SELECT c FROM Camera c WHERE c.secureCode = :secureCode")
    , @NamedQuery(name = "Camera.findByDeviceSerial", query = "SELECT c FROM Camera c WHERE c.deviceSerial = :deviceSerial")
    , @NamedQuery(name = "Camera.findByDateCreated", query = "SELECT c FROM Camera c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "Camera.findByDeviceStatus", query = "SELECT c FROM Camera c WHERE c.deviceStatus = :deviceStatus")
    , @NamedQuery(name = "Camera.findByConnectionStatus", query = "SELECT c FROM Camera c WHERE c.connectionStatus = :connectionStatus")
    , @NamedQuery(name = "Camera.findByProvider", query = "SELECT c FROM Camera c WHERE c.provider = :provider")
    , @NamedQuery(name = "Camera.findByHost", query = "SELECT c FROM Camera c WHERE c.host = :host")
    , @NamedQuery(name = "Camera.findByPort", query = "SELECT c FROM Camera c WHERE c.port = :port")
    , @NamedQuery(name = "Camera.findByUsername", query = "SELECT c FROM Camera c WHERE c.username = :username")
    , @NamedQuery(name = "Camera.findByPassword", query = "SELECT c FROM Camera c WHERE c.password = :password")
    , @NamedQuery(name = "Camera.findByName", query = "SELECT c FROM Camera c WHERE c.name = :name")})
public class Camera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "CLOUD_ID")
    private String cloudId;
    @Size(max = 30)
    @Column(name = "SECURE_CODE")
    private String secureCode;
    @Size(max = 30)
    @Column(name = "DEVICE_SERIAL")
    private String deviceSerial;
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Size(max = 50)
    @Column(name = "DEVICE_STATUS")
    private String deviceStatus;
    @Size(max = 50)
    @Column(name = "CONNECTION_STATUS")
    private String connectionStatus;
    @Size(max = 50)
    @Column(name = "PROVIDER")
    private String provider;
    @Size(max = 50)
    @Column(name = "HOST")
    private String host;
    @Column(name = "PORT")
    private Integer port;
    @Size(max = 50)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 50)
    @Column(name = "PASSWORD")
    private String password;
    @Size(max = 300)
    @Column(name = "NAME")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cameraId")
    private Collection<CameraPackage> cameraPackageCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cameraId")
    private Collection<Record> recordCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cameraId")
    private Collection<AccountCamera> accountCameraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cameraId")
    private Collection<Stream> streamCollection;
    @JoinColumn(name = "AGENCY_ID", referencedColumnName = "ID")
    @ManyToOne
    private Agency agencyId;
    @JoinColumn(name = "GROUP_SERVER_ID", referencedColumnName = "ID")
    @ManyToOne
    private GroupServer groupServerId;
    @JoinColumn(name = "LOCATION_ID", referencedColumnName = "ID")
    @ManyToOne
    private Location locationId;
    @JoinColumn(name = "MODEL_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Model modelId;

    public Camera() {
    }

    public Camera(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCloudId() {
        return cloudId;
    }

    public void setCloudId(String cloudId) {
        this.cloudId = cloudId;
    }

    public String getSecureCode() {
        return secureCode;
    }

    public void setSecureCode(String secureCode) {
        this.secureCode = secureCode;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<CameraPackage> getCameraPackageCollection() {
        return cameraPackageCollection;
    }

    public void setCameraPackageCollection(Collection<CameraPackage> cameraPackageCollection) {
        this.cameraPackageCollection = cameraPackageCollection;
    }

    @XmlTransient
    public Collection<Record> getRecordCollection() {
        return recordCollection;
    }

    public void setRecordCollection(Collection<Record> recordCollection) {
        this.recordCollection = recordCollection;
    }

    @XmlTransient
    public Collection<AccountCamera> getAccountCameraCollection() {
        return accountCameraCollection;
    }

    public void setAccountCameraCollection(Collection<AccountCamera> accountCameraCollection) {
        this.accountCameraCollection = accountCameraCollection;
    }

    @XmlTransient
    public Collection<Stream> getStreamCollection() {
        return streamCollection;
    }

    public void setStreamCollection(Collection<Stream> streamCollection) {
        this.streamCollection = streamCollection;
    }

    public Agency getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Agency agencyId) {
        this.agencyId = agencyId;
    }

    public GroupServer getGroupServerId() {
        return groupServerId;
    }

    public void setGroupServerId(GroupServer groupServerId) {
        this.groupServerId = groupServerId;
    }

    public Location getLocationId() {
        return locationId;
    }

    public void setLocationId(Location locationId) {
        this.locationId = locationId;
    }

    public Model getModelId() {
        return modelId;
    }

    public void setModelId(Model modelId) {
        this.modelId = modelId;
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
        if (!(object instanceof Camera)) {
            return false;
        }
        Camera other = (Camera) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.Camera[ id=" + id + " ]";
    }
    
}
