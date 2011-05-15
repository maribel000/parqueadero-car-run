/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eagle
 */
@Entity
@Table(name = "PERTENECEA", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pertenecea.findAll", query = "SELECT p FROM Pertenecea p"),
    @NamedQuery(name = "Pertenecea.findByIdcomite", query = "SELECT p FROM Pertenecea p WHERE p.perteneceaPK.idcomite = :idcomite"),
    @NamedQuery(name = "Pertenecea.findByCedulausuario", query = "SELECT p FROM Pertenecea p WHERE p.perteneceaPK.cedulausuario = :cedulausuario")})
public class Pertenecea implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PerteneceaPK perteneceaPK;

    public Pertenecea() {
    }

    public Pertenecea(PerteneceaPK perteneceaPK) {
        this.perteneceaPK = perteneceaPK;
    }

    public Pertenecea(int idcomite, String cedulausuario) {
        this.perteneceaPK = new PerteneceaPK(idcomite, cedulausuario);
    }

    public PerteneceaPK getPerteneceaPK() {
        return perteneceaPK;
    }

    public void setPerteneceaPK(PerteneceaPK perteneceaPK) {
        this.perteneceaPK = perteneceaPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perteneceaPK != null ? perteneceaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pertenecea)) {
            return false;
        }
        Pertenecea other = (Pertenecea) object;
        if ((this.perteneceaPK == null && other.perteneceaPK != null) || (this.perteneceaPK != null && !this.perteneceaPK.equals(other.perteneceaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Pertenecea[ perteneceaPK=" + perteneceaPK + " ]";
    }
    
}
