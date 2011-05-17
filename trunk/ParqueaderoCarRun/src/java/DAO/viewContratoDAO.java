
package DAO;

import java.util.List;
import entity.Viewcontrato;

/**
 *
 * @author eagle
 */
public class viewContratoDAO extends GeneralDAO<viewContratoDAO, String> {

    @Override
    public String getReadQuery() {
         return "SELECT ct FROM ViewContrato ct";
    }

    @Override
    public String getReadByNameQuery() {
        return "SELECT ct FROM ViewContrato cr WHERE UPPER(cr.nombreContrato) LIKE :name ORDER BY cr.nombreContrato asc";
    }

    @Override
    public String[] makeArray(List lis, int tam) {
        String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Viewcontrato) lis.get(i)).getNombrecontrato();
        }

        return lista; 
        
    }

    @Override
    public Class getEntityClass() {
        return Viewcontrato.class;
    }
    
}
