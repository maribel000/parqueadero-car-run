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
@Table(name = "VIEWREGAUTOENTRADA", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viewregautoentrada.findAll", query = "SELECT v FROM Viewregautoentrada v"),
    @NamedQuery(name = "Viewregautoentrada.findByHorafechaentrada", query = "SELECT v FROM Viewregautoentrada v WHERE v.horafechaentrada = :horafechaentrada"),
    @NamedQuery(name = "Viewregautoentrada.findByPlaca", query = "SELECT v FROM Viewregautoentrada v WHERE v.placa = :placa"),
    @NamedQuery(name = "Viewregautoentrada.findByObservacionentrada", query = "SELECT v FROM Viewregautoentrada v WHERE v.observacionentrada = :observacionentrada")})
public class Viewregautoentrada implements Serializable {
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

    public Viewregautoentrada() {
    }

    public Viewregautoentrada(Date horafechaentrada) {
        this.horafechaentrada = horafechaentrada;
    }

    public Viewregautoentrada(Date horafechaentrada, String placa) {
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
        if (!(object instanceof Viewregautoentrada)) {
            return false;
        }
        Viewregautoentrada other = (Viewregautoentrada) object;
        if ((this.horafechaentrada == null && other.horafechaentrada != null) || (this.horafechaentrada != null && !this.horafechaentrada.equals(other.horafechaentrada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Viewregautoentrada[ horafechaentrada=" + horafechaentrada + " ]";
    }
    
}
