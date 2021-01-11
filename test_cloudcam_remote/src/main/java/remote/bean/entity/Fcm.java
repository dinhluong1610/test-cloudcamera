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
@Table(name = "FCM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fcm.findAll", query = "SELECT f FROM Fcm f")
    , @NamedQuery(name = "Fcm.findById", query = "SELECT f FROM Fcm f WHERE f.id = :id")
    , @NamedQuery(name = "Fcm.findByClientToken", query = "SELECT f FROM Fcm f WHERE f.clientToken = :clientToken")})
public class Fcm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "CLIENT_TOKEN")
    private String clientToken;
    @JoinColumn(name = "REFRESH_TOKEN_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Token refreshTokenId;

    public Fcm() {
    }

    public Fcm(Integer id) {
        this.id = id;
    }

    public Fcm(Integer id, String clientToken) {
        this.id = id;
        this.clientToken = clientToken;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public Token getRefreshTokenId() {
        return refreshTokenId;
    }

    public void setRefreshTokenId(Token refreshTokenId) {
        this.refreshTokenId = refreshTokenId;
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
        if (!(object instanceof Fcm)) {
            return false;
        }
        Fcm other = (Fcm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.Fcm[ id=" + id + " ]";
    }
    
}
