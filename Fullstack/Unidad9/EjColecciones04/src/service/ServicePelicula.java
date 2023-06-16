/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Facundo
 */
public class ServicePelicula {

    List<Pelicula> peliculaLista = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

    public void crearPelicula() {
        String nombre;
        String director;
        float duracion;
        Pelicula peli = new Pelicula();

        System.out.println("Ingrese el nombre de la pelicula");
        nombre = leer.next();
        System.out.println("Ingrese el Director de la pelicula");
        director = leer.next();
        System.out.println("INgrese la duracion de la pelicula en horas");
        duracion = leer.nextFloat();

        peli.setNombre(nombre);
        peli.setDirector(director);
        peli.setDuracion(duracion);
        peliculaLista.add(peli);

    }

    public void mostrarPeliculas() {

        for (int i = 0; i < peliculaLista.size(); i++) {
            System.out.println("Pelicula # " + (i + 1));
            System.out.println("Titulo: " + peliculaLista.get(i).getNombre());
            System.out.println("Director: " + peliculaLista.get(i).getDirector());
            System.out.println("Duración: " + peliculaLista.get(i).getDuracion() + " horas");
            System.out.println("  ");

        }
    }

    public void servicioPelicula() {

        int contador = 0;
        do {
            crearPelicula();

            System.out.println("desea ingresar ota prelicula? S/N");
            contador++;

        } while (!(leer.next().equalsIgnoreCase("N")));
        mostrarPeliculas(); //muestra todas las peliculas

        //-------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("********** PELICULAS DE 1 HORA O MENOS **********");

        for (int i = 0; i < peliculaLista.size(); i++) {
            if (peliculaLista.get(i).getDuracion() <= 1) {

                System.out.println("********** TITULO **********");
                System.out.println(peliculaLista.get(i).getNombre());

                System.out.println("********** DIRECTOR**********");
                System.out.println(peliculaLista.get(i).getDirector());

                System.out.println("********** DURACION**********");
                System.out.println(peliculaLista.get(i).getDuracion());
            }

            //-------------------------------------------------------------------------------------------------------------------------------------
            System.out.println("*************Título******************");
            Collections.sort(peliculaLista, Comparadores.ordenarTituloAscen);
            mostrarPeliculas();//,muetra peliculas

            System.out.println("*************Duracion+******************");
            Collections.sort(peliculaLista, Comparadores.ordenarDuracionAscen);
            mostrarPeliculas();//,muetra peliculas

            System.out.println("*************Duracion-******************");
            Collections.sort(peliculaLista, Comparadores.ordenarDuracionDescen);
            mostrarPeliculas();//,muetra peliculas

            System.out.println("*************Director******************");
            Collections.sort(peliculaLista, Comparadores.ordenarDirectorAscen);
            mostrarPeliculas();//,muetra peliculas

        }

    }
}
