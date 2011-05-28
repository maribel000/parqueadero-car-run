
package Controller;

import java.util.ArrayList;
import java.sql.ResultSet;
import entity.VIEWCONTRATO;

/**
 *
 * @author eagle
 */
public class viewContratoMgr extends DbManager {

     public static final viewContratoMgr mgr = new viewContratoMgr();

	public viewContratoMgr() {
		super( "VIEWCONTRATO" );
		m_titles = new String[]{"numeroCotrato", "nombreContrato", "fechaInicio", "fechaFin","descripContrato"};
	}

	@Override
	protected VIEWCONTRATO getBean() {
		return new VIEWCONTRATO();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new VIEWCONTRATO( rs ) );
	}

	@Override
	public synchronized VIEWCONTRATO getItem( String id ) {
		return (VIEWCONTRATO)super.getItem(id);
	}


        public synchronized void eliminar (String numeroContrato){
            execute("delete from VIEWCONTRATO where numeroCotrato = '"+numeroContrato+"'");
        }

        public synchronized VIEWCONTRATO getItemForNumeroC(String numeroContrato){
            ArrayList<VIEWCONTRATO> lst = executeQuery("select * from VIEWCONTRATO where numeroCotrato = '"+numeroContrato+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new VIEWCONTRATO();
            }
        }




    
}
