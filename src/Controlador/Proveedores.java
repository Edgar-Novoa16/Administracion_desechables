package Controlador;

import Modelo.SQLProveedores;
import Vista.ModuloProveedores;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Proveedores {

    DefaultTableModel modelo;    
    boolean mod = false;
    int fila;

public boolean obtenerInformacion(ModuloProveedores ps)
{
     String nombreProveedor = ps.getJtxtNombreProveedor().getText();
     String calleProveedor = ps.getJtxtCalleProveedor().getText();
     String numeroProveedor = ps.getJtxtNumeroCalle().getText();
     String coloniaProveedor = ps.getJtxtColoniaProveedor().getText();
     String codigoPostalProveedor = ps.getJtxtCodigoPostalProveedor().getText();
     String municipioProveedor = ps.getJtxtMunicipioProveedor().getText();
     String estadoProveedor = ps.getJtxtEstadoProveedor().getText();
     String numeroContactoProveedor = ps.getJtxtNumeroDeContacto().getText();
     String situacionProveedor = ps.getJcmbSituacionProveedor().getSelectedItem().toString();
    
    if(nombreProveedor.equals("                         NOMBRE") || calleProveedor.equals("                CALLE") || numeroProveedor.equals("        NUMERO")
       || coloniaProveedor.equals("              COLONIA") || ps.getJtxtCodigoPostalProveedor().equals("           C.P") || municipioProveedor.equals("           MUNICIPIO")
       || estadoProveedor.equals("           ESTADO") || ps.getJtxtNumeroDeContacto().equals("              NUMERO DE CONTACTO"))
    {
        
        return false;
        
    }else{
        
        ps.getProveedor().setNombreProveedor(nombreProveedor);
        ps.getProveedor().setCalleProveedor(calleProveedor);
        ps.getProveedor().setNumero(numeroProveedor);
        ps.getProveedor().setColoniaProveedor(coloniaProveedor);
        ps.getProveedor().setCodigoPostalProveedor(codigoPostalProveedor);
        ps.getProveedor().setMunicipio(municipioProveedor);
        ps.getProveedor().setEstadoProveedor(estadoProveedor);
        ps.getProveedor().setNumeroContacto(numeroContactoProveedor);
        ps.getProveedor().setSituacionProveedor(situacionProveedor);
        
        this.restaurarPanel(ps);
        
        return true;
        
    }
    
    
}

public void restaurarPanel(ModuloProveedores ps)
{
    
    ps.getJtxtNombreProveedor().setText("                         NOMBRE");
    ps.getJtxtCalleProveedor().setText("                CALLE");
    ps.getJtxtNumeroCalle().setText("        NUMERO");
    ps.getJtxtColoniaProveedor().setText("              COLONIA");
    ps.getJtxtCodigoPostalProveedor().setText("           C.P");
    ps.getJtxtMunicipioProveedor().setText("           MUNICIPIO");
    ps.getJtxtEstadoProveedor().setText("           ESTADO");
    ps.getJtxtNumeroDeContacto().setText("              NUMERO DE CONTACTO");
    ps.getJcmbSituacionProveedor().setSelectedIndex(0);
    ps.getJcmbFiltrarPorSituacion().setEnabled(false);
    ps.getJtxtFiltrarAlgunosProveedoresFinal().setEnabled(false);
    ps.getJtxtFiltrarAlgunosProveedoresFinal().setText("");
    ps.getJtxtFiltrarAlgunosProveedoresInicial().setEnabled(false);
    ps.getJtxtFiltrarAlgunosProveedoresInicial().setText("");
    ps.getJtxtFiltrarPorIdProveedor().setEnabled(false);
    ps.getJtxtFiltrarPorIdProveedor().setText("");
    ps.getJtxtFiltrarPorNombreProveedor().setEnabled(false);
    ps.getJtxtFiltrarPorNombreProveedor().setText("");
    ps.getJtxtFiltroCalleProveedor().setEnabled(false);
    ps.getJtxtFiltroCalleProveedor().setText("Calle");
    ps.getJtxtFiltroCodigoPostalProveedor().setEnabled(false);
    ps.getJtxtFiltroCodigoPostalProveedor().setText("C.P");
    ps.getJtxtFiltroColoniaProveedor().setEnabled(false);
    ps.getJtxtFiltroColoniaProveedor().setText("Colonia");
    ps.getJtxtFiltroEstadoProveedor().setEnabled(false);
    ps.getJtxtFiltroEstadoProveedor().setText("Estado");
    ps.getJtxtFiltroMunicipioProveedor().setEnabled(false);
    ps.getJtxtFiltroMunicipioProveedor().setText("Municipio");
    ps.getJtxtFiltroNumeroCasaProveedor().setEnabled(false);
    ps.getJtxtFiltroNumeroCasaProveedor().setText("Numero");
    ps.getBtnFiltrarProveedor().setEnabled(false);
    ps.getButtonGroup1().clearSelection();
    
}

 public void cargarTablaProveedores(ModuloProveedores ps)
    {
        
        modelo = (DefaultTableModel) ps.getJtblProveedores().getModel();
        Object info[] = new Object[10];
        
        info[0] = String.valueOf(ps.getProveedor().getIdProveedor());
        info[1] = ps.getProveedor().getNombreProveedor();
        info[2] = String.valueOf(ps.getProveedor().getCalleProveedor());
        info[3] = ps.getProveedor().getNumero();
        info[4] = ps.getProveedor().getColoniaProveedor();
        info[5] = ps.getProveedor().getCodigoPostalProveedor();
        info[6] = ps.getProveedor().getMunicipio();
        info[7] = ps.getProveedor().getEstadoProveedor();
        info[8] = ps.getProveedor().getSituacionProveedor();
        info[9] = ps.getProveedor().getNumeroContacto();
        
        modelo.addRow(info);
       
      
    }

 public void agregarRegistroProveedor(ModuloProveedores ps)
 {
     
     String decision = "v1";
     int des = 0;
     boolean dec;
     
     dec = SQLProveedores.comprobarNombreProveedor(ps.getProveedor());
     
     if(dec == false)
     {
         
         JOptionPane.showMessageDialog(null, "El proveedor ya existe.");
         
     }else
     {
     
     dec = SQLProveedores.comprobarEstadoProveedor(ps.getProveedor());
     if(dec == false)
     {
         decision = "v2";
         des++;
     }
     
     dec = SQLProveedores.comprobarMunicipioProveedor(ps.getProveedor());
     if(dec == false)
     {
         decision = "v3";
         des++;
     }
     
     if(des == 2)
     {
         decision = "v4";
     }
         
     SQLProveedores.insertarProveedores(ps.getProveedor(), decision);
     JOptionPane.showMessageDialog(null, "Registro completado. Acabas de registrar lo siguiente:\n" + ps.getProveedor().toString());
     this.cargarTablaProveedores(ps);
    
     }
     
 }
 
public void cancelarEdicionProveedores(ModuloProveedores ps)
{
        
        this.mod = false;
        if(ps.getJtblProveedores().getSelectedRow() >= 0 )
        {    
        ps.getJtblProveedores().removeRowSelectionInterval(fila, fila);
        
        }
        this.restaurarPanel(ps);
}
 
public void modificarProveedor(ModuloProveedores ps)
{
    
    this.fila = ps.getJtblProveedores().getSelectedRow();
    Object info[] = new Object[10]; 
    boolean des = false;
    
    if(this.mod == false)
    {
        
        this.modelo = (DefaultTableModel) ps.getJtblProveedores().getModel();
        ps.getJtxtNombreProveedor().setText(this.modelo.getValueAt(fila, 1).toString());
        ps.getJtxtCalleProveedor().setText(this.modelo.getValueAt(fila, 2).toString());
        ps.getJtxtNumeroCalle().setText(this.modelo.getValueAt(fila, 3).toString());
        ps.getJtxtColoniaProveedor().setText(this.modelo.getValueAt(fila, 4).toString());
        ps.getJtxtCodigoPostalProveedor().setText(this.modelo.getValueAt(fila, 5).toString());
        ps.getJtxtMunicipioProveedor().setText(this.modelo.getValueAt(fila, 6).toString());
        ps.getJtxtEstadoProveedor().setText(this.modelo.getValueAt(fila, 7).toString());
        ps.getJcmbSituacionProveedor().setSelectedItem(this.modelo.getValueAt(fila, 8).toString());
        ps.getJtxtNumeroDeContacto().setText(this.modelo.getValueAt(fila, 9).toString());

        this.mod = true;
        
    }else
    {
        des = this.obtenerInformacion(ps);
        
        if(des == false)
        {
            
            JOptionPane.showMessageDialog(null, "Llena lso campos correspondientes");
            
        }else
        {
            ps.getProveedor().setIdProveedor(Integer.parseInt(this.modelo.getValueAt(fila, 0).toString()));
                    
            info[0] = ps.getProveedor().getIdProveedor();
            info[1] = ps.getProveedor().getNombreProveedor();
            info[2] = ps.getProveedor().getCalleProveedor();
            info[3] = ps.getProveedor().getNumero();
            info[4] = ps.getProveedor().getColoniaProveedor();
            info[5] = ps.getProveedor().getCodigoPostalProveedor();
            info[6] = ps.getProveedor().getMunicipio();
            info[7] = ps.getProveedor().getEstadoProveedor();
            info[8] = ps.getProveedor().getSituacionProveedor();
            info[9] = ps.getProveedor().getNumeroContacto();
                    
            for(int i = 0; i < this.modelo.getColumnCount(); i++)
            {
                        
                modelo.setValueAt(info[i], fila, i);
                        
            }                
            
            SQLProveedores.modificarProveedor(ps.getProveedor());
            this.mod = false;
            
        }
        
        
        
    }
    
    
}

public void consultar(ModuloProveedores ps)
{
    
    if(ps.getJrbFiltrarTodosLosProveedores().isSelected())
    {
        
        this.limpiarTabla(ps);
        this.modelo = (DefaultTableModel) ps.getJtblProveedores().getModel();
        SQLProveedores.filtrarTodosLosProveedores(this.modelo);
        
    }else if(ps.getJrbFiltrarAlgunosProveedores().isSelected())
    {
        
        this.limpiarTabla(ps);
        this.modelo = (DefaultTableModel) ps.getJtblProveedores().getModel();
        ps.getProveedor().setCantidadInicial(Integer.parseInt(ps.getJtxtFiltrarAlgunosProveedoresInicial().getText()));
        ps.getProveedor().setCantidadFinal(Integer.parseInt(ps.getJtxtFiltrarAlgunosProveedoresFinal().getText()));
        SQLProveedores.filtrarAlgunosProveedores(ps.getProveedor(), this.modelo);
        
        
    }else if(ps.getJrbFiltrarPorIdProveedor().isSelected())
    {
        
        this.limpiarTabla(ps);
        this.modelo = (DefaultTableModel) ps.getJtblProveedores().getModel();
        ps.getProveedor().setIdProveedor(Integer.parseInt(ps.getJtxtFiltrarPorIdProveedor().getText()));
        SQLProveedores.filtrarIdProveedores(ps.getProveedor(), modelo);
        
        
    }else if(ps.getJrbFiltrarPorNombreProveedor().isSelected())
    {
        
        this.limpiarTabla(ps);
        this.modelo = (DefaultTableModel) ps.getJtblProveedores().getModel();
        ps.getProveedor().setNombreProveedor(ps.getJtxtFiltrarPorNombreProveedor().getText());
        SQLProveedores.filtrarNombreProveedores(ps.getProveedor(), modelo);
        
        
    }else if(ps.getJrbFiltrarPorSituacion().isSelected())
    {
        
        this.limpiarTabla(ps);
        this.modelo = (DefaultTableModel) ps.getJtblProveedores().getModel();
        ps.getProveedor().setSituacionProveedor(ps.getJcmbFiltrarPorSituacion().getSelectedItem().toString());
        SQLProveedores.filtrarSituacionProveedores(ps.getProveedor(), modelo);
        
    }else if(ps.getJrbFiltrarPorDireccion().isSelected())
    {
        
        this.limpiarTabla(ps);
        this.modelo = (DefaultTableModel) ps.getJtblProveedores().getModel();
        
        if(ps.getJtxtFiltroCalleProveedor().getText().equals("Calle") || ps.getJtxtFiltroCalleProveedor().getText().equals("") || ps.getJtxtFiltroNumeroCasaProveedor().getText().equals("Numero")
          || ps.getJtxtFiltroNumeroCasaProveedor().getText().equals("") || ps.getJtxtFiltroColoniaProveedor().getText().equals("Colonia") || ps.getJtxtFiltroColoniaProveedor().getText().equals("")
          || ps.getJtxtFiltroCodigoPostalProveedor().getText().equals("C.P") || ps.getJtxtFiltroCodigoPostalProveedor().getText().equals("") || ps.getJtxtFiltroMunicipioProveedor().getText().equals("Municipio")
          || ps.getJtxtFiltroMunicipioProveedor().getText().equals("") || ps.getJtxtFiltroEstadoProveedor().getText().equals("Estado") || ps.getJtxtFiltroEstadoProveedor().getText().equals(""))
        {
            
            JOptionPane.showMessageDialog(null, "Por favor, llena los campos");
            
        }else
        {
        
        ps.getProveedor().setCalleProveedor(ps.getJtxtFiltroCalleProveedor().getText());
        ps.getProveedor().setNumero(ps.getJtxtFiltroNumeroCasaProveedor().getText());
        ps.getProveedor().setColoniaProveedor(ps.getJtxtFiltroColoniaProveedor().getText());
        ps.getProveedor().setCodigoPostalProveedor(ps.getJtxtFiltroCodigoPostalProveedor().getText());
        ps.getProveedor().setMunicipio(ps.getJtxtFiltroMunicipioProveedor().getText());
        ps.getProveedor().setEstadoProveedor(ps.getJtxtFiltroEstadoProveedor().getText());
        SQLProveedores.filtrarDireccionProveedores(ps.getProveedor(), modelo);
        
        }
    }
    
}

public void limpiarTabla(ModuloProveedores ps)
{
    
    this.modelo = (DefaultTableModel) ps.getJtblProveedores().getModel();
    int filas = this.modelo.getRowCount();
    
    for(int i = 0; filas > i; i++)
    {
        
        this.modelo.removeRow(0);
        
    }
    
}

}
