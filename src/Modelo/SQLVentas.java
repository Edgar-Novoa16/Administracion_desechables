package Modelo;

import Vista.ModuloVentas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SQLVentas {

      private static  ResultSet rs;
      private static  Connection con;
      private static PreparedStatement ps;


public static void insertarVenta(Venta venta)
{
    
    con = Conexion.getConexion();
    
    
    switch(venta.getTipoProducto())
    {
        
        case "ALIMENTOS":
            
        
            try {
                
                ps = con.prepareCall("{call pedirIdVentas}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    venta.setIdVentas(rs.getInt("idventas"));
                }
                
                ps = con.prepareCall("{call insertarVentasAlimentos(?,?,?)}");
                ps.setFloat(1, venta.getCantidadVendida());
                ps.setFloat(2, venta.getTotalVenta());
                ps.setInt(3, venta.getIdProducto());
                ps.executeUpdate();
                
                
                ps = con.prepareCall("{call pedirFechaVenta(?)}");
                ps.setInt(1, (venta.getIdVentas() + 1));
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    venta.setFechaVenta(rs.getDate("fecha_de_venta"));
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {

                ps = con.prepareCall("{call pedirIdVentas}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    venta.setIdVentas(rs.getInt("idventas"));
                    
                }    
                
                ps = con.prepareCall("{call insertarVentasDesechables(?,?,?)}");
                ps.setFloat(1, venta.getCantidadVendida());
                ps.setFloat(2, venta.getTotalVenta());
                ps.setInt(3, venta.getIdProducto());
                ps.executeUpdate();
                
                ps = con.prepareCall("{call pedirFechaVenta(?)}");
                ps.setInt(1, venta.getIdVentas());
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    venta.setFechaVenta(rs.getDate("fecha_de_venta"));
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {

                ps = con.prepareCall("{call pedirIdVentas}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    venta.setIdVentas(rs.getInt("idventas"));
                    
                }
                
                ps = con.prepareCall("{call insertarVentasPrimeraNecesidad(?,?,?)}");
                ps.setFloat(1, venta.getCantidadVendida());
                ps.setFloat(2, venta.getTotalVenta());
                ps.setInt(3, venta.getIdProducto());
                ps.executeUpdate();
                
                ps = con.prepareCall("{call pedirFechaVenta(?)}");
                ps.setInt(1, venta.getIdVentas());
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    venta.setFechaVenta(rs.getDate("fecha_de_venta"));
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {

                ps = con.prepareCall("{call pedirIdVentas}");
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    venta.setIdVentas(rs.getInt("idventas"));
                    
                }
                
                ps = con.prepareCall("{call insertarVentasSegundaNecesidad(?,?,?)}");
                ps.setFloat(1, venta.getCantidadVendida());
                ps.setFloat(2, venta.getTotalVenta());
                ps.setInt(3, venta.getIdProducto());
                ps.executeUpdate();
                
                ps = con.prepareCall("{call pedirFechaVenta(?)}");
                ps.setInt(1, venta.getIdVentas());
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    venta.setFechaVenta(rs.getDate("fecha_de_venta"));
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }
    
    
    
}

public static void pedirUltimoId(ModuloVentas vs)
{
    
    con = Conexion.getConexion();
    
    try
    {
        
        ps = con.prepareCall("{call pedirIdVentas}");
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            
            vs.getVenta().setIdVentas(rs.getInt("idventas"));
            
        }
        
        
    }catch(SQLException ex)
    {
        
        JOptionPane.showMessageDialog(null, ex.toString());
    }
    
    
}

public static float consultarPrecioVenta(int idProducto, String tipoProducto)
{
    
    
    con = Conexion.getConexion();
    
    
    switch(tipoProducto)
    {
        
        case "ALIMENTOS":
            
        
            try {
                
                ps = con.prepareCall("{call consultarPrecioAlimento(?)}");
                ps.setInt(1, idProducto);
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    return rs.getFloat("precio");
                    
                }
               
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call consultarPrecioDesechable(?)}");
                ps.setInt(1, idProducto);
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    return rs.getFloat("precio");
                    
                }
                
                
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call consultarPrecioPrin(?)}");
                ps.setInt(1, idProducto);
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    return rs.getFloat("precio");
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call consultarPrecioPsn(?)}");
                ps.setInt(1, idProducto);
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    return rs.getFloat("precio");
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }
    
    return 0;
}


 public static void eliminarVenta(String idventa, String tipoProducto, int idProducto, float cantidadVendida)
{
    
    con = Conexion.getConexion();
    
    
            try {
                
                ps = con.prepareCall("{call eliminarVentas(?,?,?,?)}");
                ps.setInt(1, Integer.parseInt(idventa));
                ps.setString(2, tipoProducto);
                ps.setInt(3, idProducto);
                ps.setFloat(4, cantidadVendida);
                ps.executeUpdate();
                
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
    
}
     
/*public static void modificarVenta(Venta venta)
{
    
    con = Conexion.getConexion();
    
    
    switch(venta.getTipoProducto())
    {
        
        case "ALIMENTOS":
            
        
            try {
                
                ps = con.prepareCall("{call modificarVentasAlimentos(?,?,?,?,?)}");
                ps.setInt(1, venta.getIdVentas());
                ps.setFloat(2, venta.getCantidadVendida());
                ps.setFloat(3, venta.getTotalVenta());
                ps.setDate(4, venta.getFechaVenta());
                ps.setInt(5, venta.getIdProducto());
                ps.executeUpdate();
                
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call modificarVentasDesechables(?,?,?,?,?)}");
                ps.setInt(1, venta.getIdVentas());
                ps.setFloat(2, venta.getCantidadVendida());
                ps.setFloat(3, venta.getTotalVenta());
                ps.setDate(4, venta.getFechaVenta());
                ps.setInt(5, venta.getIdProducto());
                ps.executeUpdate();
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call modificarVentasPrimeraNecesidad(?,?,?,?,?)}");
                ps.setInt(1, venta.getIdVentas());
                ps.setFloat(2, venta.getCantidadVendida());
                ps.setFloat(3, venta.getTotalVenta());
                ps.setDate(4, venta.getFechaVenta());
                ps.setInt(5, venta.getIdProducto());
                ps.executeUpdate();

            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call modificarVentasSegundaNecesidad(?,?,?,?,?)}");
                ps.setInt(1, venta.getIdVentas());
                ps.setFloat(2, venta.getCantidadVendida());
                ps.setFloat(3, venta.getTotalVenta());
                ps.setDate(4, venta.getFechaVenta());
                ps.setInt(5, venta.getIdProducto());
                ps.executeUpdate();
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }
    
}      
*/      
public static float consultarCantidadProducto(String idProducto, String tipoProducto)
{
    
     con = Conexion.getConexion();
    
    
    switch(tipoProducto)
    {
        
        case "ALIMENTOS":
            
        
            try {
                
                ps = con.prepareCall("{call consultarCantidadAlimento(?)}");
                ps.setInt(1, Integer.parseInt(idProducto));
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    return rs.getFloat("cantidad_almacen");
                    
                }
               
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call consultarCantidadDesechable(?)}");
                ps.setInt(1, Integer.parseInt(idProducto));
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    return rs.getFloat("cantidad_almacen");
                    
                }
                
                
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call consultarCantidadPrin(?)}");
                ps.setInt(1, Integer.parseInt(idProducto));
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    return rs.getFloat("cantidad_almacen");
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call consultarCantidadPsn(?)}");
                ps.setInt(1, Integer.parseInt(idProducto));
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    
                    return rs.getFloat("cantidad_almacen");
                    
                }
                
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }
    
    return 0;
}

