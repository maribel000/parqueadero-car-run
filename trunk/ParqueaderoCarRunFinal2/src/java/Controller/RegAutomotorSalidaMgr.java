package Controller;

import entity.REGAUTOMOTORSALIDA;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author eagle
 */
public class RegAutomotorSalidaMgr extends DbManager {

   public static final RegAutomotorSalidaMgr mgr = new RegAutomotorSalidaMgr();

	public RegAutomotorSalidaMgr() {
		super( "REGAUTOMOTORSALIDA" );
		m_titles = new String[]{"horaFechaSalida", "horaFechaEntrada", "precio"};
	}

	@Override
	protected REGAUTOMOTORSALIDA getBean() {
		return new REGAUTOMOTORSALIDA();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new REGAUTOMOTORSALIDA( rs ) );
	}

	@Override
	public synchronized REGAUTOMOTORSALIDA getItem( String id ) {
		return (REGAUTOMOTORSALIDA)super.getItem(id);
	}


        public synchronized void eliminar (String placa){
            execute("delete from REGAUTOMOTORSALIDA where placa = '"+placa+"'");
        }

        public synchronized REGAUTOMOTORSALIDA getItemForPlaca(String placa){
            ArrayList<REGAUTOMOTORSALIDA> lst = executeQuery("select * from REGAUTOMOTORSALIDA where placa = '"+placa+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new REGAUTOMOTORSALIDA();
            }
        }





    
}
