/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class RectanguloService {
    
    Rectangulo r  =new Rectangulo();
    Scanner leer = new Scanner(System.in);
    
    public void crearRectangulo() {
        System.out.println("Ingrese la base y la altura del rectangulo");
        r.setBase(leer.nextDouble());
        r.setAltura(leer.nextDouble());
    }

    public void superficie() {
        System.out.println("Superficie = " + (r.getBase() * r.getAltura()));
    }

    public void perimetro() {
        System.out.println("Perimetro = " + ((r.getBase() * r.getAltura()) * 2));

    } 

    public void dibujar() {
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if (i == 0 || i == r.getAltura() - 1 || j == 0 || j == r.getBase() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
