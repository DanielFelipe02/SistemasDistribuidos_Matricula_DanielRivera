/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasdistribuidos_matricula_danielrivera;

import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class BaseDeDatos {
    
    public String db = "ventaspeliculas";
    public String url = "jdbc:mysql://localhost/" + db;
    public String user = "root";
    public String pass = "";


    public BaseDeDatos()
    {

    }

    public Connection Connectar(){
        Connection link = null;
        try {
           Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return link;
    }

    public static void main (String[] args){

    }
}