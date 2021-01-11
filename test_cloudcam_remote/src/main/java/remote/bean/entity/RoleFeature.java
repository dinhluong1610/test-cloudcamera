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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luong
 */
@Entity
@Table(name = "ROLE_FEATURE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoleFeature.findAll", query = "SELECT r FROM RoleFeature r")
    , @NamedQuery(name = "RoleFeature.findById", query = "SELECT r FROM RoleFeature r WHERE r.id = :id")})
public class RoleFeature implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "FEATURE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Feature featureId;
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Role roleId;

    public RoleFeature() {
    }

    public RoleFeature(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Feature getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Feature featureId) {
        this.featureId = featureId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
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
        if (!(object instanceof RoleFeature)) {
            return false;
        }
        RoleFeature other = (RoleFeature) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.RoleFeature[ id=" + id + " ]";
    }
    
}
