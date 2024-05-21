/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.SQLProductos;
import Vista.ModuloProductos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marco
 */
public class Productos {
    
    DefaultTableModel modelo;    
    boolean mod = false;
    int fila;


public boolean obtenerInformacion(ModuloProductos pdts)
{
 
    String tipoProducto = pdts.getJcmbCProducto().getSelectedItem().toString();
    String claveProveedor = pdts.getJtxtClaveProveedor().getText();
    String nombreProducto = pdts.getJtxtNombreP().getText();
    String categoriaP = pdts.getJtxtCategoriaP().getText();
    String modeloP = pdts.getJtxtModeloP().getText();
    String tamañoP = pdts.getJtxtTamañoP().getText();
    String cantidad = pdts.getJtxtCantidadP().getText();
    String precioP = pdts.getJtxtPrecioP().getText();
    
    if(pdts.getJtxtCantidadP().getText().equals("    CANTIDAD") || pdts.getJtxtCategoriaP().getText().equals("             CATEGORIA") || 
       pdts.getJtxtClaveProveedor().getText().equals("  CLAVE PROVEEDOR") || pdts.getJtxtNombreP().getText().equals("                         NOMBRE") || 
       pdts.getJtxtModeloP().getText().equals("      MODELO") || pdts.getJtxtTamañoP().getText().equals("       TAMAÑO") || pdts.getJtxtPrecioP().getText().equals("      PRECIO"))
    {
        
        return false;
        
    }else{
        
        pdts.getProducto().setIdProveedor(Integer.parseInt(claveProveedor));
        pdts.getProducto().setCantidad_almacen(Float.parseFloat(cantidad));
        pdts.getProducto().setCategoria(categoriaP);
        pdts.getProducto().setModelo(modeloP);
        pdts.getProducto().setNombre_producto(nombreProducto);
        pdts.getProducto().setPrecio(Float.parseFloat(precioP));
        pdts.getProducto().setTamaño(tamañoP);
        pdts.getProducto().setTipoProducto(tipoProducto);
        
        
        
        this.restaurarPanel(pdts);
        
        return true;
        
    }
    
    
}

public void restaurarPanel(ModuloProductos pdts)
{
    
    pdts.getJcmbCProducto().setSelectedIndex(0);
    pdts.getJtxtCantidadP().setText("    CANTIDAD");
    pdts.getJtxtCategoriaP().setText("             CATEGORIA");
    pdts.getJtxtClaveProveedor().setText("  CLAVE PROVEEDOR");
    pdts.getJtxtModeloP().setText("      MODELO");
    pdts.getJtxtNombreP().setText("                         NOMBRE");
    pdts.getJtxtPrecioP().setText("      PRECIO");
    pdts.getJtxtTamañoP().setText("       TAMAÑO");
    pdts.getJtxtFiltroCantidadAlmacenI().setEnabled(false);
    pdts.getJtxtFiltroCantidadAlmacenI().setText("");
    pdts.getJtxtCantidadAlmacenF().setEnabled(false);
    pdts.getJtxtCantidadAlmacenF().setText("");
    pdts.getJtxtFiltroCantidadFinalProducto().setEnabled(false);
    pdts.getJtxtFiltroCantidadFinalProducto().setText("");
    pdts.getJtxtFiltroCantidadInicialProducto().setEnabled(false);
    pdts.getJtxtFiltroCantidadInicialProducto().setText("");
    pdts.getJtxtFiltroCategoriaProducto().setEnabled(false);
    pdts.getJtxtFiltroCategoriaProducto().setText("");
    pdts.getJtxtFiltroIdProducto().setEnabled(false);
    pdts.getJtxtFiltroIdProducto().setText("");
    pdts.getJtxtFiltroIdProveedor().setEnabled(false);
    pdts.getJtxtFiltroIdProveedor().setText("");
    pdts.getJtxtFiltroNombreProducto().setEnabled(false);
    pdts.getJtxtFiltroNombreProducto().setText("");
    pdts.getJtxtFiltroPrecioF().setEnabled(false);
    pdts.getJtxtFiltroPrecioF().setText("");
    pdts.getJtxtFiltroPrecioProductoI().setEnabled(false);
    pdts.getJtxtFiltroPrecioProductoI().setText("");
    pdts.getJcmbFiltroTipoProducto().setEnabled(false);
    pdts.getButtonGroup1().clearSelection();
    
}

