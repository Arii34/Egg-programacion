/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs.practicos;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej11Calculadora {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese 2 numeros");
        int n1=leer.nextInt(),n2=leer.nextInt();
        char r;
        boolean l=false;
        do{
            System.out.println("segun el siguiente menu elija sus opciones");
            System.out.println("MENU");
            System.out.println("1-SUMAR");    
            System.out.println("2-RESTAR");   
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("5-SALIR");
            byte s=leer.nextByte();
            switch(s){
                case 1:
                    System.out.println("el resultado es "+(n1+n2));
                    break;
                case 2:
                    System.out.println("el resultado es "+(n1-n2));
                    break;
                case 3:
                    System.out.println("el resultado es "+(n1*n2));
                    break;    
                case 4:
                    System.out.println("el resultado es "+(n1/n2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    r=leer.next().charAt(0);
                    if(r=='s'){
                        l=true;
                        break;        
                    }
                default:
                    System.out.println("numero incorrecto");
                    break;
            }
        }while(l==false);
        }
  
}