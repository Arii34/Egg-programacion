/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Facundo
 */
public class Juego {

    String[] PObjetivo;
    int LEncontradas;
    int oportunidades;

    public Juego() {
    }

    public Juego(String[] PObjetivo, int LEncontradas, int oportunidades) {
        this.PObjetivo = PObjetivo;
        this.LEncontradas = LEncontradas;
        this.oportunidades = oportunidades;
    }

    public String[] getPObjetivo() {
        return PObjetivo;
    }

    public void setPObjetivo(String[] PObjetivo) {
        this.PObjetivo = PObjetivo;
    }

    public int getLEncontradas() {
        return LEncontradas;
    }

    public void setLEncontradas(int LEncontradas) {
        this.LEncontradas = LEncontradas;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(int contador) {
        this.oportunidades = contador;
    }
    
    
}
