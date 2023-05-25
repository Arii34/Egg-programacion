/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidades.Movil;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class MovilService {

    Movil m = new Movil();
    Scanner leer = new Scanner(System.in);
    
    public void cargarCelular() {
        System.out.println("ingrese marca");
        m.setMarca(leer.next());
        
        System.out.println("ingrese precio");
        m.setPrecio(leer.next());
        
        System.out.println("ingrese ram");
        m.setRam(leer.next());
        
        System.out.println("ingrese almacenamiento");
        m.setAlmacenamiento((leer.next()));
        
        System.out.println("");
        m.setCodigo(ingresarCodigo());
    }
    
    public int[] ingresarCodigo() {
        int[] aux = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("ingrese un codigo ");            
            aux[i] = leer.nextInt();
        }
        
        return aux;
    }
    
}
