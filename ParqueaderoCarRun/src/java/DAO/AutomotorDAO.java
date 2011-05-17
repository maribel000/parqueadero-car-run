package DAO;

import java.util.List;
import entity.Automotor;


/**
 *
 * @author eagle
 */
public class AutomotorDAO extends GeneralDAO<Automotor, String> {

    @Override
    public String getReadQuery() {
         return "SELECT a FROM Automotor a";
    }
    //Leemos por placa de automotor   
    @Override
    public String getReadByNameQuery() {
        return "SELECT a FROM automotor a WHERE UPPER(a.placa) LIKE :name ORDER BY a.placa asc";
    }

    @Override
    public String[] makeArray(List lis, int tam) {
        
       String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Automotor) lis.get(i)).getPlaca();
        }

        return lista; 
               
        
    }

    @Override
    public Class getEntityClass() {
        return Automotor.class;
    }
    
}
