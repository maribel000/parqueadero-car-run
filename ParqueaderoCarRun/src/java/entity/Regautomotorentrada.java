/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
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
@Table(name = "REGAUTOMOTORENTRADA", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Regautomotorentrada.findAll", query = "SELECT r FROM Regautomotorentrada r"),
    @NamedQuery(name = "Regautomotorentrada.findByHorafechaentrada", query = "SELECT r FROM Regautomotorentrada r WHERE r.horafechaentrada = :horafechaentrada"),
    @NamedQuery(name = "Regautomotorentrada.findByPlaca", query = "SELECT r FROM Regautomotorentrada r WHERE r.placa = :placa"),
    @NamedQuery(name = "Regautomotorentrada.findByObservacionentrada", query = "SELECT r FROM Regautomotorentrada r WHERE r.observacionentrada = :observacionentrada")})
public class Regautomotorentrada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HORAFECHAENTRADA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horafechaentrada;
    @Basic(optional = false)
    @Column(name = "PLACA", nullable = false, length = 16)
    private String placa;
    @Column(name = "OBSERVACIONENTRADA", length = 64)
    private String observacionentrada;

    public Regautomotorentrada() {
    }

    public Regautomotorentrada(Date horafechaentrada) {
        this.horafechaentrada = horafechaentrada;
    }

    public Regautomotorentrada(Date horafechaentrada, String placa) {
        this.horafechaentrada = horafechaentrada;
        this.placa = placa;
    }

    public Date getHorafechaentrada() {
        return horafechaentrada;
    }

    public void setHorafechaentrada(Date horafechaentrada) {
        this.horafechaentrada = horafechaentrada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getObservacionentrada() {
        return observacionentrada;
    }

    public void setObservacionentrada(String observacionentrada) {
        this.observacionentrada = observacionentrada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (horafechaentrada != null ? horafechaentrada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regautomotorentrada)) {
            return false;
        }
        Regautomotorentrada other = (Regautomotorentrada) object;
        if ((this.horafechaentrada == null && other.horafechaentrada != null) || (this.horafechaentrada != null && !this.horafechaentrada.equals(other.horafechaentrada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Regautomotorentrada[ horafechaentrada=" + horafechaentrada + " ]";
    }
    
}
