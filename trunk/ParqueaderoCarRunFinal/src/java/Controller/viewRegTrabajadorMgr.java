
package Controller;

import java.util.List;
import entity.Viewregtrabajador;

/**
 *
 * @author eagle
 */
public class viewRegTrabajadorMgr extends GeneralDAO<viewRegTrabajadorMgr, String> {

    @Override
    public String getReadQuery() {
              return "SELECT t FROM ViewRegTrabajador t";
    }

    @Override
    public String getReadByNameQuery() {
        return "SELECT t FROM ViewRegTrabajador t WHERE UPPER(t.cedulaUsuario) LIKE :name ORDER BY t.cedulaUsuario asc";
    }

    @Override
    public String[] makeArray(List lis, int tam) {
        String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Viewregtrabajador) lis.get(i)).getCedulausuario();
        }

        return lista;    
    }

    @Override
    public Class getEntityClass() {
        return Viewregtrabajador.class;
    }
    
}
