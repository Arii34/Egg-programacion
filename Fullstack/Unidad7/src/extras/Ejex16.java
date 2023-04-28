/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs.Extras;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Facundo
 */
public class Ejex16 {

    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        String siNo;

        do {
            System.out.println("Nombre:");
            String nombre = leer1.next();

            System.out.println("Edad:");
            int edad = leer1.nextInt();

            if (edad < 18) {
                System.out.println(nombre + " es menor de edad.");
            } else {
                System.out.println(nombre + " es mayor de edad.");
            }

            System.out.println("¿Desea ingresar otro dato?");
            siNo = "";

            do {
                siNo = leer2.next();
                siNo = toLowerCase(siNo);
            } while (!siNo.equals("si") && !siNo.equals("no"));

        } while (siNo.equals("si"));
    }
}
