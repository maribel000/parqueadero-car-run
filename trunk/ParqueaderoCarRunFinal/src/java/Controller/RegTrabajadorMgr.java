
package Controller;

import java.util.List;
import entity.Regtrabajador;

/**
 *
 * @author eagle
 */
public class RegTrabajadorMgr extends GeneralDAO<RegTrabajadorMgr, String> {

    @Override
    public String getReadQuery() {
        return "SELECT t FROM regTrabajador t";
    }
 // leemos el trabajador por su cedula
    @Override
    public String getReadByNameQuery() {
       return "SELECT t FROM regTrabajador t WHERE UPPER(t.cedulaUsuario) LIKE :name ORDER BY t.cedulaUsuario asc";
    }

    @Override
    public String[] makeArray(List lis, int tam) {
      String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Regtrabajador) lis.get(i)).getCedulausuario();
        }

        return lista;    
                
    }

    @Override
    public Class getEntityClass() {
        return Regtrabajador.class;
    }
    
}
