package service;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();

    int anio, mes, dia;

    public Persona crearPersona() {

        System.out.println("Ingrese su nombre: ");
        p1.setNombre(leer.nextLine());

        System.out.println("año de nacimiento");
        anio = leer.nextInt();

        System.out.println("Imes de nacimiento (nro)");
        mes = leer.nextInt();

        System.out.println("dia de nacimiento");
        dia = leer.nextInt();

        Date fecha = new Date(anio-1900,mes-1,dia);
        p1.setFechaNac(fecha);
        
        return p1;
    }
    
public int calcularEdad(Persona p1) {

        Date fechaActual = new Date();
        int edad = (fechaActual.getYear() - p1.getFechaNac().getYear());

        if (fechaActual.getMonth() < p1.getFechaNac().getMonth()) {
            edad--;
        } else if (fechaActual.getMonth() == p1.getFechaNac().getMonth()) {
            if (fechaActual.getDate() < p1.getFechaNac().getDate()) {
                edad--;
            }
        }

        return edad;
    }
    
    public boolean menorQue(int edad2 , Persona p1){
        
        int edad1 = calcularEdad(p1);
        
        return edad1>edad2;
        
        
    }
    
    public void mostrarPersona(Persona p1){
        p1.toString();
    }
}
