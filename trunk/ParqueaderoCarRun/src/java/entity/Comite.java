/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eagle
 */
@Entity
@Table(name = "COMITE", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comite.findAll", query = "SELECT c FROM Comite c"),
    @NamedQuery(name = "Comite.findByIdcomite", query = "SELECT c FROM Comite c WHERE c.idcomite = :idcomite"),
    @NamedQuery(name = "Comite.findByNombrecomite", query = "SELECT c FROM Comite c WHERE c.nombrecomite = :nombrecomite")})
public class Comite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCOMITE", nullable = false)
    private Integer idcomite;
    @Basic(optional = false)
    @Column(name = "NOMBRECOMITE", nullable = false, length = 32)
    private String nombrecomite;
    @Lob
    @Column(name = "DESCRIPCOMITE", length = 2147483647)
    private String descripcomite;

    public Comite() {
    }

    public Comite(Integer idcomite) {
        this.idcomite = idcomite;
    }

    public Comite(Integer idcomite, String nombrecomite) {
        this.idcomite = idcomite;
        this.nombrecomite = nombrecomite;
    }

    public Integer getIdcomite() {
        return idcomite;
    }

    public void setIdcomite(Integer idcomite) {
        this.idcomite = idcomite;
    }

    public String getNombrecomite() {
        return nombrecomite;
    }

    public void setNombrecomite(String nombrecomite) {
        this.nombrecomite = nombrecomite;
    }

    public String getDescripcomite() {
        return descripcomite;
    }

    public void setDescripcomite(String descripcomite) {
        this.descripcomite = descripcomite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomite != null ? idcomite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comite)) {
            return false;
        }
        Comite other = (Comite) object;
        if ((this.idcomite == null && other.idcomite != null) || (this.idcomite != null && !this.idcomite.equals(other.idcomite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Comite[ idcomite=" + idcomite + " ]";
    }
    
}
