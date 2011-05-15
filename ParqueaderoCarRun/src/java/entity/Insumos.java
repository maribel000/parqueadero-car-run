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
@Table(name = "INSUMOS", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Insumos.findAll", query = "SELECT i FROM Insumos i"),
    @NamedQuery(name = "Insumos.findByIdinsumo", query = "SELECT i FROM Insumos i WHERE i.idinsumo = :idinsumo"),
    @NamedQuery(name = "Insumos.findByNombreinsumo", query = "SELECT i FROM Insumos i WHERE i.nombreinsumo = :nombreinsumo"),
    @NamedQuery(name = "Insumos.findByDestinoinsumo", query = "SELECT i FROM Insumos i WHERE i.destinoinsumo = :destinoinsumo"),
    @NamedQuery(name = "Insumos.findByProveedor", query = "SELECT i FROM Insumos i WHERE i.proveedor = :proveedor"),
    @NamedQuery(name = "Insumos.findByResponsable", query = "SELECT i FROM Insumos i WHERE i.responsable = :responsable"),
    @NamedQuery(name = "Insumos.findByFechacompra", query = "SELECT i FROM Insumos i WHERE i.fechacompra = :fechacompra"),
    @NamedQuery(name = "Insumos.findByCantidadinventario", query = "SELECT i FROM Insumos i WHERE i.cantidadinventario = :cantidadinventario")})
public class Insumos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDINSUMO", nullable = false)
    private Integer idinsumo;
    @Basic(optional = false)
    @Column(name = "NOMBREINSUMO", nullable = false, length = 32)
    private String nombreinsumo;
    @Basic(optional = false)
    @Column(name = "DESTINOINSUMO", nullable = false, length = 32)
    private String destinoinsumo;
    @Basic(optional = false)
    @Column(name = "PROVEEDOR", nullable = false, length = 64)
    private String proveedor;
    @Basic(optional = false)
    @Column(name = "RESPONSABLE", nullable = false, length = 32)
    private String responsable;
    @Basic(optional = false)
    @Column(name = "FECHACOMPRA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacompra;
    @Basic(optional = false)
    @Column(name = "CANTIDADINVENTARIO", nullable = false, length = 32)
    private String cantidadinventario;
    @Lob
    @Column(name = "DESCRIPINSUMO", length = 2147483647)
    private String descripinsumo;

    public Insumos() {
    }

    public Insumos(Integer idinsumo) {
        this.idinsumo = idinsumo;
    }

    public Insumos(Integer idinsumo, String nombreinsumo, String destinoinsumo, String proveedor, String responsable, Date fechacompra, String cantidadinventario) {
        this.idinsumo = idinsumo;
        this.nombreinsumo = nombreinsumo;
        this.destinoinsumo = destinoinsumo;
        this.proveedor = proveedor;
        this.responsable = responsable;
        this.fechacompra = fechacompra;
        this.cantidadinventario = cantidadinventario;
    }

    public Integer getIdinsumo() {
        return idinsumo;
    }

    public void setIdinsumo(Integer idinsumo) {
        this.idinsumo = idinsumo;
    }

    public String getNombreinsumo() {
        return nombreinsumo;
    }

    public void setNombreinsumo(String nombreinsumo) {
        this.nombreinsumo = nombreinsumo;
    }

    public String getDestinoinsumo() {
        return destinoinsumo;
    }

    public void setDestinoinsumo(String destinoinsumo) {
        this.destinoinsumo = destinoinsumo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Date getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }

    public String getCantidadinventario() {
        return cantidadinventario;
    }

    public void setCantidadinventario(String cantidadinventario) {
        this.cantidadinventario = cantidadinventario;
    }

    public String getDescripinsumo() {
        return descripinsumo;
    }

    public void setDescripinsumo(String descripinsumo) {
        this.descripinsumo = descripinsumo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinsumo != null ? idinsumo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insumos)) {
            return false;
        }
        Insumos other = (Insumos) object;
        if ((this.idinsumo == null && other.idinsumo != null) || (this.idinsumo != null && !this.idinsumo.equals(other.idinsumo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Insumos[ idinsumo=" + idinsumo + " ]";
    }
    
}
