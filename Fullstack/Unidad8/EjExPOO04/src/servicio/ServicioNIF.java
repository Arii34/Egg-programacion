/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.NIF;
import java.util.Scanner;

public class ServicioNIF {

    public NIF CrearNif() {
        NIF nif1 = new NIF();
        int num;
        char[] id = new char[23];
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su documento de 8 digitos");
        nif1.setDni(leer.nextLong());
        num = (int) (nif1.getDni() % 23);
        id[0] = 'T';
        id[1] = 'R';
        id[2] = 'W';
        id[3] = 'A';
        id[4] = 'G';
        id[5] = 'M';
        id[6] = 'Y';
        id[7] = 'F';
        id[8] = 'P';
        id[9] = 'D';
        id[10] = 'X';
        id[11] = 'B';
        id[12] = 'N';
        id[13] = 'J';
        id[14] = 'Z';
        id[15] = 'S';
        id[16] = 'Q';
        id[17] = 'V';
        id[18] = 'H';
        id[19] = 'L';
        id[20] = 'C';
        id[21] = 'K';
        id[22] = 'E';
        nif1.setLet(id[num]);
        return nif1;
    }
    public void Mostrar(NIF nif2){
        System.out.println("SU NIF ES:");
        System.out.println(nif2.getDni()+"-"+nif2.getLet());
    }
}
