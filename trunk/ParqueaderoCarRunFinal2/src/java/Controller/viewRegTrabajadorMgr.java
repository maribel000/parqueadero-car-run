
package Controller;

import java.util.ArrayList;
import java.sql.ResultSet;
import entity.VIEWREGTRABAJADOR;

/**
 *
 * @author eagle
 */
public class viewRegTrabajadorMgr extends DbManager {

   public static final viewRegTrabajadorMgr mgr = new viewRegTrabajadorMgr();

	public viewRegTrabajadorMgr() {
		super( "VIEWREGTRABAJADOR" );
		m_titles = new String[]{"idRegTrab", "cedulaUsuario", "diaTrabajado","horaIngreso","observaciones"};
	}

	@Override
	protected VIEWREGTRABAJADOR getBean() {
		return new VIEWREGTRABAJADOR();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new VIEWREGTRABAJADOR( rs ) );
	}

	@Override
	public synchronized VIEWREGTRABAJADOR getItem( String id ) {
		return (VIEWREGTRABAJADOR)super.getItem(id);
	}


        public synchronized void eliminar (String id){
            execute("delete from VIEWREGTRABAJADOR where idRegTrab = '"+id+"'");
        }

        public synchronized VIEWREGTRABAJADOR getItemByCedula(String cedula){
            ArrayList<VIEWREGTRABAJADOR> lst = executeQuery("select * from VIEWREGTRABAJADOR where cedulUsuario = '"+cedula+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new VIEWREGTRABAJADOR();
            }
        }

         public synchronized VIEWREGTRABAJADOR getItemByDia(String dia){
            ArrayList<VIEWREGTRABAJADOR> lst = executeQuery("select * from VIEWREGTRABAJADOR where diaTrabajado = '"+dia+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new VIEWREGTRABAJADOR();
            }
        }
}
