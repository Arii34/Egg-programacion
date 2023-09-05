package libreriajpa.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import libreriajpa.Entidades.Autor;
import libreriajpa.Entidades.Editorial;
import libreriajpa.Entidades.Libro;

public class DAOLibro extends DAO<Libro> {

    public DAOLibro(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Libro> listarLibros() {
        String sql = "SELECT * FROM Libros";
        Query query = entityManager.createNativeQuery(sql, Libro.class);
        return query.getResultList();

    }

    public List<Libro> listarLibrosPorISBN(long isbn) {
        String sql = "SELECT * FROM Libros WHERE ISBN LIKE '" + isbn + "';";
        Query query = entityManager.createNativeQuery(sql, Libro.class);
        return query.getResultList();

    }

    public List<Libro> listarLibrosPorTitulo(String titulo) {
        String sql = "SELECT * FROM Libros WHERE Titulo LIKE '" + titulo + "';";
        Query query = entityManager.createNativeQuery(sql, Libro.class);
        return query.getResultList();
    }

    public List<Libro> listarLibrosPorAutor(Autor autor) {
        String sql = "SELECT * FROM Libros WHERE autor LIKE '" + autor + "';";
        Query query = entityManager.createNativeQuery(sql, Libro.class);
        return query.getResultList();
    }

    public List<Libro> listarLibrosPorEditorial(Editorial editorial) {
        String sql = "SELECT * FROM Libros WHERE editorial LIKE '" + editorial + "';";
        Query query = entityManager.createNativeQuery(sql, Libro.class);
        return query.getResultList();
    }

    public List<Libro> listarLibrosPorNombreDeAutor(String nombreAutor) {
        String sql = "select l.ISBN,l.ALTA,l.ANIO,l.EJEMPLARES,l.ejemplares_prestados,l.ejemplares_restantes,l.TITULO,l.AUTOR_ID,l.EDITORIAL_ID from libros l "
                + "inner join autores a "
                + "where a.NOMBRE ='" + nombreAutor + "'";
        Query query = entityManager.createNativeQuery(sql, Libro.class);

        return query.getResultList();

    }

    public List<Libro> listarLibrosPorNombreDeEditorial(String nombreEditorial) {
        String sql = "select l.ISBN,l.ALTA,l.ANIO,l.EJEMPLARES,l.ejemplares_prestados,l.ejemplares_restantes,l.TITULO,l.AUTOR_ID,l.EDITORIAL_ID from libros as l "
                + "inner join editoriales as e "
                + "where e.NOMBRE ='" + nombreEditorial + "'";
        Query query = entityManager.createNativeQuery(sql, Libro.class);

        return query.getResultList();
    }

}
