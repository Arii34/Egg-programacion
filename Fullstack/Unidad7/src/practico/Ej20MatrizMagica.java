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
public class Ej20MatrizMagica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int n;
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int s4 = 0;
        System.out.println("ingrese valores en la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    n = leer.nextInt();
                    matriz[i][j] = n;
                } while (matriz[i][j] > 10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            s1 = s1 + matriz[i][0];
        }
        for (int j = 0; j < 3; j++) {
            s2 = s2 + matriz[0][j];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    s3 = s3 + matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            int j = 2;
            j = j--;
            s4 = s4 + matriz[i][j];

        }
        if (s1 == s2 && s3 == s4 && s1 == s3 && s2 == s4 && s2 == s3 && s1 == s4) {
            System.out.println("Es un cuadrado magico");
        } else {
            System.out.println("No es un cuadrado magico");
        }
    }
}
