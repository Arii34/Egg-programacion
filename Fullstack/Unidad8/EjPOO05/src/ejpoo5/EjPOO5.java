/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo5;

import Service.CuentaService;

/**
 *
 * @author Facundo
 */
public class EjPOO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            CuentaService cue = new CuentaService();
            cue.crearCuenta();
            cue.consultarDatos();
    }

}
