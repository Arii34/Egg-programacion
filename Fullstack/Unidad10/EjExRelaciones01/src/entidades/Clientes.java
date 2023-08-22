/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Facundo
 */
public class Clientes {
    private String nombre;
    private String apellido;
    private int documento;
    private String mail;
    private String domicilo;
    private int telefono;
    private ArrayList <Vehiculo> listaVehiculos;
    public Clientes() {
    }

    public Clientes(String nombre, String apellido, int documento, String mail, String domicilo, int telefono, ArrayList<Vehiculo> listaVehiculos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilo = domicilo;
        this.telefono = telefono;
        this.listaVehiculos = listaVehiculos;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilo() {
        return domicilo;
    }

    public void setDomicilo(String domicilo) {
        this.domicilo = domicilo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", mail=" + mail + ", domicilo=" + domicilo + ", telefono=" + telefono + ", listaVehiculos=" + listaVehiculos + '}';
    }

 
    
}
