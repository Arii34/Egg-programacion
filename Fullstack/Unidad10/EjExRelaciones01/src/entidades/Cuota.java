/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Facundo
 */
public class Cuota {
    //número de cuota, monto total de la cuota, si está o no pagada, fecha de vencimiento, forma de pago
private int nroDeCuota;
private int montoTotalCuota;
private boolean pagada;
private Date fechaVencimiento;
private String formaDePago;

    public Cuota(int nroDeCuota, int montoTotalCuota, boolean pagada, Date fechaVencimiento, String formaDePago) {
        this.nroDeCuota = nroDeCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaDePago = formaDePago;
    }

    public Cuota() {
    }

    public int getNroDeCuota() {
        return nroDeCuota;
    }

    public void setNroDeCuota(int nroDeCuota) {
        this.nroDeCuota = nroDeCuota;
    }

    public int getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(int montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }
    

}
