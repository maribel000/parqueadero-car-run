package DAO;

import java.util.List;
import entity.Danhos;

/**
 *
 * @author eagle
 */
public class DanhosDAO extends GeneralDAO<DanhosDAO, String> {

    @Override
    public String getReadQuery() {
         return "SELECT d FROM danhos d";
    }
    //leemos los daños por la placa del auto
    @Override
    public String getReadByNameQuery() {
         return "SELECT d FROM danhos d WHERE UPPER(d.placa) LIKE :name ORDER BY d.placa asc";
    }

    @Override
    public String[] makeArray(List lis, int tam) {
         String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Danhos) lis.get(i)).getPlaca();
        }

        return lista; 
             
    }

    @Override
    public Class getEntityClass() {
        return Danhos.class;
    }
    
}
