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
@Table(name = "STREAMING_SERVER_LOG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StreamingServerLog.findAll", query = "SELECT s FROM StreamingServerLog s")
    , @NamedQuery(name = "StreamingServerLog.findById", query = "SELECT s FROM StreamingServerLog s WHERE s.id = :id")
    , @NamedQuery(name = "StreamingServerLog.findByStreamingServerId", query = "SELECT s FROM StreamingServerLog s WHERE s.streamingServerId = :streamingServerId")
    , @NamedQuery(name = "StreamingServerLog.findByStartTime", query = "SELECT s FROM StreamingServerLog s WHERE s.startTime = :startTime")
    , @NamedQuery(name = "StreamingServerLog.findByEndTime", query = "SELECT s FROM StreamingServerLog s WHERE s.endTime = :endTime")
    , @NamedQuery(name = "StreamingServerLog.findByStatus", query = "SELECT s FROM StreamingServerLog s WHERE s.status = :status")
    , @NamedQuery(name = "StreamingServerLog.findByDateCreated", query = "SELECT s FROM StreamingServerLog s WHERE s.dateCreated = :dateCreated")})
public class StreamingServerLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "STREAMING_SERVER_ID")
    private Integer streamingServerId;
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

    public StreamingServerLog() {
    }

    public StreamingServerLog(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStreamingServerId() {
        return streamingServerId;
    }

    public void setStreamingServerId(Integer streamingServerId) {
        this.streamingServerId = streamingServerId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StreamingServerLog)) {
            return false;
        }
        StreamingServerLog other = (StreamingServerLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.StreamingServerLog[ id=" + id + " ]";
    }
    
}
