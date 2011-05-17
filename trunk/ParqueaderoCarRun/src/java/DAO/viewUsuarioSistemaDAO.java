package DAO;

import java.util.List;
import entity.Viewusuariosisstema;

/**
 *
 * @author eagle
 */
public class viewUsuarioSistemaDAO extends GeneralDAO<viewUsuarioSistemaDAO, String> {

    @Override
    public String getReadQuery() {
        return "SELECT u FROM ViewUsuarioSisstema u";
    }

    @Override
    public String getReadByNameQuery() {
       return "SELECT u FROM ViewUsuarioSisstema u WHERE UPPER(u.apellidoUsuario) LIKE :name ORDER BY u.apellidoUsuario asc";
    }

    @Override
    public String[] makeArray(List lis, int tam) {
         String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Viewusuariosisstema) lis.get(i)).getApellidousuario();
        }

        return lista; 
    }

    @Override
    public Class getEntityClass() {
        return Viewusuariosisstema.class;
    }
    
}
