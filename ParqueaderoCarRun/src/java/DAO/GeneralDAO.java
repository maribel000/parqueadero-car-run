package DAO;

/**
 *
 * @author eagle
 * 
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

public abstract class GeneralDAO <E, K> {
   
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ParqueaderoCarRunPU");
    
    
    public boolean create(E entity,StringBuffer error) {
        boolean       ret = false;
        EntityManager em  = emf.createEntityManager();

        em.getTransaction().begin();

        try {
            em.persist(entity);
            em.getTransaction().commit();
            ret = true;
        } catch (Exception e) {
            error.append(e.getMessage());
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();

            return ret;
        }
    }

    public boolean update(E entity,StringBuffer error) {
        EntityManager em = emf.createEntityManager();
        boolean       ret = false;

        em.getTransaction().begin();

        try {
            em.merge(entity);
            em.getTransaction().commit();
            ret = true;
        } catch (Exception e) {
            error.append(e.getLocalizedMessage());
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            return ret;
        }
    }

    public boolean delete(E entity,StringBuffer error) {
        EntityManager em = emf.createEntityManager();
        boolean ret=false;

        em.getTransaction().begin();

        try {
            em.remove(em.merge(entity));
            em.getTransaction().commit();
            ret=true;
        } catch (Exception e) {
            error.append(e.getLocalizedMessage());
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            return ret;
        }
    }

    public List<E> read() {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        try {
            Query q = em.createQuery(getReadQuery());

            return q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return null;
    }

    public List<E> readByName(String name) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        try {
            Query q = em.createQuery(getReadByNameQuery());

            q.setParameter("name", name.toUpperCase());

            return q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            
        } finally {
            em.close();
        }

        return  null;
    }

    public String[] ListObjects() {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        try {
            Query   q   = em.createQuery(getReadQuery());
            List<E> l   = q.getResultList();
            int     tam = l.size();

            return makeArray(l, tam);
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return null;
    }

    public E readById(K id) {
        EntityManager em = emf.createEntityManager();

        try {
            E ret = null;

            try {
                ret = (E) em.find(getEntityClass(), id);
            } catch (Exception e) {
                Logger.getLogger(GeneralDAO.class.getName()).log(Level.SEVERE, null, e);
                em.getTransaction().rollback();
            } finally {
                em.close();

                return ret;
            }
        } catch (Exception e) {
            Logger.getLogger(GeneralDAO.class.getName()).log(Level.SEVERE, null, e);

            return null;
        }
    }

    public abstract String getReadQuery();

    public abstract String getReadByNameQuery();

    public abstract String[] makeArray(List lis, int tam);

    public abstract Class getEntityClass();
  
}
