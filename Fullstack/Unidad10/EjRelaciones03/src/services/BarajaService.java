/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidad.Baraja;
import entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class BarajaService {

    Baraja mazo = new Baraja();
    ArrayList<Carta> mazoAux = new ArrayList();
    ArrayList<Carta> mazoDescarte = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void CrearBaraja() {
        String[] palos = {"Espada", "Basto", "Oro", "Copa"};
        for (String palo : palos) {

            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    Carta c = new Carta(i, palo);
                    mazoAux.add(c);
                }
            }
            mazo.setMazo(mazoAux);
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : mazo.getMazo()) {
            System.out.println(carta.toString());
        }
    }

    public void barajar() {
        Collections.shuffle(mazo.getMazo());
    }

    public void siguienteCarta() {
        /**
         * siguienteCarta(): devuelve la siguiente carta que está en la baraja,
         * cuando no haya más o se haya llegado al final, se indica al usuario
         * que no hay más cartas.
         */
        Carta auxCarta;
        if (mazo.getMazo().isEmpty()) {
            System.out.println("no te quedan cartas");
        } else {
            auxCarta = mazo.getMazo().get(0);
            mazoDescarte.add(auxCarta);
            mazo.getMazo().remove(0);
        }
    }

    public void cartasDisponibles() {
        System.out.println("Quedan " + mazo.getMazo().size() + " cartas en el mazo");
    }

    public void darCartas() {
        /**
         * • darCartas(): dado un número de cartas que nos pidan, le
         * devolveremos ese número de cartas. En caso de que haya menos cartas
         * que las pedidas, no devolveremos nada, pero debemos indicárselo al
         * usuario.
        *
         */
        int repartir;
        System.out.println("Cuantas cartas se repartiran?");
        repartir = leer.nextInt();
        if (mazo.getMazo().size() >= repartir) {
            for (int i = 0; i < repartir; i++) {
                siguienteCarta();
            }
        } else {
            System.out.println("No quedan suficientes cartas para repartir");
        }
    }

    public void cartasMonton() {
        if (mazoDescarte.isEmpty()) {
            System.out.println("No se ha eliminado/jugado ninguna carta");
        } else {
            for (Carta carta : mazoDescarte) {
                System.out.println(carta.toString());
            }
        }
    }

}