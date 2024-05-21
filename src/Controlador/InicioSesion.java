package Controlador;

import Modelo.Conexion;
import vista.Inicio;
import java.sql.*;
import Modelo.Usuario;
import Modelo.SQLUsuarios;
import Vista.Menu_Principal;
import javax.swing.JOptionPane;


public class InicioSesion {
 
    
    private static ResultSet rs;
    private static PreparedStatement ps;
    private static Connection con;
    private static Menu_Principal menu;
    
    public static void obtenerInformacionUsuario(Inicio incs){
        
        Usuario usuario = new Usuario();
        String txtContraseña = new String(incs.getPsContraseña().getPassword());
        
        usuario.setNombre_de_usuario(incs.getTxtUsuario().getText());
        usuario.setContraseña_de_usuario(txtContraseña);
        
      InicioSesion.verificarUsuario(usuario, incs);
        
        
    }
    
    public static void establecerCampoUsuario(Inicio incs)
    {
        
      String txtUsuario;
      
        
      txtUsuario = incs.getTxtUsuario().getText();
      
      if(txtUsuario.equals("              USUARIO"))
      {
          incs.getTxtUsuario().setText("");
          
      }else if(txtUsuario.isEmpty())
      {
      
          incs.getTxtUsuario().setText("              USUARIO");
          
      }
        
    }
    
    public static void verificarUsuario(Usuario usuario, Inicio incs)
    {
        boolean result;
        
        result = SQLUsuarios.consultarUsuario(usuario);
 
        if(result == true)
        {
            
            menu = new Menu_Principal(usuario.getPrivilegio_de_usuario());
            incs.dispose();
            menu.setVisible(true);
            
        }else
        {
           
            JOptionPane.showMessageDialog(null, "El usuario no existe");
            incs.getTxtUsuario().setText("              USUARIO");
            incs.getPsContraseña().setText("");
        } 
        
        
    }
    
    
}
