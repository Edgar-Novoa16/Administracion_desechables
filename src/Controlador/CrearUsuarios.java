package Controlador;

import Modelo.SQLUsuarios;
import Vista.ModuloCrearUsuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrearUsuarios {

    
    //ATRIBUTOS
    
    DefaultTableModel modelo;    
    boolean mod = false;
    int fila;
    
    //MÉTODOS.

    public boolean obtenerinformación(ModuloCrearUsuario cs){
     
        
      String nombreU = cs.getJtxtNombreU().getText();
      String contraseñaU = cs.getJtxtContraseñaU().getText();
      String estadoU = (String)cs.getJcmbEstadoU().getSelectedItem();
      String privilegioU = (String) cs.getJcmbPrivilegio().getSelectedItem();
      
      
      if(nombreU.equals("           NOMBRE DEL USUARIO ") || contraseñaU.equals("         CONTRASEÑA DEL USUARIO"))
      {
          return false;
          
      }else
      {
        
        
        cs.getUsuario().setNombre_de_usuario(nombreU);
        cs.getUsuario().setContraseña_de_usuario(contraseñaU);
        cs.getUsuario().setEstado_del_usuario(estadoU);
        cs.getUsuario().setPrivilegio_de_usuario(privilegioU);
        this.restaurarPanel(cs);
        
        return true;
      }
     
    }

    public void restaurarPanel(ModuloCrearUsuario cs){
     
        cs.getJtxtNombreU().setText("           NOMBRE DEL USUARIO ");
        cs.getJtxtContraseñaU().setText("         CONTRASEÑA DEL USUARIO");
        cs.getJcmbEstadoU().setSelectedIndex(0);
        cs.getJcmbPrivilegio().setSelectedIndex(0);
        cs.getButtonGroup1().clearSelection();
        cs.getJtxtCantidad().setText("");
        cs.getJtxtCantidad().setEnabled(false);
        cs.getJtxtEAU().setText("");
        cs.getJtxtEAU().setEnabled(false);
        cs.getJtxtIDU().setText("");
        cs.getJtxtIDU().setEnabled(false);
        cs.getJtxtNDU().setText("");
        cs.getJtxtNDU().setEnabled(false);
        cs.getJtxtPDU().setText("");
        cs.getJtxtPDU().setEnabled(false);
        cs.getBtnFiltrarU().setEnabled(false);
        
        
        
    }
    
    public void cargarTablaUsuarios(ModuloCrearUsuario cs)
    {
        
        modelo = (DefaultTableModel) cs.getJtblUsuarios().getModel();
        String info[] = new String[5];
        
        info[0] = String.valueOf(cs.getUsuario().getIdUsuario());
        info[1] = cs.getUsuario().getNombre_de_usuario();
        info[2] = cs.getUsuario().getContraseña_de_usuario();
        info[3] = cs.getUsuario().getEstado_del_usuario();
        info[4] = cs.getUsuario().getPrivilegio_de_usuario();
        
        modelo.addRow(info);
      
        
        
    }
    
    public void modificarRegistro(ModuloCrearUsuario cs)
    {
        
        this.fila = cs.getJtblUsuarios().getSelectedRow();
        String info[] = new String[5]; 
        
        
        
        
        
        if(this.mod == false)
        {
            modelo = (DefaultTableModel) cs.getJtblUsuarios().getModel();
            cs.getJtxtNombreU().setText(cs.getJtblUsuarios().getValueAt(fila, 1).toString());
            cs.getJtxtContraseñaU().setText(cs.getJtblUsuarios().getValueAt(fila, 2).toString());
            cs.getJcmbEstadoU().setSelectedItem(cs.getJtblUsuarios().getValueAt(fila, 3).toString());
            cs.getJcmbPrivilegio().setSelectedItem(cs.getJtblUsuarios().getValueAt(fila, 4).toString());
            this.mod = true;
            
        }else
        {
            
            this.obtenerinformación(cs);
            SQLUsuarios.pedirIdUsuario(cs);
            
            info[0] = String.valueOf(cs.getUsuario().getIdUsuario());
            info[1] = cs.getUsuario().getNombre_de_usuario();
            info[2] = cs.getUsuario().getContraseña_de_usuario();
            info[3] = cs.getUsuario().getEstado_del_usuario();
            info[4] = cs.getUsuario().getPrivilegio_de_usuario();
            
            for(int i = 0; i < cs.getJtblUsuarios().getColumnCount(); i++)
            {
                
                modelo.setValueAt(info[i], fila, i);
                
            }
            
            SQLUsuarios.modificarUsuario(cs.getUsuario());
            this.mod = false;
            
            
        }
        
        
    }
    
    public void verificarCamposSeleccionados(ModuloCrearUsuario cs)
    {
        
        if(cs.getJtblUsuarios().getSelectedRow() >= 0)
        {
            cs.getBtnModificar().setEnabled(true);
            cs.getBtnEliminar().setEnabled(true);
            
        }else
        {
            cs.getBtnModificar().setEnabled(false);
            cs.getBtnEliminar().setEnabled(false);
        }
        
    }
    
    public void cancelarEdicionUsuarios(ModuloCrearUsuario cs)
    {
        
        this.mod = false;
        if(cs.getJtblUsuarios().getSelectedRow() >= 0)
        {
            
            cs.getJtblUsuarios().removeRowSelectionInterval(fila, fila);
            
        }
        
        this.restaurarPanel(cs);
        
        
        
    }
    
    public void EliminarRegistroUsuario(ModuloCrearUsuario cs)
    {
        
        fila = cs.getJtblUsuarios().getSelectedRow();
        
        SQLUsuarios.eliminarUsuario(cs.getJtblUsuarios().getValueAt(fila, 0).toString());
        modelo.removeRow(fila);
        
    }
    
    public void ConsultarTodosLosUsuarios(ModuloCrearUsuario cs)
    {
        
        modelo = (DefaultTableModel) cs.getJtblUsuarios().getModel();
        SQLUsuarios.filtrarTodosUsuarios(cs, modelo);
        
    }
    
    public void consultarCantidadDeUsuarios(ModuloCrearUsuario cs)
    {
        
        cs.getUsuario().setFiltroCantidadUsuarios(Integer.parseInt(cs.getJtxtCantidad().getText()));
        modelo = (DefaultTableModel) cs.getJtblUsuarios().getModel();
        SQLUsuarios.filtrarAlgunosUsuarios(cs, modelo);
        
    }
    
    public void consultarUsuariosPorNombre(ModuloCrearUsuario cs)
    {
        
        cs.getUsuario().setNombre_de_usuario(cs.getJtxtNDU().getText());
        modelo = (DefaultTableModel) cs.getJtblUsuarios().getModel();
        SQLUsuarios.filtrarUsuariosPorNombre(cs, modelo);
        
    }
    
    
    public void consultarUsuariosPorPrivilegio(ModuloCrearUsuario cs)
    {
        
        cs.getUsuario().setPrivilegio_de_usuario(cs.getJtxtPDU().getText());
        modelo = (DefaultTableModel) cs.getJtblUsuarios().getModel();
        SQLUsuarios.filtrarUsuariosPorPrivilegio(cs, modelo);
        
    }
    
    
    public void consultarUsuariosPorEstado(ModuloCrearUsuario cs)
    {
        
        cs.getUsuario().setEstado_del_usuario(cs.getJtxtEAU().getText());
        modelo = (DefaultTableModel) cs.getJtblUsuarios().getModel();
        SQLUsuarios.filtrarUsuariosPorEstado(cs, modelo);
        
    }
    
    
    public void consultarUsuariosPorId(ModuloCrearUsuario cs)
    {
        
        cs.getUsuario().setIdUsuario(Integer.parseInt(cs.getJtxtIDU().getText()));
        modelo = (DefaultTableModel) cs.getJtblUsuarios().getModel();
        SQLUsuarios.filtrarUsuariosPorId(cs, modelo);
        
    }
    
    public void activarTxtCantidad(ModuloCrearUsuario cs)
    {
        
        cs.getJtxtEAU().setEnabled(false);
        cs.getJtxtIDU().setEnabled(false);
        cs.getJtxtNDU().setEnabled(false);
        cs.getJtxtPDU().setEnabled(false);
        cs.getBtnFiltrarU().setEnabled(true);
        cs.getJtxtCantidad().setEnabled(true);
        
    }
    
    public void activarTxtNDU(ModuloCrearUsuario cs)
    {
        
       
        cs.getJtxtEAU().setEnabled(false);
        cs.getJtxtIDU().setEnabled(false);
        cs.getJtxtCantidad().setEnabled(false);
        cs.getJtxtPDU().setEnabled(false);
        
        cs.getJtxtNDU().setEnabled(true);
        cs.getBtnFiltrarU().setEnabled(true);
        
    }
    
    public void activarTxtPDU(ModuloCrearUsuario cs)
    {
        
        
        cs.getJtxtEAU().setEnabled(false);
        cs.getJtxtIDU().setEnabled(false);
        cs.getJtxtCantidad().setEnabled(false);
        cs.getJtxtNDU().setEnabled(false);
        
        cs.getBtnFiltrarU().setEnabled(true);
        cs.getJtxtPDU().setEnabled(true);
        
    }
    
    public void activarTxtEDU(ModuloCrearUsuario cs)
    {
        
        
        cs.getJtxtPDU().setEnabled(false);
        cs.getJtxtIDU().setEnabled(false);
        cs.getJtxtCantidad().setEnabled(false);
        cs.getJtxtNDU().setEnabled(false);

        cs.getBtnFiltrarU().setEnabled(true);
        cs.getJtxtEAU().setEnabled(true);
        
    }
    
    public void activarTxtIDU(ModuloCrearUsuario cs)
    {
        cs.getJtxtEAU().setEnabled(false);
        cs.getJtxtPDU().setEnabled(false);
        cs.getJtxtCantidad().setEnabled(false);
        cs.getJtxtNDU().setEnabled(false);
        
        cs.getBtnFiltrarU().setEnabled(true);
        cs.getJtxtIDU().setEnabled(true);
        
    }
    
    public void descativarTxt(ModuloCrearUsuario cs)
    {
        
        cs.getJtxtCantidad().setText("");
        cs.getJtxtCantidad().setEnabled(false);
        cs.getJtxtEAU().setText("");
        cs.getJtxtEAU().setEnabled(false);
        cs.getJtxtIDU().setText("");
        cs.getJtxtIDU().setEnabled(false);
        cs.getJtxtNDU().setText("");
        cs.getJtxtNDU().setEnabled(false);
        cs.getJtxtPDU().setText("");
        cs.getJtxtPDU().setEnabled(false);    
        cs.getBtnFiltrarU().setEnabled(true);
        
    }

    public void limpiarTabla(ModuloCrearUsuario cs)
    {
        
        this.modelo = (DefaultTableModel) cs.getJtblUsuarios().getModel();
        int filas = modelo.getRowCount();
        
        
        for(int i = 0; filas > i; i++)
        {
            
            modelo.removeRow(0);
            
        }
        
    }

    
}
