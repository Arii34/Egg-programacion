/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs.teoricos;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej10 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int numLeido;
         for (int i = 0; i < 4; i++) { //Primer bucle: cantidad de veces que leeremos un numero
             System.out.println("Ingrese un numero entre 1 y 20");
             numLeido = leer.nextInt();
             
             while ((numLeido <=0)||(numLeido>=21)){ //Si el usuario ingresa un numero fuera de rango, volvemos a pedir por un numero correcto
                 System.out.println("POR FAVOR! Ingrese un numero entre 1 y 20");
                 numLeido = leer.nextInt();
             }
             
             System.out.print(numLeido+" ");
             for (int j = 0; j < numLeido; j++) { //Segundo bucle: escribe una cantidad de astericos igual al numero leido
                 System.out.print("*");//imprime SIN salto de linea
                 
             }
             System.out.println("");//imprimimos un salto preparandonos para imprimir la siguiente cadena de asteriscos
         }
     }
    
}