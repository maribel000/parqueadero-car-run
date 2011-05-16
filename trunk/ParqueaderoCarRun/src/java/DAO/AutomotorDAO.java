package DAO;

import java.util.List;
import entity.Automotor;


/**
 *
 * @author eagle
 */
public class AutomotorDAO extends GeneralDAO<Automotor, String> {

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
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
