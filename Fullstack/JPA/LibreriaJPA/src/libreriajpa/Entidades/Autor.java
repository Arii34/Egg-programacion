
package libreriajpa.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Nombre;
    private boolean alta;

    public Autor() {
    }

    public Autor(Integer id, String Nombre, boolean alta) {
        this.id = id;
        this.Nombre = Nombre;
        this.alta = alta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", Nombre=" + Nombre + ", alta=" + alta + '}';
    }
    
}
