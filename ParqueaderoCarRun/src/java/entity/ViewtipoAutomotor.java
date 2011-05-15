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
@Table(name = "VIEWTIPO_AUTOMOTOR", catalog = "dbd_2", schema = "rvillabonas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViewtipoAutomotor.findAll", query = "SELECT v FROM ViewtipoAutomotor v"),
    @NamedQuery(name = "ViewtipoAutomotor.findByIdtipoautomotor", query = "SELECT v FROM ViewtipoAutomotor v WHERE v.idtipoautomotor = :idtipoautomotor"),
    @NamedQuery(name = "ViewtipoAutomotor.findByTipo", query = "SELECT v FROM ViewtipoAutomotor v WHERE v.tipo = :tipo")})
public class ViewtipoAutomotor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDTIPOAUTOMOTOR", nullable = false)
    private Integer idtipoautomotor;
    @Basic(optional = false)
    @Column(name = "TIPO", nullable = false, length = 32)
    private String tipo;

    public ViewtipoAutomotor() {
    }

    public ViewtipoAutomotor(Integer idtipoautomotor) {
        this.idtipoautomotor = idtipoautomotor;
    }

    public ViewtipoAutomotor(Integer idtipoautomotor, String tipo) {
        this.idtipoautomotor = idtipoautomotor;
        this.tipo = tipo;
    }

    public Integer getIdtipoautomotor() {
        return idtipoautomotor;
    }

    public void setIdtipoautomotor(Integer idtipoautomotor) {
        this.idtipoautomotor = idtipoautomotor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoautomotor != null ? idtipoautomotor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ViewtipoAutomotor)) {
            return false;
        }
        ViewtipoAutomotor other = (ViewtipoAutomotor) object;
        if ((this.idtipoautomotor == null && other.idtipoautomotor != null) || (this.idtipoautomotor != null && !this.idtipoautomotor.equals(other.idtipoautomotor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ViewtipoAutomotor[ idtipoautomotor=" + idtipoautomotor + " ]";
    }
    
}
