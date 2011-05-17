
package DAO;

import java.util.List;
import entity.Viewregautosalida;

/**
 *
 * @author eagle
 */
public class viewRegAutoSalidaDAO extends GeneralDAO<viewRegAutoSalidaDAO, String> {

    @Override
    public String getReadQuery() {
           return "SELECT r FROM ViewregAutoEntrada r";  
    }

    @Override
    public String getReadByNameQuery() {
        return "SELECT r FROM ViewregAutoEntrada r WHERE UPPER(r.horaFechaSalida) LIKE :name ORDER BY r.horaFechaSalida asc";
    }

    @Override
    public String[] makeArray(List lis, int tam) {
     String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Viewregautosalida) lis.get(i)).getHorafechasalida().toString();
        }

        return lista;
    }

    @Override
    public Class getEntityClass() {
        return Viewregautosalida.class;
    }
    
}
