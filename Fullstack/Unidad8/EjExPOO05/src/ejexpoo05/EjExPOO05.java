package ejexpoo05;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class EjExPOO05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] mes = new String[12];

        mes[0] = "enero";
        mes[1] = "febrero";
        mes[2] = "marzo";
        mes[3] = "abril";
        mes[4] = "mayo";
        mes[5] = "junio";
        mes[6] = "julio";
        mes[7] = "agosto";
        mes[8] = "septiembre";
        mes[9] = "octubre";
        mes[10] = "noviembre";
        mes[11] = "diciembre";

        String mesSecreto = mes[5];
        String adivinanza;

        do {
            System.out.println("Introduzca un mes en minusculas");
            adivinanza = leer.nextLine();

            if (adivinanza.equals(mesSecreto)) {
                System.out.println("Bien le pegaste!");
                
            } else {
                System.out.println("intente de nuevo :(");
            }
        } while (!adivinanza.equals(mesSecreto));
    }

}
