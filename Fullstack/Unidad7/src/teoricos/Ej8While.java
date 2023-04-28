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
public class Ej8While {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
    /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.*/
        int nota;
        System.out.println("Ingrese una nota");
        nota = leer.nextInt();
        while(!((nota >= 0)&&(nota <= 10))){
            System.out.println("POR FAVOR ingrese una nota VALIDA");
            nota = leer.nextInt();
        } 
    }     
}
