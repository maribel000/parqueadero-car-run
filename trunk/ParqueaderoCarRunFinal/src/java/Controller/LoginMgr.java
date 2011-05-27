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
		m_titles = new String[]{"idDanhos", "placa", "fecharegDanhos", "horaRegDanhos","listaDanhos"};
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


        public synchronized void eliminar (String placa){
            execute("delete from DANHOS where placa = '"+placa+"'");
        }

        public synchronized LOGIN getItemForNumeroC(String placa){
            ArrayList<LOGIN> lst = executeQuery("select * from DANHOS where placa = '"+placa+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new LOGIN();
            }
        }

    
    
    
}
