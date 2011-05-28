
package Controller;

import java.util.ArrayList;
import java.sql.ResultSet;
import entity.ROLPARQUEO;

/**
 *
 * @author eagle
 */
public class RolParqueoMgr extends DbManager {

  public static final RolParqueoMgr mgr = new RolParqueoMgr();

   public RolParqueoMgr() {
		super( "ROLPARQUEO" );
		m_titles = new String[]{"idRolParqueo", "nombreRolParqueo", "descripRolParqueo"};
	}

	@Override
	protected ROLPARQUEO getBean() {
		return new ROLPARQUEO();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new ROLPARQUEO( rs ) );
	}

	@Override
	public synchronized ROLPARQUEO getItem( String id ) {
		return (ROLPARQUEO)super.getItem(id);
	}


        public synchronized void eliminar (String id){
            execute("delete from ROLPARQUEO where idRolParqueo = '"+id+"'");
        }



    
}