public static void filtrarTodasLasVentas(String filtroTipoProducto, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[6];
    
    switch(filtroTipoProducto)
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirTodasLasVentasAlimentos}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idventas");
                     info[1] = "ALIMENTOS";
                     info[2] = rs.getInt("idalimento");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirTodasLasVentasDesechables}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                     
                     info[0] = rs.getInt("idventas");
                     info[1] = "DESECHABLES";
                     info[2] = rs.getInt("iddesechable");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info); 
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirTodasLasVentasPrimeraNecesidad}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     
                     info[0] = rs.getInt("idventas");
                     info[1] = "PRIMERA NECESIDAD";
                     info[2] = rs.getInt("idproducto_primera_necesidad");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info);
                    
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirTodasLasVentasSegundaNecesidad}");
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idventas");
                     info[1] = "SEGUNDA NECESIDAD";
                     info[2] = rs.getInt("idproducto_segunda_necesidad");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info);
                    
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

    
}

public static void filtrarAlgunasVentas(Venta venta, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[6];
    
    switch(venta.getTipoProducto())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunasVentasAlimentos(?,?)}");
                ps.setInt(1, venta.getCantidadVentasInicial());
                ps.setInt(2, venta.getCantidadVentasFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idventas");
                     info[1] = "ALIMENTOS";
                     info[2] = rs.getInt("idalimento");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunasVentasDesechables(?,?)}");
                ps.setInt(1, venta.getCantidadVentasInicial());
                ps.setInt(2, venta.getCantidadVentasFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                     
                     info[0] = rs.getInt("idventas");
                     info[1] = "DESECHABLES";
                     info[2] = rs.getInt("iddesechable");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info); 
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunasVentasPrimeraNecesidad(?,?)}");
                ps.setInt(1, venta.getCantidadVentasInicial());
                ps.setInt(2, venta.getCantidadVentasFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     
                     info[0] = rs.getInt("idventas");
                     info[1] = "PRIMERA NECESIDAD";
                     info[2] = rs.getInt("idproducto_primera_necesidad");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info);
                    
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirAlgunasVentasSegundaNecesidad(?,?)}");
                ps.setInt(1, venta.getCantidadVentasInicial());
                ps.setInt(2, venta.getCantidadVentasFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idventas");
                     info[1] = "SEGUNDA NECESIDAD";
                     info[2] = rs.getInt("idproducto_segunda_necesidad");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info);
                    
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

}

