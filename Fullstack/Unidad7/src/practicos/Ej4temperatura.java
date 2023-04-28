/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejs.practicos;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej4temperatura {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura acutal en grados C° ");
        int celcios = leer.nextInt();
        int f = 32 +(9*celcios/5);
        
        System.out.println("La temperatura en grados Fahrenheit es de " + f);
    }
    
}
