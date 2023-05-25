/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexpoo03;

import entidades.Raiz;
import service.RaicesService;

/**
 *
 * @author Facundo
 */
public class EjExPOO03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesService rs = new RaicesService();
        Raiz r = new Raiz();

        
        System.out.println("discriminante= " +  rs.getDiscriminante(r));
        System.out.println("tiene raices " + rs.tieneRaices(r));
        System.out.println("tiene raiz " + rs.tieneRaiz(r));
        rs.calcular(r);
    }

}
