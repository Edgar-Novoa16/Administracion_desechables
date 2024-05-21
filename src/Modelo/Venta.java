package Modelo;

import java.sql.Date;

public class Venta {

    private int idVentas;
    private float cantidadVendida;
    private float totalVenta;
    private String tipoProducto;
    private int idProducto;
    private Date fechaVenta;
    private java.sql.Date rangoFechaInicial;
    private java.sql.Date rangoFechaFinal;
    private int cantidadVentasInicial;
    private int cantidadVentasFinal;

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public float getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(float cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Date getRangoFechaInicial() {
        return rangoFechaInicial;
    }

    public void setRangoFechaInicial(Date rangoFechaInicial) {
        this.rangoFechaInicial = rangoFechaInicial;
    }

    public Date getRangoFechaFinal() {
        return rangoFechaFinal;
    }

    public void setRangoFechaFinal(Date rangoFechaFinal) {
        this.rangoFechaFinal = rangoFechaFinal;
    }

    public int getCantidadVentasInicial() {
        return cantidadVentasInicial;
    }

    public void setCantidadVentasInicial(int cantidadVentasInicial) {
        this.cantidadVentasInicial = cantidadVentasInicial;
    }

    public int getCantidadVentasFinal() {
        return cantidadVentasFinal;
    }

    public void setCantidadVentasFinal(int cantidadVentasFinal) {
        this.cantidadVentasFinal = cantidadVentasFinal;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    
    



    
}
