
package Controller;

import java.util.List;
import entity.ViewrolParqueo;

/**
 *
 * @author eagle
 */
public class viewRolParqueoMgr extends GeneralDAO<viewRolParqueoMgr, String> {

    @Override
    public String getReadQuery() {
         return "SELECT r FROM ViewRol Parqueo r";
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
       return ViewrolParqueo.class;
    }
    
}
