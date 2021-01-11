/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "STORAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Storage.findAll", query = "SELECT s FROM Storage s")
    , @NamedQuery(name = "Storage.findById", query = "SELECT s FROM Storage s WHERE s.id = :id")
    , @NamedQuery(name = "Storage.findByBasePath", query = "SELECT s FROM Storage s WHERE s.basePath = :basePath")
    , @NamedQuery(name = "Storage.findByPriority", query = "SELECT s FROM Storage s WHERE s.priority = :priority")
    , @NamedQuery(name = "Storage.findByStatus", query = "SELECT s FROM Storage s WHERE s.status = :status")
    , @NamedQuery(name = "Storage.findByTotalSpace", query = "SELECT s FROM Storage s WHERE s.totalSpace = :totalSpace")
    , @NamedQuery(name = "Storage.findByUsableSpace", query = "SELECT s FROM Storage s WHERE s.usableSpace = :usableSpace")})
public class Storage implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 100)
    @Column(name = "BASE_PATH")
    private String basePath;
    @Column(name = "PRIORITY")
    private Short priority;
    @Size(max = 50)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "TOTAL_SPACE")
    private Long totalSpace;
    @Column(name = "USABLE_SPACE")
    private Long usableSpace;
    @JoinColumn(name = "GROUP_SERVER_ID", referencedColumnName = "ID")
    @ManyToOne
    private GroupServer groupServerId;

    public Storage() {
    }

    public Storage(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public Short getPriority() {
        return priority;
    }

    public void setPriority(Short priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTotalSpace() {
        return totalSpace;
    }

    public void setTotalSpace(Long totalSpace) {
        this.totalSpace = totalSpace;
    }

    public Long getUsableSpace() {
        return usableSpace;
    }

    public void setUsableSpace(Long usableSpace) {
        this.usableSpace = usableSpace;
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
        if (!(object instanceof Storage)) {
            return false;
        }
        Storage other = (Storage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.Storage[ id=" + id + " ]";
    }
    
}
