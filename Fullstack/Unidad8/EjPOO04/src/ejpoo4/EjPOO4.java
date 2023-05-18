/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo4;

import service.RectanguloService;

/**
 *
 * @author Facundo
 */
public class EjPOO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RectanguloService r1 = new RectanguloService();
        
        r1.crearRectangulo();
        r1.superficie();
        r1.perimetro();
        r1.dibujar();
        
    }
    
}
