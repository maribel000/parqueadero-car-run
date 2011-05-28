
package Controller;


import entity.VIEWDANHOS;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author eagle
 */
public class viewDanhosMgr extends DbManager {

    public static final viewDanhosMgr mgr = new viewDanhosMgr();

	public viewDanhosMgr() {
		super( "VIEWDANHOS" );
		m_titles = new String[]{"idDanhos", "placa", "fecharegDanhos", "horaRegDanhos","listaDanhos"};
	}

	@Override
	protected VIEWDANHOS getBean() {
		return new VIEWDANHOS();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new VIEWDANHOS( rs ) );
	}

	@Override
	public synchronized VIEWDANHOS getItem( String id ) {
		return (VIEWDANHOS)super.getItem(id);
	}


        public synchronized void eliminar (String placa){
            execute("delete from VIEWDANHOS where placa = '"+placa+"'");
        }

        public synchronized VIEWDANHOS getItemForNumeroC(String placa){
            ArrayList<VIEWDANHOS> lst = executeQuery("select * from VIEWDANHOS where placa = '"+placa+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new VIEWDANHOS();
            }
        }


    
}
