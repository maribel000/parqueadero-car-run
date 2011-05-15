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
import javax.persistence.Lob;
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
@Table(name = "CONTRATO", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c"),
    @NamedQuery(name = "Contrato.findByNumerocotrato", query = "SELECT c FROM Contrato c WHERE c.numerocotrato = :numerocotrato"),
    @NamedQuery(name = "Contrato.findByNombrecontrato", query = "SELECT c FROM Contrato c WHERE c.nombrecontrato = :nombrecontrato"),
    @NamedQuery(name = "Contrato.findByFechainicio", query = "SELECT c FROM Contrato c WHERE c.fechainicio = :fechainicio"),
    @NamedQuery(name = "Contrato.findByFechafin", query = "SELECT c FROM Contrato c WHERE c.fechafin = :fechafin")})
public class Contrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMEROCOTRATO", nullable = false)
    private Integer numerocotrato;
    @Basic(optional = false)
    @Column(name = "NOMBRECONTRATO", nullable = false, length = 32)
    private String nombrecontrato;
    @Basic(optional = false)
    @Column(name = "FECHAINICIO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Basic(optional = false)
    @Column(name = "FECHAFIN", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafin;
    @Lob
    @Column(name = "DESCRIPCONTRATO", length = 2147483647)
    private String descripcontrato;

    public Contrato() {
    }

    public Contrato(Integer numerocotrato) {
        this.numerocotrato = numerocotrato;
    }

    public Contrato(Integer numerocotrato, String nombrecontrato, Date fechainicio, Date fechafin) {
        this.numerocotrato = numerocotrato;
        this.nombrecontrato = nombrecontrato;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    public Integer getNumerocotrato() {
        return numerocotrato;
    }

    public void setNumerocotrato(Integer numerocotrato) {
        this.numerocotrato = numerocotrato;
    }

    public String getNombrecontrato() {
        return nombrecontrato;
    }

    public void setNombrecontrato(String nombrecontrato) {
        this.nombrecontrato = nombrecontrato;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getDescripcontrato() {
        return descripcontrato;
    }

    public void setDescripcontrato(String descripcontrato) {
        this.descripcontrato = descripcontrato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numerocotrato != null ? numerocotrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.numerocotrato == null && other.numerocotrato != null) || (this.numerocotrato != null && !this.numerocotrato.equals(other.numerocotrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Contrato[ numerocotrato=" + numerocotrato + " ]";
    }
    
}
