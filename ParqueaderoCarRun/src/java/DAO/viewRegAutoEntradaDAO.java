package DAO;

import java.util.List;
import entity.Viewregautoentrada;

/**
 *
 * @author eagle
 */
public class viewRegAutoEntradaDAO extends GeneralDAO<viewRegAutoEntradaDAO, String> {

    @Override
    public String getReadQuery() {
        return "SELECT r FROM ViewregAutoEntrada r";
    }

    @Override
    public String getReadByNameQuery() {
        return "SELECT r FROM ViewregAutoEntrada r WHERE UPPER(r.placa) LIKE :name ORDER BY r.placa asc";  
    }

    @Override
    public String[] makeArray(List lis, int tam) {
        String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Viewregautoentrada) lis.get(i)).getPlaca();
        }

        return lista;
    }

    @Override
    public Class getEntityClass() {
        return Viewregautoentrada.class;
    }
    
}
