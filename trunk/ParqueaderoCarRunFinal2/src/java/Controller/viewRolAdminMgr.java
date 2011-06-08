
package Controller;


import java.util.ArrayList;
import java.sql.ResultSet;
import entity.VIEWROLADMIN;
/**
 *
 * @author eagle
 */
public class viewRolAdminMgr extends DbManager {

    public static final viewRolAdminMgr mgr = new viewRolAdminMgr();

   public viewRolAdminMgr() {
		super( "VIEWROLADMIN" );
		m_titles = new String[]{"idRolAdmin", "nombreRolAdmin", "duracion","descripRolAdmin"};
	}

	@Override
	protected VIEWROLADMIN getBean() {
		return new VIEWROLADMIN();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new VIEWROLADMIN( rs ) );
	}

	@Override
	public synchronized VIEWROLADMIN getItem( String id ) {
		return (VIEWROLADMIN)super.getItem(id);
	}


        public synchronized void eliminar (String id){
            execute("delete from VIEWROLADMIN where idRolAdmin = '"+id+"'");
        }



    
}
