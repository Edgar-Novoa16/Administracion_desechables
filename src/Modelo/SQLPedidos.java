/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Pedidos;
import Vista.ModuloPedidos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class SQLPedidos {
 
    //ATRIBUTOS   
  private static  ResultSet rs;
  private static  Connection con;
  private static PreparedStatement ps;

//MÉTODOS  
public static void insertarPedidoAlimento(Pedido pedido){ //MÉTODO PARA INSERTAR EL PEDIDOALIMENTOS

    
    con = Conexion.getConexion();

    
        try{
 
        ps = con.prepareCall("{call insertarPedidoAlimento(?,?,?,?,?)}");
        ps.setInt(1, pedido.getIdProveedor());
        ps.setInt(2, pedido.getIdProducto());
        ps.setFloat(3, pedido.getCantidad());
        ps.setDate(4, pedido.getFecha_de_llegada());
        ps.setFloat(5, pedido.getPrecio());
        ps.executeUpdate();
   
        ps = con.prepareCall("{call establecer_Cuenta_Clave_PedidoAli}");
        ps.executeUpdate();
               
        ps = con.prepareCall("{call pedirIdPedidoAli}");
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            
            pedido.setIdPedido(rs.getInt("idpedidosali"));
            
        }
        
        ps = con.prepareCall("{call pedirFPPedidosAli(?)}");
        ps.setInt(1, pedido.getIdPedido());
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            
            pedido.setFecha_de_petición(rs.getDate("fecha_de_petición"));
            
        }
        
        JOptionPane.showMessageDialog(null, "Se introdujeron con éxito los siguientes datos del usuario:\n\n\n" + pedido.toString());
    
    }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }
        
    
}
 

public static void insertarPedidoDesechable(Pedido pedido){ //MÉTODO PARA INSERTAR EL PEDIDOALIMENTOS

    
    con = Conexion.getConexion();

    
        try{
 
        ps = con.prepareCall("{call insertarPedidoDesechable(?,?,?,?,?)}");
        ps.setInt(1, pedido.getIdProveedor());
        ps.setInt(2, pedido.getIdProducto());
        ps.setFloat(3, pedido.getCantidad());
        ps.setDate(4, pedido.getFecha_de_llegada());
        ps.setFloat(5, pedido.getPrecio());
        ps.executeUpdate();
   
        ps = con.prepareCall("{call establecer_Cuenta_Clave_PedidoDes}");
        ps.executeUpdate();
               
        ps = con.prepareCall("{call pedirIdPedidoDes}");
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            
            pedido.setIdPedido(rs.getInt("idpedidosdes"));
            
        }
        
        ps = con.prepareCall("{call pedirFPPedidosDes(?)}");
        ps.setInt(1, pedido.getIdPedido());
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            
            pedido.setFecha_de_petición(rs.getDate("fecha_de_petición"));
            
        }
        
        JOptionPane.showMessageDialog(null, "Se introdujeron con éxito los siguientes datos del usuario:\n\n\n" + pedido.toString());
    
    }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }
        
    
}

public static void insertarPedidoPrin(Pedido pedido){ //MÉTODO PARA INSERTAR EL PEDIDOALIMENTOS

    
    con = Conexion.getConexion();

    
        try{
 
        ps = con.prepareCall("{call insertarPedidoPrin(?,?,?,?,?)}");
        ps.setInt(1, pedido.getIdProveedor());
        ps.setInt(2, pedido.getIdProducto());
        ps.setFloat(3, pedido.getCantidad());
        ps.setDate(4, pedido.getFecha_de_llegada());
        ps.setFloat(5, pedido.getPrecio());
        ps.executeUpdate();
   
        ps = con.prepareCall("{call establecer_Cuenta_Clave_PedidoPrin}");
        ps.executeUpdate();
               
        ps = con.prepareCall("{call pedirIdPedidoPrin}");
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            
            pedido.setIdPedido(rs.getInt("idpedidosprin"));
            
        }
        
        ps = con.prepareCall("{call pedirFPPedidosPrin(?)}");
        ps.setInt(1, pedido.getIdPedido());
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            
            pedido.setFecha_de_petición(rs.getDate("fecha_de_petición"));
            
        }
        
        JOptionPane.showMessageDialog(null, "Se introdujeron con éxito los siguientes datos del usuario:\n\n\n" + pedido.toString());
    
    }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }
        
    
}
    
