/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class Conexion {
    
    public static Connection getConexion(){
        
                        //Datos del servidor y gestor
        String url = "jdbc:sqlserver://DESKTOP-JQRCHOD:1433;"
                + "database=administración_desechables;"//Datos de la base de datos.
                + "user=sa;"//Nombre del usuario.
                + "password=marcoscg1198;"//Contraseña.
                + "loginTimeup=30;";//Tiempo máximo (en segundos) para que el sistema intente establecer la conexión. 
        try{
            
            Connection conexion = DriverManager.getConnection(url);
            return conexion;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
    }
    
    
}
