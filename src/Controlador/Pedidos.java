/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.SQLPedidos;
import Vista.ModuloPedidos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Pedidos {
    
    
    DefaultTableModel modelo;    
    boolean mod = false;
    int fila;

    public boolean obtenerinformación(ModuloPedidos pd){
     
     Date f;
    
     
     String Producto = pd.getJcmbProductos().getSelectedItem().toString();
     String claveProducto = pd.getJtxtIdProducto().getText();
     String claveProveedor = pd.getJtxtIdProveedor().getText();
     String cantidadProducto = pd.getJtxtCantidad().getText();
     String precio = pd.getJtxtPrecio().getText();
      
      if(claveProducto.equals("CLAVE PRODUCTO") || claveProveedor.equals("CLAVE PROVEEDOR") || cantidadProducto.equals("      CANTIDAD")
         || pd.getJdtFechaLlegada().getDate() == null || precio.equals("          PRECIO"))
      {
          
          return false;
          
      }else
      {
     
        f = pd.getJdtFechaLlegada().getDate();
        long a = f.getTime();
        java.sql.Date fecha_de_llegada = new java.sql.Date(a);
        
        pd.getPedido().setTipoProducto(Producto);    
        pd.getPedido().setIdProveedor(Integer.parseInt(claveProveedor));
        pd.getPedido().setIdProducto(Integer.parseInt(claveProducto));
        pd.getPedido().setCantidad(Float.parseFloat(cantidadProducto));
        pd.getPedido().setFecha_de_llegada(fecha_de_llegada);
        pd.getPedido().setPrecio(Float.parseFloat(precio));
          
        this.restaurarPanel(pd);
        
        return true;
      }
     
    }
    
    public void restaurarPanel(ModuloPedidos pd){
     
        pd.getJcmbProductos().setSelectedIndex(0);
        pd.getJtxtIdProducto().setText("CLAVE PRODUCTO");
        pd.getJtxtIdProveedor().setText("CLAVE PROVEEDOR");
        pd.getJtxtCantidad().setText("      CANTIDAD");
        pd.getJdtFechaLlegada().setDate(null);
        pd.getJtxtPrecio().setText("          PRECIO");
        pd.getButtonGroup1().clearSelection();
        pd.getJdtFPF().setDate(null);
        pd.getJdtFPF().setEnabled(false);
        pd.getJdtFPI().setDate(null);
        pd.getJdtFPI().setEnabled(false);
        pd.getJdtFPLLF().setDate(null);
        pd.getJdtFPLLF().setEnabled(false);
        pd.getJdtFPLLI().setDate(null);
        pd.getJdtFPLLI().setEnabled(false);
        pd.getJtxtFCP().setText("");
        pd.getJtxtFCP().setEnabled(false);
        pd.getJtxtFIdPdo().setText("");
        pd.getJtxtFIdPdo().setEnabled(false);
        pd.getJtxtFIdPdto().setText("");
        pd.getJtxtFIdPdto().setEnabled(false);
        pd.getJtxtFIdPvdor().setText("");
        pd.getJtxtFIdPvdor().setEnabled(false);
        pd.getJtxtFPP().setText("");
        pd.getJtxtFPP().setEnabled(false);
        pd.getBtnFiltrar().setEnabled(false);
        pd.getJcmbPP().setSelectedIndex(0);
        
    }
    
    public void cargarTablaPedidos(ModuloPedidos pd)
    {
        
        modelo = (DefaultTableModel) pd.getJtblPedidos().getModel();
        Object info[] = new Object[8];
        
        info[0] = String.valueOf(pd.getPedido().getIdPedido());
        info[1] = String.valueOf(pd.getPedido().getIdProducto());
        info[2] = String.valueOf(pd.getPedido().getIdProveedor());
        info[3] = pd.getPedido().getTipoProducto();
        info[4] = String.valueOf(pd.getPedido().getCantidad());
        info[5] = pd.getPedido().getFecha_de_petición();
        info[6] = String.valueOf(pd.getPedido().getFecha_de_llegada());
        info[7] = String.valueOf(pd.getPedido().getPrecio());
        
        modelo.addRow(info);
      
    }

    
    public void agregarRegistroPedido(ModuloPedidos pd)
    {
        
        switch (pd.getPedido().getTipoProducto()) {

            case "ALIMENTOS":
                
                
                SQLPedidos.insertarPedidoAlimento(pd.getPedido());
                this.cargarTablaPedidos(pd);
                break;

            case "DESECHABLES":
                
                SQLPedidos.insertarPedidoDesechable(pd.getPedido());
                this.cargarTablaPedidos(pd);
                break;

            case "PRIMERA NECESIDAD":

                SQLPedidos.insertarPedidoPrin(pd.getPedido());
                this.cargarTablaPedidos(pd);
                break;

            case "SEGUNDA NECESIDAD":
                
                SQLPedidos.insertarPedidoPsn(pd.getPedido());
                this.cargarTablaPedidos(pd);
                break;

            default:
                break;
        }
        
        
    }
    
    public float calcularPrecioPedido(String tipoProducto, int idProducto, float cantidadProducto){
        
        float precioProducto;
        
        switch(tipoProducto)
        {
            case "ALIMENTOS":
                
                precioProducto = SQLPedidos.consultarPrecioAlimento(idProducto);
                precioProducto *= cantidadProducto;
                return precioProducto;
                
            case "DESECHABLES":
                
                precioProducto = SQLPedidos.consultarPrecioDesechable(idProducto);
                precioProducto *= cantidadProducto;
                return precioProducto;
                
            case "PRIMERA NECESIDAD":
                
                precioProducto = SQLPedidos.consultarPrecioPrin(idProducto);
                precioProducto *= cantidadProducto;
                return precioProducto;
                
            case "SEGUNDA NECESIDAD":
                
                precioProducto = SQLPedidos.consultarPrecioPsn(idProducto);
                precioProducto *= cantidadProducto;
                return precioProducto;
                
        }
        
        return 0;
    }
    
    public void establecerPrecioPedido(ModuloPedidos pd)
    {
        
        String tipoProducto = pd.getJcmbProductos().getSelectedItem().toString();
        int idProducto = Integer.parseInt(pd.getJtxtIdProducto().getText());
        float cantidadProducto = Float.parseFloat(pd.getJtxtCantidad().getText());
        
        
        pd.getJtxtPrecio().setText(String.valueOf(this.calcularPrecioPedido(tipoProducto, idProducto, cantidadProducto)));
        
    }
    
    
    public void modificarRegistroPedido(ModuloPedidos pd)
    {
        
        this.fila = pd.getJtblPedidos().getSelectedRow();
        Object info[] = new Object[8]; 
        
        
        
        
        
        if(this.mod == false)
        {
            
            modelo = (DefaultTableModel) pd.getJtblPedidos().getModel();
           
            Date dt;
            try {
                
                dt = new SimpleDateFormat("yyyy-MM-dd").parse(pd.getJtblPedidos().getValueAt(fila, 6).toString());
                JOptionPane.showMessageDialog(null, dt);
                pd.getJdtFechaLlegada().setDate(dt);
                
            
            } catch (ParseException ex) {
               
                JOptionPane.showMessageDialog(null, ex.toString());
                
            }
            
            pd.getJtxtIdProducto().setText(String.valueOf(pd.getJtblPedidos().getValueAt(fila, 1)));
            pd.getJtxtIdProveedor().setText(String.valueOf(pd.getJtblPedidos().getValueAt(fila, 2)));
            pd.getJcmbProductos().setSelectedItem(pd.getJtblPedidos().getValueAt(fila, 3));
            pd.getJtxtCantidad().setText(String.valueOf(pd.getJtblPedidos().getValueAt(fila, 4)));
            pd.getJtxtPrecio().setText(String.valueOf(pd.getJtblPedidos().getValueAt(fila, 7)));
            
            this.mod = true;
            
        }else
        {
            
          boolean des =  this.obtenerinformación(pd);
            if(des == false){
                
                JOptionPane.showMessageDialog(null, "Llena los campos");
                
            }else
            {
            switch (pd.getPedido().getTipoProducto()) {
                case "ALIMENTOS":
                 
                    pd.getPedido().setIdPedido(Integer.parseInt(pd.getJtblPedidos().getValueAt(fila, 0).toString()));
                    pd.getPedido().setFecha_de_petición((java.sql.Date) pd.getJtblPedidos().getValueAt(fila, 5));
                    
                    info[0] = pd.getPedido().getIdPedido();
                    info[1] = pd.getPedido().getIdProducto();
                    info[2] = pd.getPedido().getIdProveedor();
                    info[3] = pd.getPedido().getTipoProducto();
                    info[4] = pd.getPedido().getCantidad();
                    info[5] = pd.getPedido().getFecha_de_petición();
                    info[6] = pd.getPedido().getFecha_de_llegada();
                    info[7] = pd.getPedido().getPrecio();
                    
                    for(int i = 0; i < pd.getJtblPedidos().getColumnCount(); i++)
                    {
                        
                        modelo.setValueAt(info[i], fila, i);
                        
                    }
                    
                    SQLPedidos.modificarPedidoAlimento(pd.getPedido());
                    this.mod = false;
                    break;
                    
                case "DESECHABLES":
                    
                    pd.getPedido().setIdPedido(Integer.parseInt(pd.getJtblPedidos().getValueAt(fila, 0).toString()));
                    pd.getPedido().setFecha_de_petición((java.sql.Date) pd.getJtblPedidos().getValueAt(fila, 5));
                    
                    info[0] = pd.getPedido().getIdPedido();
                    info[1] = pd.getPedido().getIdProducto();
                    info[2] = pd.getPedido().getIdProveedor();
                    info[3] = pd.getPedido().getTipoProducto();
                    info[4] = pd.getPedido().getCantidad();
                    info[5] = pd.getPedido().getFecha_de_petición();
                    info[6] = pd.getPedido().getFecha_de_llegada();
                    info[7] = pd.getPedido().getPrecio();
                    
                    for(int i = 0; i < pd.getJtblPedidos().getColumnCount(); i++)
                    {
                        
                        modelo.setValueAt(info[i], fila, i);
                        
                    }
                    
                    SQLPedidos.modificarPedidoDesechable(pd.getPedido());
                    this.mod = false;
                    break;
                
                case "PRIMERA NECESIDAD":
                
                    pd.getPedido().setIdPedido(Integer.parseInt(pd.getJtblPedidos().getValueAt(fila, 0).toString()));
                    pd.getPedido().setFecha_de_petición((java.sql.Date) pd.getJtblPedidos().getValueAt(fila, 5));
                    
                    info[0] = pd.getPedido().getIdPedido();
                    info[1] = pd.getPedido().getIdProducto();
                    info[2] = pd.getPedido().getIdProveedor();
                    info[3] = pd.getPedido().getTipoProducto();
                    info[4] = pd.getPedido().getCantidad();
                    info[5] = pd.getPedido().getFecha_de_petición();
                    info[6] = pd.getPedido().getFecha_de_llegada();
                    info[7] = pd.getPedido().getPrecio();
                    
                    for(int i = 0; i < pd.getJtblPedidos().getColumnCount(); i++)
                    {
                        
                        modelo.setValueAt(info[i], fila, i);
                        
                    }  
                    
                    SQLPedidos.modificarPedidoPrin(pd.getPedido());
                    this.mod = false;
                    break;
                
                case "SEGUNDA NECESIDAD":
                
                    pd.getPedido().setIdPedido(Integer.parseInt(pd.getJtblPedidos().getValueAt(fila, 0).toString()));
                    pd.getPedido().setFecha_de_petición((java.sql.Date) pd.getJtblPedidos().getValueAt(fila, 5));
                    
                    info[0] = pd.getPedido().getIdPedido();
                    info[1] = pd.getPedido().getIdProducto();
                    info[2] = pd.getPedido().getIdProveedor();
                    info[3] = pd.getPedido().getTipoProducto();
                    info[4] = pd.getPedido().getCantidad();
                    info[5] = pd.getPedido().getFecha_de_petición();
                    info[6] = pd.getPedido().getFecha_de_llegada();
                    info[7] = pd.getPedido().getPrecio();
                    
                    for(int i = 0; i < pd.getJtblPedidos().getColumnCount(); i++)
                    {
                        
                        modelo.setValueAt(info[i], fila, i);
                        
                    }
                    SQLPedidos.modificarPedidoPsn(pd.getPedido());
                    this.mod = false;
                    break;
                
                default:
                    break;
            }
        
        }
             }
        
}


public void verificarCamposSeleccionados(ModuloPedidos pd)
    {
        
        if(pd.getJtblPedidos().getSelectedRow() >= 0)
        {
            pd.getBtnModificarPedido().setEnabled(true);
            pd.getBtnEliminarPedido().setEnabled(true);
            
        }else
        {
            pd.getBtnModificarPedido().setEnabled(false);
            pd.getBtnEliminarPedido().setEnabled(false);
        }
        
    }

public void cancelarEdicionPedidos(ModuloPedidos pd)
{
        
        this.mod = false;
        if(pd.getJtblPedidos().getSelectedRow() >= 0 )
        {    
        pd.getJtblPedidos().removeRowSelectionInterval(fila, fila);
        
        }
        this.restaurarPanel(pd);
}

public void EliminarRegistroUsuario(ModuloPedidos pd)
{
        
        fila = pd.getJtblPedidos().getSelectedRow();
        String tipoProducto = String.valueOf(pd.getJtblPedidos().getValueAt(fila, 3));
        String idpedido = String.valueOf(pd.getJtblPedidos().getValueAt(fila, 0));
        
        switch(tipoProducto)
        {
            case "ALIMENTOS":

                SQLPedidos.eliminarPedidoAli(idpedido);
                modelo.removeRow(fila);
                break;
                
            case "DESECHABLES":
                
                SQLPedidos.eliminarPedidoDes(idpedido);
                modelo.removeRow(fila);
                break;
                
            case "PRIMERA NECESIDAD":
                
                SQLPedidos.eliminarPedidoPrin(idpedido);
                modelo.removeRow(fila);
                break;
                
            case "SEGUNDA NECESIDAD":
                
                SQLPedidos.eliminarPedidoPsn(idpedido);
                modelo.removeRow(fila);
                break;
                
            default:
                break;
        }
        
}
    
public void consultarTodosPedidos(ModuloPedidos pd)
{
    
    modelo = (DefaultTableModel) pd.getJtblPedidos().getModel();
    
    switch(pd.getJcmbPP().getSelectedItem().toString())
    {
        case "ALIMENTOS":
            
            SQLPedidos.filtrarTodosPedidosAli(pd, modelo);
            break;
            
        case "DESECHABLES":
            
            SQLPedidos.filtrarTodosPedidosDes(pd, modelo);
            break;
                
        case "PRIMERA NECESIDAD":
            
            SQLPedidos.filtrarTodosPedidosPrin(pd, modelo);
            break;
        
        case "SEGUNDA NECESIDAD":
            
            SQLPedidos.filtrarTodosPedidosPsn(pd, modelo);
            break;
            
    }
    
}

public void consultarAlgunosPedidos(ModuloPedidos pd)
{
    
    modelo = (DefaultTableModel) pd.getJtblPedidos().getModel();
    pd.getPedido().setCantidadFiltros(Integer.parseInt(pd.getJtxtFCP().getText()));
    SQLPedidos.filtrarAlgunosPedidos(pd, modelo);
    
}

public void consultarRDPPedidos(ModuloPedidos pd)
{
    
    modelo = (DefaultTableModel) pd.getJtblPedidos().getModel();
    Date f = pd.getJdtFPI().getDate();
        
        long a = f.getTime();
        java.sql.Date RFI = new java.sql.Date(a);
        
    Date g = pd.getJdtFPF().getDate();
    
        long b = g.getTime();
        java.sql.Date RFF = new java.sql.Date(b);
    
    pd.getPedido().setRangoInicial(RFI);
    pd.getPedido().setRangoFinal(RFF);
    SQLPedidos.filtrarRDPPedidos(pd, modelo);
    
}

public void consultarRDLLPedidos(ModuloPedidos pd)
{
    
    modelo = (DefaultTableModel) pd.getJtblPedidos().getModel();
    
    Date g = pd.getJdtFPLLI().getDate();
        
        long b = g.getTime();
        java.sql.Date RFI = new java.sql.Date(b);
        
    Date h = pd.getJdtFPLLF().getDate();
    
        long c = h.getTime();
        java.sql.Date RFF = new java.sql.Date(c);
    
    pd.getPedido().setRangoFinal(RFF);
    pd.getPedido().setRangoInicial(RFI);
    SQLPedidos.filtrarRDLLPedidos(pd, modelo);
    
    
}

public void consultarPrecioPedidos(ModuloPedidos pd)
{
    
    modelo = (DefaultTableModel) pd.getJtblPedidos().getModel();
    float numero = Float.parseFloat(pd.getJtxtFPP().getText());
    
    if(numero < 100)
    {
        
        pd.getPedido().setRangoPrecioInicial(numero);
        pd.getPedido().setRangoPrecioFinal((numero+10));
        
    }else if(numero > 100 && numero < 1000)
    {
        pd.getPedido().setRangoPrecioInicial(numero);
        pd.getPedido().setRangoPrecioFinal((numero+100));
        
    }else if(numero > 1000)
    {
        pd.getPedido().setRangoPrecioInicial(numero);
        pd.getPedido().setRangoPrecioFinal((numero+1000));
        
    }
    
    SQLPedidos.filtrarPrecioPedidos(pd, modelo);

}

public void consultarIDPedidos(ModuloPedidos pd)
{
    
    modelo = (DefaultTableModel) pd.getJtblPedidos().getModel();   
    pd.getPedido().setIdPedido(Integer.parseInt(pd.getJtxtFIdPdo().getText()));
    SQLPedidos.filtrarIDPedidos(pd, modelo);
    
}

public void consultarIDProductoPedidos(ModuloPedidos pd)
{
    
    modelo = (DefaultTableModel) pd.getJtblPedidos().getModel();   
    pd.getPedido().setIdProducto(Integer.parseInt(pd.getJtxtFIdPdto().getText()));
    SQLPedidos.filtrarIDProductoPedidos(pd, modelo);
    
}

public void consultarIDProveedorPedidos(ModuloPedidos pd)
{
    
    modelo = (DefaultTableModel) pd.getJtblPedidos().getModel();   
    pd.getPedido().setIdProveedor(Integer.parseInt(pd.getJtxtFIdPvdor().getText()));
    SQLPedidos.filtrarIDProveedorPedidos(pd, modelo);
    
}

public void Consultar(ModuloPedidos pd)
{
    
    if(pd.getJrbFCP().isSelected())
    {
        
        this.limpiarTabla(pd);
        this.consultarAlgunosPedidos(pd);
                
    }else if(pd.getJrbFTP().isSelected())
    {
        
        this.limpiarTabla(pd);
        this.consultarTodosPedidos(pd);
        
    }else if(pd.getJrbFP().isSelected())
    {
        
        this.limpiarTabla(pd);
        this.consultarPrecioPedidos(pd);
        
    }else if(pd.getJrbFRFP().isSelected())
    {
        
        this.limpiarTabla(pd);
        this.consultarRDPPedidos(pd);
        
    }else if(pd.getJrbFRFLL().isSelected())
    {
        
        this.limpiarTabla(pd);
        this.consultarRDLLPedidos(pd);
        
    }else if(pd.getJrbFIdPdo().isSelected())
    {
        
        this.limpiarTabla(pd);
        this.consultarIDPedidos(pd);
        
    }else if(pd.getJrbFIdPdto().isSelected())
    {
        
        this.limpiarTabla(pd);
        this.consultarIDProductoPedidos(pd);
        
    }else if(pd.getJrbFIdPvdor().isSelected())
    {
        
        this.limpiarTabla(pd);
        this.consultarIDProveedorPedidos(pd);
        
    }

    
    
}

public void limpiarTabla(ModuloPedidos pd)
{
    
    this.modelo = (DefaultTableModel) pd.getJtblPedidos().getModel();
    int filas = this.modelo.getRowCount();
    
    for(int i = 0; filas > i; i++)
    {
        
        this.modelo.removeRow(0);
        
    }
    
}



}