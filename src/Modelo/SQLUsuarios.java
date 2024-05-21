package Modelo;

import Vista.ModuloCrearUsuario;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class SQLUsuarios {

//ATRIBUTOS   
  private static  ResultSet rs;
  private static  Connection con;
  private static PreparedStatement ps;

//MÉTODOS  
public static void insertarUsuario(Usuario usuario){ //MÉTODO PARA INSERTAR EL USUARIO

    
    con = Conexion.getConexion();

    
    try{
    
    ps = con.prepareStatement("select contraseña_de_usuario from administracion_desechables.usuarios where nombre_de_usuario = ?");
    ps.setString(1, usuario.getNombre_de_usuario());
    
    rs = ps.executeQuery();
    
    if(rs.next())
    {
        JOptionPane.showMessageDialog(null, "El usuario ya existe, por favor introduce uno nuevo.");
    }else
    {
        try{
 
        ps = con.prepareCall("{call insertarUsuario (?,?,?,?)}");
        ps.setString(1, usuario.getEstado_del_usuario());
        ps.setString(2, usuario.getNombre_de_usuario());
        ps.setString(3, usuario.getContraseña_de_usuario());
        ps.setString(4, usuario.getPrivilegio_de_usuario());
        ps.executeUpdate();
   
        ps = con.prepareCall("{call establecer_Cuenta_Clave}");
        ps.executeUpdate();
               
        ps = con.prepareStatement("{call ConsultarUsuario(?)}");
        ps.setString(1, usuario.getNombre_de_usuario());
        rs = ps.executeQuery();
        
        if(rs.next())
        {
        usuario.setIdUsuario(rs.getInt("idusuario"));
        }
        
        JOptionPane.showMessageDialog(null, "Se introdujeron con éxito los siguientes datos del usuario:\n\n\n" + usuario.toString());
    
    }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }
        
    }
    
    }catch(SQLException ex)
    {
      
        JOptionPane.showMessageDialog(null, ex.toString());
       
    }
    
    
    
    
}

public static void modificarUsuario(Usuario usuario)//MÉTODO PARA MODIFICAR EL USUARIO.
{

     con = Conexion.getConexion();
    
     try{
        
         
            ps = con.prepareCall("{call modificarUsuario(?,?,?,?,?)}");
            ps.setString(1, usuario.getEstado_del_usuario());
            ps.setString(2, usuario.getNombre_de_usuario());
            ps.setString(3, usuario.getContraseña_de_usuario());
            ps.setString(4, usuario.getPrivilegio_de_usuario());
            ps.setInt(5, usuario.getIdUsuario());
            
            ps.executeUpdate();
            
     }catch(SQLException ex)
     {
          
         JOptionPane.showMessageDialog(null, ex.toString());
         
     }
    
    
    
   
}

public static void eliminarUsuario(String idusuario)
{
        
    con = Conexion.getConexion();
    
    try{
    
        ps = con.prepareCall("{call eliminarUsuario(?)}");
        ps.setString(1, idusuario);
        ps.executeUpdate();
        
    }catch(SQLException ex)
    {
        
        JOptionPane.showMessageDialog(null, ex.toString());
        
    }
    
}

