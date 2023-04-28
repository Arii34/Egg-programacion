/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs.teoricos;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej7Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("ingrese el Id del motor (numero)");
        int motor = leer.nextInt();
        
        switch (motor) {
            case 1 :
                System.out.println("“La bomba es una bomba de agua”");
                break;
            case 2 :
                System.out.println("“La bomba es una bomba de gasolina”.");
                break;
            case 3 :
                System.out.println("“La bomba es una bomba de hormigon”");
                break;
            case 4 :
                System.out.println("“La bomba es una bomba de alimenticia”");
                break;
            default :
                System.out.println("No existe un valoir valido para el tipo de bomba ");
        }
    }
    
}
