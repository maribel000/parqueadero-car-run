
package Controller;

import java.util.ArrayList;
import java.sql.ResultSet;
import entity.ROLADMIN;

/**
 *
 * @author eagle
 */
public class RolAdminMgr extends DbManager {

   public static final RolAdminMgr mgr = new RolAdminMgr();

   public RolAdminMgr() {
		super( "ROLADMIN" );
		m_titles = new String[]{"idRolAdmin", "nombreRolAdmin", "duracion","descripRolAdmin"};
	}

	@Override
	protected ROLADMIN getBean() {
		return new ROLADMIN();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new ROLADMIN( rs ) );
	}

	@Override
	public synchronized ROLADMIN getItem( String id ) {
		return (ROLADMIN)super.getItem(id);
	}


        public synchronized void eliminar (String id){
            execute("delete from ROLADMIN where idRolAdmin = '"+id+"'");
        }

       
 
    
}
