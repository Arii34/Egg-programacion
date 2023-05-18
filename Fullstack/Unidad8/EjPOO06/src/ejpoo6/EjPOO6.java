/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo6;

import service.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class EjPOO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraService cafe = new CafeteraService();
        int opcion;

        do {
            System.out.println("Bienvenido a Nesspreso, que desea hacer? ");

            System.out.println("1.Llenar cafetera");
            System.out.println("2.Servir Taza");
            System.out.println("3.Vaciar Cafetera");
            System.out.println("4.Agregar Cafe ");
            System.out.println("5.Salir");
            opcion = leer.nextInt();
            switch (opcion) {

                case 1:
                    cafe.llenarCafetera();
                    break;
                case 2:
                    cafe.servirTaza(opcion);
                    break;
                case 3:
                    cafe.vaciarCafetera();
                case 4:
                    cafe.agregarCafe(opcion);

            }
            if (opcion > 5) {
                System.out.println("nro no valido ");
            }
          

            System.out.println("Adios");
        }  while (opcion != 5);

    
    }

}
