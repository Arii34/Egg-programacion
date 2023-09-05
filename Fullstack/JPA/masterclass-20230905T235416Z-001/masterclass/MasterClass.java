/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterclass;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import masterclass.entidad.Cliente;
import masterclass.servicio.ClienteServicio;

/**
 *
 * @author W10
 */
public class MasterClass {

    public static void main(String[] args) {

        EntityManager entityManager = Persistence.createEntityManagerFactory("MasterClassPU").createEntityManager();

        ClienteServicio clienteServicio = new ClienteServicio(entityManager);

        Cliente cliente = new Cliente();
        cliente.setNombre("Rodrigo");
        cliente.setCorreoElectronico("rodrigo_caro_cba@hotmail.com");
        cliente.setActiva(true);

        clienteServicio.guardar(cliente);

        System.out.println("Listado con SQL");
        List<Cliente> clienteSQL = clienteServicio.obtenerClientesSQLNativo();
        for (Cliente cliente1 : clienteSQL) {
            System.out.println(cliente1.toString());
        }

            System.out.println("Listado con JPQL");
            List<Cliente> clienteJPQL = clienteServicio.obtenerClientesJPQL();
            for (Cliente cliente2 : clienteJPQL) {
                System.out.println(cliente2.toString());
            }

        }

    }

