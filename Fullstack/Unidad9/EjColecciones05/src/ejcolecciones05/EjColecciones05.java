/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class EjColecciones05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String pais;
        int cont = 0;
        do {
            System.out.println("Ingresa un pais");
            pais = leer.nextLine();
            paises.add(pais);
            System.out.println("Desea continuar agreando paises? (S/N)");
            cont++;
        } while (!(leer.nextLine().equalsIgnoreCase("n")));

         System.out.println("--------------Paises-----------------");
         paises.forEach(System.out::println);
         
         
         Collections.sort(paises);
         System.out.println("-----------Ordenados forma 1------------");
         paises.forEach(System.out::println);
         
         
         System.out.println("ingrese pais a borrar: ");
         String paisABorrar = leer.next();
         Iterator it = paises.iterator();
          boolean noEliminado = true;
        while (it.hasNext()) {
            if (it.next().equals(paisABorrar)) {
                it.remove();
                noEliminado = false;
            }
        }
        if (noEliminado) {
            System.out.println("Pais no encontrado");
        } else {
            System.out.println("Pais borrado satisfactoriamente");
            System.out.println("--------------Paises-----------------");
            paises.forEach(System.out::println);
        }
    }
}
