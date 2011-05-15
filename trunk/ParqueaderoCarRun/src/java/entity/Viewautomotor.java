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
@Table(name = "VIEWAUTOMOTOR", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viewautomotor.findAll", query = "SELECT v FROM Viewautomotor v"),
    @NamedQuery(name = "Viewautomotor.findByPlaca", query = "SELECT v FROM Viewautomotor v WHERE v.placa = :placa"),
    @NamedQuery(name = "Viewautomotor.findByCedulacliente", query = "SELECT v FROM Viewautomotor v WHERE v.cedulacliente = :cedulacliente"),
    @NamedQuery(name = "Viewautomotor.findByIdtipoautomotor", query = "SELECT v FROM Viewautomotor v WHERE v.idtipoautomotor = :idtipoautomotor")})
public class Viewautomotor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PLACA", nullable = false, length = 16)
    private String placa;
    @Basic(optional = false)
    @Column(name = "CEDULACLIENTE", nullable = false, length = 32)
    private String cedulacliente;
    @Column(name = "IDTIPOAUTOMOTOR")
    private Integer idtipoautomotor;
    @Lob
    @Column(name = "OBSERVACIONAUTOMOTOR", length = 2147483647)
    private String observacionautomotor;

    public Viewautomotor() {
    }

    public Viewautomotor(String placa) {
        this.placa = placa;
    }

    public Viewautomotor(String placa, String cedulacliente) {
        this.placa = placa;
        this.cedulacliente = cedulacliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public Integer getIdtipoautomotor() {
        return idtipoautomotor;
    }

    public void setIdtipoautomotor(Integer idtipoautomotor) {
        this.idtipoautomotor = idtipoautomotor;
    }

    public String getObservacionautomotor() {
        return observacionautomotor;
    }

    public void setObservacionautomotor(String observacionautomotor) {
        this.observacionautomotor = observacionautomotor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placa != null ? placa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Viewautomotor)) {
            return false;
        }
        Viewautomotor other = (Viewautomotor) object;
        if ((this.placa == null && other.placa != null) || (this.placa != null && !this.placa.equals(other.placa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Viewautomotor[ placa=" + placa + " ]";
    }
    
}
