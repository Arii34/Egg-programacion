/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package practico;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej1Suma {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INgrese so numeros para sumar");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("La suma de esos dos numeros es de: " + (num1+num2));
    }
    
}
