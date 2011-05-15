/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PROYECTO", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyecto.findAll", query = "SELECT p FROM Proyecto p"),
    @NamedQuery(name = "Proyecto.findByIdproyecto", query = "SELECT p FROM Proyecto p WHERE p.idproyecto = :idproyecto"),
    @NamedQuery(name = "Proyecto.findByNombreproyecto", query = "SELECT p FROM Proyecto p WHERE p.nombreproyecto = :nombreproyecto"),
    @NamedQuery(name = "Proyecto.findByPresupuesto", query = "SELECT p FROM Proyecto p WHERE p.presupuesto = :presupuesto")})
public class Proyecto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPROYECTO", nullable = false)
    private Integer idproyecto;
    @Basic(optional = false)
    @Column(name = "NOMBREPROYECTO", nullable = false, length = 32)
    private String nombreproyecto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRESUPUESTO", precision = 19, scale = 4)
    private BigDecimal presupuesto;
    @Lob
    @Column(name = "DESCRIPPROYECTO", length = 2147483647)
    private String descripproyecto;

    public Proyecto() {
    }

    public Proyecto(Integer idproyecto) {
        this.idproyecto = idproyecto;
    }

    public Proyecto(Integer idproyecto, String nombreproyecto) {
        this.idproyecto = idproyecto;
        this.nombreproyecto = nombreproyecto;
    }

    public Integer getIdproyecto() {
        return idproyecto;
    }

    public void setIdproyecto(Integer idproyecto) {
        this.idproyecto = idproyecto;
    }

    public String getNombreproyecto() {
        return nombreproyecto;
    }

    public void setNombreproyecto(String nombreproyecto) {
        this.nombreproyecto = nombreproyecto;
    }

    public BigDecimal getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(BigDecimal presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getDescripproyecto() {
        return descripproyecto;
    }

    public void setDescripproyecto(String descripproyecto) {
        this.descripproyecto = descripproyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproyecto != null ? idproyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        if ((this.idproyecto == null && other.idproyecto != null) || (this.idproyecto != null && !this.idproyecto.equals(other.idproyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Proyecto[ idproyecto=" + idproyecto + " ]";
    }
    
}
