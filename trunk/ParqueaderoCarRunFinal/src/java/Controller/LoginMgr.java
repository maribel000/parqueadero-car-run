package Controller;

/**
 *
 * @author eagle
 */

import entity.LOGIN;
import java.util.ArrayList;
import java.sql.ResultSet;




public class LoginMgr extends DbManager {
    
public static final LoginMgr mgr = new LoginMgr();

	public LoginMgr() {
		super( "LOGIN" );
		m_titles = new String[]{"idLogin", "cedulaUsuario", "idRolParqueo", "idRolAdmin","password"};
	}

	@Override
	protected LOGIN getBean() {
		return new LOGIN();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new LOGIN( rs ) );
	}

	@Override
	public synchronized LOGIN getItem( String id ) {
		return (LOGIN)super.getItem(id);
	}


        public synchronized LOGIN doLogin(String login, String passwd) {
        ArrayList<LOGIN> lst = executeQuery("select * from LOGIN where idLogin = '" + login + "'and'" + passwd + "'= DECRYPTBYPASSPHRASE('@¿!!35%__./=|vbtk,)', password)");
        if (lst.size() > 0) {
            return lst.get(0);
        } else {
            return null;
        }
    }
        

    
    
    
}
