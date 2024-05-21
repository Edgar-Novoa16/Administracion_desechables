/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.ModuloProductosPerecederos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marco
 */
public class SQLProductosPerecederos {
   
     private static  ResultSet rs;
     private static  Connection con;
     private static PreparedStatement ps;

public static void insertarProductosPerecederos(ProductoPerecedero producto)
{
    
    con = Conexion.getConexion();
    
    
    switch(producto.getTipoProducto())
    {
        
        case "ALIMENTOS":
            
        
            try {
                
                ps = con.prepareCall("{call insertarAlimentosPerecederos(?,?,?,?,?)}");
                ps.setInt(1, producto.getIdproducto());
                ps.setFloat(2, producto.getCantidad_del_producto());
                ps.setDate(3, producto.getFecha_de_pérdida());
                ps.setString(4, producto.getMotivo_de_pérdida());
                ps.setFloat(5, producto.getmerma());
                ps.executeUpdate();
                
                ps = con.prepareCall("{call pedirIdAlimentoPerecedero}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    producto.setIdproductos_perecederosali(rs.getInt("idalimentoperecedero"));
                    
                }
               
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call insertarDesechablesPerecederos(?,?,?,?,?)}");
                ps.setInt(1, producto.getIdproducto());
                ps.setFloat(2, producto.getCantidad_del_producto());
                ps.setDate(3, producto.getFecha_de_pérdida());
                ps.setString(4, producto.getMotivo_de_pérdida());
                ps.setFloat(5, producto.getmerma());
                ps.executeUpdate();
                
                ps = con.prepareCall("{call pedirIdDesechablePerecedero}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    producto.setIdproductos_perecederosali(rs.getInt("iddesechableperecedero"));
                    
                }
                
                
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call insertarPrinPerecederos(?,?,?,?,?)}");
                ps.setInt(1, producto.getIdproducto());
                ps.setFloat(2, producto.getCantidad_del_producto());
                ps.setDate(3, producto.getFecha_de_pérdida());
                ps.setString(4, producto.getMotivo_de_pérdida());
                ps.setFloat(5, producto.getmerma());
                ps.executeUpdate();
                
                ps = con.prepareCall("{call pedirIdPrinPerecedero}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    producto.setIdproductos_perecederosali(rs.getInt("idprinperecedero"));
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call insertarPsnPerecederos(?,?,?,?,?)}");
                ps.setInt(1, producto.getIdproducto());
                ps.setFloat(2, producto.getCantidad_del_producto());
                ps.setDate(3, producto.getFecha_de_pérdida());
                ps.setString(4, producto.getMotivo_de_pérdida());
                ps.setFloat(5, producto.getmerma());
                ps.executeUpdate();
                
                ps = con.prepareCall("{call pedirIdPsnPerecedero}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    producto.setIdproductos_perecederosali(rs.getInt("idpsnperecedero"));
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }
    
}    
    
public static float consultarPrecioAlimento(int idProducto)
{
    
    con = Conexion.getConexion();
    float precio = 0;
    
      try {
          
          ps = con.prepareCall("{call consultarPrecioAlimento(?)}");
          ps.setInt(1, idProducto);
          rs = ps.executeQuery();
          
          if(rs.next())
          {
              
              precio = rs.getFloat("precio");
              return precio;
          }
          
          
      } catch (SQLException ex) {

          JOptionPane.showMessageDialog(null, ex.toString());
          return precio;
      }
    
     return precio;
    
}


public static float consultarPrecioDesechable(int idProducto)
{
    
    con = Conexion.getConexion();
    float precio = 0;
    
      try{
          
          ps = con.prepareCall("{call consultarPrecioDesechable(?)}");
          ps.setInt(1, idProducto);
          rs = ps.executeQuery();
          
          if(rs.next())
          {
              
              precio = rs.getFloat("precio");
              return precio;
          }
          
          
      } catch (SQLException ex) {

          JOptionPane.showMessageDialog(null, ex.toString());
          return precio;
      }
    
     return precio;
    
    
}

public static float consultarPrecioPrin(int idProducto)
{
    
    con = Conexion.getConexion();
    float precio = 0;
    
      try{
          
          ps = con.prepareCall("{call consultarPrecioPrin(?)}");
          ps.setInt(1, idProducto);
          rs = ps.executeQuery();
          
          if(rs.next())
          {
              
              precio = rs.getFloat("precio");
              return precio;
          }
          
          
      } catch (SQLException ex) {

          JOptionPane.showMessageDialog(null, ex.toString());
          return precio;
      }
    
     return precio;
    
    
}

public static float consultarPrecioPsn(int idProducto)
{

    con = Conexion.getConexion();
    float precio = 0;
    
      try{
          
          ps = con.prepareCall("{call consultarPrecioPsn(?)}");
          ps.setInt(1, idProducto);
          rs = ps.executeQuery();
          
          if(rs.next())
          {
              
              precio = rs.getFloat("precio");
              return precio;
          }
          
          
      } catch (SQLException ex) {

          JOptionPane.showMessageDialog(null, ex.toString());
          return precio;
      }
    
     return precio;
    
    
}


public static void filtrarTodosLosProductos(ModuloProductosPerecederos pp, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[7];
    
    switch(pp.getJcmbFiltroTipoPP().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirTodosLosAlimentosPerecederos}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirTodosLosDesechablesPerecederos}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirTodosLosPrinPerecederos}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirTodosLosPsnPerecederos}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarAlgunosProductos(ModuloProductosPerecederos pp, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[7];
    
    switch(pp.getJcmbFiltroTipoPP().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunosAlimentosPerecederos(?,?)}");
                ps.setInt(1, pp.getProductoP().getFiltroCantidadProductosPInicial());
                ps.setInt(2, pp.getProductoP().getFiltroCantidadProductosPFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunosDesechablesPerecederos(?,?)}");
                ps.setInt(1, pp.getProductoP().getFiltroCantidadProductosPInicial());
                ps.setInt(2, pp.getProductoP().getFiltroCantidadProductosPFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunosPrinPerecederos(?,?)}");
                ps.setInt(1, pp.getProductoP().getFiltroCantidadProductosPInicial());
                ps.setInt(2, pp.getProductoP().getFiltroCantidadProductosPFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunosPsnPerecederos(?,?)}");
                ps.setInt(1, pp.getProductoP().getFiltroCantidadProductosPInicial());
                ps.setInt(2, pp.getProductoP().getFiltroCantidadProductosPFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarPorCantidadPerdidaProducto(ModuloProductosPerecederos pp, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[7];
    
    switch(pp.getJcmbFiltroTipoPP().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCantidadPerdidaAlimentosPerecederos(?,?)}");
                ps.setFloat(1, pp.getProductoP().getFiltroCantidadPerdidaInicial());
                ps.setFloat(2, pp.getProductoP().getFiltroCantidadPerdidaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCantidadPerdidaDesechablesPerecederos(?,?)}");
                ps.setFloat(1, pp.getProductoP().getFiltroCantidadPerdidaInicial());
                ps.setFloat(2, pp.getProductoP().getFiltroCantidadPerdidaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCantidadPerdidaPrinPerecederos(?,?)}");
                ps.setFloat(1, pp.getProductoP().getFiltroCantidadPerdidaInicial());
                ps.setFloat(2, pp.getProductoP().getFiltroCantidadPerdidaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCantidadPerdidaPsnPerecederos(?,?)}");
                ps.setFloat(1, pp.getProductoP().getFiltroCantidadPerdidaInicial());
                ps.setFloat(2, pp.getProductoP().getFiltroCantidadPerdidaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarPorFechaPerdidaProducto(ModuloProductosPerecederos pp, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[7];
    
    switch(pp.getJcmbFiltroTipoPP().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirPorFechaPerdidaAlimentosPerecederos(?,?)}");
                ps.setDate(1, (Date) pp.getProductoP().getFiltroRangoFechaPerdidaInicial());
                ps.setDate(2, (Date) pp.getProductoP().getFiltroRangoFechaPerdidaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirPorFechaPerdidaDesechablesPerecederos(?,?)}");
                ps.setDate(1, (Date) pp.getProductoP().getFiltroRangoFechaPerdidaInicial());
                ps.setDate(2, (Date) pp.getProductoP().getFiltroRangoFechaPerdidaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorFechaPerdidaPrinPerecederos(?,?)}");
                ps.setDate(1, (Date) pp.getProductoP().getFiltroRangoFechaPerdidaInicial());
                ps.setDate(2, (Date) pp.getProductoP().getFiltroRangoFechaPerdidaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorFechaPerdidaPsnPerecederos(?,?)}");
                ps.setDate(1, (Date) pp.getProductoP().getFiltroRangoFechaPerdidaInicial());
                ps.setDate(2, (Date) pp.getProductoP().getFiltroRangoFechaPerdidaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarPorCantidadMerma(ModuloProductosPerecederos pp, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[7];
    
    switch(pp.getJcmbFiltroTipoPP().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCantidadMermaAlimentosPerecederos(?,?)}");
                ps.setFloat(1,  pp.getProductoP().getFiltroMermaInicial());
                ps.setFloat(2,  pp.getProductoP().getFiltroMermaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCantidadMermaDesechablesPerecederos(?,?)}");
                ps.setFloat(1,  pp.getProductoP().getFiltroMermaInicial());
                ps.setFloat(2,  pp.getProductoP().getFiltroMermaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCantidadMermaPrinPerecederos(?,?)}");
                ps.setFloat(1,  pp.getProductoP().getFiltroMermaInicial());
                ps.setFloat(2,  pp.getProductoP().getFiltroMermaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCantidadMermaPsnPerecederos(?,?)}");
                ps.setFloat(1,  pp.getProductoP().getFiltroMermaInicial());
                ps.setFloat(2,  pp.getProductoP().getFiltroMermaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarPorIdProductosPerecederos(ModuloProductosPerecederos pp, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[7];
    
    switch(pp.getJcmbFiltroTipoPP().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdAlimentosPerecederos(?)}");
                ps.setInt(1,  pp.getProductoP().getIdproducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdDesechablesPerecederos(?)}");
                ps.setInt(1,  pp.getProductoP().getIdproducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdPrinPerecederos(?)}");
                ps.setInt(1,  pp.getProductoP().getIdproducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdPsnPerecederos(?)}");
                ps.setInt(1,  pp.getProductoP().getIdproducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproductos_perecederospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getFloat("cantidad_del_producto");
                     info[4] = rs.getDate("fecha_de_pérdida");
                     info[5] = rs.getString("motivo_de_pérdida");
                     info[6] = rs.getFloat("Merma");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

/*public float establecerCantidadProducto(ProductoPerecedero perecedero)
{
    
    con = Conexion.getConexion();
    float total;
    try{
       
        if(perecedero.getTipoProducto() == "Alimentos")
        {
        
            ps = con.prepareCall("{call consultarCantidadAlimento}");
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                
                total = rs.getFloat("cantidad_almacen");
                total -= perecedero.getCantidad_del_producto();
                
                if(total <= 0)
                {
                    return 0;
                }else
                {
                    
                    return 1;
                }
                
            }
            
        
                
        }
    }catch(SQLException ex)
    {
        
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }
    
    
}
*/

}
