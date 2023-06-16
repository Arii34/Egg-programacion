/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ServiceProductos {

    HashMap<String, Double> productos = new HashMap();
    Scanner leer = new Scanner(System.in);

    public void introducirProducto() {
        System.out.println("ingrese el nombre del producto");
        String producto = leer.next();
        System.out.println("ingrese el precio del producto");
        Double precio = leer.nextDouble();

        productos.put(producto, precio);
    }

    public void modificarPrecio() {
        System.out.println("ingrese el producto a cambiar el precio");
        String producto = leer.next();
        System.out.println("ingrese el nuevo valor del articulo");
        double precio = leer.nextDouble();
        boolean noCambio = true;

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            if (key.equalsIgnoreCase(producto)) {
                entry.setValue(precio);
                System.out.println("Precio Modificado exitosamente");
                noCambio = false;
            }
        }
        if (noCambio) {
            System.out.println("Producto no encotrado");
        }

    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese el producto que desea eliminar");
        String producto = leer.next();
        productos.remove(producto);
        
        
    }
    
    public void mostraProductos(){
        productos.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        });
    }
}