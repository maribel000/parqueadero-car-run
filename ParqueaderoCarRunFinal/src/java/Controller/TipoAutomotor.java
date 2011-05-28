

package Controller;
import java.util.ArrayList;
import java.sql.ResultSet;
import entity.TIPOAUTOMOTOR;

 
public class TipoAutomotor extends DbManager {

   public static final TipoAutomotor mgr = new TipoAutomotor();

   public TipoAutomotor() {
		super( "TIPOAUTOMOTOR" );
		m_titles = new String[]{"idTipoAutomotor", "tipo"};
	}

	@Override
	protected TIPOAUTOMOTOR getBean() {
		return new TIPOAUTOMOTOR();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new TIPOAUTOMOTOR( rs ) );
	}

	@Override
	public synchronized TIPOAUTOMOTOR getItem( String id ) {
		return (TIPOAUTOMOTOR)super.getItem(id);
	}


        public synchronized void eliminar (String tipo){
            execute("delete from TIPOAUTOMOTOR where tipo = '"+tipo+"'");
        }



}
