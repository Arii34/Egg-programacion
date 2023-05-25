/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código.
 */
package ejpoo14;

import service.MovilService;

/**
 *
 * @author Facundo
 */
public class EjPOO14 {

    public static void main(String[] args) {
MovilService ms = new MovilService();

ms.cargarCelular();
        
    }
    
}
