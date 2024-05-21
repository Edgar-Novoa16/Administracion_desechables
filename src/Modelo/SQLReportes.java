package Modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SQLReportes {

   private static  ResultSet rs;
   private static  Connection con;
   private static PreparedStatement ps;
   private static final int max = 20;
   
   public static void generarProductosMAV(Reporte reporte)
   {
       
       con = Conexion.getConexion();
       
       try{
  
           //ALIMENTOS
           
           ps = con.prepareCall("{call generarAlimentosMAV(?,?)}");
           ps.setDate(1,  reporte.getFechaInicial());
           ps.setDate(2,  reporte.getFechaFinal());
           rs = ps.executeQuery();

              final int contador = 3; 
               Object alimentosMAV[][] = new Object[contador][2];
               int i = 0;
           
           while(rs.next())
           {
               
                     alimentosMAV[i][0] = rs.getInt("cantidad");
                     alimentosMAV[i][1] = rs.getString("nombre_alimento");
                     i++;
           }
       
           reporte.setAlimentosMAV(alimentosMAV);
           
           //Desechables
           
           ps = con.prepareCall("{call generarDesechablesMAV(?,?)}");
           ps.setDate(1, reporte.getFechaInicial());
           ps.setDate(2, reporte.getFechaFinal());
           rs = ps.executeQuery();
           
           
               
               Object desechablesMAV[][] = new Object[contador][2];
               i = 0;
               
            while(rs.next())
            {
               
                       
                     desechablesMAV[i][0] = rs.getInt("cantidad");
                     desechablesMAV[i][1] = rs.getString("nombre_desechable");
                     i++;   
               
           }
           
            reporte.setDesechablesMAV(desechablesMAV);
            
           //Primera necesidad
           
           ps = con.prepareCall("{call generarPrinMAV(?,?)}");
           ps.setDate(1, reporte.getFechaInicial());
           ps.setDate(2, reporte.getFechaFinal());
           rs = ps.executeQuery();
           
            Object primeraNecesidadMAV[][] = new Object[contador][2];
            i = 0;
            
            while(rs.next())
            {
                       
                     primeraNecesidadMAV[i][0] = rs.getInt("cantidad");
                     primeraNecesidadMAV[i][1] = rs.getString("nombre_producto_primera_necesidad");
                     i++;
           }
           
           reporte.setPrimeraNecesidadMAV(primeraNecesidadMAV);
            
           //Segunda necesidad
           
           ps = con.prepareCall("{call generarPsnMAV(?,?)}");
           ps.setDate(1, reporte.getFechaInicial());
           ps.setDate(2, reporte.getFechaFinal());
           rs = ps.executeQuery();
           
              Object segundaNecesidadMAV[][] = new Object[contador][2];
              i = 0;
              
           while(rs.next())
           {
               segundaNecesidadMAV[i][0] = rs.getInt("cantidad");
               segundaNecesidadMAV[i][1] = rs.getString("nombre_producto_segunda_necesidad");
               i++; 
           }
       
           reporte.setSegundaNecesidadMAV(segundaNecesidadMAV);
           
       }catch(SQLException ex)
       {
           
           JOptionPane.showMessageDialog(null, ex.toString());
           
       }
       
   }
   
   public static void generarProductosMEV(Reporte reporte)
   {
       
       con = Conexion.getConexion();
       
       try{
  
           //ALIMENTOS
           
           ps = con.prepareCall("{call generarAlimentosMEV(?,?)}");
           ps.setDate(1, reporte.getFechaInicial());
           ps.setDate(2, reporte.getFechaFinal());
           rs = ps.executeQuery();

                
               final int contador = 3; 
               Object alimentosMEV[][] = new Object[contador][2];
               int i = 0;
           
           while(rs.next())
           {
               
               alimentosMEV[i][0] = rs.getInt("cantidad");
               alimentosMEV[i][1] = rs.getString("nombre_alimento");
               i++;
               
           }         
               reporte.setAlimentosMEV(alimentosMEV);
               i = 0;
       
           //Desechables
           
           ps = con.prepareCall("{call generarDesechablesMEV(?,?)}");
           ps.setDate(1, reporte.getFechaInicial());
           ps.setDate(2, reporte.getFechaFinal());
           rs = ps.executeQuery();
           
           Object desechablesMEV[][] = new Object[contador][2];
           
           while(rs.next())
           {
               
               desechablesMEV[i][0] = rs.getInt("cantidad");
               desechablesMEV[i][1] = rs.getString("nombre_desechable");
               i++;
               
           }

           reporte.setDesechablesMEV(desechablesMEV);
           i = 0;
           
           //Primera necesidad
           
           ps = con.prepareCall("{call generarPrinMEV(?,?)}");
           ps.setDate(1, reporte.getFechaInicial());
           ps.setDate(2, reporte.getFechaFinal());
           rs = ps.executeQuery();
           
           Object primeraNecesidadMEV[][] = new Object[contador][2];
           
           while(rs.next())
           {

                primeraNecesidadMEV[i][0] = rs.getInt("cantidad");
                primeraNecesidadMEV[i][1] = rs.getString("nombre_producto_primera_necesidad");
                i++;
           }         

           reporte.setPrimeraNecesidadMEV(primeraNecesidadMEV);
           i = 0;
           
           //Segunda necesidad
           
           ps = con.prepareCall("{call generarPsnMEV(?,?)}");
           ps.setDate(1, reporte.getFechaInicial());
           ps.setDate(2, reporte.getFechaFinal());
           rs = ps.executeQuery();
           
           Object segundaNecesidadMEV[][] = new Object[contador][2];

           while(rs.next())
           {
               
               segundaNecesidadMEV[i][0] = rs.getInt("cantidad");
               segundaNecesidadMEV[i][1] = rs.getString("nombre_producto_segunda_necesidad");
               i++;
               
           }         
               
               reporte.setSegundaNecesidadMEV(segundaNecesidadMEV);
               i = 0;
       
       }catch(SQLException ex)
       {
           
           JOptionPane.showMessageDialog(null, ex.toString());
           
       }
       
       
   }

   public static void generarGastos(Reporte reporte)
   {
       
       con = Conexion.getConexion();
       
       try{
           
           //Pedidos
           
           ps = con.prepareCall("{call generarGastosPedidos(?,?)}");
           ps.setDate(1, reporte.getFechaInicial());
           ps.setDate(2, reporte.getFechaFinal());
           rs = ps.executeQuery();
           
           if(rs.next())
           {
           
               reporte.setPedidos(rs.getFloat("total"));
               
           }
           
           //Productos perecederos
           
           ps = con.prepareCall("{call generarGastosPerecederos(?,?)}");
           ps.setDate(1, (Date) reporte.getFechaInicial());
           ps.setDate(2, (Date) reporte.getFechaFinal());
           rs = ps.executeQuery();
           
           if(rs.next())
           {
           
               reporte.setPerecederos(rs.getFloat("total"));
               
           }
           
       }catch(SQLException ex)
       {
           
           JOptionPane.showMessageDialog(null, ex.toString());
           
       }
       
   }
   
   
   public static void generarProductosAPT(Reporte reporte)
   {
       
       con = Conexion.getConexion();
       
       try{
           
           //Alimentos
           
           ps = con.prepareCall("{call generarAlimentosAPT}");
           rs = ps.executeQuery();

           ArrayList<Object> alimentosAPT = new ArrayList();
           
           while(rs.next())
           {
               
                 alimentosAPT.add(rs.getFloat("cantidad_almacen"));
                 alimentosAPT.add(rs.getString("nombre_alimento"));
               
           }
           
           reporte.setAlimentosAPT(alimentosAPT);
           
           //Desechables
           
           ps = con.prepareCall("{call generarDesechablesAPT}");
           rs = ps.executeQuery();
           
           ArrayList<Object> desechablesAPT = new ArrayList();
           
           while(rs.next())
           {
                   
                 desechablesAPT.add(rs.getFloat("cantidad_almacen"));
                 desechablesAPT.add(rs.getString("nombre_desechable"));
                 
           }

           reporte.setDesechablesAPT(desechablesAPT);
           
           //Primera necesidad
           
           ps = con.prepareCall("{call generarPrinAPT}");
           rs = ps.executeQuery();

           ArrayList<Object> primeraNecesidadAPT = new ArrayList();
           
           while(rs.next())
           {
               
                 primeraNecesidadAPT.add(rs.getFloat("cantidad_almacen"));
                 primeraNecesidadAPT.add(rs.getString("nombre_producto_primera_necesidad"));
                 
           }

           reporte.setPrimeraNecesidadAPT(primeraNecesidadAPT);
           
           //Segunda necesidad
           
           ps = con.prepareCall("{call generarPsnAPT}");
           rs = ps.executeQuery();

           ArrayList<Object> segundaNecesidadAPT = new ArrayList();
           
           while(rs.next())
           {
               
                 segundaNecesidadAPT.add(rs.getFloat("cantidad_almacen"));
                 segundaNecesidadAPT.add(rs.getString("nombre_producto_segunda_necesidad"));
                
                 
           }

           reporte.setSegundaNecesidadAPT(segundaNecesidadAPT);
           
       }catch(SQLException ex)
       {
           
           JOptionPane.showMessageDialog(null, ex.toString());
           
       }
       
       
       
   }
   
   public static void generarGanancia(Reporte reporte)
   {
       
       con = Conexion.getConexion();
       
       try{
       
            ps = con.prepareCall("{call generarGanancia(?,?)}");
            ps.setDate(1, reporte.getFechaInicial());
            ps.setDate(2, reporte.getFechaFinal());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                
                reporte.setGanancia(rs.getFloat("total"));
                
            }
            
       }catch(SQLException ex)
       {
       
           JOptionPane.showMessageDialog(null, ex.toString());
           
       }
       
   }
    
}