public static void insertarPedidoPsn(Pedido pedido){ //MÉTODO PARA INSERTAR EL PEDIDOALIMENTOS

    
    con = Conexion.getConexion();

    
        try{
 
        ps = con.prepareCall("{call insertarPedidoPsn(?,?,?,?,?)}");
        ps.setInt(1, pedido.getIdProveedor());
        ps.setInt(2, pedido.getIdProducto());
        ps.setFloat(3, pedido.getCantidad());
        ps.setDate(4, pedido.getFecha_de_llegada());
        ps.setFloat(5, pedido.getPrecio());
        ps.executeUpdate();
   
        ps = con.prepareCall("{call establecer_Cuenta_Clave_PedidoPsn}");
        ps.executeUpdate();
               
        ps = con.prepareCall("{call pedirIdPedidoPsn}");
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            
            pedido.setIdPedido(rs.getInt("idpedidospsn"));
            
        }
        
        ps = con.prepareCall("{call pedirFPPedidosPsn(?)}");
        ps.setInt(1, pedido.getIdPedido());
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            
            pedido.setFecha_de_petición(rs.getDate("fecha_de_petición"));
            
        }
        
        JOptionPane.showMessageDialog(null, "Se introdujeron con éxito los siguientes datos del usuario:\n\n\n" + pedido.toString());
    
    }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }
        
    
}    


public static void modificarPedidoAlimento(Pedido pedido)//MÉTODO PARA MODIFICAR EL PEDIDO.
{

     con = Conexion.getConexion();
    
     try{
        
         
            ps = con.prepareCall("{call modificarPedidoAli(?,?,?,?,?,?,?)}");
            ps.setInt(1, pedido.getIdPedido());
            ps.setInt(2, pedido.getIdProveedor());
            ps.setInt(3, pedido.getIdProducto());
            ps.setFloat(4, pedido.getCantidad());
            ps.setDate(5, pedido.getFecha_de_petición());
            ps.setDate(6, pedido.getFecha_de_llegada());
            ps.setFloat(7, pedido.getPrecio());
            
            ps.executeUpdate();
            
     }catch(SQLException ex)
     {
          
         JOptionPane.showMessageDialog(null, ex.toString());
         
     }
   
}

public static void modificarPedidoDesechable(Pedido pedido)//MÉTODO PARA MODIFICAR EL PEDIDO.
{

     con = Conexion.getConexion();
    
     try{
        
         
            ps = con.prepareCall("{call modificarPedidoDes(?,?,?,?,?,?,?)}");
            ps.setInt(1, pedido.getIdPedido());
            ps.setInt(2, pedido.getIdProveedor());
            ps.setInt(3, pedido.getIdProducto());
            ps.setFloat(4, pedido.getCantidad());
            ps.setDate(5, pedido.getFecha_de_petición());
            ps.setDate(6, pedido.getFecha_de_llegada());
            ps.setFloat(7, pedido.getPrecio());
            
            ps.executeUpdate();
            
     }catch(SQLException ex)
     {
          
         JOptionPane.showMessageDialog(null, ex.toString());
         
     }
    
}

public static void modificarPedidoPrin(Pedido pedido)//MÉTODO PARA MODIFICAR EL PEDIDO.
{

     con = Conexion.getConexion();
    
     try{
        
         
            ps = con.prepareCall("{call modificarPedidoPrin(?,?,?,?,?,?,?)}");
            ps.setInt(1, pedido.getIdPedido());
            ps.setInt(2, pedido.getIdProveedor());
            ps.setInt(3, pedido.getIdProducto());
            ps.setFloat(4, pedido.getCantidad());
            ps.setDate(5, pedido.getFecha_de_petición());
            ps.setDate(6, pedido.getFecha_de_llegada());
            ps.setFloat(7, pedido.getPrecio());
            
            ps.executeUpdate();
            
     }catch(SQLException ex)
     {
          
         JOptionPane.showMessageDialog(null, ex.toString());
         
     }
    
}

