
package Controller;

import java.util.ArrayList;
import java.sql.ResultSet;
import entity.VIEWROLPARQUEO;

/**
 *
 * @author eagle
 */
public class viewRolParqueoMgr extends DbManager {

   public static final viewRolParqueoMgr mgr = new viewRolParqueoMgr();

   public viewRolParqueoMgr() {
		super( "VIEWROLPARQUEO" );
		m_titles = new String[]{"idRolParqueo", "nombreRolParqueo", "descripRolParqueo"};
	}

	@Override
	protected VIEWROLPARQUEO getBean() {
		return new VIEWROLPARQUEO();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new VIEWROLPARQUEO( rs ) );
	}

	@Override
	public synchronized VIEWROLPARQUEO getItem( String id ) {
		return (VIEWROLPARQUEO)super.getItem(id);
	}


        public synchronized void eliminar (String id){
            execute("delete from VIEWROLPARQUEO where idRolParqueo = '"+id+"'");
        }


  
    
}
