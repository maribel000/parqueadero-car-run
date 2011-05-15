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
@Table(name = "ESTADOFINANCIERO", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadofinanciero.findAll", query = "SELECT e FROM Estadofinanciero e"),
    @NamedQuery(name = "Estadofinanciero.findByIdestfinanciero", query = "SELECT e FROM Estadofinanciero e WHERE e.idestfinanciero = :idestfinanciero"),
    @NamedQuery(name = "Estadofinanciero.findByNombreestfinanciero", query = "SELECT e FROM Estadofinanciero e WHERE e.nombreestfinanciero = :nombreestfinanciero"),
    @NamedQuery(name = "Estadofinanciero.findByValor", query = "SELECT e FROM Estadofinanciero e WHERE e.valor = :valor")})
public class Estadofinanciero implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDESTFINANCIERO", nullable = false)
    private Integer idestfinanciero;
    @Basic(optional = false)
    @Column(name = "NOMBREESTFINANCIERO", nullable = false, length = 32)
    private String nombreestfinanciero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "VALOR", nullable = false, precision = 19, scale = 4)
    private BigDecimal valor;
    @Lob
    @Column(name = "DESCRIPESTFINANCIERO", length = 2147483647)
    private String descripestfinanciero;

    public Estadofinanciero() {
    }

    public Estadofinanciero(Integer idestfinanciero) {
        this.idestfinanciero = idestfinanciero;
    }

    public Estadofinanciero(Integer idestfinanciero, String nombreestfinanciero, BigDecimal valor) {
        this.idestfinanciero = idestfinanciero;
        this.nombreestfinanciero = nombreestfinanciero;
        this.valor = valor;
    }

    public Integer getIdestfinanciero() {
        return idestfinanciero;
    }

    public void setIdestfinanciero(Integer idestfinanciero) {
        this.idestfinanciero = idestfinanciero;
    }

    public String getNombreestfinanciero() {
        return nombreestfinanciero;
    }

    public void setNombreestfinanciero(String nombreestfinanciero) {
        this.nombreestfinanciero = nombreestfinanciero;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescripestfinanciero() {
        return descripestfinanciero;
    }

    public void setDescripestfinanciero(String descripestfinanciero) {
        this.descripestfinanciero = descripestfinanciero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestfinanciero != null ? idestfinanciero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadofinanciero)) {
            return false;
        }
        Estadofinanciero other = (Estadofinanciero) object;
        if ((this.idestfinanciero == null && other.idestfinanciero != null) || (this.idestfinanciero != null && !this.idestfinanciero.equals(other.idestfinanciero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Estadofinanciero[ idestfinanciero=" + idestfinanciero + " ]";
    }
    
}
