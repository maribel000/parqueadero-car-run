
package conection;

import DAO.LoginDAO;
import entity.Login;
import java.util.List;

/**
 *
 * @author eagle
 */
public class requestLogin {

    private LoginDAO DAO=new LoginDAO();

    public boolean ActualizarLogin(Login l){
        return DAO.update(l, new StringBuffer());
    }

    public Login BuscarLogin(String log, String psw){
        Login l=new Login();
        List<Login> lis=DAO.readByLoginPass(log, psw);
        if(lis!=null && !lis.isEmpty())
          return lis.get(0);
        return null;
    }

    public int getTipoPerfil(Login log){
     //ROL PARQUEO   //1- Coordinador
                   //2- Cajero
                  //3- Parqueador
                 //4- Tesorero
    //ROL ADMIN //1- Presidente
               //2- Vicepresidente
              //3- Tesorero
             //4- Secretario
        if(log.getIdrolparqueo()==1)//Coordinador
            return 1;
        if(log.getIdrolparqueo()==2)//Cajero
            return 2;
        if(log.getIdrolparqueo()==3)//Parqueador
            return 3;
        if(log.getIdrolparqueo()==4)//Tesorero
            return 4;
        return log.getIdrolparqueo();
    }

}
