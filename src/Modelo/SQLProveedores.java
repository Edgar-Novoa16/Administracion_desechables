/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.ModuloProveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SQLProveedores {

     private static  ResultSet rs;
     private static  Connection con;
     private static PreparedStatement ps;

    
    
public static void insertarProveedores(Proveedor proveedor, String decision)
{
    
    con = Conexion.getConexion();
    
    
            try {
                
                if(decision.equals("v1"))
                {
                
                ps = con.prepareCall("{call insertarProveedor(?,?,?,?,?,?,?,?,?)}");
                ps.setString(1, proveedor.getNombreProveedor());
                ps.setString(2, proveedor.getSituacionProveedor());
                ps.setString(3, proveedor.getNumeroContacto());
                ps.setString(4, proveedor.getCalleProveedor());
                ps.setString(5, proveedor.getNumero());
                ps.setString(6, proveedor.getColoniaProveedor());
                ps.setString(7, proveedor.getCodigoPostalProveedor());
                ps.setString(8, proveedor.getMunicipio());
                ps.setString(9, proveedor.getEstadoProveedor());
                ps.execute();
                
                }else if(decision.equals("v2"))
                {
                
                ps = con.prepareCall("{call insertarProveedorv2(?,?,?,?,?,?,?,?,?)}");
                ps.setString(1, proveedor.getNombreProveedor());
                ps.setString(2, proveedor.getSituacionProveedor());
                ps.setString(3, proveedor.getNumeroContacto());
                ps.setString(4, proveedor.getCalleProveedor());
                ps.setString(5, proveedor.getNumero());
                ps.setString(6, proveedor.getColoniaProveedor());
                ps.setString(7, proveedor.getCodigoPostalProveedor());
                ps.setString(8, proveedor.getMunicipio());
                ps.setString(9, proveedor.getEstadoProveedor());
                ps.execute();
                    
                }else if(decision.equals("v3"))
                {
                
                ps = con.prepareCall("{call insertarProveedor(?,?,?,?,?,?,?,?,?)}");
                ps.setString(1, proveedor.getNombreProveedor());
                ps.setString(2, proveedor.getSituacionProveedor());
                ps.setString(3, proveedor.getNumeroContacto());
                ps.setString(4, proveedor.getCalleProveedor());
                ps.setString(5, proveedor.getNumero());
                ps.setString(6, proveedor.getColoniaProveedor());
                ps.setString(7, proveedor.getCodigoPostalProveedor());
                ps.setString(8, proveedor.getMunicipio());
                ps.setString(9, proveedor.getEstadoProveedor());
                ps.execute();
                    
                }else if(decision.equals("v4"))
                {
                
                ps = con.prepareCall("{call insertarProveedorv4(?,?,?,?,?,?,?,?,?)}");
                ps.setString(1, proveedor.getNombreProveedor());
                ps.setString(2, proveedor.getSituacionProveedor());
                ps.setString(3, proveedor.getNumeroContacto());
                ps.setString(4, proveedor.getCalleProveedor());
                ps.setString(5, proveedor.getNumero());
                ps.setString(6, proveedor.getColoniaProveedor());
                ps.setString(7, proveedor.getCodigoPostalProveedor());
                ps.setString(8, proveedor.getMunicipio());
                ps.setString(9, proveedor.getEstadoProveedor());
                ps.execute();
                    
                }
                
                ps = con.prepareCall("{call pedirIdProveedor}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    proveedor.setIdProveedor(rs.getInt("idproveedores"));
                    
                }
               
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
    
}

public static boolean comprobarNombreProveedor(Proveedor proveedor)
{
    
    con = Conexion.getConexion();
    
    
    try
    {
        
     ps = con.prepareCall("{call comprobarNombreProveedor(?)}");
     ps.setString(1, proveedor.getNombreProveedor());
     rs = ps.executeQuery();
        
     if(rs.next())
     {
         return false;
    
     }else
     {
         return true;
     }
        
    }catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null, ex.toString());
        
        
    }
    
    
    
    return true;
    
}

public static boolean comprobarEstadoProveedor(Proveedor proveedor)
{
    
    con = Conexion.getConexion();
    
    try
    {
        
     ps = con.prepareCall("{call comprobarEstadoProveedor(?)}");
     ps.setString(1, proveedor.getEstadoProveedor());
     rs = ps.executeQuery();
        
     if(rs.next())
     {
         return false;
    
     }else{
         return true;
     }
        
    }catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null, ex.toString());
        
        
    }
    
    
    
    return true;
    
}

public static boolean comprobarMunicipioProveedor(Proveedor proveedor)
{
    
    con = Conexion.getConexion();
    
    try
    {
        
     ps = con.prepareCall("{call comprobarMunicipioProveedor(?)}");
     ps.setString(1, proveedor.getMunicipio());
     rs = ps.executeQuery();
        
     if(rs.next())
     {
         return false;
    
     }else{
         
         return true;
         
     }
        
    }catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null, ex.toString());
        
        
    }
    
    
    
    return true;
    
}

