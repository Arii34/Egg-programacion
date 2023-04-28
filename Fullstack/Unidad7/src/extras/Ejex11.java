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
public class Ejex11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, digitos = 0;
        System.out.println("ingrese el numero");
        num = leer.nextInt();
        do {
            num = num / 10;
            digitos++;

        } while (num != 0);
        System.out.println("la cantidad de digitos es:" + digitos);
    }
}