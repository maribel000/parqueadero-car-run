
package Controller;

import java.util.ArrayList;
import java.sql.ResultSet;
import entity.VIEWREGAUTOSALIDA;

/**
 *
 * @author eagle
 */
public class viewRegAutoSalidaMgr extends DbManager {

    public static final viewRegAutoSalidaMgr mgr = new viewRegAutoSalidaMgr();

	public viewRegAutoSalidaMgr() {
		super( "VIEWREGAUTOSALIDA" );
		m_titles = new String[]{"horaFechaSalida", "horaFechaEntrada", "precio"};
	}

	@Override
	protected VIEWREGAUTOSALIDA getBean() {
		return new VIEWREGAUTOSALIDA();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new VIEWREGAUTOSALIDA( rs ) );
	}

	@Override
	public synchronized VIEWREGAUTOSALIDA getItem( String id ) {
		return (VIEWREGAUTOSALIDA)super.getItem(id);
	}


        public synchronized void eliminar (String placa){
            execute("delete from VIEWREGAUTOSALIDA where placa = '"+placa+"'");
        }

        public synchronized VIEWREGAUTOSALIDA getItemForPlaca(String placa){
            ArrayList<VIEWREGAUTOSALIDA> lst = executeQuery("select * from VIEWREGAUTOSALIDA where placa = '"+placa+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new VIEWREGAUTOSALIDA();
            }
        }



}
