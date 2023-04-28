/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package ejs.practicos;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej2Nombre {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        
        System.out.println("su nombre es " + nombre);
    }
    
}
