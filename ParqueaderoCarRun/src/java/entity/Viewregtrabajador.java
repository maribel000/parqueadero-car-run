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
@Table(name = "VIEWREGTRABAJADOR", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viewregtrabajador.findAll", query = "SELECT v FROM Viewregtrabajador v"),
    @NamedQuery(name = "Viewregtrabajador.findByIdregtrab", query = "SELECT v FROM Viewregtrabajador v WHERE v.idregtrab = :idregtrab"),
    @NamedQuery(name = "Viewregtrabajador.findByCedulausuario", query = "SELECT v FROM Viewregtrabajador v WHERE v.cedulausuario = :cedulausuario"),
    @NamedQuery(name = "Viewregtrabajador.findByDiatrabajado", query = "SELECT v FROM Viewregtrabajador v WHERE v.diatrabajado = :diatrabajado"),
    @NamedQuery(name = "Viewregtrabajador.findByHoraingreso", query = "SELECT v FROM Viewregtrabajador v WHERE v.horaingreso = :horaingreso"),
    @NamedQuery(name = "Viewregtrabajador.findByObservaciones", query = "SELECT v FROM Viewregtrabajador v WHERE v.observaciones = :observaciones")})
public class Viewregtrabajador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDREGTRAB", nullable = false)
    private Integer idregtrab;
    @Basic(optional = false)
    @Column(name = "CEDULAUSUARIO", nullable = false, length = 32)
    private String cedulausuario;
    @Basic(optional = false)
    @Column(name = "DIATRABAJADO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date diatrabajado;
    @Basic(optional = false)
    @Column(name = "HORAINGRESO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaingreso;
    @Column(name = "OBSERVACIONES", length = 32)
    private String observaciones;

    public Viewregtrabajador() {
    }

    public Viewregtrabajador(Integer idregtrab) {
        this.idregtrab = idregtrab;
    }

    public Viewregtrabajador(Integer idregtrab, String cedulausuario, Date diatrabajado, Date horaingreso) {
        this.idregtrab = idregtrab;
        this.cedulausuario = cedulausuario;
        this.diatrabajado = diatrabajado;
        this.horaingreso = horaingreso;
    }

    public Integer getIdregtrab() {
        return idregtrab;
    }

    public void setIdregtrab(Integer idregtrab) {
        this.idregtrab = idregtrab;
    }

    public String getCedulausuario() {
        return cedulausuario;
    }

    public void setCedulausuario(String cedulausuario) {
        this.cedulausuario = cedulausuario;
    }

    public Date getDiatrabajado() {
        return diatrabajado;
    }

    public void setDiatrabajado(Date diatrabajado) {
        this.diatrabajado = diatrabajado;
    }

    public Date getHoraingreso() {
        return horaingreso;
    }

    public void setHoraingreso(Date horaingreso) {
        this.horaingreso = horaingreso;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idregtrab != null ? idregtrab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Viewregtrabajador)) {
            return false;
        }
        Viewregtrabajador other = (Viewregtrabajador) object;
        if ((this.idregtrab == null && other.idregtrab != null) || (this.idregtrab != null && !this.idregtrab.equals(other.idregtrab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Viewregtrabajador[ idregtrab=" + idregtrab + " ]";
    }
    
}
