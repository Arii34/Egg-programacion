package ejs.Extras;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Facundo
 */
public class Ejex10 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num1 = (int)(10 * Math.random()), num2 = (int)(10 * Math.random()), res;
        
        System.out.println(num1 + " x " + num2);
        System.out.println("Digite su respuesta:");
        
        do{
           res = leer.nextInt();
           
           if (res != (num1 * num2)){
               System.out.println("Incorrecto. Vuelva a intentar:");
           }
        } while (res != (num1 * num2));
        
        System.out.println("Felicitaciones, ha adivinado.");
    }     
}