
package entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Facundo
 */
public class Poliza {
    //son: número de póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total asegurado, 
    //incluye granizo, monto máximo granizo, tipo de cobertura
    private int nroPoliza;
    private Date fechaInicio;
    private Date fechaFinal;
    private int canyCuotas;
    private ArrayList<Cuota> cuota;
    private String formaPago;
    private int montoTotalAsegurado;
    private boolean granizo;
    private int montoMaxGranizo;
    private String tipoCovertura;
    private Vehiculo vehiculo;
    private Clientes cliente;

    public Poliza() {
    }

    public Poliza(int nroPoliza, Date fechaInicio, Date fechaFinal, int canyCuotas, ArrayList<Cuota> cuota, String formaPago, int montoTotalAsegurado, boolean granizo, int montoMaxGranizo, String tipoCovertura, Vehiculo vehiculo, Clientes cliente) {
        this.nroPoliza = nroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.canyCuotas = canyCuotas;
        this.cuota = cuota;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoCovertura = tipoCovertura;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    public ArrayList<Cuota> getCuota() {
        return cuota;
    }

    public void setCuota(ArrayList<Cuota> cuota) {
        this.cuota = cuota;
    }



    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getCanyCuotas() {
        return canyCuotas;
    }

    public void setCanyCuotas(int canyCuotas) {
        this.canyCuotas = canyCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(int montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public String getTipoCovertura() {
        return tipoCovertura;
    }

    public void setTipoCovertura(String tipoCovertura) {
        this.tipoCovertura = tipoCovertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "poliza{" + "nroPoliza=" + nroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", canyCuotas=" + canyCuotas + ", formaPago=" + formaPago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", granizo=" + granizo + ", montoMaxGranizo=" + montoMaxGranizo + ", tipoCovertura=" + tipoCovertura + ", vehiculo=" + vehiculo + ", cliente=" + cliente + '}';
    }
    
    
}
