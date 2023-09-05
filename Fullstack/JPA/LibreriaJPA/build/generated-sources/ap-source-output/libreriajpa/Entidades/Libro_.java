package libreriajpa.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import libreriajpa.Entidades.Autor;
import libreriajpa.Entidades.Editorial;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-24T21:59:12")
@StaticMetamodel(Libro.class)
public class Libro_ { 

    public static volatile SingularAttribute<Libro, Editorial> editorial;
    public static volatile SingularAttribute<Libro, Integer> ejemplares;
    public static volatile SingularAttribute<Libro, Boolean> alta;
    public static volatile SingularAttribute<Libro, Long> isbn;
    public static volatile SingularAttribute<Libro, Integer> ejemplaresPrestados;
    public static volatile SingularAttribute<Libro, String> titulo;
    public static volatile SingularAttribute<Libro, Integer> ejemplaresRestantes;
    public static volatile SingularAttribute<Libro, Integer> anio;
    public static volatile SingularAttribute<Libro, Autor> autor;

}