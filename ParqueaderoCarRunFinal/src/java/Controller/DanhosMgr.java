package Controller;

import entity.DANHOS;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author eagle
 */
public class DanhosMgr extends DbManager {

 public static final DanhosMgr mgr = new DanhosMgr();

	public DanhosMgr() {
		super( "DANHOS" );
		m_titles = new String[]{"idDanhos", "placa", "fecharegDanhos", "horaRegDanhos","listaDanhos"};
	}

	@Override
	protected DANHOS getBean() {
		return new DANHOS();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new DANHOS( rs ) );
	}

	@Override
	public synchronized DANHOS getItem( String id ) {
		return (DANHOS)super.getItem(id);
	}


        public synchronized void eliminar (String placa){
            execute("delete from DANHOS where placa = '"+placa+"'");
        }

        public synchronized DANHOS getItemForNumeroC(String placa){
            ArrayList<DANHOS> lst = executeQuery("select * from DANHOS where placa = '"+placa+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new DANHOS();
            }
        }
  
  
    
}
