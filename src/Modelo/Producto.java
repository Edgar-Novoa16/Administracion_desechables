/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author marco
 */
public class Producto {
    
    private String tipoProducto;
    private int idProducto;
    private int idProveedor;
    private String nombre_producto;
    private String categoria;
    private String modelo;
    private String tamaño;
    private float cantidad_almacen;
    private float precio;
    private int cantidadInicialFiltro;
    private int cantidadFinalFiltro;
    private float precioInicialProducto;
    private float precioFinalProducto;
    private float filtroCantidadAlmacenInicial;
    private float filtroCantidadAlmacenFinal;
    
    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public float getCantidad_almacen() {
        return cantidad_almacen;
    }

    public void setCantidad_almacen(float cantidad_almacen) {
        this.cantidad_almacen = cantidad_almacen;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getCantidadInicialFiltro() {
        return cantidadInicialFiltro;
    }

    public void setCantidadInicialFiltro(int cantidadInicialFiltro) {
        this.cantidadInicialFiltro = cantidadInicialFiltro;
    }

    public int getCantidadFinalFiltro() {
        return cantidadFinalFiltro;
    }

    public void setCantidadFinalFiltro(int cantidadFinalFiltro) {
        this.cantidadFinalFiltro = cantidadFinalFiltro;
    }

    public float getPrecioInicialProducto() {
        return precioInicialProducto;
    }

    public void setPrecioInicialProducto(float precioInicialProducto) {
        this.precioInicialProducto = precioInicialProducto;
    }

    public float getPrecioFinalProducto() {
        return precioFinalProducto;
    }

    public void setPrecioFinalProducto(float precioFinalProducto) {
        this.precioFinalProducto = precioFinalProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getFiltroCantidadAlmacenInicial() {
        return filtroCantidadAlmacenInicial;
    }

    public void setFiltroCantidadAlmacenInicial(float filtroCantidadAlmacenInicial) {
        this.filtroCantidadAlmacenInicial = filtroCantidadAlmacenInicial;
    }

    public float getFiltroCantidadAlmacenFinal() {
        return filtroCantidadAlmacenFinal;
    }

    public void setFiltroCantidadAlmacenFinal(float filtroCantidadAlmacenFinal) {
        this.filtroCantidadAlmacenFinal = filtroCantidadAlmacenFinal;
    }

    
    
    @Override
    public String toString() {
        return "Producto\n" + "Tipo de Producto = " + tipoProducto + "\nIdProducto = " + idProducto + "\nNombre del producto = " + nombre_producto + "\nCategoria = " + categoria + "\nModelo = " + modelo + "\nTamaño = " + tamaño + "\nCantidad en el almacen = " + cantidad_almacen + "\nPrecio = " + precio;
    }
    
    
    
    
    
    
    
    
}
