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
@Table(name = "BUNCH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bunch.findAll", query = "SELECT b FROM Bunch b")
    , @NamedQuery(name = "Bunch.findById", query = "SELECT b FROM Bunch b WHERE b.id = :id")
    , @NamedQuery(name = "Bunch.findByName", query = "SELECT b FROM Bunch b WHERE b.name = :name")
    , @NamedQuery(name = "Bunch.findByDateCreated", query = "SELECT b FROM Bunch b WHERE b.dateCreated = :dateCreated")})
public class Bunch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 300)
    @Column(name = "NAME")
    private String name;
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Account accountId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bunchId")
    private Collection<BunchCamera> bunchCameraCollection;

    public Bunch() {
    }

    public Bunch(Integer id) {
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    @XmlTransient
    public Collection<BunchCamera> getBunchCameraCollection() {
        return bunchCameraCollection;
    }

    public void setBunchCameraCollection(Collection<BunchCamera> bunchCameraCollection) {
        this.bunchCameraCollection = bunchCameraCollection;
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
        if (!(object instanceof Bunch)) {
            return false;
        }
        Bunch other = (Bunch) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "remote.bean.entity.Bunch[ id=" + id + " ]";
    }
    
}
