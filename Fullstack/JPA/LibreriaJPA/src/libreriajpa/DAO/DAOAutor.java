package libreriajpa.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import libreriajpa.Entidades.Autor;

/**
 *
 * @author Facundo
 */
public class DAOAutor extends DAO<Autor> {

    public DAOAutor(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Autor> listarAutores() {
        String sql = "SELECT * FROM Autores";
        Query query = entityManager.createNativeQuery(sql,Autor.class);
       return query.getResultList();
    }

    public List<Autor> listarAutoresPorNombre(String nombre) {
        String sql = "SELECT * FROM Autores WHERE Nombre LIKE '" + nombre + "';";
        Query query = entityManager.createNativeQuery(sql,Autor.class);
        return query.getResultList();
    }

    public Autor obtenerAutorPorId(Integer id) {
        return entityManager.find(Autor.class, id);
    }

    
    
}
