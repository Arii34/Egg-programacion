/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs.Extras;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Facundo
 */
public class Ejex5 {
      public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String clase;
        
        System.out.println("Indique qué plan abona: (A, B o C)");
        
        do{
            clase = leer.next();
            clase = toUpperCase(clase);
            if (!clase.equals("A") && !clase.equals("B") && !clase.equals("C")){
                System.out.println("Respuesta no válida, inténtelo de nuevo.");
            }
        } while (!clase.equals("A") && !clase.equals("B") && !clase.equals("C"));
        
        System.out.println("A continuación igrese el"
                + " costo total del tratamiento:");
        int costo = leer.nextInt();
        
        switch (clase){
            case "A": System.out.println("De acuerdo a su membresía, el costo final será de: " + (float)(costo * 0.5));
            break;
            case "B": System.out.println("De acuerdo a su membresía, el costo final será de: " + (float)(costo * 0.65));
            break;
            case "C": System.out.println("De acuerdo a su membresía, el costo final será de: " + costo);
        }
    }     
}