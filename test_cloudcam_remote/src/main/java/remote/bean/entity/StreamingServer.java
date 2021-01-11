/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.bean.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "STREAMING_SERVER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StreamingServer.findAll", query = "SELECT s FROM StreamingServer s")
    , @NamedQuery(name = "StreamingServer.findById", query = "SELECT s FROM StreamingServer s WHERE s.id = :id")
    , @NamedQuery(name = "StreamingServer.findByName", query = "SELECT s FROM StreamingServer s WHERE s.name = :name")
    , @NamedQuery(name = "StreamingServer.findByHost", query = "SELECT s FROM StreamingServer s WHERE s.host = :host")
    , @NamedQuery(name = "StreamingServer.findByMemoryFree", query = "SELECT s FROM StreamingServer s WHERE s.memoryFree = :memoryFree")
    , @NamedQuery(name = "StreamingServer.findByMemoryUsed", query = "SELECT s FROM StreamingServer s WHERE s.memoryUsed = :memoryUsed")
    , @NamedQuery(name = "StreamingServer.findByHeapFree", query = "SELECT s FROM StreamingServer s WHERE s.heapFree = :heapFree")
    , @NamedQuery(name = "StreamingServer.findByHeapUsed", query = "SELECT s FROM StreamingServer s WHERE s.heapUsed = :heapUsed")
    , @NamedQuery(name = "StreamingServer.findByDiskFree", query = "SELECT s FROM StreamingServer s WHERE s.diskFree = :diskFree")
    , @NamedQuery(name = "StreamingServer.findByDiskUsed", query = "SELECT s FROM StreamingServer s WHERE s.diskUsed = :diskUsed")
    , @NamedQuery(name = "StreamingServer.findByConnectionCount", query = "SELECT s FROM StreamingServer s WHERE s.connectionCount = :connectionCount")
    , @NamedQuery(name = "StreamingServer.findByServerUptime", query = "SELECT s FROM StreamingServer s WHERE s.serverUptime = :serverUptime")
    , @NamedQuery(name = "StreamingServer.findByBytesIn", query = "SELECT s FROM StreamingServer s WHERE s.bytesIn = :bytesIn")
    , @NamedQuery(name = "StreamingServer.findByBytesOut", query = "SELECT s FROM StreamingServer s WHERE s.bytesOut = :bytesOut")
    , @NamedQuery(name = "StreamingServer.findByBytesInMax", query = "SELECT s FROM StreamingServer s WHERE s.bytesInMax = :bytesInMax")
    , @NamedQuery(name = "StreamingServer.findByBytesOutMax", query = "SELECT s FROM StreamingServer s WHERE s.bytesOutMax = :bytesOutMax")
    , @NamedQuery(name = "StreamingServer.findByDateModified", query = "SELECT s FROM StreamingServer s WHERE s.dateModified = :dateModified")
    , @NamedQuery(name = "StreamingServer.findByStatus", query = "SELECT s FROM StreamingServer s WHERE s.status = :status")
    , @NamedQuery(name = "StreamingServer.findByHostPrivate", query = "SELECT s FROM StreamingServer s WHERE s.hostPrivate = :hostPrivate")
    , @NamedQuery(name = "StreamingServer.findByConnectionMax", query = "SELECT s FROM StreamingServer s WHERE s.connectionMax = :connectionMax")
    , @NamedQuery(name = "StreamingServer.findByGroupServerId", query = "SELECT s FROM StreamingServer s WHERE s.groupServerId = :groupServerId")})
public class StreamingServer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "NAME")
    private String name;
    @Size(max = 30)
    @Column(name = "HOST")
    private String host;
    @Column(name = "MEMORY_FREE")
    private Long memoryFree;
    @Column(name = "MEMORY_USED")
    private Long memoryUsed;
    @Column(name = "HEAP_FREE")
    private Long heapFree;
    @Column(name = "HEAP_USED")
    private Long heapUsed;
    @Column(name = "DISK_FREE")
    private Long diskFree;
    @Column(name = "DISK_USED")
    private Long diskUsed;
    @Column(name = "CONNECTION_COUNT")
    private Integer connectionCount;
    @Column(name = "SERVER_UPTIME")
    private Long serverUptime;
    @Column(name = "BYTES_IN")
    private Long bytesIn;
    @Column(name = "BYTES_OUT")
    private Long bytesOut;
    @Column(name = "BYTES_IN_MAX")
    private Long bytesInMax;
    @Column(name = "BYTES_OUT_MAX")
    private Long bytesOutMax;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;
    @Size(max = 30)
    @Column(name = "STATUS")
    private String status;
    @Size(max = 30)
    @Column(name = "HOST_PRIVATE")
    private String hostPrivate;
    @Column(name = "CONNECTION_MAX")
    private Integer connectionMax;
    @Column(name = "GROUP_SERVER_ID")
    private BigInteger groupServerId;

    public StreamingServer() {
    }

    public StreamingServer(Integer id) {
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

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Long getMemoryFree() {
        return memoryFree;
    }

    public void setMemoryFree(Long memoryFree) {
        this.memoryFree = memoryFree;
    }

    public Long getMemoryUsed() {
        return memoryUsed;
    }

    public void setMemoryUsed(Long memoryUsed) {
        this.memoryUsed = memoryUsed;
    }

    public Long getHeapFree() {
        return heapFree;
    }

    public void setHeapFree(Long heapFree) {
        this.heapFree = heapFree;
    }

    public Long getHeapUsed() {
        return heapUsed;
    }

    public void setHeapUsed(Long heapUsed) {
        this.heapUsed = heapUsed;
    }

    public Long getDiskFree() {
        return diskFree;
    }

    public void setDiskFree(Long diskFree) {
        this.diskFree = diskFree;
    }

    public Long getDiskUsed() {
        return diskUsed;
    }

    public void setDiskUsed(Long diskUsed) {
        this.diskUsed = diskUsed;
    }

    public Integer getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
    }

    public Long getServerUptime() {
        return serverUptime;
    }

    public void setServerUptime(Long serverUptime) {
        this.serverUptime = serverUptime;
    }

    public Long getBytesIn() {
        return bytesIn;
    }

    public void setBytesIn(Long bytesIn) {
        this.bytesIn = bytesIn;
    }

    public Long getBytesOut() {
        return bytesOut;
    }

    public void setBytesOut(Long bytesOut) {
        this.bytesOut = bytesOut;
    }

    public Long getBytesInMax() {
        return bytesInMax;
    }

    public void setBytesInMax(Long bytesInMax) {
        this.bytesInMax = bytesInMax;
    }

    public Long getBytesOutMax() {
        return bytesOutMax;
    }

    public void setBytesOutMax(Long bytesOutMax) {
        this.bytesOutMax = bytesOutMax;
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

    public String getHostPrivate() {
        return hostPrivate;
    }

    public void setHostPrivate(String hostPrivate) {
        this.hostPrivate = hostPrivate;
    }

    public Integer getConnectionMax() {
        return connectionMax;
    }

    public void setConnectionMax(Integer connectionMax) {
        this.connectionMax = connectionMax;
    }

    public BigInteger getGroupServerId() {
        return groupServerId;
    }

    public void setGroupServerId(BigInteger groupServerId) {
        this.groupServerId = groupServerId;
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
        if (!(object instanceof StreamingServer)) {
            return false;
        }
        StreamingServer other = (StreamingServer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.StreamingServer[ id=" + id + " ]";
    }
    
}