public static void modificarPedidoPsn(Pedido pedido)//MÉTODO PARA MODIFICAR EL PEDIDO.
{

     con = Conexion.getConexion();
    
     try{
        
         
            ps = con.prepareCall("{call modificarPedidoPsn(?,?,?,?,?,?,?)}");
            ps.setInt(1, pedido.getIdPedido());
            ps.setInt(2, pedido.getIdProveedor());
            ps.setInt(3, pedido.getIdProducto());
            ps.setFloat(4, pedido.getCantidad());
            ps.setDate(5, pedido.getFecha_de_petición());
            ps.setDate(6, pedido.getFecha_de_llegada());
            ps.setFloat(7, pedido.getPrecio());
            
            ps.executeUpdate();
            
     }catch(SQLException ex)
     {
          
         JOptionPane.showMessageDialog(null, ex.toString());
         
     }
    
}

public static void eliminarPedidoAli(String idpedidosali)
{
        
    con = Conexion.getConexion();
    
    try{
    
        ps = con.prepareCall("{call eliminarPedidoAli(?)}");
        ps.setString(1, idpedidosali);
        ps.executeUpdate();
        
    }catch(SQLException ex)
    {
        
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }
    
}

public static void eliminarPedidoDes(String idpedidosdes)
{
        
    con = Conexion.getConexion();
    
    try{
    
        ps = con.prepareCall("{call eliminarPedidoDes(?)}");
        ps.setString(1, idpedidosdes);
        ps.executeUpdate();
        
    }catch(SQLException ex)
    {
        
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }
    
}

public static void eliminarPedidoPrin(String idpedidosprin)
{
        
    con = Conexion.getConexion();
    
    try{
    
        ps = con.prepareCall("{call eliminarPedidoPrin(?)}");
        ps.setString(1, idpedidosprin);
        ps.executeUpdate();
        
    }catch(SQLException ex)
    {
        
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }
    
}

public static void eliminarPedidoPsn(String idpedidospsn)
{
        
    con = Conexion.getConexion();
    
    try{
    
        ps = con.prepareCall("{call eliminarPedidoPsn(?)}");
        ps.setString(1, idpedidospsn);
        ps.executeUpdate();
        
    }catch(SQLException ex)
    {
        
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }
    
}


public static void pedirIdPedidoAlimentos(Pedido pedido)
{
    
    con = Conexion.getConexion();
     
     try{
     
        ps = con.prepareStatement("{call ConsultarPedidoAli(?,?,?,?,?)}");
        ps.setInt(1, pedido.getIdProveedor());
        ps.setInt(2, pedido.getIdProducto());
        ps.setFloat(3, pedido.getCantidad());
        ps.setDate(4, pedido.getFecha_de_llegada());
        ps.setFloat(5, pedido.getPrecio());
        
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            pedido.setIdPedido(rs.getInt("idpedidosali"));
            pedido.setFecha_de_petición(rs.getDate("fecha_de_petición"));
        }
        
     
     
     }catch(SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     }
    
}

public static void pedirIdPedidoDesechables(Pedido pedido)
{
    
    con = Conexion.getConexion();
     
     try{
     
        ps = con.prepareStatement("{call ConsultarPedidoDes(?,?,?,?,?)}");
        ps.setInt(1, pedido.getIdProveedor());
        ps.setInt(2, pedido.getIdProducto());
        ps.setFloat(3, pedido.getCantidad());
        ps.setDate(4, pedido.getFecha_de_llegada());
        ps.setFloat(5, pedido.getPrecio());
        
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            pedido.setIdPedido(rs.getInt("idpedidosdes"));
            pedido.setFecha_de_petición(rs.getDate("fecha_de_petición"));
        }
        
     
     
     }catch(SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     }
    
}

