package Modelo;

import java.util.Date;

public class ProductoPerecedero {
   
    private int idproductos_perecederosali;
    private String tipoProducto;
    private int idproducto;
    private float cantidad_del_producto;
    private java.sql.Date fecha_de_pérdida;
    private String motivo_de_pérdida;
    private float merma;
    private float filtroCantidadPerdidaInicial;
    private float filtroCantidadPerdidaFinal;
    private int filtroCantidadProductosPInicial;
    private int filtroCantidadProductosPFinal;
    private java.sql.Date filtroRangoFechaPerdidaInicial;
    private java.sql.Date filtroRangoFechaPerdidaFinal;
    private float filtroMermaInicial;
    private float filtroMermaFinal;

    public int getIdproductos_perecederosali() {
        return idproductos_perecederosali;
    }

    public void setIdproductos_perecederosali(int idproductos_perecederosali) {
        this.idproductos_perecederosali = idproductos_perecederosali;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public float getCantidad_del_producto() {
        return cantidad_del_producto;
    }

    public void setCantidad_del_producto(float cantidad_del_producto) {
        this.cantidad_del_producto = cantidad_del_producto;
    }

    public java.sql.Date getFecha_de_pérdida() {
        return fecha_de_pérdida;
    }

    public void setFecha_de_pérdida(java.sql.Date fecha_de_pérdida) {
        this.fecha_de_pérdida = fecha_de_pérdida;
    }

    public String getMotivo_de_pérdida() {
        return motivo_de_pérdida;
    }

    public void setMotivo_de_pérdida(String motivo_de_pérdida) {
        this.motivo_de_pérdida = motivo_de_pérdida;
    }

    public float getmerma() {
        return merma;
    }

    public void setMerma(float merma) {
        this.merma = merma;
    }

    public float getFiltroCantidadPerdidaInicial() {
        return filtroCantidadPerdidaInicial;
    }

    public void setFiltroCantidadPerdidaInicial(float filtroCantidadPerdidaInicial) {
        this.filtroCantidadPerdidaInicial = filtroCantidadPerdidaInicial;
    }

    public float getFiltroCantidadPerdidaFinal() {
        return filtroCantidadPerdidaFinal;
    }

    public void setFiltroCantidadPerdidaFinal(float filtroCantidadPerdidaFinal) {
        this.filtroCantidadPerdidaFinal = filtroCantidadPerdidaFinal;
    }

    public Date getFiltroRangoFechaPerdidaInicial() {
        return filtroRangoFechaPerdidaInicial;
    }

    public void setFiltroRangoFechaPerdidaInicial(java.sql.Date filtroRangoFechaPerdidaInicial) {
        this.filtroRangoFechaPerdidaInicial = filtroRangoFechaPerdidaInicial;
    }

    public Date getFiltroRangoFechaPerdidaFinal() {
        return filtroRangoFechaPerdidaFinal;
    }

    public void setFiltroRangoFechaPerdidaFinal(java.sql.Date filtroRangoFechaPerdidaFinal) {
        this.filtroRangoFechaPerdidaFinal = filtroRangoFechaPerdidaFinal;
    }

    public float getFiltroMermaInicial() {
        return filtroMermaInicial;
    }

    public void setFiltroMermaInicial(float filtroMermaInicial) {
        this.filtroMermaInicial = filtroMermaInicial;
    }

    public float getFiltroMermaFinal() {
        return filtroMermaFinal;
    }

    public void setFiltroMermaFinal(float filtroMermaFinal) {
        this.filtroMermaFinal = filtroMermaFinal;
    }

    public int getFiltroCantidadProductosPInicial() {
        return filtroCantidadProductosPInicial;
    }

    public void setFiltroCantidadProductosPInicial(int filtroCantidadProductosPInicial) {
        this.filtroCantidadProductosPInicial = filtroCantidadProductosPInicial;
    }

    public int getFiltroCantidadProductosPFinal() {
        return filtroCantidadProductosPFinal;
    }

    public void setFiltroCantidadProductosPFinal(int filtroCantidadProductosPFinal) {
        this.filtroCantidadProductosPFinal = filtroCantidadProductosPFinal;
    }

    
    
    @Override
    public String toString() {
        return "Producto Perecedero\n" + "Idproductos_perecederosali = " + idproductos_perecederosali + "\nTipoProducto = " + tipoProducto + "\nIdproducto = " + idproducto + "\nCantidad_del_producto = " + cantidad_del_producto + 
                "\nFecha_de_pérdida = " + fecha_de_pérdida + "\nMotivo_de_pérdida = " + motivo_de_pérdida + "\nMerma = " + merma;    }

        
    
    
}
