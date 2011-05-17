package DAO;

/**
 *
 * @author eagle
 */
import java.util.List;
import entity.Cliente;

public class ClienteDAO extends GeneralDAO<ClienteDAO, String> {

    @Override
    public String getReadQuery() {
        return "SELECT c FROM cliente c";
    }
    //leeremos de la tabla cliente por la cedula del cliente
    @Override
    public String getReadByNameQuery() {
        return "SELECT c FROM cliente c WHERE UPPER(c.cedulaCliente) LIKE :name ORDER BY c.cedulaCliente asc";
    }

    @Override
    public String[] makeArray(List lis, int tam) {
        
     String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Cliente) lis.get(i)).getCedulacliente();
        }

        return lista;    
          
    }

    @Override
    public Class getEntityClass() {
     return Cliente.class;
    }
    
}
