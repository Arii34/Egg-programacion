/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class PuntosService {

    Puntos p = new Puntos();
    Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos() {
        System.out.println("ingrese las coordenadas del primer punto (X e Y)");
        p.setX1(leer.nextInt());
        p.setY1(leer.nextInt());

        System.out.println("ingrese las coordenadas del segundo punto (X e Y)");
        p.setX2(leer.nextInt());
        p.setY2(leer.nextInt());
        return p;
    }

    public double calcularDistancia() {
        int aux;
        int aux2;
        int x1 = p.getX1();
        int x2 = p.getX2();
        int y1 = p.getY1();
        int y2 = p.getY2();

        aux = (int) Math.pow(x2 - x1, 2);
        aux2 = (int) Math.pow(y2 - y1, 2);

        return Math.sqrt(aux + aux2);
    }
}