public static void filtrarPorIdProducto(Venta venta, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[6];
    
    switch(venta.getTipoProducto())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdAlimentosVentas(?)}");
                ps.setInt(1, venta.getIdProducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idventas");
                     info[1] = "ALIMENTOS";
                     info[2] = rs.getInt("idalimento");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdDesechablesVentas(?)}");
                ps.setInt(1, venta.getIdProducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                     
                     info[0] = rs.getInt("idventas");
                     info[1] = "DESECHABLES";
                     info[2] = rs.getInt("iddesechable");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info); 
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdPrimeraNecesidadVentas(?)}");
                ps.setInt(1, venta.getIdProducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     
                     info[0] = rs.getInt("idventas");
                     info[1] = "PRIMERA NECESIDAD";
                     info[2] = rs.getInt("idproducto_primera_necesidad");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info);
                    
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorIdSegundaNecesidadVentas(?)}");
                ps.setInt(1, venta.getIdProducto());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idventas");
                     info[1] = "SEGUNDA NECESIDAD";
                     info[2] = rs.getInt("idproducto_segunda_necesidad");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info);
                    
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

}

public static void filtrarPorRangoFechaVenta(Venta venta, DefaultTableModel modelo)
{
    con = Conexion.getConexion();
    Object info[] = new Object[6];
    
    switch(venta.getTipoProducto())
    {
        case "ALIMENTOS":
            
            try {
                
                ps = con.prepareCall("{call pedirPorRFVentasAlimentos(?,?)}");
                ps.setDate(1, venta.getRangoFechaInicial());
                ps.setDate(2, venta.getRangoFechaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idventas");
                     info[1] = "ALIMENTOS";
                     info[2] = rs.getInt("idalimento");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info);
                     
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;

        case "DESECHABLES":
            
            try {
                
                ps = con.prepareCall("{call pedirPorRFVentasDesechables(?,?)}");
                ps.setDate(1, venta.getRangoFechaInicial());
                ps.setDate(2, venta.getRangoFechaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                     
                     info[0] = rs.getInt("idventas");
                     info[1] = "DESECHABLES";
                     info[2] = rs.getInt("iddesechable");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info); 
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "PRIMERA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorRFVentasPrimeraNecesidad(?,?)}");
                ps.setDate(1, venta.getRangoFechaInicial());
                ps.setDate(2, venta.getRangoFechaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     
                     info[0] = rs.getInt("idventas");
                     info[1] = "PRIMERA NECESIDAD";
                     info[2] = rs.getInt("idproducto_primera_necesidad");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info);
                    
                }
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
            
        case "SEGUNDA NECESIDAD":
            
            try {
                
                ps = con.prepareCall("{call pedirPorRFVentasSegundaNecesidad(?,?)}");
                ps.setDate(1, venta.getRangoFechaInicial());
                ps.setDate(2, venta.getRangoFechaFinal());
                rs = ps.executeQuery();
                
                while(rs.next())
                {
                    
                     info[0] = rs.getInt("idventas");
                     info[1] = "SEGUNDA NECESIDAD";
                     info[2] = rs.getInt("idproducto_segunda_necesidad");
                     info[3] = 1;
                     info[4] = rs.getDate("fecha_de_venta");
                     info[5] = rs.getFloat("total_venta");
                     
                     modelo.addRow(info);
                    
                    
                }
                
                
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            break;
    }

}



}
