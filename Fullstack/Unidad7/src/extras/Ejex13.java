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
public class Ejex13 {
  public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Altura de la escalera:");
        int n = leer.nextInt();
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println("");
        }
  }
}