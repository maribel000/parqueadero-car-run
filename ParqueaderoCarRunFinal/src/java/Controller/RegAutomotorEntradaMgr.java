
package Controller;


import entity.REGAUTOMOTORENTRADA;
import java.util.ArrayList;
import java.sql.ResultSet;


/**
 *
 * @author eagle
 */
public class RegAutomotorEntradaMgr extends DbManager {

   public static final RegAutomotorEntradaMgr mgr = new RegAutomotorEntradaMgr();

	public RegAutomotorEntradaMgr() {
		super( "REGAUTOMOTORENTRADA" );
		m_titles = new String[]{"horaFechaEntrada", "placa", "ObservacionEntrada"};
	}

	@Override
	protected REGAUTOMOTORENTRADA getBean() {
		return new REGAUTOMOTORENTRADA();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new REGAUTOMOTORENTRADA( rs ) );
	}

	@Override
	public synchronized REGAUTOMOTORENTRADA getItem( String id ) {
		return (REGAUTOMOTORENTRADA)super.getItem(id);
	}


        public synchronized void eliminar (String placa){
            execute("delete from REGAUTOMOTORENTRADA where placa = '"+placa+"'");
        }

        public synchronized REGAUTOMOTORENTRADA getItemForHoraEC(String hora){
            ArrayList<REGAUTOMOTORENTRADA> lst = executeQuery("select * from REGAUTOMOTORENTRADA where horaFechaEntrada = '"+hora+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new REGAUTOMOTORENTRADA();
            }
        }

         public synchronized REGAUTOMOTORENTRADA getItemByPlaca(String placa){
            ArrayList<REGAUTOMOTORENTRADA> lst = executeQuery("select * from REGAUTOMOTORENTRADA where placa = '"+placa+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new REGAUTOMOTORENTRADA();
            }
        }




}
