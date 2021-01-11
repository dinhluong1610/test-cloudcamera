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
@Table(name = "BUNCH_CAMERA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BunchCamera.findAll", query = "SELECT b FROM BunchCamera b")
    , @NamedQuery(name = "BunchCamera.findById", query = "SELECT b FROM BunchCamera b WHERE b.id = :id")})
public class BunchCamera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "ACCOUNT_CAMERA_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private AccountCamera accountCameraId;
    @JoinColumn(name = "BUNCH_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Bunch bunchId;

    public BunchCamera() {
    }

    public BunchCamera(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AccountCamera getAccountCameraId() {
        return accountCameraId;
    }

    public void setAccountCameraId(AccountCamera accountCameraId) {
        this.accountCameraId = accountCameraId;
    }

    public Bunch getBunchId() {
        return bunchId;
    }

    public void setBunchId(Bunch bunchId) {
        this.bunchId = bunchId;
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
        if (!(object instanceof BunchCamera)) {
            return false;
        }
        BunchCamera other = (BunchCamera) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.BunchCamera[ id=" + id + " ]";
    }
    
}
