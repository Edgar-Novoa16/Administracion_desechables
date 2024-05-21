/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.SQLProductosPerecederos;
import Vista.ModuloProductosPerecederos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Perecederos {

    DefaultTableModel modelo;    
    boolean mod = false;
    int fila;


public boolean obtenerInformacion(ModuloProductosPerecederos pp)
{
    
        
    String tipoProducto = pp.getJcmbTipoProductoPere().getSelectedItem().toString();
    String claveProducto = pp.getJtxtClaveProductoPere().getText();
    String cantidadP = pp.getJtxtCantidadProductoPere().getText();
    String motivo = pp.getJtxtMotivoPerdida().getText();
    String merma = pp.getJtxtMerma().getText();
    java.util.Date fP = pp.getJdtFechaPerdida().getDate();
    
    if(claveProducto.equals("CLAVE PRODUCTO") || cantidadP.equals("      CANTIDAD") || 
       fP == null || motivo.equals("                     MOTIVO") || merma.equals("           MERMA"))
    {
        
        return false;
        
    }else{
        
        long a = fP.getTime();
        java.sql.Date fecha_de_perdida = new java.sql.Date(a);
        
        pp.getProductoP().setIdproducto(Integer.parseInt(claveProducto));
        pp.getProductoP().setTipoProducto(tipoProducto);
        pp.getProductoP().setCantidad_del_producto(Float.parseFloat(cantidadP));
        pp.getProductoP().setMotivo_de_pérdida(motivo);
        pp.getProductoP().setMerma(Float.parseFloat(merma));
        pp.getProductoP().setFecha_de_pérdida(fecha_de_perdida);
        
        this.restaurarPanel(pp);
        
        return true;
        
        
    }
    
    
    
}    

public void restaurarPanel(ModuloProductosPerecederos pp)
{
    
    pp.getJcmbTipoProductoPere().setSelectedIndex(0);
    pp.getJtxtClaveProductoPere().setText("CLAVE PRODUCTO");
    pp.getJtxtCantidadProductoPere().setText("      CANTIDAD");
    pp.getJtxtMotivoPerdida().setText("                     MOTIVO");
    pp.getJtxtMerma().setText("           MERMA");
    pp.getJcmbFiltroTipoPP().setSelectedIndex(0);
    pp.getJdtFechaPerdida().setDate(null);
    pp.getJcmbFiltroTipoPP().setEnabled(false);
    pp.getButtonGroup1().clearSelection();
    pp.getJtxtFiltroCantidadProductosPFinal().setText("");
    pp.getJtxtFiltroCantidadProductosPFinal().setEnabled(false);
    pp.getJtxtFiltroCantidadProductosPInicial().setText("");
    pp.getJtxtFiltroCantidadProductosPInicial().setEnabled(false);
    pp.getJtxtFiltroPorCantidadPerdidaFinal().setText("");
    pp.getJtxtFiltroPorCantidadPerdidaFinal().setEnabled(false);
    pp.getJtxtFiltroPorCantidadPerdidaInicial().setText("");
    pp.getJtxtFiltroPorCantidadPerdidaInicial().setEnabled(false);
    pp.getJdtFiltroPorFechaPerdidaFinal().setDate(null);
    pp.getJdtFiltroPorFechaPerdidaFinal().setEnabled(false);
    pp.getJdtFiltroPorFechaPerdidaInicial().setDate(null);
    pp.getJdtFiltroPorFechaPerdidaInicial().setEnabled(false);
    pp.getJtxtFiltroPorIdProducto().setText("");
    pp.getJtxtFiltroPorIdProducto().setEnabled(false);
    pp.getJtxtFiltroPorMermaFinal().setText("");
    pp.getJtxtFiltroPorMermaFinal().setEnabled(false);
    pp.getJtxtFiltroPorMermaInicial().setText("");
    pp.getJtxtFiltroPorMermaInicial().setEnabled(false);
    
    
}

public void cargarTablaProductos(ModuloProductosPerecederos pp)
    {
        
        modelo = (DefaultTableModel) pp.getJtblProductosPere().getModel();
        Object info[] = new Object[7];
        
        info[0] = String.valueOf(pp.getProductoP().getIdproductos_perecederosali());
        info[1] = String.valueOf(pp.getProductoP().getIdproducto());
        info[2] = pp.getProductoP().getTipoProducto();
        info[3] = String.valueOf(pp.getProductoP().getCantidad_del_producto());
        info[4] = String.valueOf(pp.getProductoP().getFecha_de_pérdida());
        info[5] = pp.getProductoP().getMotivo_de_pérdida();
        info[6] = String.valueOf(pp.getProductoP().getmerma());

        modelo.addRow(info);
      
    }

public void agregarRegistroProducto(ModuloProductosPerecederos pp)
 {
     
     SQLProductosPerecederos.insertarProductosPerecederos(pp.getProductoP());
     JOptionPane.showMessageDialog(null, "Registro completado. Acabas de registrar lo siguiente:\n" + pp.getProductoP().toString());
     this.cargarTablaProductos(pp);
     
 }

public float calcularPrecioPedido(String tipoProducto, int idProducto, float cantidadProducto){
        
        float precioProducto;
        
        switch(tipoProducto)
        {
            case "ALIMENTOS":
                
                precioProducto = SQLProductosPerecederos.consultarPrecioAlimento(idProducto);
                precioProducto *= cantidadProducto;
                return precioProducto;
                
            case "DESECHABLES":
                
                precioProducto = SQLProductosPerecederos.consultarPrecioDesechable(idProducto);
                precioProducto *= cantidadProducto;
                return precioProducto;
                
            case "PRIMERA NECESIDAD":
                
                precioProducto = SQLProductosPerecederos.consultarPrecioPrin(idProducto);
                precioProducto *= cantidadProducto;
                return precioProducto;
                
            case "SEGUNDA NECESIDAD":
                
                precioProducto = SQLProductosPerecederos.consultarPrecioPsn(idProducto);
                precioProducto *= cantidadProducto;
                return precioProducto;
                
        }
        
        return 0;
    }

public void establecerPrecioPedido(ModuloProductosPerecederos pp)
    {
        
        String tipoProducto = pp.getJcmbTipoProductoPere().getSelectedItem().toString();
        int idProducto = Integer.parseInt(pp.getJtxtClaveProductoPere().getText());
        float cantidadProducto = Float.parseFloat(pp.getJtxtCantidadProductoPere().getText());
        
        
        pp.getJtxtMerma().setText(String.valueOf(this.calcularPrecioPedido(tipoProducto, idProducto, cantidadProducto)));
        
    }

public void cancelarEdicionProductos(ModuloProductosPerecederos pp)
{
        
        this.mod = false;
        if(pp.getJtblProductosPere().getSelectedRow() >= 0 )
        {    
        pp.getJtblProductosPere().removeRowSelectionInterval(fila, fila);
        
        }
        this.restaurarPanel(pp);
}

public void consultar(ModuloProductosPerecederos pp)
{
    
    if(pp.getJrbFiltroTodosLosProductosP().isSelected())
    {
        
        this.limpiarTabla(pp);
        this.modelo = (DefaultTableModel) pp.getJtblProductosPere().getModel();
        SQLProductosPerecederos.filtrarTodosLosProductos(pp, modelo);
        
    }else if(pp.getJrbFiltroCantidadProductosP().isSelected())
    {
        
        this.limpiarTabla(pp);
        this.modelo = (DefaultTableModel) pp.getJtblProductosPere().getModel();
        pp.getProductoP().setFiltroCantidadProductosPInicial(Integer.parseInt(pp.getJtxtFiltroCantidadProductosPInicial().getText()));
        pp.getProductoP().setFiltroCantidadProductosPFinal(Integer.parseInt(pp.getJtxtFiltroCantidadProductosPFinal().getText()));
        SQLProductosPerecederos.filtrarAlgunosProductos(pp, modelo);
        
        
    }else if(pp.getJrbFiltroPorCantidadPerdida().isSelected())
    {
        
        this.limpiarTabla(pp);
        this.modelo = (DefaultTableModel) pp.getJtblProductosPere().getModel();
        pp.getProductoP().setFiltroCantidadPerdidaInicial(Float.parseFloat(pp.getJtxtFiltroPorCantidadPerdidaInicial().getText()));
        pp.getProductoP().setFiltroCantidadPerdidaFinal(Float.parseFloat(pp.getJtxtFiltroPorCantidadPerdidaFinal().getText()));
        SQLProductosPerecederos.filtrarPorCantidadPerdidaProducto(pp, modelo);
        
        
    }else if(pp.getJrbFiltroPorFechaPerdida().isSelected())
    {
        
        this.limpiarTabla(pp);
        this.modelo = (DefaultTableModel) pp.getJtblProductosPere().getModel();
        Date f = pp.getJdtFiltroPorFechaPerdidaInicial().getDate();
        Date g = pp.getJdtFiltroPorFechaPerdidaFinal().getDate();
        
        long a = f.getTime();
        long b = g.getTime();
        
        java.sql.Date RFPI = new java.sql.Date(a);
        java.sql.Date RFPF = new java.sql.Date(b);
        
        pp.getProductoP().setFiltroRangoFechaPerdidaInicial(RFPI);
        pp.getProductoP().setFiltroRangoFechaPerdidaFinal(RFPF);
        SQLProductosPerecederos.filtrarPorFechaPerdidaProducto(pp, modelo);
        
        
    }else if(pp.getJrbFiltroPorMerma().isSelected())
    {
        
        this.limpiarTabla(pp);
        this.modelo = (DefaultTableModel) pp.getJtblProductosPere().getModel();
        pp.getProductoP().setFiltroMermaInicial(Float.parseFloat(pp.getJtxtFiltroPorMermaInicial().getText()));
        pp.getProductoP().setFiltroMermaFinal(Float.parseFloat(pp.getJtxtFiltroPorMermaFinal().getText()));
        SQLProductosPerecederos.filtrarPorCantidadMerma(pp, modelo);
        
    }else if(pp.getJrbFiltroPorIdProducto().isSelected())
    {
        
        this.limpiarTabla(pp);
        this.modelo = (DefaultTableModel) pp.getJtblProductosPere().getModel();
        pp.getProductoP().setIdproducto(Integer.parseInt(pp.getJtxtFiltroPorIdProducto().getText()));
        SQLProductosPerecederos.filtrarPorIdProductosPerecederos(pp, modelo);
        
    }
    
    
}

public void limpiarTabla(ModuloProductosPerecederos pp)
{
    
    this.modelo = (DefaultTableModel) pp.getJtblProductosPere().getModel();
    int filas = this.modelo.getRowCount();
    
    for(int i = 0; filas > i; i++)
    {
        
        this.modelo.removeRow(0);
        
    }
    
}

/*public boolean consultarCantidadProducto(ModuloProductosPerecederos pp)
{
    
    SQLProductosPerecederos.establecerCantidadProducto(pp.getProductoP());
    
}
*/
}
