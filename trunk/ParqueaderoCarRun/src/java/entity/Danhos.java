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
@Table(name = "DANHOS", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Danhos.findAll", query = "SELECT d FROM Danhos d"),
    @NamedQuery(name = "Danhos.findByIddanhos", query = "SELECT d FROM Danhos d WHERE d.iddanhos = :iddanhos"),
    @NamedQuery(name = "Danhos.findByPlaca", query = "SELECT d FROM Danhos d WHERE d.placa = :placa"),
    @NamedQuery(name = "Danhos.findByFecharegdanhos", query = "SELECT d FROM Danhos d WHERE d.fecharegdanhos = :fecharegdanhos"),
    @NamedQuery(name = "Danhos.findByHoraregdanhos", query = "SELECT d FROM Danhos d WHERE d.horaregdanhos = :horaregdanhos")})
public class Danhos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDDANHOS", nullable = false)
    private Integer iddanhos;
    @Basic(optional = false)
    @Column(name = "PLACA", nullable = false, length = 16)
    private String placa;
    @Basic(optional = false)
    @Column(name = "FECHAREGDANHOS", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegdanhos;
    @Basic(optional = false)
    @Column(name = "HORAREGDANHOS", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaregdanhos;
    @Lob
    @Column(name = "LISTADANHOS", length = 2147483647)
    private String listadanhos;

    public Danhos() {
    }

    public Danhos(Integer iddanhos) {
        this.iddanhos = iddanhos;
    }

    public Danhos(Integer iddanhos, String placa, Date fecharegdanhos, Date horaregdanhos) {
        this.iddanhos = iddanhos;
        this.placa = placa;
        this.fecharegdanhos = fecharegdanhos;
        this.horaregdanhos = horaregdanhos;
    }

    public Integer getIddanhos() {
        return iddanhos;
    }

    public void setIddanhos(Integer iddanhos) {
        this.iddanhos = iddanhos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFecharegdanhos() {
        return fecharegdanhos;
    }

    public void setFecharegdanhos(Date fecharegdanhos) {
        this.fecharegdanhos = fecharegdanhos;
    }

    public Date getHoraregdanhos() {
        return horaregdanhos;
    }

    public void setHoraregdanhos(Date horaregdanhos) {
        this.horaregdanhos = horaregdanhos;
    }

    public String getListadanhos() {
        return listadanhos;
    }

    public void setListadanhos(String listadanhos) {
        this.listadanhos = listadanhos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddanhos != null ? iddanhos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Danhos)) {
            return false;
        }
        Danhos other = (Danhos) object;
        if ((this.iddanhos == null && other.iddanhos != null) || (this.iddanhos != null && !this.iddanhos.equals(other.iddanhos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Danhos[ iddanhos=" + iddanhos + " ]";
    }
    
}
