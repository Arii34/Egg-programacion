/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.fabricante;

/**
 *
 * @author Silvina
 */
public class DAO_Fabricante extends DAO{

    public void guardarFabricante( fabricante fabricante) throws Exception {
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

    public void modificarFabricante(fabricante fabricante) throws Exception {
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
    
    public void eliminarFabricate (fabricante fabricante) throws Exception{
        try {
            String sql = "DELETE FROM fabricante WHERE nombre = '" + fabricante.getNombre() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }//eliminar por nombre
    
    public fabricante buscarFabricantePorNombre(String nombre) throws Exception{
        try {
            
            String sql ="SELECT * FROM fabricante"
                    +" WHERE nombre = '" + nombre + "'";
            
            consultaBase(sql);
            
            fabricante fabricante=null;
            
            
            while (resultado.next()) {                
                fabricante = new fabricante();
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
    
    public Collection<fabricante> listarFabricantes() throws Exception{
        try {
            
            String sql = "SELECT * FROM fabricante";
            
            consultaBase(sql);
            
            fabricante fabricante = null;
            
            Collection<fabricante> fabricantes = new ArrayList();
            while (resultado.next()){                
                 fabricante = new fabricante();
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
