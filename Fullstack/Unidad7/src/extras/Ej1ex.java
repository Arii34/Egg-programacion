/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejs.Extras;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej1ex {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en MINUTOS");
        int minutosIn = leer.nextInt();
        int horas = 0;
        int dias = 0;

        do {
            if (minutosIn >= 60) {
                horas += 1;
                minutosIn -= 60;
            }
        } while (minutosIn >= 60);
        
        do{
            if (horas >=24 ){
                dias += 1;
                horas -= 24;
            }
        }while (horas>=24);
        System.out.println("Es igual a " + dias + " dias y " + horas + " horas con " + minutosIn + " minutos" );
    } 

}
