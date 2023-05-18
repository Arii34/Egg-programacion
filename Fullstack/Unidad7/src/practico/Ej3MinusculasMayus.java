/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas.
 */
package practico;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej3MinusculasMayus {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String frase = leer.nextLine();
        String mayus = frase.toUpperCase();
        String minus = frase.toLowerCase();
        System.out.println("Minsiculas: " + minus);
        System.out.println("Mayusculas " + mayus);

    }

}
