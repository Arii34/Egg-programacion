/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs.Extras;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejex8 {
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contImpar = 0, contPar = 0, contTotal = 0, num;

        System.out.println("");

        do {
            num = leer.nextInt();

            if (num >= 0) {
                contTotal++;
                if (num % 2 == 0) {
                    contPar++;
                } else if (num % 2 != 0) {
                    contImpar++;
                }   
            }
        } while (num % 5 != 0);
        
        System.out.println("Números leídos: " + contTotal);
        System.out.println("Números pares: " + contPar);
        System.out.println("Números impares: " + contImpar);
    }
}