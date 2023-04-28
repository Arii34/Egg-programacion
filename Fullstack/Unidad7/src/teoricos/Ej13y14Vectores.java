/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package ejs.teoricos;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej13y14Vectores {

    /**
     * tipo[] arregloV = new tipo[Tamaño];

     */
    public static void main(String[] args) {
        String[] equipo = new String[8];
        Scanner leer = new Scanner(System.in);

        
        for (int i=0;i <= 7;i++){
            
            System.out.println("Introduzca un nombre para el miembro nro " + (i+1));
            equipo[i] = leer.nextLine();
            System.out.println("hola miembro " + (i+1)+" " + equipo[i]);
        }
    }
    
}
