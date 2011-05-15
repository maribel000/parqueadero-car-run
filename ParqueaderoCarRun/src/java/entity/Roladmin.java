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
@Table(name = "ROLADMIN", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roladmin.findAll", query = "SELECT r FROM Roladmin r"),
    @NamedQuery(name = "Roladmin.findByIdroladmin", query = "SELECT r FROM Roladmin r WHERE r.idroladmin = :idroladmin"),
    @NamedQuery(name = "Roladmin.findByNombreroladmin", query = "SELECT r FROM Roladmin r WHERE r.nombreroladmin = :nombreroladmin"),
    @NamedQuery(name = "Roladmin.findByDuracion", query = "SELECT r FROM Roladmin r WHERE r.duracion = :duracion")})
public class Roladmin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDROLADMIN", nullable = false)
    private Integer idroladmin;
    @Basic(optional = false)
    @Column(name = "NOMBREROLADMIN", nullable = false, length = 32)
    private String nombreroladmin;
    @Column(name = "DURACION", length = 32)
    private String duracion;
    @Lob
    @Column(name = "DESCRIPROLADMIN", length = 2147483647)
    private String descriproladmin;

    public Roladmin() {
    }

    public Roladmin(Integer idroladmin) {
        this.idroladmin = idroladmin;
    }

    public Roladmin(Integer idroladmin, String nombreroladmin) {
        this.idroladmin = idroladmin;
        this.nombreroladmin = nombreroladmin;
    }

    public Integer getIdroladmin() {
        return idroladmin;
    }

    public void setIdroladmin(Integer idroladmin) {
        this.idroladmin = idroladmin;
    }

    public String getNombreroladmin() {
        return nombreroladmin;
    }

    public void setNombreroladmin(String nombreroladmin) {
        this.nombreroladmin = nombreroladmin;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDescriproladmin() {
        return descriproladmin;
    }

    public void setDescriproladmin(String descriproladmin) {
        this.descriproladmin = descriproladmin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idroladmin != null ? idroladmin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roladmin)) {
            return false;
        }
        Roladmin other = (Roladmin) object;
        if ((this.idroladmin == null && other.idroladmin != null) || (this.idroladmin != null && !this.idroladmin.equals(other.idroladmin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Roladmin[ idroladmin=" + idroladmin + " ]";
    }
    
}
