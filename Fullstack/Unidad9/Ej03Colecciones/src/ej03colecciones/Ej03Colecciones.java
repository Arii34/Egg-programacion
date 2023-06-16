/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej03colecciones;

import entidades.Alumno;
import java.util.ArrayList;
import service.ServiceAlumno;

/**
 *
 * @author Facundo
 */
public class Ej03Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceAlumno sa = new ServiceAlumno();
        

        ArrayList <Alumno> grupo = sa.agregarAlumno();
        System.out.println("nota final=  " + sa.notaFinal(grupo));
    }
    
}
