/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexpoo04;
import entidad.NIF;
import servicio.ServicioNIF;

public class EjExPOO04 {
    
    public static void main(String[] args) {
        ServicioNIF sf = new ServicioNIF();
        NIF nf = sf.CrearNif();
        sf.Mostrar(nf);
    }
}