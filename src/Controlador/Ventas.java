/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.SQLVentas;
import Modelo.Venta;
import Vista.ModuloVentas;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marco
 */
public class Ventas {
    
    DefaultTableModel modelo;    
    boolean mod = false;
    int fila;
    boolean  aux = false;

    public boolean obtenerInformacion(ModuloVentas vs){
     
    
     
     String TipoProducto = vs.getJcmbTipoProductoVenta().getSelectedItem().toString();
     String claveProducto = vs.getJtxtClaveProductoVenta().getText();
     String cantidadProducto = vs.getJtxtCantidadVenta().getText();
     String totalVenta = vs.getJtxtTotalDeVenta().getText();
      
     if(claveProducto.equals("CLAVE PRODUCTO") || vs.getJtxtCantidadVenta().equals("      CANTIDAD")|| vs.getJtxtTotalDeVenta().equals("          TOTAL"))
      {
          
          return false;
          
      }else
      {
     
        vs.getVenta().setTipoProducto(TipoProducto);
        vs.getVenta().setIdProducto(Integer.parseInt(claveProducto));
        vs.getVenta().setCantidadVendida(Float.parseFloat(cantidadProducto));
        vs.getVenta().setTotalVenta(Float.parseFloat(totalVenta));
        
          
          
        this.restaurarPanel(vs);
        
        return true;
      }
     
    }
    
public void restaurarPanel(ModuloVentas vs)
{
        vs.getButtonGroup1().clearSelection();
        vs.getJcmbFiltroTipoProductoVenta().setEnabled(false);
        vs.getBtnFiltrar().setEnabled(false);
        vs.getJtxtFiltrarAlgunasVentasInicial().setEnabled(false);
        vs.getJtxtFiltrarAlgunasVentasInicial().setText("");
        vs.getJtxtFiltrarAlgunasVentasFinal().setEnabled(false);
        vs.getJtxtFiltrarAlgunasVentasFinal().setText("");
        vs.getJtxtFiltrarPorIdProducto().setEnabled(false);
        vs.getJtxtFiltrarPorIdProducto().setText("");
        vs.getJdtFiltrarPorFechaVentaInicial().setDate(null);
        vs.getJdtFiltrarPorFechaVentaInicial().setEnabled(false);
        vs.getJdtFiltrarPorFechaVentaFinal().setDate(null);
        vs.getJdtFiltrarPorFechaVentaFinal().setEnabled(false);
        vs.getJcmbFiltroTipoProductoVenta().setSelectedIndex(0);
        vs.getJcmbTipoProductoVenta().setSelectedIndex(0);
        vs.getJtxtCantidadVenta().setText("      CANTIDAD");
        vs.getJtxtClaveProductoVenta().setText("CLAVE PRODUCTO");
        vs.getJtxtTotalDeVenta().setText("          TOTAL");
    
}

    public void cargarTablaPedidos(ModuloVentas vs)
    {
        
        this.modelo = (DefaultTableModel) vs.getJtblVentas().getModel();
        Object info[] = new Object[6];
        
        info[0] = String.valueOf(vs.getVenta().getIdVentas());
        info[1] = String.valueOf(vs.getVenta().getTipoProducto());
        info[2] = String.valueOf(vs.getVenta().getIdProducto());
        info[3] = "1";
        info[4] = String.valueOf(vs.getVenta().getFechaVenta());
        info[5] = String.valueOf(vs.getVenta().getTotalVenta());
        
        modelo.addRow(info);
      
    }

    public void agregarRegistroVenta(ModuloVentas vs)
    {
        
        SQLVentas.insertarVenta(vs.getVenta());
        
        int j = vs.getVenta().getIdVentas() + 1;

        vs.getVenta().setIdVentas(j);
        vs.getVenta().setTotalVenta(vs.getVenta().getTotalVenta()/vs.getVenta().getCantidadVendida());
        
        if(this.aux == false)
        {
         
            for(int i = 0; i < vs.getVenta().getCantidadVendida(); i++)
            {   
        
                
                this.cargarTablaPedidos(vs);
                j++;
                vs.getVenta().setIdVentas(j);
                

                
            }
            
            
            
        }else
        {
        
        for(int i = 0; i < vs.getVenta().getCantidadVendida(); i++)
        {
        
            this.cargarTablaPedidos(vs);
            SQLVentas.pedirUltimoId(vs);
        
        }
        
        
        
        }
    }

