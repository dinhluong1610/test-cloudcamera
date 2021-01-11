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
@Table(name = "GROUP_SERVER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GroupServer.findAll", query = "SELECT g FROM GroupServer g")
    , @NamedQuery(name = "GroupServer.findById", query = "SELECT g FROM GroupServer g WHERE g.id = :id")
    , @NamedQuery(name = "GroupServer.findByName", query = "SELECT g FROM GroupServer g WHERE g.name = :name")})
public class GroupServer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NAME")
    private String name;
    @OneToMany(mappedBy = "groupServerId")
    private Collection<Storage> storageCollection;
    @OneToMany(mappedBy = "groupServerId")
    private Collection<Stream> streamCollection;
    @OneToMany(mappedBy = "groupServerId")
    private Collection<Camera> cameraCollection;

    public GroupServer() {
    }

    public GroupServer(Integer id) {
        this.id = id;
    }

    public GroupServer(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @XmlTransient
    public Collection<Storage> getStorageCollection() {
        return storageCollection;
    }

    public void setStorageCollection(Collection<Storage> storageCollection) {
        this.storageCollection = storageCollection;
    }

    @XmlTransient
    public Collection<Stream> getStreamCollection() {
        return streamCollection;
    }

    public void setStreamCollection(Collection<Stream> streamCollection) {
        this.streamCollection = streamCollection;
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
        if (!(object instanceof GroupServer)) {
            return false;
        }
        GroupServer other = (GroupServer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.GroupServer[ id=" + id + " ]";
    }
    
}