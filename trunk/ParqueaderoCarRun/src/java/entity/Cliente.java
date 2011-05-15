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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eagle
 */
@Entity
@Table(name = "CLIENTE", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCedulacliente", query = "SELECT c FROM Cliente c WHERE c.cedulacliente = :cedulacliente"),
    @NamedQuery(name = "Cliente.findByNumerocotrato", query = "SELECT c FROM Cliente c WHERE c.numerocotrato = :numerocotrato"),
    @NamedQuery(name = "Cliente.findByNombrecliente", query = "SELECT c FROM Cliente c WHERE c.nombrecliente = :nombrecliente"),
    @NamedQuery(name = "Cliente.findByApellidocliente", query = "SELECT c FROM Cliente c WHERE c.apellidocliente = :apellidocliente"),
    @NamedQuery(name = "Cliente.findByTelefonocliente", query = "SELECT c FROM Cliente c WHERE c.telefonocliente = :telefonocliente")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CEDULACLIENTE", nullable = false, length = 32)
    private String cedulacliente;
    @Column(name = "NUMEROCOTRATO")
    private Integer numerocotrato;
    @Column(name = "NOMBRECLIENTE", length = 32)
    private String nombrecliente;
    @Column(name = "APELLIDOCLIENTE", length = 32)
    private String apellidocliente;
    @Basic(optional = false)
    @Column(name = "TELEFONOCLIENTE", nullable = false, length = 32)
    private String telefonocliente;

    public Cliente() {
    }

    public Cliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public Cliente(String cedulacliente, String telefonocliente) {
        this.cedulacliente = cedulacliente;
        this.telefonocliente = telefonocliente;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public Integer getNumerocotrato() {
        return numerocotrato;
    }

    public void setNumerocotrato(Integer numerocotrato) {
        this.numerocotrato = numerocotrato;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getApellidocliente() {
        return apellidocliente;
    }

    public void setApellidocliente(String apellidocliente) {
        this.apellidocliente = apellidocliente;
    }

    public String getTelefonocliente() {
        return telefonocliente;
    }

    public void setTelefonocliente(String telefonocliente) {
        this.telefonocliente = telefonocliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedulacliente != null ? cedulacliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cedulacliente == null && other.cedulacliente != null) || (this.cedulacliente != null && !this.cedulacliente.equals(other.cedulacliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Cliente[ cedulacliente=" + cedulacliente + " ]";
    }
    
}
