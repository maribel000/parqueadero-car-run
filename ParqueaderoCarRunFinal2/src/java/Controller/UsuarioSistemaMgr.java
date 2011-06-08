
package Controller;

import java.util.ArrayList;
import java.sql.ResultSet;
import entity.USUARIOSISTEMA;

/**
 *
 * @author eagle
 */
public class UsuarioSistemaMgr extends DbManager {

    public static final UsuarioSistemaMgr mgr = new UsuarioSistemaMgr();

	public UsuarioSistemaMgr() {
		super( "REGAUTOMOTORENTRADA" );
		m_titles = new String[]{"cedulaUsuario", "idRolParqueo", "idRolAdmin","nombreUsuario","apellidoUsuario","e-mail", "telefonoUsuario"};
	}

	@Override
	protected USUARIOSISTEMA getBean() {
		return new USUARIOSISTEMA();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new USUARIOSISTEMA( rs ) );
	}

	@Override
	public synchronized USUARIOSISTEMA getItem( String id ) {
		return (USUARIOSISTEMA)super.getItem(id);
	}


        public synchronized void eliminar (String cedula){
            execute("delete from USUARIOSISTEMA where cedulaUsuario = '"+cedula+"'");
        }

        public synchronized USUARIOSISTEMA getItemByApellido(String apellido){
            ArrayList<USUARIOSISTEMA> lst = executeQuery("select * from USUARIOSISTEMA where apellidoUsuario = '"+apellido+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new USUARIOSISTEMA();
            }
        }

         public synchronized USUARIOSISTEMA getItemByRol(String rol){
            ArrayList<USUARIOSISTEMA> lst = executeQuery("select * from USUARIOSISTEMA where idRolParqueo = '"+rol+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new USUARIOSISTEMA();
            }
        }

    
}
