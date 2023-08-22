    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrelaciones01;

import entidaddes.Perro;
import entidaddes.Persona;

/**
 *
 * @author Facundo
 */
public class EjRelaciones01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro m1 = new Perro("pancho", "salchicha", 7, "chiquito");
        Perro m2 = new Perro("choco", "calle", 5, "mediano");
        Persona p1 = new Persona("juan", "Rodriguez", 25, 44728017, m1);
        Persona p2 = new Persona("Pepe", "Argento", 47, 20999176, m2);
        
        
        
        System.out.println(p2.toString());
        System.out.println(p1.toString());
    }
    
}
