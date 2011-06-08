/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author eagle
 */
@Embeddable
public class PerteneceaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDCOMITE", nullable = false)
    private int idcomite;
    @Basic(optional = false)
    @Column(name = "CEDULAUSUARIO", nullable = false, length = 32)
    private String cedulausuario;

    public PerteneceaPK() {
    }

    public PerteneceaPK(int idcomite, String cedulausuario) {
        this.idcomite = idcomite;
        this.cedulausuario = cedulausuario;
    }

    public int getIdcomite() {
        return idcomite;
    }

    public void setIdcomite(int idcomite) {
        this.idcomite = idcomite;
    }

    public String getCedulausuario() {
        return cedulausuario;
    }

    public void setCedulausuario(String cedulausuario) {
        this.cedulausuario = cedulausuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idcomite;
        hash += (cedulausuario != null ? cedulausuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerteneceaPK)) {
            return false;
        }
        PerteneceaPK other = (PerteneceaPK) object;
        if (this.idcomite != other.idcomite) {
            return false;
        }
        if ((this.cedulausuario == null && other.cedulausuario != null) || (this.cedulausuario != null && !this.cedulausuario.equals(other.cedulausuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PerteneceaPK[idcomite=" + idcomite + ", cedulausuario=" + cedulausuario + "]";
    }

}
