/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class CursoService {

    Curso c1 = new Curso();
    Scanner leer = new Scanner(System.in);

    public String[] cargarAlumnos() {
        String[] aux = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno");
            aux[i] = leer.next();
        }

        return aux;
    }
    
    public void crearCurso(){
        System.out.println("INgrese el nombre del curso");
        c1.setNombreCurso(leer.nextLine());
        
        System.out.println(" Ingrese la cantidad de horas por dia");
        c1.setCantidadHorasPorDia(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de dias por semana");
        c1.setCantidadDiasPorSemana(leer.nextInt());

        
        System.out.println("INgrese el precio por hora");
       c1.setPrecioPorHora(leer.nextInt());
       
               
        System.out.println("INgrese turno mañana o tarde");
        c1.setTurno(leer.next());
       
        System.out.println("ingresando alumnos");
        c1.setAlumnos(cargarAlumnos());
    }
    
    public int calcularGanancia(){
        
        int aux = c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * 5 * c1.getCantidadDiasPorSemana();
        return aux;
        
    }
    
}
