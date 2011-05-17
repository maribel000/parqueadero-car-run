package DAO;

import java.util.List;
import entity.Contrato;
/**
 *
 * @author eagle
 */
public class ContratoDAO  extends GeneralDAO<ContratoDAO, String> {

    @Override
    public String getReadQuery() {
           return "SELECT ct FROM contrato ct";
    }
  //leeremos de tabla contrato por el nombre del contrato
    @Override
    public String getReadByNameQuery() {
        
        return "SELECT ct FROM contrato cr WHERE UPPER(cr.nombreContrato) LIKE :name ORDER BY cr.nombreContrato asc";
             
    }

    @Override
    public String[] makeArray(List lis, int tam) {
        
        String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Contrato) lis.get(i)).getNombrecontrato();
        }

        return lista; 
        
        
        
    }

    @Override
    public Class getEntityClass() {
        return Contrato.class;
    }
    
}
