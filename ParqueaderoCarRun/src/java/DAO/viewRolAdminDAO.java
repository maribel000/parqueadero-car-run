
package DAO;

import java.util.List;
import entity.Viewroladmin;
/**
 *
 * @author eagle
 */
public class viewRolAdminDAO extends GeneralDAO<viewRolAdminDAO, String> {

    @Override
    public String getReadQuery() {
       return "SELECT r FROM ViewRolAdmin r";
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
        return Viewroladmin.class;
    }
    
}
