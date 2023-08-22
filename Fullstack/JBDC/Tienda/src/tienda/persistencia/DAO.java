
package tienda.persistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER ="root";
    private final String PASSWORD ="root";
    private final String DATABASE ="Tienda";
    private final String DRIVER ="com.mysql.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException,SQLException  {
        try {
            Class.forName(DRIVER);
            String URL = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("La conexion fue exitosa");
            
        } catch (ClassNotFoundException | SQLException ex ) {
            System.out.println("La conexion no fue exitosa");
            throw ex ;
            
        }
    
    }
    
    protected void desconectarBase() throws Exception{
        try {
            
            if(resultado != null){
                resultado.close();
            }
            if(sentencia != null){
                sentencia.close();
            }
            if(conexion != null){
                conexion.close();
            }
            
        } catch (SQLException e) {
        throw e; 
        }
        
    }
    
    protected void insertarModificarEliminar(String sql) throws Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeQuery(sql);
        } catch (SQLException | ClassNotFoundException ex) {
            //conexion.rollback(); NO TIENE SENTIDO PARA ESTE PROYECTO 
            throw ex;
            
        } finally{
            desconectarBase();
        }
    }
    protected void consultaBase(String sql) throws Exception{
        
        try {
        conectarBase();
        sentencia= conexion.createStatement();
        resultado= sentencia.executeQuery(sql);
        
        } catch (ClassNotFoundException | SQLException ex) {
        throw ex;
        }
       
        
    }
}
