
package Controller;


import entity.REGTRABAJADOR;
import java.util.ArrayList;
import java.sql.ResultSet;


/**
 *
 * @author eagle
 */
public class RegTrabajadorMgr extends DbManager {

   public static final RegTrabajadorMgr mgr = new RegTrabajadorMgr();

	public RegTrabajadorMgr() {
		super( "REGTRABAJADOR" );
		m_titles = new String[]{"idRegTrab", "cedulaUsuario", "diaTrabajado","horaIngreso","observaciones"};
	}

	@Override
	protected REGTRABAJADOR getBean() {
		return new REGTRABAJADOR();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new REGTRABAJADOR( rs ) );
	}

	@Override
	public synchronized REGTRABAJADOR getItem( String id ) {
		return (REGTRABAJADOR)super.getItem(id);
	}


        public synchronized void eliminar (String id){
            execute("delete from REGTRABAJADOR where idRegTrab = '"+id+"'");
        }

        public synchronized REGTRABAJADOR getItemByCedula(String cedula){
            ArrayList<REGTRABAJADOR> lst = executeQuery("select * from REGTRABAJADOR where cedulUsuario = '"+cedula+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new REGTRABAJADOR();
            }
        }

         public synchronized REGTRABAJADOR getItemByDia(String dia){
            ArrayList<REGTRABAJADOR> lst = executeQuery("select * from REGTRABAJADOR where diaTrabajado = '"+dia+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new REGTRABAJADOR();
            }
        }
}
