/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eagle
 */
@Entity
@Table(name = "REGAUTOMOTORSALIDA", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Regautomotorsalida.findAll", query = "SELECT r FROM Regautomotorsalida r"),
    @NamedQuery(name = "Regautomotorsalida.findByHorafechasalida", query = "SELECT r FROM Regautomotorsalida r WHERE r.horafechasalida = :horafechasalida"),
    @NamedQuery(name = "Regautomotorsalida.findByHorafechaentrada", query = "SELECT r FROM Regautomotorsalida r WHERE r.horafechaentrada = :horafechaentrada"),
    @NamedQuery(name = "Regautomotorsalida.findByPrecio", query = "SELECT r FROM Regautomotorsalida r WHERE r.precio = :precio")})
public class Regautomotorsalida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HORAFECHASALIDA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horafechasalida;
    @Column(name = "HORAFECHAENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horafechaentrada;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRECIO", nullable = false, precision = 19, scale = 4)
    private BigDecimal precio;

    public Regautomotorsalida() {
    }

    public Regautomotorsalida(Date horafechasalida) {
        this.horafechasalida = horafechasalida;
    }

    public Regautomotorsalida(Date horafechasalida, BigDecimal precio) {
        this.horafechasalida = horafechasalida;
        this.precio = precio;
    }

    public Date getHorafechasalida() {
        return horafechasalida;
    }

    public void setHorafechasalida(Date horafechasalida) {
        this.horafechasalida = horafechasalida;
    }

    public Date getHorafechaentrada() {
        return horafechaentrada;
    }

    public void setHorafechaentrada(Date horafechaentrada) {
        this.horafechaentrada = horafechaentrada;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (horafechasalida != null ? horafechasalida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regautomotorsalida)) {
            return false;
        }
        Regautomotorsalida other = (Regautomotorsalida) object;
        if ((this.horafechasalida == null && other.horafechasalida != null) || (this.horafechasalida != null && !this.horafechasalida.equals(other.horafechasalida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Regautomotorsalida[ horafechasalida=" + horafechasalida + " ]";
    }
    
}
