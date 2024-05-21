package Modelo;

import java.sql.*;

public class Pedido {
    
    //ATRIBUTOS
    private int idPedido;
    private int idProveedor;
    private int idProducto;
    private String tipoProducto;
    private float cantidad;
    private Date fecha_de_petición;
    private Date fecha_de_llegada;
    private float precio;
    private int cantidadFiltros;
    private java.sql.Date rangoInicial;
    private java.sql.Date rangoFinal;
    private float rangoPrecioInicial;
    private float rangoPrecioFinal;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

        
    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha_de_petición() {
        return fecha_de_petición;
    }

    public void setFecha_de_petición(Date fecha_de_petición) {
        this.fecha_de_petición = fecha_de_petición;
    }

    public Date getFecha_de_llegada() {
        return fecha_de_llegada;
    }

    public void setFecha_de_llegada(Date fecha_de_llegada) {
        this.fecha_de_llegada = fecha_de_llegada;
    }
    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidadFiltros() {
        return cantidadFiltros;
    }

    public void setCantidadFiltros(int cantidadFiltros) {
        this.cantidadFiltros = cantidadFiltros;
    }

    public Date getRangoInicial() {
        return rangoInicial;
    }

    public void setRangoInicial(java.sql.Date rangoInicial) {
        this.rangoInicial = rangoInicial;
    }

    public java.sql.Date getRangoFinal() {
        return rangoFinal;
    }

    public void setRangoFinal(java.sql.Date rangoFinal) {
        this.rangoFinal = rangoFinal;
    }

    public float getRangoPrecioInicial() {
        return rangoPrecioInicial;
    }

    public void setRangoPrecioInicial(float rangoPrecioInicial) {
        this.rangoPrecioInicial = rangoPrecioInicial;
    }

    public float getRangoPrecioFinal() {
        return rangoPrecioFinal;
    }

    public void setRangoPrecioFinal(float rangoPrecioFinal) {
        this.rangoPrecioFinal = rangoPrecioFinal;
    }

    
    
    @Override
    public String toString() {
        return "Pedido\n" + "idPedido = " + idPedido + "\nidProveedor = " + idProveedor + "\nidProducto = " + idProducto + "\ncantidad = " + cantidad + "\nfecha_de_llegada = " + fecha_de_llegada + "\nprecio = " + precio;
    }
    
}
