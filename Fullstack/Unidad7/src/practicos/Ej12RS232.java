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
public class Ej12RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        String codigo;
        String FDE = "&&&&&";
        int correctos = 0, incorrectos = 0;
        do{
            System.out.println("Ingrese su codigo");
            codigo= leer.nextLine();
            codigo= codigo.toUpperCase();
            if(codigo.equals(FDE)){
                break;
            }
            if(codigo.startsWith("X")&&codigo.endsWith("O")&&codigo.length()<=5){
                correctos++;
            }else{
                incorrectos++;
            }
            
        }while(!codigo.equals(FDE));
        System.out.println("La cantidad de lecturas correctas fue: "+correctos);
        System.out.println("La cantidad de lecturas incorrectas fue: "+incorrectos);
    }
}