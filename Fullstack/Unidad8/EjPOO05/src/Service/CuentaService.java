/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class CuentaService {
    Cuenta c1 = new Cuenta();
    Scanner leer = new Scanner(System.in);
    
    public void  crearCuenta(){
        
        
        c1.setNroCuenta(((int) (1000000 * Math.random())));
        System.out.println("Su numero de centa es: " + c1.getNroCuenta());
        
        System.out.println("ingrese DNI");
        c1.setDni(leer.nextLong());
        
        System.out.println("Deposite su dinero");
        c1.setSaldo(leer.nextInt());
    }
    
    public void ingresar(double ingreso){
     c1.setSaldo((int) (c1.getSaldo()+ingreso));
     
    }
    
    public void retirar(double retiro){
        if(retiro >c1.getSaldo()){
            c1.setSaldo(0);
            
        }else{
            c1.setSaldo((int) (c1.getSaldo()-retiro));
        }
    }
    
    public void extraccionRapida(){
        System.out.println("retire hasta un 20% de su sueldo: ");
        int extraccion=leer.nextInt();
        if (extraccion > (c1.getSaldo()*0.2)){
            System.out.println("no puede retirar esa cantidad");
            
        }  else {
            c1.setSaldo(c1.getSaldo()-extraccion);
            System.out.println("se retiro correctamente");
        }
        
    }
    
    public void consultarSlado(){
        System.out.println("Su saldo es de "+ c1.getSaldo());
        
        
    }
    
    public void consultarDatos(){
        System.out.println("Cuenta{" + "nroCuenta=" + c1.getNroCuenta() + ", dni=" + c1.getDni() + ", saldo=" + c1.getSaldo() + '}');
    }
    
}
