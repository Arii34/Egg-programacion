/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej8FraseDe8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String f;
       do{
        System.out.println("Ingrese una palabra de 8 letras");
        f=leer.nextLine();
    }while(f.length()!= 8);
        System.out.println("correcto");
    } 
}