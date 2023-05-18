/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo3;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class OperacionService {
    Operacion o = new Operacion();
    Scanner leer = new Scanner(System.in);
    
    public void crearOperacion(){
        
        
        System.out.println("Ingrese dos numeros a operar:");
    
        o.setNum1(leer.nextDouble());
        o.setNum2(leer.nextDouble());
    }
    
    public void sumar(){
        System.out.println("La suma de los numeros es: "+ (o.getNum1()+o.getNum2()));
    }
    
    public void restar(){
        System.out.println("La resta de los numeros es: "+ (o.getNum1()-o.getNum2()));
    }
    
    public void multiplicar(){
        if (o.getNum1() == 0 || o.getNum2()==0){
            System.out.println("La multiplicacion por cero siempre es 0");
        } else {
            System.out.println("La multiplicacion de los numeros es: "+ (o.getNum1()*o.getNum2()));
        }
    }
    
    public void dividir(){
        if (o.getNum2() == 0){
            System.out.println("Error: no se puede dvidir entre cero");
        }else {
            System.out.println("La divicion de los numeros es: "+ (o.getNum1()/o.getNum2()));
        }
    } 
}
