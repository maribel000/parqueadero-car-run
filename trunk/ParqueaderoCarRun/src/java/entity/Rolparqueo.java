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
@Table(name = "ROLPARQUEO", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rolparqueo.findAll", query = "SELECT r FROM Rolparqueo r"),
    @NamedQuery(name = "Rolparqueo.findByIdrolparqueo", query = "SELECT r FROM Rolparqueo r WHERE r.idrolparqueo = :idrolparqueo"),
    @NamedQuery(name = "Rolparqueo.findByNombrerolparqueo", query = "SELECT r FROM Rolparqueo r WHERE r.nombrerolparqueo = :nombrerolparqueo")})
public class Rolparqueo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDROLPARQUEO", nullable = false)
    private Integer idrolparqueo;
    @Basic(optional = false)
    @Column(name = "NOMBREROLPARQUEO", nullable = false, length = 32)
    private String nombrerolparqueo;
    @Basic(optional = false)
    @Lob
    @Column(name = "DESCRIPROLPARQUEO", nullable = false, length = 2147483647)
    private String descriprolparqueo;

    public Rolparqueo() {
    }

    public Rolparqueo(Integer idrolparqueo) {
        this.idrolparqueo = idrolparqueo;
    }

    public Rolparqueo(Integer idrolparqueo, String nombrerolparqueo, String descriprolparqueo) {
        this.idrolparqueo = idrolparqueo;
        this.nombrerolparqueo = nombrerolparqueo;
        this.descriprolparqueo = descriprolparqueo;
    }

    public Integer getIdrolparqueo() {
        return idrolparqueo;
    }

    public void setIdrolparqueo(Integer idrolparqueo) {
        this.idrolparqueo = idrolparqueo;
    }

    public String getNombrerolparqueo() {
        return nombrerolparqueo;
    }

    public void setNombrerolparqueo(String nombrerolparqueo) {
        this.nombrerolparqueo = nombrerolparqueo;
    }

    public String getDescriprolparqueo() {
        return descriprolparqueo;
    }

    public void setDescriprolparqueo(String descriprolparqueo) {
        this.descriprolparqueo = descriprolparqueo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrolparqueo != null ? idrolparqueo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolparqueo)) {
            return false;
        }
        Rolparqueo other = (Rolparqueo) object;
        if ((this.idrolparqueo == null && other.idrolparqueo != null) || (this.idrolparqueo != null && !this.idrolparqueo.equals(other.idrolparqueo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Rolparqueo[ idrolparqueo=" + idrolparqueo + " ]";
    }
    
}
