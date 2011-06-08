
package Controller;


import entity.VIEWCLIENTE;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author eagle
 */
public class viewClienteMgr extends DbManager {

   public static final viewClienteMgr mgr = new viewClienteMgr();

	public viewClienteMgr() {
		super( "VIEWCLIENTE" );
		m_titles = new String[]{"cedulaCliente", "numeroContrato", "nombreCliente", "apellidoCliente","telefonoCliente"};
	}

	@Override
	protected VIEWCLIENTE getBean() {
		return new VIEWCLIENTE();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new VIEWCLIENTE( rs ) );
	}

	@Override
	public synchronized VIEWCLIENTE getItem( String id ) {
		return (VIEWCLIENTE)super.getItem(id);
	}


        public synchronized void eliminar (String cedula){
            execute("delete from VIEWCLIENTE where cedulaCliente = '"+cedula+"'");
        }

        public synchronized VIEWCLIENTE getItemForCedula(String cedula){
            ArrayList<VIEWCLIENTE> lst = executeQuery("select * from VIEWCLIENTE where cedulaCliente = '"+cedula+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new VIEWCLIENTE();
            }
        }


    
}
