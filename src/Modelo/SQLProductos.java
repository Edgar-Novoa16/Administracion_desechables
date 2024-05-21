package Modelo;

import Vista.ModuloProductos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marco
 */
public class SQLProductos {

     private static  ResultSet rs;
     private static  Connection con;
     private static PreparedStatement ps;

    
public static boolean comprobarProductos(Producto producto)
{
    
    con = Conexion.getConexion();
    
    
    switch(producto.getTipoProducto())
    {
        
        case "ALIMENTOS":
            
        
            try {
                
                ps = con.prepareCall("{call comprobarAlimentos(?,?)}");
                ps.setString(1, producto.getNombre_producto());
                ps.setString(2, producto.getModelo());
                rs = ps.executeQuery();
                
                
                if(rs.next())
                {
                 
                    return false;
                    
                }else
                {
               
                    return true;
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call comprobarDesechables(?,?)}");
                ps.setInt(1, producto.getIdProveedor());
                ps.setString(2, producto.getModelo());
                rs = ps.executeQuery();
                
                
                if(rs.next())
                {
                
                    return false;
                    
                }else
                {
                    
                    return true;
                            
                }
                
                
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());

            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call comprobarPrimeraNecesidad(?,?)}");
                ps.setString(1, producto.getNombre_producto());
                ps.setString(2, producto.getModelo());
                rs = ps.executeQuery();
                
                
                if(rs.next())
                {
                    
                    return false;
                
                }else
                {
                    
                    return true;
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call comprobarSegundaNecesidad(?,?)}");
                ps.setString(1, producto.getNombre_producto());
                ps.setString(2, producto.getModelo());
                rs = ps.executeQuery();
                
                
                if(rs.next())
                {
                    
                    return false;
                    
                }else
                {
                    
                    return true;
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }
    
    return false;
    
}

     
     
public static void insertarProductos(Producto producto)
{
    
    con = Conexion.getConexion();
    
    
    switch(producto.getTipoProducto())
    {
        
        case "ALIMENTOS":
            
        
            try {
                
                ps = con.prepareCall("{call insertarAlimentos(?,?,?,?,?,?,?)}");
                ps.setInt(1, producto.getIdProveedor());
                ps.setString(2, producto.getNombre_producto());
                ps.setString(3, producto.getCategoria());
                ps.setString(4, producto.getModelo());
                ps.setString(5, producto.getTamaño());
                ps.setFloat(6, producto.getCantidad_almacen());
                ps.setFloat(7, producto.getPrecio());
                ps.executeUpdate();
                
                ps = con.prepareCall("{call pedirIdAlimento}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    producto.setIdProducto(rs.getInt("idalimento"));
                    
                }
               
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call insertarDesechables(?,?,?,?,?,?,?)}");
                ps.setInt(1, producto.getIdProveedor());
                ps.setString(2, producto.getNombre_producto());
                ps.setString(3, producto.getCategoria());
                ps.setString(4, producto.getModelo());
                ps.setString(5, producto.getTamaño());
                ps.setFloat(6, producto.getCantidad_almacen());
                ps.setFloat(7, producto.getPrecio());
                ps.executeUpdate();
                
                ps = con.prepareCall("{call pedirIdDesechable}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    producto.setIdProducto(rs.getInt("iddesechable"));
                    
                }
                
                
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call insertarPrimeraNecesidad(?,?,?,?,?,?,?)}");
                ps.setInt(1, producto.getIdProveedor());
                ps.setString(2, producto.getNombre_producto());
                ps.setString(3, producto.getCategoria());
                ps.setString(4, producto.getModelo());
                ps.setString(5, producto.getTamaño());
                ps.setFloat(6, producto.getCantidad_almacen());
                ps.setFloat(7, producto.getPrecio());
                ps.executeUpdate();
                
                ps = con.prepareCall("{call pedirIdPrimeraNecesidad}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    producto.setIdProducto(rs.getInt("idproducto_primera_necesidad"));
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call insertarSegundaNecesidad(?,?,?,?,?,?,?)}");
                ps.setInt(1, producto.getIdProveedor());
                ps.setString(2, producto.getNombre_producto());
                ps.setString(3, producto.getCategoria());
                ps.setString(4, producto.getModelo());
                ps.setString(5, producto.getTamaño());
                ps.setFloat(6, producto.getCantidad_almacen());
                ps.setFloat(7, producto.getPrecio());
                ps.executeUpdate();
                
                ps = con.prepareCall("{call pedirIdSegundaNecesidad}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    producto.setIdProducto(rs.getInt("idproducto_segunda_necesidad"));
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }
    
}

public static void modificarProducto(Producto producto)
{
    
    con = Conexion.getConexion();
    
    switch(producto.getTipoProducto())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call modificarAlimentos(?,?,?,?,?,?,?)}");
                ps.setInt(1, producto.getIdProducto());
                ps.setString(2, producto.getNombre_producto());
                ps.setString(3, producto.getCategoria());
                ps.setString(4, producto.getModelo());
                ps.setString(5, producto.getTamaño());
                ps.setFloat(6, producto.getCantidad_almacen());
                ps.setFloat(7, producto.getPrecio());
                ps.executeUpdate();
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call modificarDesechables(?,?,?,?,?,?,?)}");
                ps.setInt(1, producto.getIdProducto());
                ps.setString(2, producto.getNombre_producto());
                ps.setString(3, producto.getCategoria());
                ps.setString(4, producto.getModelo());
                ps.setString(5, producto.getTamaño());
                ps.setFloat(6, producto.getCantidad_almacen());
                ps.setFloat(7, producto.getPrecio());
                ps.executeUpdate();
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call modificarPrimeraNecesidad(?,?,?,?,?,?,?)}");
                ps.setInt(1, producto.getIdProducto());
                ps.setString(2, producto.getNombre_producto());
                ps.setString(3, producto.getCategoria());
                ps.setString(4, producto.getModelo());
                ps.setString(5, producto.getTamaño());
                ps.setFloat(6, producto.getCantidad_almacen());
                ps.setFloat(7, producto.getPrecio());
                ps.executeUpdate();
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call modificarSegundaNecesidad(?,?,?,?,?,?,?)}");
                ps.setInt(1, producto.getIdProducto());
                ps.setString(2, producto.getNombre_producto());
                ps.setString(3, producto.getCategoria());
                ps.setString(4, producto.getModelo());
                ps.setString(5, producto.getTamaño());
                ps.setFloat(6, producto.getCantidad_almacen());
                ps.setFloat(7, producto.getPrecio());
                ps.executeUpdate();
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
        
    }
    
}



