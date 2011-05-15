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
@Table(name = "VIEWREGAUTOSALIDA", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viewregautosalida.findAll", query = "SELECT v FROM Viewregautosalida v"),
    @NamedQuery(name = "Viewregautosalida.findByHorafechasalida", query = "SELECT v FROM Viewregautosalida v WHERE v.horafechasalida = :horafechasalida"),
    @NamedQuery(name = "Viewregautosalida.findByHorafechaentrada", query = "SELECT v FROM Viewregautosalida v WHERE v.horafechaentrada = :horafechaentrada"),
    @NamedQuery(name = "Viewregautosalida.findByPrecio", query = "SELECT v FROM Viewregautosalida v WHERE v.precio = :precio")})
public class Viewregautosalida implements Serializable {
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

    public Viewregautosalida() {
    }

    public Viewregautosalida(Date horafechasalida) {
        this.horafechasalida = horafechasalida;
    }

    public Viewregautosalida(Date horafechasalida, BigDecimal precio) {
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
        if (!(object instanceof Viewregautosalida)) {
            return false;
        }
        Viewregautosalida other = (Viewregautosalida) object;
        if ((this.horafechasalida == null && other.horafechasalida != null) || (this.horafechasalida != null && !this.horafechasalida.equals(other.horafechasalida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Viewregautosalida[ horafechasalida=" + horafechasalida + " ]";
    }
    
}
