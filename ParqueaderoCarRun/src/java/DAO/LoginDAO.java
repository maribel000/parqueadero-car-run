package DAO;

/**
 *
 * @author eagle
 */

import entity.Login;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class LoginDAO extends GeneralDAO<Login, Integer> {
    
  @Override
    public String getReadQuery() {
        return "SELECT r FROM Login r";
    }

    @Override
    public String getReadByNameQuery() {
        return "SELECT r FROM Login r WHERE UPPER(r.idLogin) LIKE :name AND UPPER(r.password) LIKE :pass";
    }

      public List<Login> readByLoginPass(String name,String pass ) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            Query q = em.createQuery(getReadByNameQuery());

            q.setParameter("name", name.toUpperCase());
            q.setParameter("pass", pass.toUpperCase());

            return q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return null;
    }

    @Override
    public String[] makeArray(List lis, int tam) {
        
       String[] listaLogin = new String[tam];
        int      i;

        for (i = 0; i < tam; i++) {
            listaLogin[i] = ((Login) lis.get(i)).getIdlogin();
        }

        return listaLogin; 
        
       
        
    }

    @Override
    public Class getEntityClass() {
        return Login.class;
    }
    
    
    
    
}
