
package Controller;


import entity.VIEWAUTOMOTOR;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author eagle
 */
public class viewAutomotorMgr extends DbManager {

    public static final viewAutomotorMgr mgr = new viewAutomotorMgr();

	public viewAutomotorMgr() {
		super( "VIEWAUTOMOTOR" );
		m_titles = new String[]{"placa", "cedulaCliente", "idTipoAutomotor", "observacionAutomotor"};
	}

	@Override
	protected VIEWAUTOMOTOR getBean() {
		return new VIEWAUTOMOTOR();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new VIEWAUTOMOTOR( rs ) );
	}

	@Override
	public synchronized VIEWAUTOMOTOR getItem( String id ) {
		return (VIEWAUTOMOTOR)super.getItem(id);
	}


        public synchronized void eliminar (String placa){
            execute("delete from VIEWAUTOMOTOR where placa = '"+placa+"'");
        }

        public synchronized VIEWAUTOMOTOR getItemForPlaca(String placa){
            ArrayList<VIEWAUTOMOTOR> lst = executeQuery("select * from VIEWAUTOMOTOR where placa = '"+placa+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new VIEWAUTOMOTOR();
            }
        }

    
}
