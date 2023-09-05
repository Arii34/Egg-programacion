/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterclass.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import masterclass.entidad.Cliente;

/**
 *
 * @author W10
 */
public class ClienteDAO extends DAO<Cliente> {

    public ClienteDAO(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Cliente> obtenerClientesSQLNativo() {
        String sql = "SELECT * FROM clientes";
        Query query = entityManager.createNativeQuery(sql, Cliente.class);
        return query.getResultList();
    }
    
     public List<Cliente> obtenerClientesJPQL() {
        String jpql = "SELECT c FROM Cliente c";
         TypedQuery query = entityManager.createQuery(jpql, Cliente.class);
        return query.getResultList();
    }
    
     public Cliente obtenerPorId(Long id){
     return entityManager.find(Cliente.class, id);
     }

}
