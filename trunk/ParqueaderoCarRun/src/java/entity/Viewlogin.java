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
@Table(name = "VIEWLOGIN", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viewlogin.findAll", query = "SELECT v FROM Viewlogin v"),
    @NamedQuery(name = "Viewlogin.findByIdlogin", query = "SELECT v FROM Viewlogin v WHERE v.idlogin = :idlogin"),
    @NamedQuery(name = "Viewlogin.findByCedulausuario", query = "SELECT v FROM Viewlogin v WHERE v.cedulausuario = :cedulausuario"),
    @NamedQuery(name = "Viewlogin.findByIdrolparqueo", query = "SELECT v FROM Viewlogin v WHERE v.idrolparqueo = :idrolparqueo"),
    @NamedQuery(name = "Viewlogin.findByIdroladmin", query = "SELECT v FROM Viewlogin v WHERE v.idroladmin = :idroladmin"),
    @NamedQuery(name = "Viewlogin.findByPassword", query = "SELECT v FROM Viewlogin v WHERE v.password = :password")})
public class Viewlogin implements Serializable {
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

    public Viewlogin() {
    }

    public Viewlogin(String idlogin) {
        this.idlogin = idlogin;
    }

    public Viewlogin(String idlogin, String password) {
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
        if (!(object instanceof Viewlogin)) {
            return false;
        }
        Viewlogin other = (Viewlogin) object;
        if ((this.idlogin == null && other.idlogin != null) || (this.idlogin != null && !this.idlogin.equals(other.idlogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Viewlogin[ idlogin=" + idlogin + " ]";
    }
    
}
