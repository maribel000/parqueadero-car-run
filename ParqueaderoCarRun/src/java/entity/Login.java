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
@Table(name = "LOGIN", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l"),
    @NamedQuery(name = "Login.findByIdlogin", query = "SELECT l FROM Login l WHERE l.idlogin = :idlogin"),
    @NamedQuery(name = "Login.findByCedulausuario", query = "SELECT l FROM Login l WHERE l.cedulausuario = :cedulausuario"),
    @NamedQuery(name = "Login.findByIdrolparqueo", query = "SELECT l FROM Login l WHERE l.idrolparqueo = :idrolparqueo"),
    @NamedQuery(name = "Login.findByIdroladmin", query = "SELECT l FROM Login l WHERE l.idroladmin = :idroladmin"),
    @NamedQuery(name = "Login.findByPassword", query = "SELECT l FROM Login l WHERE l.password = :password")})
public class Login implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDLOGIN", nullable = false, length = 64)
    private String idlogin;
    @Column(name = "CEDULAUSUARIO", length = 32)
    private String cedulausuario;
    @Column(name = "IDROLPARQUEO")
    private Integer idrolparqueo;
    @Column(name = "IDROLADMIN")
    private Integer idroladmin;
    @Basic(optional = false)
    @Column(name = "PASSWORD", nullable = false, length = 64)
    private String password;

    public Login() {
    }

    public Login(String idlogin) {
        this.idlogin = idlogin;
    }

    public Login(String idlogin, String password) {
        this.idlogin = idlogin;
        this.password = password;
    }

    public String getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(String idlogin) {
        this.idlogin = idlogin;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlogin != null ? idlogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.idlogin == null && other.idlogin != null) || (this.idlogin != null && !this.idlogin.equals(other.idlogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Login[ idlogin=" + idlogin + " ]";
    }
    
}
