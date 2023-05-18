/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class CircunferenciaService {
    Circunferencia c = new Circunferencia();
    Scanner leer = new Scanner(System.in);
    
    
     public void crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia");
        c.setRadio(leer.nextDouble());
    }
    public void area (){
        System.out.println("Area= " + (Math.PI *(c.getRadio()*c.getRadio())));
    }
    public void perimetro (){
        System.out.println("Perimetro= " + (2*Math.PI*c.getRadio()));
    }
}
