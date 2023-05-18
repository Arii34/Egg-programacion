/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class CafeteraService {
    Cafetera c = new Cafetera();
        Scanner leer = new Scanner(System.in);
        
        
    public void llenarCafetera() {
        c.setCantidadActual(c.getCapacidadMaxima());
    }
    
     public void servirTaza(int taza){
        System.out.println("INgrese la cantidad a servir");
        taza = leer.nextInt();
        if(taza <= c.getCantidadActual()){
            c.setCantidadActual(c.getCantidadActual()-taza);
            System.out.println("Se sirvio correctamente");
            System.out.println("Queda " + c.getCantidadActual() +  "% de cafe" );
            
        }else {
            System.out.println("se sirvio solamente " + c.getCantidadActual() + "ya que la taza es mayor que el cafe restante");
           c.setCantidadActual(0);
            System.out.println("no queda nada de cafe");
            
        }
    }
    public void vaciarCafetera(){
        c.setCantidadActual(0);
        System.out.println("Se vacio correctamente");
    }
    
    public void agregarCafe(int agg){
        System.out.println("ingrese la cantidad a agreagar");
        agg=leer.nextInt();
        if ( c.getCantidadActual()+agg >= c.getCapacidadMaxima()){
            System.out.println("Se lleno hasta el maximo de cafe ");
            c.setCantidadActual(c.getCapacidadMaxima());
        } else {
            System.out.println("Se lleno la cafetera hasta el " + (agg+c.getCantidadActual()) + "%");
            c.setCantidadActual(c.getCantidadActual()+agg);
        }
    }
}
