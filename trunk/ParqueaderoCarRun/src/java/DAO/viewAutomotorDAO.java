
package DAO;

import java.util.List;
import entity.Viewautomotor;

/**
 *
 * @author eagle
 */
public class viewAutomotorDAO extends GeneralDAO<viewAutomotorDAO, String> {

    @Override
    public String getReadQuery() {
         return "SELECT v FROM ViewAutomotor v";
    }

    @Override
    public String getReadByNameQuery() {
        
      return "SELECT a FROM ViewAutomotor a WHERE UPPER(a.placa) LIKE :name ORDER BY a.placa asc";  
        
    }

    @Override
    public String[] makeArray(List lis, int tam) {
        String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Viewautomotor) lis.get(i)).getPlaca();
        }

        return lista; 
    }

    @Override
    public Class getEntityClass() {
        return Viewautomotor.class;
    }
    
}
