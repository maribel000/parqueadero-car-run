package Controller;


import entity.CONTRATO;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author eagle
 */
public class ContratoMgr extends DbManager {

    public static final ContratoMgr mgr = new ContratoMgr();

	public ContratoMgr() {
		super( "CONTRATO" );
		m_titles = new String[]{"numeroCotrato", "nombreContrato", "fechaInicio", "fechaFin","descripContrato"};
	}

	@Override
	protected CONTRATO getBean() {
		return new CONTRATO();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new CONTRATO( rs ) );
	}

	@Override
	public synchronized CONTRATO getItem( String id ) {
		return (CONTRATO)super.getItem(id);
	}


       public synchronized ArrayList<CONTRATO> getListContratos(){
        ArrayList<CONTRATO> lst = executeQuery("select TOP(50) * from CONTRATO");
        return lst;
    }

     
	
        public synchronized void eliminar (String numeroContrato){
            execute("delete from CONTRATO where numeroCotrato = '"+numeroContrato+"'");
        }

        public synchronized CONTRATO getItemForNumeroC(String numeroContrato){
            ArrayList<CONTRATO> lst = executeQuery("select * from CONTRATO where numeroCotrato = '"+numeroContrato+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new CONTRATO();
            }
        }

      
    
}
