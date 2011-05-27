
package Controller;

import java.util.List;
import entity.Rolparqueo;

/**
 *
 * @author eagle
 */
public class RolParqueoMgr extends GeneralDAO<RolParqueoMgr, String> {

    @Override
    public String getReadQuery() {
        return "SELECT r FROM rolParqueo r";
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
        return Rolparqueo.class;
    }
    
}
