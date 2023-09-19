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
public class Ejex6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] altura = new double[20];
        double sumaTotal = 0, sumaEnanos = 0, contadorTotal = 0, contadorEnanos = 0;

        for (int i = 0; i < 20; i++) {
            altura[i] = (double) (50 * Math.random() + 140);
            altura[i] = (altura[i] / 100);
            altura[i] = Math.floor(altura[i] * 100) / 100;
            
            System.out.print(altura[i] + " ");
            if (i % 5 == 0 && i > 0) {
                System.out.println("");
            }
        }

        System.out.println("");
        
        for (int i = 0; i < 20; i++) {
            if (altura[i] < 1.6) {
                sumaEnanos = sumaEnanos + altura[i];
                contadorEnanos++;
            }
           sumaTotal = sumaTotal + altura[i];
           contadorTotal++;
        }
            System.out.println("Promedio total: " + (sumaTotal / contadorTotal));
            System.out.println("Promedio debajo de 1.60: " + (sumaEnanos / contadorEnanos));
    }
}