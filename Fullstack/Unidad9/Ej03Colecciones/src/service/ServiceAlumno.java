/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ServiceAlumno {

    Scanner leer = new Scanner(System.in);

    ArrayList<Integer> notas = new ArrayList();
    ArrayList<Alumno> grupo = new ArrayList();

    public Alumno crearAlumno() {
        Alumno al = new Alumno();
        ArrayList<Integer> notaAux = new ArrayList();
        System.out.println("ingrese el nombre del alumno: ");
        al.setNombre(leer.next());

        for (int i = 1; i < 4; i++) {
            System.out.println("ingrese la nota " + i + ": ");
            notaAux.add(leer.nextInt());

        }
        al.setNotas(notaAux);
        return al;
    }

    public ArrayList<Alumno> agregarAlumno() {
        String saux;
        boolean baux = true;
        do {
            System.out.println("desea agregar un alumno?");
            saux = leer.next();
            if (!saux.equals("no")) {
                grupo.add(crearAlumno());

            } else {
                baux = false;
            }

        } while (baux);

        return grupo;
    }

    public double notaFinal(ArrayList<Alumno> grupo) {

        System.out.println("que alumno quiere revisar");
        String valu = leer.next();
        double sumaTotal = 0;

        for (Alumno alumno : grupo) {
            if (alumno.getNombre().equals(valu)) {

                ArrayList<Integer> prueba = alumno.getNotas();

                for (Integer nota : prueba) {
                    sumaTotal += nota;

                }

            }

        }
        return sumaTotal / 3;
    }
}
