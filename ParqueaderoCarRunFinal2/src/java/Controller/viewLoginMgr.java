
package Controller;


import entity.VIEWLOGIN;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author eagle
 */
public class viewLoginMgr extends DbManager {

   public static final viewLoginMgr mgr = new viewLoginMgr();

	public viewLoginMgr() {
		super( "VIEWLOGIN" );
		m_titles = new String[]{"idLogin", "cedulaUsuario", "idRolParqueo", "idRolAdmin","password"};
	}

	@Override
	protected VIEWLOGIN getBean() {
		return new VIEWLOGIN();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new VIEWLOGIN( rs ) );
	}

	@Override
	public synchronized VIEWLOGIN getItem( String id ) {
		return (VIEWLOGIN)super.getItem(id);
	}


        public synchronized VIEWLOGIN doLogin(String login, String passwd) {
        ArrayList<VIEWLOGIN> lst = executeQuery("select * from VIEWLOGIN where idLogin = '" + login + "' and password = md5('" + passwd + "')");
        if (lst.size() > 0) {
            return lst.get(0);
        } else {
            return null;
        }
    }

}
