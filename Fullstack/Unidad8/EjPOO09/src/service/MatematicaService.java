/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Matematica;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class MatematicaService {

    Matematica m = new Matematica();
    
    Scanner leer = new Scanner(System.in);

    public int devolverMayor() {
        if (m.getNum1() > m.getNum2()) {
            return (int) m.getNum1();
        } else {
            return (int) m.getNum2();
        }
    }

    public int devolverMenor() {
        if (m.getNum1() < m.getNum2()) {
            return (int) m.getNum1();
        } else {
            return (int) m.getNum2();
        }
    }

    public double calculcarPotencia() {

        return devolverMayor()^devolverMenor();
        
    }

    public double calcularRaiz (){
        double aux ; 
        aux = Math.abs(devolverMenor());
        return Math.sqrt(aux);
    }
}