public static void pedirIdPedidoPrin(Pedido pedido)
{
    
    con = Conexion.getConexion();
     
     try{
     
        ps = con.prepareStatement("{call ConsultarPedidoPrin(?,?,?,?,?)}");
        ps.setInt(1, pedido.getIdProveedor());
        ps.setInt(2, pedido.getIdProducto());
        ps.setFloat(3, pedido.getCantidad());
        ps.setDate(4, pedido.getFecha_de_llegada());
        ps.setFloat(5, pedido.getPrecio());
        
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            pedido.setIdPedido(rs.getInt("idpedidosprin"));
            pedido.setFecha_de_petición(rs.getDate("fecha_de_petición"));
        }
        
     
     
     }catch(SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     }
    
}

public static void pedirIdPedidoPsn(Pedido pedido)
{
    
    con = Conexion.getConexion();
     
     try{
     
        ps = con.prepareStatement("{call ConsultarPedidoPsn(?,?,?,?,?)}");
        ps.setInt(1, pedido.getIdProveedor());
        ps.setInt(2, pedido.getIdProducto());
        ps.setFloat(3, pedido.getCantidad());
        ps.setDate(4, pedido.getFecha_de_llegada());
        ps.setFloat(5, pedido.getPrecio());
        
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            pedido.setIdPedido(rs.getInt("idpedidospsn"));
            pedido.setFecha_de_petición(rs.getDate("fecha_de_petición"));
        }
        
     
     
     }catch(SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
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


public static void filtrarTodosPedidosAli(ModuloPedidos pd, DefaultTableModel modelo)
 {
    
     con = Conexion.getConexion();
     Object info[] = new Object[8];
     
     
     
     try{
         
         ps = con.prepareCall("{call pedirTodosPedidosAli}");

         rs = ps.executeQuery();
         
         while(rs.next())
         {
             //ALIMENTOS
             info[0] = String.valueOf(rs.getInt("idpedidosali"));
             info[1] = String.valueOf(rs.getInt("idalimento"));
             info[2] = String.valueOf(rs.getInt("idproveedores"));
             info[3] = "ALIMENTOS";
             info[4] = String.valueOf(rs.getInt("cantidad"));
             info[5] = rs.getDate("fecha_de_petición");
             info[6] = rs.getDate("fecha_de_llegada");
             info[7] = String.valueOf(rs.getFloat("precio"));
             
             modelo.addRow(info);
             
         }
     }catch(SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     }
 }     


 public static void filtrarTodosPedidosDes(ModuloPedidos pd, DefaultTableModel modelo)
 {
    
     con = Conexion.getConexion();
     Object info[] = new Object[8];

         try{   
         ps = con.prepareCall("{call pedirTodosPedidosDes}");

         rs = ps.executeQuery();
         
         while(rs.next())
         {
             //DESECHABLES
             info[0] = String.valueOf(rs.getInt("idpedidosdes"));
             info[1] = String.valueOf(rs.getInt("iddesechable"));
             info[2] = String.valueOf(rs.getInt("idproveedores"));
             info[3] = "DESECHABLES";
             info[4] = String.valueOf(rs.getInt("cantidad"));
             info[5] = rs.getDate("fecha_de_petición");
             info[6] = rs.getDate("fecha_de_llegada");
             info[7] = String.valueOf(rs.getFloat("precio"));
             
             modelo.addRow(info);
             
         }
         }catch(SQLException ex)
         {
             
             JOptionPane.showMessageDialog(null, ex.toString());
             
         }    
 }        
  
 
 public static void filtrarTodosPedidosPrin(ModuloPedidos pd, DefaultTableModel modelo)
 {
    
     con = Conexion.getConexion();
     Object info[] = new Object[8];

   
      try
      {   
        
        ps = con.prepareCall("{call pedirTodosPedidosPrin}");
        rs = ps.executeQuery();
         
         while(rs.next())
         {
             //PRIMERA NECESIDAD
             info[0] = String.valueOf(rs.getInt("idpedidosprin"));
             info[1] = String.valueOf(rs.getInt("idproducto_primera_necesidad"));
             info[2] = String.valueOf(rs.getInt("idproveedores"));
             info[3] = "PRIMERA NECESIDAD";
             info[4] = String.valueOf(rs.getInt("cantidad"));
             info[5] = rs.getDate("fecha_de_petición");
             info[6] = rs.getDate("fecha_de_llegada");
             info[7] = String.valueOf(rs.getFloat("precio"));
             
             modelo.addRow(info);
             
         }
         
         }catch(SQLException ex)
         {
             
             JOptionPane.showMessageDialog(null, ex.toString());
             
         }
 }
 
 
 public static void filtrarTodosPedidosPsn(ModuloPedidos pd, DefaultTableModel modelo)
 {
    
     con = Conexion.getConexion();
     String info[] = new String[8];

         try{   
  
         ps = con.prepareCall("{call pedirTodosPedidosPsn}");

         rs = ps.executeQuery();
         
         while(rs.next())
         {
             //SEGUNDA NECESIDAD
             info[0] = String.valueOf(rs.getInt("idpedidospsn"));
             info[1] = String.valueOf(rs.getInt("idproducto_segunda_necesidad"));
             info[2] = String.valueOf(rs.getInt("idproveedores"));
             info[3] = "SEGUNDA NECESIDAD";
             info[4] = String.valueOf(rs.getInt("cantidad"));
             info[5] = rs.getDate("fecha_de_petición").toString();
             info[6] = rs.getDate("fecha_de_llegada").toString();
             info[7] = String.valueOf(rs.getFloat("precio"));
             
             modelo.addRow(info);
             
         }
         
         }catch(SQLException ex)
         {
             
             JOptionPane.showMessageDialog(null, ex.toString());
             
         }
 }
     
 
 public static void filtrarAlgunosPedidos(ModuloPedidos pd, DefaultTableModel modelo)
 {
     con = Conexion.getConexion();
     Object info[] = new Object[8];
     
     switch(pd.getJcmbPP().getSelectedItem().toString())
     {
         
         case "ALIMENTOS":
             
             try {
          
                 ps = con.prepareCall("{call consultarAlgunosPedidosAli(?)}");
                 ps.setInt(1, pd.getPedido().getCantidadFiltros());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "ALIMENTOS";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
          
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;

             
         case "DESECHABLES":

            try {
          
                 ps = con.prepareCall("{call consultarAlgunosPedidosDes(?)}");
                 ps.setInt(1, pd.getPedido().getCantidadFiltros());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "DESECHABLES";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }

          
            } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             
             break;
             
         case "PRIMERA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarAlgunosPedidosPrin(?)}");
                 ps.setInt(1, pd.getPedido().getCantidadFiltros());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "PRIMERA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;
             
         case "SEGUNDA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarAlgunosPedidosPsn(?)}");
                 ps.setInt(1, pd.getPedido().getCantidadFiltros());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "SEGUNDA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }     
             break;
             
     }
     
 }
 
 public static void filtrarRDPPedidos(ModuloPedidos pd, DefaultTableModel modelo)
 {
     con = Conexion.getConexion();
     Object info[] = new Object[8];
     
     switch(pd.getJcmbPP().getSelectedItem().toString())
     {
         
         case "ALIMENTOS":
             
             try {
          
                 ps = con.prepareCall("{call consultarRDPPedidosAli(?,?)}");
                 ps.setDate(1, pd.getPedido().getRangoInicial());
                 ps.setDate(2, pd.getPedido().getRangoFinal());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "ALIMENTOS";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
          
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;

             
         case "DESECHABLES":

            try {
          
                 ps = con.prepareCall("{call consultarRDPPedidosDes(?,?)}");
                 ps.setDate(1, pd.getPedido().getRangoInicial());
                 ps.setDate(2, pd.getPedido().getRangoFinal());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "DESECHABLES";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }

          
            } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             
             break;
             
         case "PRIMERA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarRDPPedidosPrin(?,?)}");
                 ps.setDate(1, pd.getPedido().getRangoInicial());
                 ps.setDate(2, pd.getPedido().getRangoFinal());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "PRIMERA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;
             
         case "SEGUNDA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarRDPPedidosPsn(?,?)}");
                 ps.setDate(1, pd.getPedido().getRangoInicial());
                 ps.setDate(2, pd.getPedido().getRangoFinal());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "SEGUNDA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }     
             break;
             
     }
     
 }
 
 public static void filtrarRDLLPedidos(ModuloPedidos pd, DefaultTableModel modelo)
 {
     con = Conexion.getConexion();
     Object info[] = new Object[8];
     
     switch(pd.getJcmbPP().getSelectedItem().toString())
     {
         
         case "ALIMENTOS":
             
             try {
                 
                 ps = con.prepareCall("{call consultarRDLLPedidosAli(?,?)}");
                 ps.setDate(1, pd.getPedido().getRangoInicial());
                 ps.setDate(2, pd.getPedido().getRangoFinal());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "ALIMENTOS";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
          
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;

             
         case "DESECHABLES":

            try {
          
                 ps = con.prepareCall("{call consultarRDLLPedidosDes(?,?)}");
                 ps.setDate(1, pd.getPedido().getRangoInicial());
                 ps.setDate(2, pd.getPedido().getRangoFinal());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "DESECHABLES";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }

          
            } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             
             break;
             
         case "PRIMERA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarRDLLPedidosPrin(?,?)}");
                 ps.setDate(1, pd.getPedido().getRangoInicial());
                 ps.setDate(2, pd.getPedido().getRangoFinal());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "PRIMERA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;
             
         case "SEGUNDA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarRDLLPedidosPsn(?,?)}");
                 ps.setDate(1, pd.getPedido().getRangoInicial());
                 ps.setDate(2, pd.getPedido().getRangoFinal());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "SEGUNDA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }     
             break;
             
     }
     
 }
 
 public static void filtrarPrecioPedidos(ModuloPedidos pd, DefaultTableModel modelo)
 {
     con = Conexion.getConexion();
     Object info[] = new Object[8];
     
     switch(pd.getJcmbPP().getSelectedItem().toString())
     {
         
         case "ALIMENTOS":
             
             try {
          
                 ps = con.prepareCall("{call consultarPrecioPedidosAli(?,?)}");
                 ps.setFloat(1, pd.getPedido().getRangoPrecioInicial());
                 ps.setFloat(2, pd.getPedido().getRangoPrecioFinal());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "ALIMENTOS";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
          
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;

             
         case "DESECHABLES":

            try {
          
                 ps = con.prepareCall("{call consultarPrecioPedidosDes(?,?)}");
                 ps.setFloat(1, pd.getPedido().getRangoPrecioInicial());
                 ps.setFloat(2, pd.getPedido().getRangoPrecioFinal());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "DESECHABLES";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }

          
            } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             
             break;
             
         case "PRIMERA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarPrecioPedidosPrin(?,?)}");
                 ps.setFloat(1, pd.getPedido().getRangoPrecioInicial());
                 ps.setFloat(2, pd.getPedido().getRangoPrecioFinal());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "PRIMERA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;
             
         case "SEGUNDA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarPrecioPedidosPsn(?,?)}");
                 ps.setFloat(1, pd.getPedido().getRangoPrecioInicial());
                 ps.setFloat(2, pd.getPedido().getRangoPrecioFinal());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "SEGUNDA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }     
             break;
             
     }
     
 }
 
 public static void filtrarIDPedidos(ModuloPedidos pd, DefaultTableModel modelo)
 {
     con = Conexion.getConexion();
     Object info[] = new Object[8];
     
     switch(pd.getJcmbPP().getSelectedItem().toString())
     {
         
         case "ALIMENTOS":
             
             try {
          
                 ps = con.prepareCall("{call consultarIdPedidosAli(?)}");
                 ps.setInt(1, pd.getPedido().getIdPedido());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "ALIMENTOS";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
          
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;

             
         case "DESECHABLES":

            try {
          
                 ps = con.prepareCall("{call consultarIdPedidosDes(?)}");
                 ps.setInt(1, pd.getPedido().getIdPedido());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "DESECHABLES";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }

          
            } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             
             break;
             
         case "PRIMERA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarIdPedidosPrin(?)}");
                 ps.setInt(1, pd.getPedido().getIdPedido());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "PRIMERA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;
             
         case "SEGUNDA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarIdPedidosPsn(?)}");
                 ps.setInt(1, pd.getPedido().getIdPedido());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "SEGUNDA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }     
             break;
             
     }
     
 }
 
 public static void filtrarIDProductoPedidos(ModuloPedidos pd, DefaultTableModel modelo)
 {
     con = Conexion.getConexion();
     Object info[] = new Object[8];
     
     switch(pd.getJcmbPP().getSelectedItem().toString())
     {
         
         case "ALIMENTOS":
             
             try {
          
                 ps = con.prepareCall("{call consultarIdProductoPedidosAli(?)}");
                 ps.setInt(1, pd.getPedido().getIdProducto());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "ALIMENTOS";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
          
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;

             
         case "DESECHABLES":

            try {
          
                 ps = con.prepareCall("{call consultarIdProductoPedidosDes(?)}");
                 ps.setInt(1, pd.getPedido().getIdProducto());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "DESECHABLES";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }

          
            } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             
             break;
             
         case "PRIMERA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarIdProductoPedidosPrin(?)}");
                 ps.setInt(1, pd.getPedido().getIdProducto());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "PRIMERA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;
             
         case "SEGUNDA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarIdProductoPedidosPsn(?)}");
                 ps.setInt(1, pd.getPedido().getIdProducto());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "SEGUNDA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }     
             break;
             
     }
     
 }
 
 public static void filtrarIDProveedorPedidos(ModuloPedidos pd, DefaultTableModel modelo)
 {
     con = Conexion.getConexion();
     Object info[] = new Object[8];
     
     switch(pd.getJcmbPP().getSelectedItem().toString())
     {
         
         case "ALIMENTOS":
             
             try {
          
                 ps = con.prepareCall("{call consultarIdProveedorPedidosAli(?)}");
                 ps.setInt(1, pd.getPedido().getIdProveedor());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosali");
                     info[1] = rs.getInt("idalimento");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "ALIMENTOS";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
          
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;

             
         case "DESECHABLES":

            try {
          
                 ps = con.prepareCall("{call consultarIdProveedorPedidosDes(?)}");
                 ps.setInt(1, pd.getPedido().getIdProveedor());
                 rs = ps.executeQuery();
                 
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosdes");
                     info[1] = rs.getInt("iddesechable");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "DESECHABLES";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }

          
            } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             
             break;
             
         case "PRIMERA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarIdProveedorPedidosPrin(?)}");
                 ps.setInt(1, pd.getPedido().getIdProveedor());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidosprin");
                     info[1] = rs.getInt("idproducto_primera_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "PRIMERA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }
             break;
             
         case "SEGUNDA NECESIDAD":

            try {
          
                 ps = con.prepareCall("{call consultarIdProveedorPedidosPsn(?)}");
                 ps.setInt(1, pd.getPedido().getIdProveedor());
                 rs = ps.executeQuery();
          
                 while(rs.next())
                 {
                     
                     info[0] = rs.getInt("idpedidospsn");
                     info[1] = rs.getInt("idproducto_segunda_necesidad");
                     info[2] = rs.getInt("idproveedores");
                     info[3] = "SEGUNDA NECESIDAD";
                     info[4] = rs.getFloat("cantidad");
                     info[5] = rs.getDate("fecha_de_petición");
                     info[6] = rs.getDate("fecha_de_llegada");
                     info[7] = rs.getFloat("precio");
                     
                     modelo.addRow(info);
                     
                 }
                 
             } catch (SQLException ex) {
                 
                 JOptionPane.showMessageDialog(null, ex.toString());
                 
             }     
             break;
             
     }
     
 }
 
 
 
}
