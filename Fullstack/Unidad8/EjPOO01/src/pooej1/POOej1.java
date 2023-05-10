/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidades.Persona;

/**
 *
 * @author Facundo
 */
public class POOej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona primeraPersona = new Persona();
        
        Persona segundaPersona = new Persona("facundo","Arienti",19);
        
        primeraPersona.setNombre("NombreSeteado");
        
         System.out.println(primeraPersona.getNombre());
         System.out.println(segundaPersona.getNombre());
        segundaPersona.toString();
    }
    
}
