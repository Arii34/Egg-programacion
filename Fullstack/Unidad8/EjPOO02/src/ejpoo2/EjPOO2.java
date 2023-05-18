/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo2;

import Service.CircunferenciaService;

/**
 *
 * @author Facundo
 */
public class EjPOO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CircunferenciaService c1 = new CircunferenciaService(); 
       
       c1.crearCircunferencia();
       c1.area();
       c1.perimetro();
       
    }
    
}