    public void EliminarRegistroVenta(ModuloVentas vs)
    {
        
        fila = vs.getJtblVentas().getSelectedRow();
        String idVenta  = String.valueOf(vs.getJtblVentas().getValueAt(fila, 0));
        String tipoProducto = String.valueOf(vs.getJtblVentas().getValueAt(fila, 1));
        int idProducto =  Integer.parseInt(vs.getJtblVentas().getValueAt(fila, 2).toString());
        float cantidadVendida = Float.parseFloat(vs.getJtblVentas().getValueAt(fila, 3).toString());
        SQLVentas.eliminarVenta(idVenta, tipoProducto, idProducto, cantidadVendida);
        this.modelo.removeRow(fila);
        this.aux = true;
        
    }

    public void cancelarEdicionVentas(ModuloVentas vs)
    {
        
        this.mod = false;
        if(vs.getJtblVentas().getSelectedRow() >= 0 )
        {    
            
            vs.getJtblVentas().removeRowSelectionInterval(fila, fila);
        
        }
        this.restaurarPanel(vs);
    }    
    
/*public void modificarVenta(ModuloVentas vs)
{
    
    this.fila = vs.getJtblVentas().getSelectedRow();
    Object info[] = new Object[6]; 
    boolean des;
    
    if(this.mod == false)
    {
        
        this.modelo = (DefaultTableModel) vs.getJtblVentas().getModel();
        
        vs.getJcmbTipoProductoVenta().setSelectedItem(this.modelo.getValueAt(fila, 1));
        vs.getJtxtClaveProductoVenta().setText(this.modelo.getValueAt(fila, 2).toString());
        vs.getJtxtCantidadVenta().setText(this.modelo.getValueAt(fila, 3).toString());
        vs.getJtxtTotalDeVenta().setText(this.modelo.getValueAt(fila, 5).toString());
        this.mod = true;
        
    }else
    {
        des = this.obtenerInformacion(vs);
        
        if(des == false)
        {
            
            JOptionPane.showMessageDialog(null, "Llena los campos correspondientes");
            
        }else
        {
            vs.getVenta().setIdVentas(Integer.parseInt(this.modelo.getValueAt(fila, 0).toString()));
            vs.getVenta().setFechaVenta((java.sql.Date) this.modelo.getValueAt(fila, 4));
            
            info[0] = vs.getVenta().getIdVentas();
            info[1] = vs.getVenta().getTipoProducto();
            info[2] = vs.getVenta().getIdProducto();
            info[3] = vs.getVenta().getCantidadVendida();
            info[4] = vs.getVenta().getFechaVenta();
            info[5] = vs.getVenta().getTotalVenta();
                    
            for(int i = 0; i < vs.getJtblVentas().getColumnCount(); i++)
            {
                        
                this.modelo.setValueAt(info[i], fila, i);
                        
            }                
            
            SQLVentas.modificarVenta(vs.getVenta());
            this.mod = false;
            
        }
        
        
        
    }
    
    
}
*/    
public void establecerTotalVenta(ModuloVentas vs)
{
    
    float totalPrecio = SQLVentas.consultarPrecioVenta(Integer.parseInt(vs.getJtxtClaveProductoVenta().getText()), vs.getJcmbTipoProductoVenta().getSelectedItem().toString());
    totalPrecio *= Float.parseFloat(vs.getJtxtCantidadVenta().getText());
    vs.getJtxtTotalDeVenta().setText(String.valueOf(totalPrecio));
    
    
}

public boolean establecerCantidadProducto(ModuloVentas vs)
{
    
    
   float cantidadProducto = SQLVentas.consultarCantidadProducto(vs.getJtxtClaveProductoVenta().getText(), vs.getJcmbTipoProductoVenta().getSelectedItem().toString());

   if(cantidadProducto == 0)
   {
       JOptionPane.showMessageDialog(null, "No tienes productos en el almacen");
       vs.getJtxtCantidadVenta().setText("      CANTIDAD");
       vs.getJtxtTotalDeVenta().setText("          TOTAL");
       return false;
       
   }else if(cantidadProducto > 0 && cantidadProducto < Float.parseFloat(vs.getJtxtCantidadVenta().getText()))
   {
       JOptionPane.showMessageDialog(null, "No tienes esa cantidad del producto en el almacen");
       vs.getJtxtCantidadVenta().setText("      CANTIDAD");
       vs.getJtxtTotalDeVenta().setText("          TOTAL");
       return false;
       
   }else
   {
       
       return true;
       
   }
    
    
    
}

public void traerTodasLasVentas(ModuloVentas vs)
{
    
    this.modelo = (DefaultTableModel) vs.getJtblVentas().getModel();
    SQLVentas.filtrarTodasLasVentas(vs.getJcmbFiltroTipoProductoVenta().getSelectedItem().toString(), modelo);
    
}


public void traerAlgunasVentas(ModuloVentas vs)
{
    
    this.modelo = (DefaultTableModel) vs.getJtblVentas().getModel();
    vs.getVenta().setCantidadVentasInicial(Integer.parseInt(vs.getJtxtFiltrarAlgunasVentasInicial().getText()));
    vs.getVenta().setCantidadVentasFinal(Integer.parseInt(vs.getJtxtFiltrarAlgunasVentasFinal().getText()));
    vs.getVenta().setTipoProducto(vs.getJcmbFiltroTipoProductoVenta().getSelectedItem().toString());
    SQLVentas.filtrarAlgunasVentas(vs.getVenta(), modelo);
    
}

public void traerPorIdProducto(ModuloVentas vs)
{
    
    this.modelo = (DefaultTableModel) vs.getJtblVentas().getModel();
    vs.getVenta().setIdProducto(Integer.parseInt(vs.getJtxtFiltrarPorIdProducto().getText()));
    vs.getVenta().setTipoProducto(vs.getJcmbFiltroTipoProductoVenta().getSelectedItem().toString());
    SQLVentas.filtrarPorIdProducto(vs.getVenta(), modelo);
    
}

public void traerPorFechaVenta(ModuloVentas vs)
{
    
    this.modelo = (DefaultTableModel) vs.getJtblVentas().getModel();
    Date f = vs.getJdtFiltrarPorFechaVentaInicial().getDate();
        
        long a = f.getTime();
        java.sql.Date RFI = new java.sql.Date(a);
        
    Date g = vs.getJdtFiltrarPorFechaVentaFinal().getDate();
    
        long b = g.getTime();
        java.sql.Date RFF = new java.sql.Date(b);
    
    vs.getVenta().setRangoFechaInicial(RFI);
    vs.getVenta().setRangoFechaFinal(RFF);
    vs.getVenta().setTipoProducto(vs.getJcmbFiltroTipoProductoVenta().getSelectedItem().toString());
    SQLVentas.filtrarPorRangoFechaVenta(vs.getVenta(), this.modelo);
        
}

public void consultar(ModuloVentas vs)
{
    
    if(vs.getJrbFiltrarTodasLasVentas().isSelected())
    {
    
        this.limpiarTabla(vs);
        this.traerTodasLasVentas(vs);
        
    }else if(vs.getJrbFiltrarAlgunasVentas().isSelected())
    {
        
        this.limpiarTabla(vs);
        this.traerAlgunasVentas(vs);
        
    }else if(vs.getJrbFiltrarPorIdProducto().isSelected())
    {
        
        this.limpiarTabla(vs);
        this.traerPorIdProducto(vs);
        
    }else if(vs.getJrbFiltrarPorFechaVenta().isSelected())
    {
        
        this.limpiarTabla(vs);
        this.traerPorFechaVenta(vs);
        
    }
    
}

public void limpiarTabla(ModuloVentas vs)
{
    
    this.modelo = (DefaultTableModel) vs.getJtblVentas().getModel();
    int filas = this.modelo.getRowCount();
    
    for(int i = 0; filas > i; i++)
    {
        
        this.modelo.removeRow(0);
        
    }
    
}
    
    
}



