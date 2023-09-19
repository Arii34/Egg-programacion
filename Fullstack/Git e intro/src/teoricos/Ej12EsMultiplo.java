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
public class Ej12EsMultiplo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numero siendo el primero multiplo del segundo");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        esMultiplo(num1,num2);
    }
    
    public static void esMultiplo(int num1, int num2){
    if ((num1%num2)==0){
        System.out.println("el primero es multiplo del segundo"); 
        
    }else{
        System.out.println("Los numeros no son multiplos ");
    }
    }
}
