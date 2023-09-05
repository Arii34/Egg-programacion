package libreriajpa.Servicio;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import libreriajpa.DAO.DAOAutor;
import libreriajpa.DAO.DAOEditorial;
import libreriajpa.DAO.DAOLibro;
import libreriajpa.Entidades.Autor;
import libreriajpa.Entidades.Editorial;
import libreriajpa.Entidades.Libro;

/**
 *
 * @author Facundo
 */
public class LibroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private DAOLibro daoLibro;
    private DAOAutor daoAutor;
    private DAOEditorial daoEditorial;

    public LibroService(EntityManager entityManager) {
        this.daoLibro = new DAOLibro(entityManager);
        this.daoAutor = new DAOAutor(entityManager);
        this.daoEditorial = new DAOEditorial(entityManager);

    }

    public void listarLibrosPorISBN() {

        System.out.println("introduzca el ISBN a buscar");
        long isbn = leer.nextLong();

        List<Libro> listaLibros = daoLibro.listarLibrosPorISBN(isbn);
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro.toString());
        }
    }

    public void listarLibrosPorTitulo() {

        System.out.println("introduzca el titulo a buscar");
        String titulo = leer.next();

        List<Libro> listaLibros = daoLibro.listarLibrosPorTitulo(titulo);
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro.toString());
        }

    }

    public void crearLibroYEdiorialHardcodeao() {
        Libro libro1 = new Libro();
        System.out.println("");
        
        libro1.setIsbn(12345);
        
        libro1.setTitulo("titulo");
        
        libro1.setAlta(true);
        
        libro1.setAnio(2023);
        
        Autor autor1 = daoAutor.obtenerAutorPorId(1);
        libro1.setAutor(autor1);

        Editorial editorial1 = new Editorial();
        editorial1.setNombre("panini");
        editorial1.setAlta(true);
        libro1.setEditorial(editorial1);
        daoEditorial.guardar(editorial1);

        libro1.setEjemplares(200);
        
        libro1.setEjemplaresPrestados(50);
        
        libro1.setEjemplaresRestantes(libro1.getEjemplares() - libro1.getEjemplaresPrestados());
        


        System.out.println(libro1);
        daoLibro.guardar(libro1);

    }

    public void buscarLibroXNombreDeAutor() {
        System.out.println("Escriba el nombre del autor.");
        String autor = leer.next();

        List<Libro> listaLibros = daoLibro.listarLibrosPorNombreDeAutor(autor);
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro.toString());
        }
    }

    public void buscarLibroXNombreDeEditorial() {
        System.out.println("Escriba el nombre de la editorial.");
        String editorial = leer.next();

        List<Libro> listaLibros = daoLibro.listarLibrosPorNombreDeEditorial(editorial);
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro.toString());
        }
    }
}
