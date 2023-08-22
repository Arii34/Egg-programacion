/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Facundo
 */
public class Vehiculo {
    //Marca,modelo, año, número de motor, chasis, color, tipo
    private String marca;
    private String modelo;
    private int anio;
    private int nroMotor;
    private int Chasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, int nroMotor, int Chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.nroMotor = nroMotor;
        this.Chasis = Chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNroMotor() {
        return nroMotor;
    }

    public void setNroMotor(int nroMotor) {
        this.nroMotor = nroMotor;
    }

    public int getChasis() {
        return Chasis;
    }

    public void setChasis(int Chasis) {
        this.Chasis = Chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", año=" + anio + ", nroMotor=" + nroMotor + ", Chasis=" + Chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    
    
}
