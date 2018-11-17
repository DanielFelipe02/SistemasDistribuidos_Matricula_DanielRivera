package sistemasdistribuidos_matricula_danielrivera;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CARLOS
 */
public class Conexion {
    
    public String db ="ventaspeliculas";
    private String url = "jdbc:mysql://localhost/"+db;
    private String user = "root";
    private String password = "";
    private Connection cn;
    private Statement st;
    private ResultSet rs;
    
      public void conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, password);
            st = cn.createStatement();            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    // Método para insert, update y delete
    public boolean consultar(String sql){
        try{
            st.executeUpdate(sql);            
            return true;            
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
    
    // Método para select
    public ResultSet leer(String sql){
        try{
            rs = st.executeQuery(sql);            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            return rs;            
        }
    }
    
    public void desconectar(){        
        try{
            st.close();
            cn.close();            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
