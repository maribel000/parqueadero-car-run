
package Controller;

import java.util.List;
import entity.Usuariosistema;

/**
 *
 * @author eagle
 */
public class UsuarioSistemaMgr extends GeneralDAO<UsuarioSistemaMgr, String> {

    @Override
    public String getReadQuery() {
            return "SELECT u FROM usuarioSistema u";
    }
  //leemos de usuario sistema por su apellido
    @Override
    public String getReadByNameQuery() {
        return "SELECT u FROM usuarioSistema u WHERE UPPER(u.apellidoUsuario) LIKE :name ORDER BY u.apellidoUsuario asc";
    }

    @Override
    public String[] makeArray(List lis, int tam) {
         String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Usuariosistema) lis.get(i)).getApellidousuario();
        }

        return lista; 
    }

    @Override
    public Class getEntityClass() {
        return Usuariosistema.class;
    }
    
}
