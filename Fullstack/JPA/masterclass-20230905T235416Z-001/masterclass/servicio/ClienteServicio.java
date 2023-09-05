/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterclass.servicio;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import masterclass.DAO.ClienteDAO;
import masterclass.entidad.Cliente;

/**
 *
 * @author W10
 */
public class ClienteServicio {
    
    private ClienteDAO clienteDAO;

    public ClienteServicio(EntityManager entityManager) {
        this.clienteDAO = new ClienteDAO(entityManager);
    }
    
    public void guardar(Cliente cliente) {
        clienteDAO.guardar(cliente);
    }

    public void modificar(Cliente cliente) {
        clienteDAO.modificar(cliente);
    }

    public void eliminar(Cliente cliente) {
        clienteDAO.eliminar(cliente);
    }
    
     public List<Cliente> obtenerClientesSQLNativo() {
        return clienteDAO.obtenerClientesSQLNativo();
    }
    
     public List<Cliente> obtenerClientesJPQL() {
        return clienteDAO.obtenerClientesJPQL();
    }
    
     public Cliente obtenerPorId(Long id){
     return clienteDAO.obtenerPorId(id);
     }
    
    
}
