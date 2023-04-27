/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    Connection conexion;
    
    public Connection Conectar(String user, String pass){
        
        try{
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        String nombre_servidor = "localhost";
        String numero_puerto = "1521";
        String sid = "xe";
        String url = "jdbc:oracle:thin:@"+ nombre_servidor +":"+numero_puerto+":"+sid;
        conexion = DriverManager.getConnection(url,user,pass);
        JOptionPane.showMessageDialog(null, "Coneccion exitosa");
        return conexion;
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Fallo la conexion..."+ e.getMessage());   
      
        }
        return conexion;
    }
}
