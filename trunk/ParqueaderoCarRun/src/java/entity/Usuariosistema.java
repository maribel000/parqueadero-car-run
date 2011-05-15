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
@Table(name = "USUARIOSISTEMA", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuariosistema.findAll", query = "SELECT u FROM Usuariosistema u"),
    @NamedQuery(name = "Usuariosistema.findByCedulausuario", query = "SELECT u FROM Usuariosistema u WHERE u.cedulausuario = :cedulausuario"),
    @NamedQuery(name = "Usuariosistema.findByIdrolparqueo", query = "SELECT u FROM Usuariosistema u WHERE u.idrolparqueo = :idrolparqueo"),
    @NamedQuery(name = "Usuariosistema.findByIdroladmin", query = "SELECT u FROM Usuariosistema u WHERE u.idroladmin = :idroladmin"),
    @NamedQuery(name = "Usuariosistema.findByNombreusuario", query = "SELECT u FROM Usuariosistema u WHERE u.nombreusuario = :nombreusuario"),
    @NamedQuery(name = "Usuariosistema.findByApellidousuario", query = "SELECT u FROM Usuariosistema u WHERE u.apellidousuario = :apellidousuario"),
    @NamedQuery(name = "Usuariosistema.findByEMail", query = "SELECT u FROM Usuariosistema u WHERE u.eMail = :eMail"),
    @NamedQuery(name = "Usuariosistema.findByTelefonousuario", query = "SELECT u FROM Usuariosistema u WHERE u.telefonousuario = :telefonousuario")})
public class Usuariosistema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CEDULAUSUARIO", nullable = false, length = 32)
    private String cedulausuario;
    @Column(name = "IDROLPARQUEO")
    private Integer idrolparqueo;
    @Column(name = "IDROLADMIN")
    private Integer idroladmin;
    @Basic(optional = false)
    @Column(name = "NOMBREUSUARIO", nullable = false, length = 32)
    private String nombreusuario;
    @Basic(optional = false)
    @Column(name = "APELLIDOUSUARIO", nullable = false, length = 32)
    private String apellidousuario;
    @Column(name = "E_MAIL", length = 32)
    private String eMail;
    @Basic(optional = false)
    @Column(name = "TELEFONOUSUARIO", nullable = false, length = 32)
    private String telefonousuario;

    public Usuariosistema() {
    }

    public Usuariosistema(String cedulausuario) {
        this.cedulausuario = cedulausuario;
    }

    public Usuariosistema(String cedulausuario, String nombreusuario, String apellidousuario, String telefonousuario) {
        this.cedulausuario = cedulausuario;
        this.nombreusuario = nombreusuario;
        this.apellidousuario = apellidousuario;
        this.telefonousuario = telefonousuario;
    }

    public String getCedulausuario() {
        return cedulausuario;
    }

    public void setCedulausuario(String cedulausuario) {
        this.cedulausuario = cedulausuario;
    }

    public Integer getIdrolparqueo() {
        return idrolparqueo;
    }

    public void setIdrolparqueo(Integer idrolparqueo) {
        this.idrolparqueo = idrolparqueo;
    }

    public Integer getIdroladmin() {
        return idroladmin;
    }

    public void setIdroladmin(Integer idroladmin) {
        this.idroladmin = idroladmin;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getApellidousuario() {
        return apellidousuario;
    }

    public void setApellidousuario(String apellidousuario) {
        this.apellidousuario = apellidousuario;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelefonousuario() {
        return telefonousuario;
    }

    public void setTelefonousuario(String telefonousuario) {
        this.telefonousuario = telefonousuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedulausuario != null ? cedulausuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuariosistema)) {
            return false;
        }
        Usuariosistema other = (Usuariosistema) object;
        if ((this.cedulausuario == null && other.cedulausuario != null) || (this.cedulausuario != null && !this.cedulausuario.equals(other.cedulausuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Usuariosistema[ cedulausuario=" + cedulausuario + " ]";
    }
    
}
