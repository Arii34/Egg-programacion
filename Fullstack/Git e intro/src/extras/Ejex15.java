/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs.Extras;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Facundo
 */
public class Ejex15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String siNo;

        do {
            System.out.println("Digite dos números a continuación:");
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();

            System.out.println("");
            System.out.println("Indique cuál de las siguientes operaciones"
                    + " desea aplicar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            int opcion;

            do {
                opcion = leer.nextInt();
                if (opcion < 1 || opcion > 4) {
                    System.out.println("Por favor ingrese una respuesta válida: 1, 2, 3 o 4");
                }
            } while (opcion < 1 || opcion > 4);

            float resultado;

            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println(num1 + " x " + num2 + " = " + resultado);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    System.out.println(num1 + " : " + num2 + " = " + resultado);
                    break;
            }
            
            System.out.println("");
            
            System.out.println("¿Desea reiniciar el proceso? (S/N)");

            do {
                siNo = leer.next();
                siNo = toUpperCase(siNo);
                if (!siNo.equals("S") && !siNo.equals("N")) {
                    System.out.println("Por favor ingrese una respuesta válida.");
                }
            } while (!siNo.equals("S") && !siNo.equals("N"));

        } while (siNo.equals("S"));
    }

    public static float sumar(int num1, int num2) {
        float res = (num1 + num2);
        return res;
    }

    public static int restar(int num1, int num2) {
        int res = (num1 - num2);
        return res;
    }
    
    public static int multiplicar(int num1, int num2) {
        int res = (num1 * num2);
        return res;
    }
    
    public static int dividir(int num1, int num2) {
        int res = (num1 / num2);
        return res;
    }
}