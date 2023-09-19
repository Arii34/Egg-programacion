/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package practico;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej7Eureka {

    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      System.out.println("ingrese una palabra");
      String frase=leer.nextLine();
        
      if(frase.equals("eureka")){
          System.out.println("correcto");
      }else{
          System.out.println("incorrecto");
      }
    }
    
}