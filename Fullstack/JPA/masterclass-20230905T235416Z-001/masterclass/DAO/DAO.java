/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterclass.DAO;

import javax.persistence.EntityManager;

/**
 *
 * @author W10
 */
public class DAO<T> {

    protected EntityManager entityManager;
    private Class<T> entityClass;

    public DAO(EntityManager entityManager) {
        this.entityManager = entityManager;
        this.entityClass = entityClass;
    }

    public void guardar(T objeto) {
        entityManager.getTransaction().begin();
        entityManager.persist(objeto);
        entityManager.getTransaction().commit();
    }

    public void modificar(T objeto) {
        entityManager.getTransaction().begin();
        entityManager.merge(objeto);
        entityManager.getTransaction().commit();
    }

    public void eliminar(T objeto) {
        entityManager.getTransaction().begin();
        entityManager.remove(objeto);
        entityManager.getTransaction().commit();
    }

}
