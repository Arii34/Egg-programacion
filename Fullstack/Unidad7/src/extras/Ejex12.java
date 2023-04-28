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
public class Ejex12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //String E;
        for (int a = 0; a < 10; a++) {

            for (int b = 0; b < 10; b++) {
                //E= String.valueOf(a/b/c);
                for (int c = 0; c < 10; c++) {
                    if (a == 3) {
                        System.out.print("E - ");
                    } else {
                        System.out.print(a + " - ");
                    }
                    if (b == 3) {
                        System.out.print("E - ");
                    } else {
                        System.out.print(b + " - ");
                    }
                    if (c == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(c);
                    }
                    System.out.println(" ");
                }
            }
        }
    }
}