public static void modificarProveedor(Proveedor proveedor)
{
    
    con = Conexion.getConexion();
    
            
            try {
                
                ps = con.prepareCall("{call modificarProveedor(?,?,?,?,?,?,?,?,?,?)}");
                ps.setInt(1, proveedor.getIdProveedor());
                ps.setString(2, proveedor.getNombreProveedor());
                ps.setString(3, proveedor.getCalleProveedor());
                ps.setString(4, proveedor.getNumero());
                ps.setString(5, proveedor.getColoniaProveedor());
                ps.setString(6, proveedor.getCodigoPostalProveedor());
                ps.setString(7, proveedor.getMunicipio());
                ps.setString(8, proveedor.getEstadoProveedor());
                ps.setString(9, proveedor.getSituacionProveedor());
                ps.setString(10, proveedor.getNumeroContacto());
                ps.executeUpdate();
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
}

public static void filtrarTodosLosProveedores(DefaultTableModel modelo)
{
    
     con = Conexion.getConexion();
     Object info[] = new Object[10];
    
    
            
            try {
                
                ps = con.prepareCall("{call pedirTodosLosProveedores}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                     info[0] = rs.getInt("idproveedores");
                     info[1] = rs.getString("nombreproveedor");
                     info[2] = rs.getString("calle");
                     info[3] = rs.getString("numero");
                     info[4] = rs.getString("colonia");
                     info[5] = rs.getInt("cp");
                     info[6] = rs.getString("municipio");
                     info[7] = rs.getString("estado");
                     info[8] = rs.getString("situacion");
                     info[9] = rs.getString("numerocontacto");
            
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }

}

public static void filtrarAlgunosProveedores(Proveedor proveedor, DefaultTableModel modelo)
{
    
     con = Conexion.getConexion();
     Object info[] = new Object[10];
    
    
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunosProveedores(?,?)}");
                ps.setInt(1, proveedor.getCantidadInicial());
                ps.setInt(2, proveedor.getCantidadFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproveedores");
                     info[1] = rs.getString("nombreproveedor");
                     info[2] = rs.getString("calle");
                     info[3] = rs.getString("numero");
                     info[4] = rs.getString("colonia");
                     info[5] = rs.getInt("cp");
                     info[6] = rs.getString("municipio");
                     info[7] = rs.getString("estado");
                     info[8] = rs.getString("situacion");
                     info[9] = rs.getString("numerocontacto");
            
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }

}

public static void filtrarIdProveedores(Proveedor proveedor, DefaultTableModel modelo)
{
    
     con = Conexion.getConexion();
     Object info[] = new Object[10];
    
    
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdProveedores(?)}");
                ps.setInt(1, proveedor.getIdProveedor());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproveedores");
                     info[1] = rs.getString("nombreproveedor");
                     info[2] = rs.getString("calle");
                     info[3] = rs.getString("numero");
                     info[4] = rs.getString("colonia");
                     info[5] = rs.getInt("cp");
                     info[6] = rs.getString("municipio");
                     info[7] = rs.getString("estado");
                     info[8] = rs.getString("situacion");
                     info[9] = rs.getString("numerocontacto");
            
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }

}

public static void filtrarNombreProveedores(Proveedor proveedor, DefaultTableModel modelo)
{
    
     con = Conexion.getConexion();
     Object info[] = new Object[10];
    
    
            
            try {
                
                ps = con.prepareCall("{call pedirPorNombreProveedores(?)}");
                ps.setString(1, proveedor.getNombreProveedor());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproveedores");
                     info[1] = rs.getString("nombreproveedor");
                     info[2] = rs.getString("calle");
                     info[3] = rs.getString("numero");
                     info[4] = rs.getString("colonia");
                     info[5] = rs.getInt("cp");
                     info[6] = rs.getString("municipio");
                     info[7] = rs.getString("estado");
                     info[8] = rs.getString("situacion");
                     info[9] = rs.getString("numerocontacto");
            
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }

}

public static void filtrarSituacionProveedores(Proveedor proveedor, DefaultTableModel modelo)
{
    
     con = Conexion.getConexion();
     Object info[] = new Object[10];
    
    
            
            try {
                
                ps = con.prepareCall("{call pedirPorSituacionProveedores(?)}");
                ps.setString(1, proveedor.getSituacionProveedor());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproveedores");
                     info[1] = rs.getString("nombreproveedor");
                     info[2] = rs.getString("calle");
                     info[3] = rs.getString("numero");
                     info[4] = rs.getString("colonia");
                     info[5] = rs.getInt("cp");
                     info[6] = rs.getString("municipio");
                     info[7] = rs.getString("estado");
                     info[8] = rs.getString("situacion");
                     info[9] = rs.getString("numerocontacto");
            
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }

}

public static void filtrarDireccionProveedores(Proveedor proveedor, DefaultTableModel modelo)
{
    
     con = Conexion.getConexion();
     Object info[] = new Object[10];
    
    
            
            try {
                
                ps = con.prepareCall("{call pedirPorDireccionProveedores(?,?,?,?,?,?)}");
                ps.setString(1, proveedor.getCalleProveedor());
                ps.setString(2, proveedor.getNumero());
                ps.setString(3, proveedor.getColoniaProveedor());
                ps.setString(4, proveedor.getCodigoPostalProveedor());
                ps.setString(5, proveedor.getMunicipio());
                ps.setString(6, proveedor.getEstadoProveedor());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproveedores");
                     info[1] = rs.getString("nombreproveedor");
                     info[2] = rs.getString("calle");
                     info[3] = rs.getString("numero");
                     info[4] = rs.getString("colonia");
                     info[5] = rs.getInt("cp");
                     info[6] = rs.getString("municipio");
                     info[7] = rs.getString("estado");
                     info[8] = rs.getString("situacion");
                     info[9] = rs.getString("numerocontacto");
            
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }

}


}