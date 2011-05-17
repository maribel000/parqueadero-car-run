
package DAO;

import java.util.List;
import entity.Viewcliente;

/**
 *
 * @author eagle
 */
public class viewClienteDAO extends GeneralDAO<viewClienteDAO, String> {

    @Override
    public String getReadQuery() {
           return "SELECT c FROM ViewCliente c";
    }

    @Override
    public String getReadByNameQuery() {
       return "SELECT c FROM ViewCliente c WHERE UPPER(c.cedulaCliente) LIKE :name ORDER BY c.cedulaCliente asc";
    }

    @Override
    public String[] makeArray(List lis, int tam) {
        String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Viewcliente) lis.get(i)).getCedulacliente();
        }

        return lista;    
    }

    @Override
    public Class getEntityClass() {
        return Viewcliente.class;
    }
    
}
