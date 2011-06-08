package Controller;


import entity.VIEWREGAUTOENTRADA;
import java.util.ArrayList;
import java.sql.ResultSet;


/**
 *
 * @author eagle
 */
public class viewRegAutoEntradaMgr extends DbManager {

public static final viewRegAutoEntradaMgr mgr = new viewRegAutoEntradaMgr();

	public viewRegAutoEntradaMgr() {
		super( "VIEWREGAUTOENTRADA" );
		m_titles = new String[]{"horaFechaEntrada", "placa", "ObservacionEntrada"};
	}

	@Override
	protected VIEWREGAUTOENTRADA getBean() {
		return new VIEWREGAUTOENTRADA();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new VIEWREGAUTOENTRADA( rs ) );
	}

	@Override
	public synchronized VIEWREGAUTOENTRADA getItem( String id ) {
		return (VIEWREGAUTOENTRADA)super.getItem(id);
	}


        public synchronized void eliminar (String placa){
            execute("delete from VIEWREGAUTOENTRADA where placa = '"+placa+"'");
        }

        public synchronized VIEWREGAUTOENTRADA getItemForHoraEC(String hora){
            ArrayList<VIEWREGAUTOENTRADA> lst = executeQuery("select * from VIEWREGAUTOENTRADA where horaFechaEntrada = '"+hora+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new VIEWREGAUTOENTRADA();
            }
        }

         public synchronized VIEWREGAUTOENTRADA getItemByPlaca(String placa){
            ArrayList<VIEWREGAUTOENTRADA> lst = executeQuery("select * from VIEWREGAUTOENTRADA where placa = '"+placa+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new VIEWREGAUTOENTRADA();
            }
        }



   
}
