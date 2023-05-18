
package ejpoo3;

/**
 *
 * @author Facundo
 */
public class EjPOO3 {

    public static void main(String[] args) {

        OperacionService op = new OperacionService();
        
        op.crearOperacion();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
    }
    
}
