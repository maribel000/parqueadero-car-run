
package Controller;

import java.util.List;
import entity.Viewdanhos;

/**
 *
 * @author eagle
 */
public class viewDanhosMgr extends GeneralDAO<viewDanhosMgr, String> {

    @Override
    public String getReadQuery() {
            return "SELECT d FROM ViewDnhos d";
    }

    @Override
    public String getReadByNameQuery() {
        return "SELECT d FROM ViewDnhos d WHERE UPPER(d.placa) LIKE :name ORDER BY d.placa asc";
    }

    @Override
    public String[] makeArray(List lis, int tam) {
         String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Viewdanhos) lis.get(i)).getPlaca();
        }

        return lista; 
    }

    @Override
    public Class getEntityClass() {
        return Viewdanhos.class;
    }
    
}
