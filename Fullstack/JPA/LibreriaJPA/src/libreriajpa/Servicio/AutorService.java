/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.Servicio;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import libreriajpa.DAO.DAOAutor;
import libreriajpa.Entidades.Autor;

/**
 *
 * @author Facundo
 */
public class AutorService {
 Scanner leer = new Scanner(System.in);
 
 
    private DAOAutor daoAutor;

    public AutorService(EntityManager entityManager) {
        this.daoAutor = new DAOAutor(entityManager);
    }

    public void guardarAutor() {
        Autor autor = new Autor();
        autor.setNombre("Ari");
        autor.setAlta(true);

        daoAutor.guardar(autor);

    }

    public void mostrarAutores() {
        List<Autor> listaAutores = daoAutor.listarAutores();

        for (Autor listaAutore : listaAutores) {
            System.out.println(listaAutore.toString());
        }
    }

    public void eliminarAutor() {

        mostrarAutores();
        
        System.out.println("elija el autor a borrar (ID)");
        Autor autor = daoAutor.obtenerAutorPorId(leer.nextInt());
        daoAutor.borrar(autor);
    }
    
    public List<Autor> listarAutorPorNombre(){
        mostrarAutores();
        System.out.println("introduzca el nombre del autor a buscar");
        String nombre = leer.nextLine();
       
        List <Autor> listaAutores = daoAutor.listarAutoresPorNombre(nombre);
        return listaAutores;
    }

}

