package Controller;

import entity.CLIENTE;
import java.util.ArrayList;
import java.sql.ResultSet;

public class ClienteMgr extends DbManager {

    public static final ClienteMgr mgr = new ClienteMgr();

	public ClienteMgr() {
		super( "CLIENTE" );
		m_titles = new String[]{"cedulaCliente", "numeroContrato", "nombreCliente", "apellidoCliente","telefonoCliente"};
	}

	@Override
	protected CLIENTE getBean() {
		return new CLIENTE();
	}

	@Override
	protected void addObject( ArrayList v, ResultSet rs ) {
		v.add( new CLIENTE( rs ) );
	}

	@Override
	public synchronized CLIENTE getItem( String id ) {
		return (CLIENTE)super.getItem(id);
	}


        public synchronized void eliminar (String cedula){
            execute("delete from CLIENTE where cedulaCliente = '"+cedula+"'");
        }

        public synchronized CLIENTE getItemForCedula(String cedula){
            ArrayList<CLIENTE> lst = executeQuery("select * from CLIENTE where cedulaCliente = '"+cedula+"'");
            if (lst.size()>0){
                return lst.get(0);
            }else{
                return new CLIENTE();
            }
        }

   
}