 public void cargarTablaProductos(ModuloProductos pdts)
    {
        
        modelo = (DefaultTableModel) pdts.getJtblProductos().getModel();
        Object info[] = new Object[9];
        
        info[0] = String.valueOf(pdts.getProducto().getIdProducto());
        info[1] = String.valueOf(pdts.getProducto().getIdProveedor());
        info[2] = pdts.getProducto().getTipoProducto();
        info[3] = pdts.getProducto().getNombre_producto();
        info[4] = pdts.getProducto().getCategoria();
        info[5] = pdts.getProducto().getModelo();
        info[6] = pdts.getProducto().getTamaño();
        info[7] = String.valueOf(pdts.getProducto().getCantidad_almacen());
        info[8] = String.valueOf(pdts.getProducto().getPrecio());
        
        modelo.addRow(info);
       
      
    }

 public void agregarRegistroProducto(ModuloProductos pdts)
 {
     
     boolean dec;
     
    dec = SQLProductos.comprobarProductos(pdts.getProducto());
     
     if(dec == false)
     {
         
         JOptionPane.showMessageDialog(null, "El producto ya existe.");
         
     }else
     {
     
        SQLProductos.insertarProductos(pdts.getProducto());
        JOptionPane.showMessageDialog(null, "Registro completado. Acabas de registrar lo siguiente:\n" + pdts.getProducto().toString());
        this.cargarTablaProductos(pdts);
         
     }
     
 }
 
public void EliminarRegistroProducto(ModuloProductos pdts)
{
        
        fila = pdts.getJtblProductos().getSelectedRow();
        String tipoProducto = String.valueOf(pdts.getJtblProductos().getValueAt(fila, 2));
        String idproducto = String.valueOf(pdts.getJtblProductos().getValueAt(fila, 0));
 
        SQLProductos.eliminarProducto(tipoProducto, idproducto);
        this.modelo.removeRow(fila);
        
        
}

public void cancelarEdicionProductos(ModuloProductos pdts)
{
        
        this.mod = false;
        if(pdts.getJtblProductos().getSelectedRow() >= 0 )
        {    
        pdts.getJtblProductos().removeRowSelectionInterval(fila, fila);
        
        }
        this.restaurarPanel(pdts);
}
    
public void modificarProducto(ModuloProductos pdts)
{
    
    this.fila = pdts.getJtblProductos().getSelectedRow();
    Object info[] = new Object[9]; 
    boolean des = false;
    
    if(this.mod == false)
    {
        
        this.modelo = (DefaultTableModel) pdts.getJtblProductos().getModel();
        
        pdts.getJcmbCProducto().setSelectedItem(this.modelo.getValueAt(this.fila, 2));
        pdts.getJtxtCantidadP().setText(String.valueOf(this.modelo.getValueAt(fila, 7)));
        pdts.getJtxtCategoriaP().setText(String.valueOf(this.modelo.getValueAt(fila, 4)));
        pdts.getJtxtClaveProveedor().setText(String.valueOf(this.modelo.getValueAt(fila, 1)));
        pdts.getJtxtModeloP().setText(String.valueOf(this.modelo.getValueAt(fila, 5)));
        pdts.getJtxtNombreP().setText(String.valueOf(this.modelo.getValueAt(fila, 3)));
        pdts.getJtxtPrecioP().setText(String.valueOf(this.modelo.getValueAt(fila, 8)));
        pdts.getJtxtTamañoP().setText(String.valueOf(this.modelo.getValueAt(fila, 6)));
        this.mod = true;
        
    }else
    {
        des = this.obtenerInformacion(pdts);
        
        if(des == false)
        {
            
            JOptionPane.showMessageDialog(null, "Llena lso campos correspondientes");
            
        }else
        {
            pdts.getProducto().setIdProducto(Integer.parseInt(this.modelo.getValueAt(fila, 0).toString()));
                    
            info[0] = pdts.getProducto().getIdProducto();
            info[1] = pdts.getProducto().getIdProveedor();
            info[2] = pdts.getProducto().getTipoProducto();
            info[3] = pdts.getProducto().getNombre_producto();
            info[4] = pdts.getProducto().getCategoria();
            info[5] = pdts.getProducto().getModelo();
            info[6] = pdts.getProducto().getTamaño();
            info[7] = pdts.getProducto().getCantidad_almacen();
            info[8] = pdts.getProducto().getPrecio();
                    
            for(int i = 0; i < pdts.getJtblProductos().getColumnCount(); i++)
            {
                        
                modelo.setValueAt(info[i], fila, i);
                        
            }                
            
            SQLProductos.modificarProducto(pdts.getProducto());
            this.mod = false;
            
        }
        
        
        
    }
    
    
}


public void consultar(ModuloProductos pdts)
{
    
    if(pdts.getJrbPedirTodosProductos().isSelected())
    {
        
        this.limpiarTabla(pdts);
        this.modelo = (DefaultTableModel) pdts.getJtblProductos().getModel();
        SQLProductos.filtrarTodosLosProductos(pdts, modelo);
        
    }else if(pdts.getJrbPedirCantidadProducto().isSelected())
    {
        
        this.limpiarTabla(pdts);
        this.modelo = (DefaultTableModel) pdts.getJtblProductos().getModel();
        pdts.getProducto().setCantidadInicialFiltro(Integer.parseInt(pdts.getJtxtFiltroCantidadInicialProducto().getText()));
        pdts.getProducto().setCantidadFinalFiltro(Integer.parseInt(pdts.getJtxtFiltroCantidadFinalProducto().getText()));
        SQLProductos.filtrarAlgunosProductos(pdts, modelo);
        
        
    }else if(pdts.getJrbNombreProducto().isSelected())
    {
        
        this.limpiarTabla(pdts);
        this.modelo = (DefaultTableModel) pdts.getJtblProductos().getModel();
        pdts.getProducto().setNombre_producto(pdts.getJtxtFiltroNombreProducto().getText());
        SQLProductos.filtrarNombreProducto(pdts, modelo);
        
        
    }else if(pdts.getJrbIdProducto().isSelected())
    {
        
        this.limpiarTabla(pdts);
        this.modelo = (DefaultTableModel) pdts.getJtblProductos().getModel();
        pdts.getProducto().setIdProducto(Integer.parseInt(pdts.getJtxtFiltroIdProducto().getText()));
        SQLProductos.filtrarIdProducto(pdts, modelo);
        
        
    }else if(pdts.getJrbIdProveedor().isSelected())
    {
        
        this.limpiarTabla(pdts);
        this.modelo = (DefaultTableModel) pdts.getJtblProductos().getModel();
        pdts.getProducto().setIdProveedor(Integer.parseInt(pdts.getJtxtFiltroIdProveedor().getText()));
        SQLProductos.filtrarIdProveedorProducto(pdts, modelo);
        
    }else if(pdts.getJrbPrecioProducto().isSelected())
    {
        
        this.limpiarTabla(pdts);
        this.modelo = (DefaultTableModel) pdts.getJtblProductos().getModel();
        pdts.getProducto().setPrecioInicialProducto(Float.parseFloat(pdts.getJtxtFiltroPrecioProductoI().getText()));
        pdts.getProducto().setPrecioFinalProducto(Float.parseFloat(pdts.getJtxtFiltroPrecioF().getText()));
        SQLProductos.filtrarPrecioProducto(pdts, modelo);
        
    }else if(pdts.getJrbCategoriaProducto().isSelected())
    {
        
        this.limpiarTabla(pdts);
        this.modelo = (DefaultTableModel) pdts.getJtblProductos().getModel();
        pdts.getProducto().setCategoria(pdts.getJtxtFiltroCategoriaProducto().getText());
        SQLProductos.filtrarCategoriaProducto(pdts, modelo);
        
    }else if(pdts.getJrbCantidadAlmacen().isSelected())
    {

        this.limpiarTabla(pdts);
        this.modelo = (DefaultTableModel) pdts.getJtblProductos().getModel();
        pdts.getProducto().setFiltroCantidadAlmacenInicial(Float.parseFloat(pdts.getJtxtFiltroCantidadAlmacenI().getText()));
        pdts.getProducto().setFiltroCantidadAlmacenFinal(Float.parseFloat(pdts.getJtxtCantidadAlmacenF().getText()));
        SQLProductos.filtrarCantidadAlmacenProducto(pdts, modelo);
        
    }
    
    
}
    
public void limpiarTabla(ModuloProductos pdts)
{
    
    this.modelo = (DefaultTableModel) pdts.getJtblProductos().getModel();
    int filas = this.modelo.getRowCount();
    
    for(int i = 0; filas > i; i++)
    {
        
        this.modelo.removeRow(0);
        
    }
    
}
    
    
}
