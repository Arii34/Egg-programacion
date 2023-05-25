
package ejpoo12;

import entidades.Persona;
import java.util.Scanner;
import service.PersonaService;

/**
 *
 * @author Facundo
 */
public class EjPOO12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();
        
        

        System.out.println("la edad de "+ p1.getNombre()+ " es "+ps.calcularEdad(p1) );
        
        
        System.out.println("Que edad desea comparar?");
        int edadAComparar = leer.nextInt();
        System.out.println(" es "+ p1.getNombre()+ " mayor que la edad introducida?");
        System.out.println(ps.menorQue(edadAComparar, p1));
        
        
    }
    
}
