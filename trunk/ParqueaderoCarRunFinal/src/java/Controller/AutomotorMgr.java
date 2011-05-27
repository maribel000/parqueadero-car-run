package Controller;

import entity.AUTOMOTOR;
import java.util.ArrayList;
import java.sql.ResultSet;


public class AutomotorMgr extends DbManager{


    public static final AutomotorMgr mgr = new AutomotorMgr();

	public AutomotorMgr() {
		super( "AUTOMOTOR" );
		m_titles = new String[]{"placa", "cedulaCliente", "idTipoAutomotor", "observacionAutomotor"};
	}

	@Override
	protected AUTOMOTOR getBean() {
		return new AUTOMOTOR();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new AUTOMOTOR( rs ) );
	}

	@Override
	public synchronized AUTOMOTOR getItem( String id ) {
		return (AUTOMOTOR)super.getItem(id);
	}


        public synchronized void eliminar (String placa){
            execute("delete from AUTOMOTOR where placa = '"+placa+"'");
        }

        public synchronized AUTOMOTOR getItemForPlaca(String placa){
            ArrayList<AUTOMOTOR> lst = executeQuery("select * from AUTOMOTOR where placa = '"+placa+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new AUTOMOTOR();
            }
        }
    
    
}
