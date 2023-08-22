/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarajaAPP;

import services.BarajaService;

/**
 *
 * @author Facundo
 */
public class BarajaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BarajaService bS = new BarajaService();
        
        bS.CrearBaraja();
        bS.mostrarBaraja();
        System.out.println("----------------------------------------------");
        bS.barajar();
        bS.mostrarBaraja();
        System.out.println("----------------------------------------------");
        bS.cartasDisponibles();
        bS.darCartas();
        System.out.println("----------------------------------------------");
        bS.cartasDisponibles();
        bS.cartasMonton();
        System.out.println("----------------------------------------------");
        bS.mostrarBaraja();


}
}