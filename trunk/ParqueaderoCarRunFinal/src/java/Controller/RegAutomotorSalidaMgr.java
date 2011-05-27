package Controller;

import java.util.List;
import entity.Regautomotorsalida;
/**
 *
 * @author eagle
 */
public class RegAutomotorSalidaMgr extends GeneralDAO<RegAutomotorSalidaMgr, String> {

    @Override
    public String getReadQuery() {
        
      return "SELECT r FROM regAutomotorSalida r";   
          
    }
    //leemos por hora de salida
    @Override
    public String getReadByNameQuery() {
       return "SELECT r FROM regAutomotorSalida r WHERE UPPER(r.horaFechaSalida) LIKE :name ORDER BY r.horaFechaSalida asc";
    }
    //Ojo si no sirve así crear un nuevo metodo abstracto
    @Override
    public String[] makeArray(List lis, int tam) {
         String[] lista = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            lista[i] = ((Regautomotorsalida) lis.get(i)).getHorafechasalida().toString();
        }

        return lista;
    }

    @Override
    public Class getEntityClass() {
     return Regautomotorsalida.class;
    }
    
}
