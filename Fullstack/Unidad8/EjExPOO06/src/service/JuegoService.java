package service;

import entidad.Juego;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JuegoService {

    Scanner leer = new Scanner(System.in);
    Juego j = new Juego();

    public String[] llenarVector() {
        String palabra;

        System.out.println("Ingrese la palabra a adivinar: ");
        palabra = leer.nextLine();

        String[] vector = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {

            vector[i] = String.valueOf(palabra.charAt(i));
        }
        j.setPObjetivo(vector);
        return vector;

    }

    public void crearJuego() {
        llenarVector();
        System.out.println("Ingrese la cantidad de jugadas maxima: ");
        j.setOportunidades(leer.nextInt());
    }

    public int longitud() {

        return j.getPObjetivo().length;
    }

    public boolean buscar(String letra) {
        boolean bolaux = false;

        for (String PObjetivo : j.getPObjetivo()) {
            if (PObjetivo.contains(letra)) {
                bolaux = true;
            }
        }

        return bolaux;
    }

    public void intentos(String letra) {
        if (buscar(letra)) {
            System.out.println("te quedan :" + j.getOportunidades() + " intentos");

        } else {
            j.setOportunidades(j.getOportunidades() - 1);
            System.out.println("te quedan :" + j.getOportunidades() + " intentos");
        }
    }

    public boolean encontradas(String letra) {
        int contador = 0;
        boolean bolaux = false;
        String[] aux = j.getPObjetivo();

        if (buscar(letra)) {
            for (int i = 0; i < aux.length; i++) {

                if (letra.equals(aux[i])) {
                    contador++;
                    bolaux = true;
                }
            }

        }
        j.setLEncontradas(j.getLEncontradas() + contador);
        System.out.println("Numero de letras (Encontradas/faltantes) : (" + j.getLEncontradas() + "," + (j.getPObjetivo().length - j.getLEncontradas())+")");
        return bolaux;
    }

    public void juego() {
        crearJuego();
        String letra;
        boolean bolaux = true;
        do {
            System.out.println("ingrese una letra");
            letra = leer.next();
            System.out.println("la longitud de la palabra: " + longitud());
            if (buscar(letra)) {
                System.out.println("la letra pertenece a la palabra");
            } else {
                System.out.println("la letra no pertenece a la palabra");
            }
            encontradas(letra);
            intentos(letra);
            if (j.getOportunidades() == 0) {

                System.out.println("lo sentimos no tienes mas oportunidades :(");
                bolaux = false;
            }
            if (j.getLEncontradas() == longitud()) {
                System.out.println("ganaste, encontraste la palabra");
                bolaux = false;
            }

        } while (bolaux);
    }

}
