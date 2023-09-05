/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

/**
 *
 * @author Silvina
 */
public class DAO_Fabricante extends DAO{

    public void guardarFabricante( Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe introducir un fabricante");
            }
            String sql = "INSERT INTO Producto (codigo,nombre)"
                    + "VALUES ( '"
                    + fabricante.getCodigo() + "' , '"
                    + fabricante.getNombre() + "' );" ;

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe introducir un fabricante");
            }
            String sql = "UPDATE fabricante SET"
                    +  "nombre = ' " + fabricante.getNombre()
                    + " ' WHERE codigo = ' " + fabricante.getCodigo();
            
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }//modificar por codigo
    
    public void eliminarFabricate (Fabricante fabricante) throws Exception{
        try {
            String sql = "DELETE FROM fabricante WHERE nombre = '" + fabricante.getNombre() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }//eliminar por nombre
    
    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception{
        try {
            
            String sql ="SELECT * FROM fabricante"
                    +" WHERE nombre = '" + nombre + "'";
            
            consultaBase(sql);
            
            Fabricante fabricante=null;
            
            
            while (resultado.next()) {                
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                
            }
            
            desconectarBase();
            
            return fabricante;
            
        } catch (Exception e) {
            desconectarBase();
            throw e; 
        }
    }
    
    public Collection<Fabricante> listarFabricantes() throws Exception{
        try {
            
            String sql = "SELECT * FROM fabricante";
            
            consultaBase(sql);
            
            Fabricante fabricante = null;
            
            Collection<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()){                
                 fabricante = new Fabricante();
                 fabricante.setCodigo(resultado.getInt(1));
                 fabricante.setNombre(resultado.getString(2));
                 fabricantes.add(fabricante);
                 
            }
            desconectarBase();
            return fabricantes;
            
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error del sistema");
            
        }
    }
}
