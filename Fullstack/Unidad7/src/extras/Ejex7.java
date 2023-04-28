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
public class Ejex7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num;

        System.out.println("Tamaño de la matriz:");
        int n = leer.nextInt();

        num = new int[n];

        System.out.println("");
        for (int i = 0; i < n; i++) {
            num[i] = leer.nextInt();
        }

        int min = num[0], max = num[0], suma = num[0], i = 1;

        do {
            if (num[i] > max) {
                max = num[i];
            } else if (num[i] < min) {
                min = num[i];
            }
            suma = suma + num[i];

            i++;
        } while (i < n);

        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Promedio: " + (suma / n));
    }
}
