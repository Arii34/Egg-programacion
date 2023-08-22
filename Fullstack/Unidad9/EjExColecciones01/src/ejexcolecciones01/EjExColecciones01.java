/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexcolecciones01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class EjExColecciones01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> nums = new ArrayList();
        Scanner leer = new Scanner(System.in);
        boolean bolaux = true;
        do {
            System.out.println("ingrese el numero a agregar: ");
            int entrada;
            entrada = leer.nextInt();
            nums.add(entrada);
            
            
            if (entrada == -99) {
                nums.remove(nums.size()-1);
                bolaux = false;

            }

        } while (bolaux);
        
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }
    

}
