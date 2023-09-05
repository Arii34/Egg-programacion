
package libreriajpa.DAO;

import javax.persistence.EntityManager;


public class DAO<T> {
    
    protected EntityManager entityManager;
    
    
    
    public DAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    
    public void guardar(T objeto){
        entityManager.getTransaction().begin();
        
        entityManager.persist(objeto);
        
        entityManager.getTransaction().commit();
    }
    public void modificar(T objeto){
        entityManager.getTransaction().begin();
        
        entityManager.merge(objeto);
        
        entityManager.getTransaction().commit();
    }
    
    public void borrar(T objeto){
        
        entityManager.getTransaction().begin();
        
        entityManager.remove(objeto);
        
        entityManager.getTransaction().commit();
    }
}
