
package Controller;

import java.util.List;
import entity.Roladmin;

/**
 *
 * @author eagle
 */
public class RolAdminMgr extends GeneralDAO<RolAdminMgr, String> {

    @Override
    public String getReadQuery() {
         return "SELECT r FROM rolAdmin r";
        
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
        return Roladmin.class;
    }
    
}