public static void eliminarProducto(String tipoProducto, String idproducto)
{
    
    con = Conexion.getConexion();
    
    switch(tipoProducto)
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call eliminarAlimentos(?)}");
                ps.setString(1, idproducto);
                ps.executeUpdate();
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call eliminarDesechables(?)}");
                ps.setString(1, idproducto);
                ps.executeUpdate();
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call eliminarPrimeraNecesidad(?)}");
                ps.setString(1, idproducto);
                ps.executeUpdate();
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call eliminarSegundaNecesidad(?)}");
                ps.setString(1, idproducto);
                ps.executeUpdate();
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
        
    }
    
    
    
    
    
}        
 
public static void filtrarTodosLosProductos(ModuloProductos pdts, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[9];
    
    switch(pdts.getJcmbFiltroTipoProducto().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirTodosLosAlimentos}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idalimento");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getString("nombre_alimento");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirTodosLosDesechables}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("iddesechable");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getString("nombre_desechable");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info); 
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirTodosLosPrimeraNecesidad}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_primera_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_primera_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirTodosLosSegundaNecesidad}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_segunda_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_segunda_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarAlgunosProductos(ModuloProductos pdts, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[9];
    
    switch(pdts.getJcmbFiltroTipoProducto().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunosAlimentos(?,?)}");
                ps.setInt(1, pdts.getProducto().getCantidadInicialFiltro());
                ps.setInt(2, pdts.getProducto().getCantidadFinalFiltro());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idalimento");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getString("nombre_alimento");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunosDesechables(?,?)}");
                ps.setInt(1, pdts.getProducto().getCantidadInicialFiltro());
                ps.setInt(2, pdts.getProducto().getCantidadFinalFiltro());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("iddesechable");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getString("nombre_desechable");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info); 
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunosPrimeraNecesidad(?,?)}");
                ps.setInt(1, pdts.getProducto().getCantidadInicialFiltro());
                ps.setInt(2, pdts.getProducto().getCantidadFinalFiltro());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_primera_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_primera_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunosSegundaNecesidad(?,?)}");
                ps.setInt(1, pdts.getProducto().getCantidadInicialFiltro());
                ps.setInt(2, pdts.getProducto().getCantidadFinalFiltro());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_segunda_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_segunda_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarNombreProducto(ModuloProductos pdts, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[9];
    
    switch(pdts.getJcmbFiltroTipoProducto().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirNombreAlimentos(?)}");
                ps.setString(1, pdts.getProducto().getNombre_producto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idalimento");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getString("nombre_alimento");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirNombreDesechables(?)}");
                ps.setString(1, pdts.getProducto().getNombre_producto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("iddesechable");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getString("nombre_desechable");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info); 
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirNombrePrimeraNecesidad(?)}");
                ps.setString(1, pdts.getProducto().getNombre_producto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_primera_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_primera_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirNombreSegundaNecesidad(?)}");
                ps.setString(1, pdts.getProducto().getNombre_producto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_segunda_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_segunda_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarIdProducto(ModuloProductos pdts, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[9];
    
    switch(pdts.getJcmbFiltroTipoProducto().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdAlimentos(?)}");
                ps.setInt(1, pdts.getProducto().getIdProducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idalimento");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getString("nombre_alimento");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdDesechables(?)}");
                ps.setInt(1, pdts.getProducto().getIdProducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("iddesechable");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getString("nombre_desechable");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info); 
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdPrimeraNecesidad(?)}");
                ps.setInt(1, pdts.getProducto().getIdProducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_primera_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_primera_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdSegundaNecesidad(?)}");
                ps.setInt(1, pdts.getProducto().getIdProducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_segunda_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_segunda_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarIdProveedorProducto(ModuloProductos pdts, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[9];
    
    switch(pdts.getJcmbFiltroTipoProducto().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdProveedorAlimentos(?)}");
                ps.setInt(1, pdts.getProducto().getIdProveedor());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idalimento");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getString("nombre_alimento");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdProveedorDesechables(?)}");
                ps.setInt(1, pdts.getProducto().getIdProveedor());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("iddesechable");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getString("nombre_desechable");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info); 
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdProveedorPrimeraNecesidad(?)}");
                ps.setInt(1, pdts.getProducto().getIdProveedor());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_primera_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_primera_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdProveedorSegundaNecesidad(?)}");
                ps.setInt(1, pdts.getProducto().getIdProveedor());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_segunda_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_segunda_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarPrecioProducto(ModuloProductos pdts, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[9];
    
    switch(pdts.getJcmbFiltroTipoProducto().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirPorPrecioAlimentos(?,?)}");
                ps.setFloat(1, pdts.getProducto().getPrecioInicialProducto());
                ps.setFloat(2, pdts.getProducto().getPrecioFinalProducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idalimento");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getString("nombre_alimento");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirPorPrecioDesechables(?,?)}");
                ps.setFloat(1, pdts.getProducto().getPrecioInicialProducto());
                ps.setFloat(2, pdts.getProducto().getPrecioFinalProducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("iddesechable");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getString("nombre_desechable");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info); 
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorPrecioPrimeraNecesidad(?,?)}");
                ps.setFloat(1, pdts.getProducto().getPrecioInicialProducto());
                ps.setFloat(2, pdts.getProducto().getPrecioFinalProducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_primera_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_primera_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorPrecioSegundaNecesidad(?,?)}");
                ps.setFloat(1, pdts.getProducto().getPrecioInicialProducto());
                ps.setFloat(2, pdts.getProducto().getPrecioFinalProducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_segunda_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_segunda_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarCategoriaProducto(ModuloProductos pdts, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[9];
    
    switch(pdts.getJcmbFiltroTipoProducto().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCategoriaAlimentos(?)}");
                ps.setString(1, pdts.getProducto().getCategoria());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idalimento");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getString("nombre_alimento");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCategoriaDesechables(?)}");
                ps.setString(1, pdts.getProducto().getCategoria());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("iddesechable");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getString("nombre_desechable");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info); 
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCategoriaPrimeraNecesidad(?)}");
                ps.setString(1, pdts.getProducto().getCategoria());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_primera_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_primera_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCategoriaSegundaNecesidad(?)}");
                ps.setString(1, pdts.getProducto().getCategoria());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_segunda_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_segunda_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarCantidadAlmacenProducto(ModuloProductos pdts, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[9];
    
    switch(pdts.getJcmbFiltroTipoProducto().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCantidadAlmacenAlimentos(?,?)}");
                ps.setFloat(1, pdts.getProducto().getFiltroCantidadAlmacenInicial());
                ps.setFloat(2, pdts.getProducto().getFiltroCantidadAlmacenFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idalimento");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "ALIMENTOS";
                     info[3] = rs.getString("nombre_alimento");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCantidadAlmacenDesechables(?,?)}");
                ps.setFloat(1, pdts.getProducto().getFiltroCantidadAlmacenInicial());
                ps.setFloat(2, pdts.getProducto().getFiltroCantidadAlmacenFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("iddesechable");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "DESECHABLES";
                     info[3] = rs.getString("nombre_desechable");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info); 
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCantidadAlmacenPrimeraNecesidad(?,?)}");
                ps.setFloat(1, pdts.getProducto().getFiltroCantidadAlmacenInicial());
                ps.setFloat(2, pdts.getProducto().getFiltroCantidadAlmacenFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_primera_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "PRIMERA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_primera_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorCantidadAlmacenSegundaNecesidad(?,?)}");
                ps.setFloat(1, pdts.getProducto().getFiltroCantidadAlmacenInicial());
                ps.setFloat(2, pdts.getProducto().getFiltroCantidadAlmacenFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idproducto_segunda_necesidad");
                     info[1] = rs.getInt("idproveedores");
                     info[2] = "SEGUNDA NECESIDAD";
                     info[3] = rs.getString("nombre_producto_segunda_necesidad");
                     info[4] = rs.getString("categoria");
                     info[5] = rs.getString("modelo");
                     info[6] = rs.getString("tamaño");
                     info[7] = rs.getFloat("cantidad_almacen");
                     info[8] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                    
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}


}
