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
public class Ejex4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un número entre 1 y 10:");
        do{
        num = leer.nextInt();
        if (num < 1 || num > 10){
            System.out.println("Inténtelo de nuevo.");
        }
        } while (num < 1 || num > 10);

        System.out.print(num + " equivale a ");

        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                System.out.print("I");
            }
        } else if (num == 4) {
            System.out.print("IV");
        } else if (num >= 5 && num <= 8) {
            System.out.print("V");
            for (int i = 0; i < (num - 5); i++) {
            System.out.print("I");
            }
        } else if (num == 9){
            System.out.print("IX"); 
        } else {
            System.out.print("X");
        }
        System.out.println("");
    }
}
    
