package Controller;

import java.util.ArrayList;
import java.sql.ResultSet;
import entity.VIEWUSUARIOSISSTEMA;

/**
 *
 * @author eagle
 */
public class viewUsuarioSistemaMgr extends DbManager {

    public static final viewUsuarioSistemaMgr mgr = new viewUsuarioSistemaMgr();

	public viewUsuarioSistemaMgr() {
		super( "VIEWUSUARIOSISSTEMA" );
		m_titles = new String[]{"cedulaUsuario", "idRolParqueo", "idRolAdmin","nombreUsuario","apellidoUsuario","e-mail", "telefonoUsuario"};
	}

	@Override
	protected VIEWUSUARIOSISSTEMA getBean() {
		return new VIEWUSUARIOSISSTEMA();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new VIEWUSUARIOSISSTEMA( rs ) );
	}

	@Override
	public synchronized VIEWUSUARIOSISSTEMA getItem( String id ) {
		return (VIEWUSUARIOSISSTEMA)super.getItem(id);
	}

        public synchronized ArrayList<VIEWUSUARIOSISSTEMA> getListDaP(String rol){
        ArrayList<VIEWUSUARIOSISSTEMA> lst = executeQuery("select * from VIEWUSUARIOSISSTEMA" + " where IDROLPARQUEO='" + rol + "' ");
        return lst;
       }




        public synchronized ArrayList<VIEWUSUARIOSISSTEMA> getListUsuarios(){
        ArrayList<VIEWUSUARIOSISSTEMA> lst = executeQuery("select TOP(50) * from VIEWUSUARIOSISSTEMA");
        return lst;
       }
        public synchronized void eliminar (String cedula){
            execute("delete from VIEWUSUARIOSISSTEMA where cedulaUsuario = '"+cedula+"'");
        }

        public synchronized VIEWUSUARIOSISSTEMA getItemByApellido(String apellido){
            ArrayList<VIEWUSUARIOSISSTEMA> lst = executeQuery("select * from VIEWUSUARIOSISSTEMA where apellidoUsuario = '"+apellido+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new VIEWUSUARIOSISSTEMA();
            }
        }

         public synchronized VIEWUSUARIOSISSTEMA getItemByRol(String rol){
            ArrayList<VIEWUSUARIOSISSTEMA> lst = executeQuery("select * from VIEWUSUARIOSISSTEMA where idRolParqueo = '"+rol+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new VIEWUSUARIOSISSTEMA();
            }
        }
}