public static boolean consultarUsuario(Usuario usuario)
{
    
    con = Conexion.getConexion();
    
    
    try{
    
    ps = con.prepareCall("{call ConsultarUsuario(?)}");
    ps.setString(1, usuario.getNombre_de_usuario());
    rs = ps.executeQuery();
    
    
    if(rs.next())
    {
        if(usuario.getContraseña_de_usuario().equals(rs.getString("contraseña_de_usuario")))
        {
            usuario.setEstado_del_usuario(rs.getString("estado_del_usuario"));
            usuario.setPrivilegio_de_usuario(rs.getString("privilegio_de_usuario"));
            
            
            return true;
        }else
        {
            return false;
        }
    }else
    {
        return false;
    }
       
    
    }catch(SQLException e)
    {
        JOptionPane.showMessageDialog(null, e.toString());
        return false;
    }

}

 public static void pedirIdUsuario(ModuloCrearUsuario cs)
 {
     
     con = Conexion.getConexion();
     
     try{
     ps = con.prepareCall("{call pedirIdUsuario(?)}");
     ps.setString(1, cs.getUsuario().getNombre_de_usuario());
     rs = ps.executeQuery();
     
     if(rs.next())
     {
         
         cs.getUsuario().setIdUsuario(rs.getInt("idusuario"));
         
     }
     
     
     }catch(SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     }
     
 }

 public static void filtrarTodosUsuarios(ModuloCrearUsuario cs, DefaultTableModel modelo)
 {
    
     con = Conexion.getConexion();
     String info[] = new String[5];
     
     
     
     try{
         
         ps = con.prepareCall("{call pedirTodosLosUsuarios}");

         rs = ps.executeQuery();
         
         while(rs.next())
         {
             
             info[0] = String.valueOf(rs.getInt("idusuario"));
             info[1] = rs.getString("nombre_de_usuario");
             info[2] = rs.getString("contraseña_de_usuario");
             info[3] = rs.getString("estado_del_usuario");
             info[4] = rs.getString("privilegio_de_usuario");
             
             modelo.addRow(info);
             
         }
         
     }catch(SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     }
     
 }
 
 public static void filtrarAlgunosUsuarios(ModuloCrearUsuario cs, DefaultTableModel modelo)
 {
    
     con = Conexion.getConexion();
     String info[] = new String[5];
     
     
     
     try{
         
         ps = con.prepareCall("{call pedirAlgunosUsuarios(?)}");
         ps.setInt(1, cs.getUsuario().getFiltroCantidadUsuarios());
         
         rs = ps.executeQuery();
         
         while(rs.next())
         {
             
             info[0] = String.valueOf(rs.getInt("idusuario"));
             info[1] = rs.getString("nombre_de_usuario");
             info[2] = rs.getString("contraseña_de_usuario");
             info[3] = rs.getString("estado_del_usuario");
             info[4] = rs.getString("privilegio_de_usuario");
             
             modelo.addRow(info);
             
         }
         
     }catch(SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     }
     
 }
 
 
 public static void filtrarUsuariosPorNombre(ModuloCrearUsuario cs, DefaultTableModel modelo)
 {
    
     con = Conexion.getConexion();
     String info[] = new String[5];
     
     
     
     try{
         
         ps = con.prepareCall("{call pedirUsuariosPorNombre(?)}");
         ps.setString(1, cs.getUsuario().getNombre_de_usuario());
         
         rs = ps.executeQuery();
         
         while(rs.next())
         {
             
             info[0] = String.valueOf(rs.getInt("idusuario"));
             info[1] = rs.getString("nombre_de_usuario");
             info[2] = rs.getString("contraseña_de_usuario");
             info[3] = rs.getString("estado_del_usuario");
             info[4] = rs.getString("privilegio_de_usuario");
             
             modelo.addRow(info);
             
         }
         
     }catch(SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     }
     
 }
    
 public static void filtrarUsuariosPorPrivilegio(ModuloCrearUsuario cs, DefaultTableModel modelo)
 {
    
     con = Conexion.getConexion();
     String info[] = new String[5];
     
     
     
     try{
         
         ps = con.prepareCall("{call pedirUsuariosPorPrivilegio(?)}");
         ps.setString(1, cs.getUsuario().getPrivilegio_de_usuario());
         
         rs = ps.executeQuery();
         
         while(rs.next())
         {
             
             info[0] = String.valueOf(rs.getInt("idusuario"));
             info[1] = rs.getString("nombre_de_usuario");
             info[2] = rs.getString("contraseña_de_usuario");
             info[3] = rs.getString("estado_del_usuario");
             info[4] = rs.getString("privilegio_de_usuario");
             
             modelo.addRow(info);
             
         }
         
     }catch(SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     }
     
 }
 
  public static void filtrarUsuariosPorEstado(ModuloCrearUsuario cs, DefaultTableModel modelo)
 {
    
     con = Conexion.getConexion();
     String info[] = new String[5];
     
     
     
     try{
         
         ps = con.prepareCall("{call pedirUsuariosPorEstado(?)}");
         ps.setString(1, cs.getUsuario().getEstado_del_usuario());
         
         rs = ps.executeQuery();
         
         while(rs.next())
         {
             
             info[0] = String.valueOf(rs.getInt("idusuario"));
             info[1] = rs.getString("nombre_de_usuario");
             info[2] = rs.getString("contraseña_de_usuario");
             info[3] = rs.getString("estado_del_usuario");
             info[4] = rs.getString("privilegio_de_usuario");
             
             modelo.addRow(info);
             
         }
         
     }catch(SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     }
     
 }

  public static void filtrarUsuariosPorId(ModuloCrearUsuario cs, DefaultTableModel modelo)
 {
    
     con = Conexion.getConexion();
     String info[] = new String[5];
     
     
     
     try{
         
         ps = con.prepareCall("{call pedirUsuariosPorId(?)}");
         ps.setInt(1, cs.getUsuario().getIdUsuario());
         
         rs = ps.executeQuery();
         
         while(rs.next())
         {
             
             info[0] = String.valueOf(rs.getInt("idusuario"));
             info[1] = rs.getString("nombre_de_usuario");
             info[2] = rs.getString("contraseña_de_usuario");
             info[3] = rs.getString("estado_del_usuario");
             info[4] = rs.getString("privilegio_de_usuario");
             
             modelo.addRow(info);
             
         }
         
     }catch(SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex.toString());
     }
     
 }


}
