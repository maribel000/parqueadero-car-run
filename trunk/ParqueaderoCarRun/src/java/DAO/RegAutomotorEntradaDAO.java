
package DAO;

import java.util.List;
import entity.Regautomotorentrada;

/**
 *
 * @author eagle
 */
public class RegAutomotorEntradaDAO extends GeneralDAO<RegAutomotorEntradaDAO, String> {

    @Override
    public String getReadQuery() {
        return "SELECT r FROM regAutomotorEntrada r";
    }
    //buscamos el registro de entrada por la placa
    @Override
    public String getReadByNameQuery() {
     return "SELECT r FROM regAutomotorEntrada r WHERE UPPER(r.placa) LIKE :name ORDER BY r.placa asc";  
    }

    @Override
    public String[] makeArray(List lis, int tam) {
        String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Regautomotorentrada) lis.get(i)).getPlaca();
        }

        return lista; 
    }

    @Override
    public Class getEntityClass() {
        return Regautomotorentrada.class;
    }
    
}
