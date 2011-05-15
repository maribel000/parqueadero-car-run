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
@Table(name = "VIEWUSUARIOSISSTEMA", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viewusuariosisstema.findAll", query = "SELECT v FROM Viewusuariosisstema v"),
    @NamedQuery(name = "Viewusuariosisstema.findByCedulausuario", query = "SELECT v FROM Viewusuariosisstema v WHERE v.cedulausuario = :cedulausuario"),
    @NamedQuery(name = "Viewusuariosisstema.findByIdrolparqueo", query = "SELECT v FROM Viewusuariosisstema v WHERE v.idrolparqueo = :idrolparqueo"),
    @NamedQuery(name = "Viewusuariosisstema.findByIdroladmin", query = "SELECT v FROM Viewusuariosisstema v WHERE v.idroladmin = :idroladmin"),
    @NamedQuery(name = "Viewusuariosisstema.findByNombreusuario", query = "SELECT v FROM Viewusuariosisstema v WHERE v.nombreusuario = :nombreusuario"),
    @NamedQuery(name = "Viewusuariosisstema.findByApellidousuario", query = "SELECT v FROM Viewusuariosisstema v WHERE v.apellidousuario = :apellidousuario"),
    @NamedQuery(name = "Viewusuariosisstema.findByEMail", query = "SELECT v FROM Viewusuariosisstema v WHERE v.eMail = :eMail"),
    @NamedQuery(name = "Viewusuariosisstema.findByTelefonousuario", query = "SELECT v FROM Viewusuariosisstema v WHERE v.telefonousuario = :telefonousuario")})
public class Viewusuariosisstema implements Serializable {
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

    public Viewusuariosisstema() {
    }

    public Viewusuariosisstema(String cedulausuario) {
        this.cedulausuario = cedulausuario;
    }

    public Viewusuariosisstema(String cedulausuario, String nombreusuario, String apellidousuario, String telefonousuario) {
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
        if (!(object instanceof Viewusuariosisstema)) {
            return false;
        }
        Viewusuariosisstema other = (Viewusuariosisstema) object;
        if ((this.cedulausuario == null && other.cedulausuario != null) || (this.cedulausuario != null && !this.cedulausuario.equals(other.cedulausuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Viewusuariosisstema[ cedulausuario=" + cedulausuario + " ]";
    }
    
}
