/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej1Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String aux;
        do {
            System.out.println("Raza: ");
            perros.add(leer.nextLine());
            System.out.println("Desea agregar otro animal?");
            aux = (leer.nextLine());

        } while (!aux.equals("no"));
        perros.forEach((perro) -> {
            System.out.println(perro);
        });
//-----------------------------------------------------------------------------------------------

        Iterator ite = perros.iterator();
        System.out.println("que perro quiere eliminar?");
        String valu = leer.nextLine();
        while (ite.hasNext()) {

            if (ite.next().equals(valu)) {

                ite.remove();

            }else{
                System.out.println("el perro no esta en la lista ");
            }
        }
        Collections.sort(perros);
        
        System.out.println("-------------------------------------");
        perros.forEach((perro) -> {
            System.out.println(perro);
        });
    }
 
}
