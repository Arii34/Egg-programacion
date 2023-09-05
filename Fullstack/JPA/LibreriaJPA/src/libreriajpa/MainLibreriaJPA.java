package libreriajpa;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreriajpa.Servicio.AutorService;
import libreriajpa.Servicio.EditorialService;
import libreriajpa.Servicio.LibroService;

public class MainLibreriaJPA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        EntityManager entityManager = Persistence.createEntityManagerFactory("LibreriaJPAPU")
                .createEntityManager();
        LibroService lS = new LibroService(entityManager);
        AutorService aS = new AutorService(entityManager);
        EditorialService eS = new EditorialService(entityManager);

        boolean salidaGral = true;
        while (salidaGral) {

            System.out.println("Bienvenido a la libreria.");
            System.out.println("Seleccione la accion que desea hacer");

            System.out.println("1-Subida de datos");
            System.out.println("");
            System.out.println("2-Busqueda de libros");
            System.out.println("");
            System.out.println("3-modificacion de datos");

            int eleccion1 = leer.nextInt();
            switch (eleccion1) {
                case 1:
                    boolean salidaSubida = true;
                    while (salidaSubida) {

                        System.out.println("Que desea subir?");
                        System.out.println("1-Libro");
                        System.out.println("2-Autor");
                        System.out.println("3-Editorial");

                        int eleccionDeSubida = leer.nextInt();
                        switch (eleccionDeSubida) {
                            case 1:
                                if () {
                                    
                                }

                        }
                    }
            }

        }
    }

}
