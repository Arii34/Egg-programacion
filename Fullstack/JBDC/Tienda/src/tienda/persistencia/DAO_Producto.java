package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.producto;

public class DAO_Producto extends DAO {

    public void guardarProducto(producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe introducir un producto");
            }
            String sql = "INSERT INTO Producto (codigo,nombre,precio,codigo_fabricante)"
                    + "VALUES ( '"
                    + producto.getCodigo() + "' , '"
                    + producto.getNombre() + "' , '"
                    + producto.getPrecio() + "' , '"
                    + producto.getCodigoFabricante() + "' );";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto(producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe introducir un producto");
            }
            String sql = "UPDATE Producto SET"
                    + "precio = '" + producto.getPrecio()
                    + "' WHERE nombre = '" + producto.getNombre();
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }//modificar por nombre
    
    public void eliminarProducto (producto producto) throws Exception{
        try {
            String sql = "DELETE FROM producto WHERE nombre = '" + producto.getNombre() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }//eliminar por nombre
    
    public Collection<producto> listarProductos() throws Exception{
        try {
            
            String sql = "SELECT nombre FROM producto";
            
            consultaBase(sql);
            
            producto producto = null;
            
            Collection<producto> productos = new ArrayList();
            while (resultado.next()){                
                 producto = new producto();
                 producto.setCodigo(resultado.getInt(1));
                 producto.setNombre(resultado.getString(2));
                 productos.add(producto);
                 
            }
            desconectarBase();
            return productos;
            
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error del sistema");
            
        }
    }
}
