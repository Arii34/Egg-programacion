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
public class Ejex9 {    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int dividendo, divisor, cociente = 0;
        
        System.out.println("Digite el dividendo a continuación:");
        dividendo = leer.nextInt();
        System.out.println("Digite el divisor a continuación:");
        divisor = leer.nextInt();
        
        while (dividendo >= divisor){
            dividendo = dividendo - divisor;
            cociente ++;
        }
        System.out.println("Cociente de la división " + cociente);
        System.out.println("Resto de la división " + dividendo);
    } 
}