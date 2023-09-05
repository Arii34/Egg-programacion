/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterclass.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author W10
 */
@Entity
@Table(name ="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Column(name = "activa")
    private Boolean activa;

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String correoElectronico, Boolean activa) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.activa = activa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", activa=" + activa + '}';
    }
    
    
            
           
    
    
}
