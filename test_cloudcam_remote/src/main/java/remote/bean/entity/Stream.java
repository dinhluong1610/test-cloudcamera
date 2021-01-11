/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.bean.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luong
 */
@Entity
@Table(name = "STREAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stream.findAll", query = "SELECT s FROM Stream s")
    , @NamedQuery(name = "Stream.findById", query = "SELECT s FROM Stream s WHERE s.id = :id")
    , @NamedQuery(name = "Stream.findByInputStream", query = "SELECT s FROM Stream s WHERE s.inputStream = :inputStream")
    , @NamedQuery(name = "Stream.findByOutputStream", query = "SELECT s FROM Stream s WHERE s.outputStream = :outputStream")
    , @NamedQuery(name = "Stream.findByHost", query = "SELECT s FROM Stream s WHERE s.host = :host")
    , @NamedQuery(name = "Stream.findByStreamingProtocol", query = "SELECT s FROM Stream s WHERE s.streamingProtocol = :streamingProtocol")
    , @NamedQuery(name = "Stream.findByByteIn", query = "SELECT s FROM Stream s WHERE s.byteIn = :byteIn")})
public class Stream implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 300)
    @Column(name = "INPUT_STREAM")
    private String inputStream;
    @Size(max = 300)
    @Column(name = "OUTPUT_STREAM")
    private String outputStream;
    @Size(max = 30)
    @Column(name = "HOST")
    private String host;
    @Size(max = 10)
    @Column(name = "STREAMING_PROTOCOL")
    private String streamingProtocol;
    @Column(name = "BYTE_IN")
    private Integer byteIn;
    @JoinColumn(name = "CAMERA_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Camera cameraId;
    @JoinColumn(name = "GROUP_SERVER_ID", referencedColumnName = "ID")
    @ManyToOne
    private GroupServer groupServerId;

    public Stream() {
    }

    public Stream(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInputStream() {
        return inputStream;
    }

    public void setInputStream(String inputStream) {
        this.inputStream = inputStream;
    }

    public String getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(String outputStream) {
        this.outputStream = outputStream;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getStreamingProtocol() {
        return streamingProtocol;
    }

    public void setStreamingProtocol(String streamingProtocol) {
        this.streamingProtocol = streamingProtocol;
    }

    public Integer getByteIn() {
        return byteIn;
    }

    public void setByteIn(Integer byteIn) {
        this.byteIn = byteIn;
    }

    public Camera getCameraId() {
        return cameraId;
    }

    public void setCameraId(Camera cameraId) {
        this.cameraId = cameraId;
    }

    public GroupServer getGroupServerId() {
        return groupServerId;
    }

    public void setGroupServerId(GroupServer groupServerId) {
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
        if (!(object instanceof Stream)) {
            return false;
        }
        Stream other = (Stream) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.Stream[ id=" + id + " ]";
    }
    
}
