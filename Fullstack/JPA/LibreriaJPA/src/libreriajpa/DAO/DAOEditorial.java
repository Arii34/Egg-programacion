
package libreriajpa.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import libreriajpa.Entidades.Editorial;

public class DAOEditorial extends DAO<Editorial> {


    public DAOEditorial(EntityManager entityManager) {
        super(entityManager);
    }
    
    public List<Editorial> listarEditoriales(){
        String sql = "SELECT * FROM Editoriales";
        Query query = entityManager.createNativeQuery(sql,Editorial.class);
        return query.getResultList();
    }
    public Editorial listarEditorialesPorId(Integer id){
        return entityManager.find(Editorial.class,id);
    }
    public List<Editorial> listarEditorialesPorNombre(String nombre) {
        String sql = "SELECT * FROM Editorial WHERE Nombre LIKE '" + nombre + "';";
        Query query = entityManager.createNativeQuery(sql,Editorial.class);
        return query.getResultList();
    }
    public List<Editorial> listarEditorialesPorAlta(boolean alta){
        String sql = "SELECT * FROM Editoriales WHERE Alta LIKE '" + alta + "'";
        Query query = entityManager.createNativeQuery(sql,Editorial.class);
        return query.getResultList();
    }
    
}
