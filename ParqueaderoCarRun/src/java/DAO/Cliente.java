package DAO;

/**
 *
 * @author eagle
 */
import java.util.List;

public class Cliente extends GeneralDAO<Cliente, String> {

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
