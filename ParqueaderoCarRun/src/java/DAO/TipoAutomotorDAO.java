
package DAO;

import java.util.List;
import entity.Tipoautomotor;

/**
 *
 * @author eagle
 */
public class TipoAutomotorDAO extends GeneralDAO<TipoAutomotorDAO, String> {

    @Override
    public String getReadQuery() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getReadByNameQuery() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String[] makeArray(List lis, int tam) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Class getEntityClass() {
        return Tipoautomotor.class;
        
    }
    
}
