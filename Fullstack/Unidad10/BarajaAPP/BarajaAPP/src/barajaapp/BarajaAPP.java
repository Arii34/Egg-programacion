/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barajaapp;

import Services.BarajaService;

/**
 *
 * @author Ioav
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
