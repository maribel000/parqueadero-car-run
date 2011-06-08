package Controller;

import java.util.ArrayList;
import java.sql.ResultSet;
import entity.VIEWTIPOAUTOMOTOR;


/**
 *
 * @author eagle
 */
public class viewTipoAutomotorMgr extends DbManager   {

    public static final viewTipoAutomotorMgr mgr = new viewTipoAutomotorMgr();

   public viewTipoAutomotorMgr() {
		super( "VIEWTIPOAUTOMOTOR" );
		m_titles = new String[]{"idTipoAutomotor", "tipo"};
	}

	@Override
	protected VIEWTIPOAUTOMOTOR getBean() {
		return new VIEWTIPOAUTOMOTOR();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new VIEWTIPOAUTOMOTOR( rs ) );
	}

	@Override
	public synchronized VIEWTIPOAUTOMOTOR getItem( String id ) {
		return (VIEWTIPOAUTOMOTOR)super.getItem(id);
	}


        public synchronized void eliminar (String tipo){
            execute("delete from VIEWTIPOAUTOMOTOR where tipo = '"+tipo+"'");
        }

    
}
