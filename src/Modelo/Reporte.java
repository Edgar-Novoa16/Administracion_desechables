package Modelo;

import java.sql.Date;
import java.util.ArrayList;


public class Reporte {

    //Productos más vendidos.
    private Object primeraNecesidadMAV[][];    
    private Object segundaNecesidadMAV[][];
    private Object alimentosMAV[][];
    private Object desechablesMAV[][];
    
    //Productos menos vendidos.
    private Object primeraNecesidadMEV[][];
    private Object segundaNecesidadMEV[][];
    private Object alimentosMEV[][];
    private Object desechablesMEV[][];
    
    //Gastos
    private float perecederos;
    private float pedidos;
    private double total;
    //Ganancias 
    private float ganancia;
    
    //Productos a punto de terminarse.
    private ArrayList<Object> primeraNecesidadAPT;
    private ArrayList<Object> segundaNecesidadAPT;
    private ArrayList<Object> alimentosAPT;
    private ArrayList<Object> desechablesAPT;
    
    //Rango de fecha
    private java.sql.Date fechaInicial;
    private java.sql.Date fechaFinal;

    public Object[][] getPrimeraNecesidadMAV() {
        return primeraNecesidadMAV;
    }

    public void setPrimeraNecesidadMAV(Object[][] primeraNecesidadMAV) {
        this.primeraNecesidadMAV = primeraNecesidadMAV;
    }

    public Object[][] getSegundaNecesidadMAV() {
        return segundaNecesidadMAV;
    }

    public void setSegundaNecesidadMAV(Object[][] segundaNecesidadMAV) {
        this.segundaNecesidadMAV = segundaNecesidadMAV;
    }

    public Object[][] getAlimentosMAV() {
        return alimentosMAV;
    }

    public void setAlimentosMAV(Object[][] alimentosMAV) {
        this.alimentosMAV = alimentosMAV;
    }

    public Object[][] getDesechablesMAV() {
        return desechablesMAV;
    }

    public void setDesechablesMAV(Object[][] desechablesMAV) {
        this.desechablesMAV = desechablesMAV;
    }

    public Object[][] getPrimeraNecesidadMEV() {
        return primeraNecesidadMEV;
    }

    public void setPrimeraNecesidadMEV(Object[][] primeraNecesidadMEV) {
        this.primeraNecesidadMEV = primeraNecesidadMEV;
    }

    public Object[][] getSegundaNecesidadMEV() {
        return segundaNecesidadMEV;
    }

    public void setSegundaNecesidadMEV(Object[][] segundaNecesidadMEV) {
        this.segundaNecesidadMEV = segundaNecesidadMEV;
    }

    public Object[][] getAlimentosMEV() {
        return alimentosMEV;
    }

    public void setAlimentosMEV(Object[][] alimentosMEV) {
        this.alimentosMEV = alimentosMEV;
    }

    public Object[][] getDesechablesMEV() {
        return desechablesMEV;
    }

    public void setDesechablesMEV(Object[][] desechablesMEV) {
        this.desechablesMEV = desechablesMEV;
    }

    public float getPerecederos() {
        return perecederos;
    }

    public void setPerecederos(float perecederos) {
        this.perecederos = perecederos;
    }

    public float getPedidos() {
        return pedidos;
    }

    public void setPedidos(float pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Object> getPrimeraNecesidadAPT() {
        return primeraNecesidadAPT;
    }

    public void setPrimeraNecesidadAPT(ArrayList<Object> primeraNecesidadAPT) {
        this.primeraNecesidadAPT = primeraNecesidadAPT;
    }

    public ArrayList<Object> getSegundaNecesidadAPT() {
        return segundaNecesidadAPT;
    }

    public void setSegundaNecesidadAPT(ArrayList<Object> segundaNecesidadAPT) {
        this.segundaNecesidadAPT = segundaNecesidadAPT;
    }

    public ArrayList<Object> getAlimentosAPT() {
        return alimentosAPT;
    }

    public void setAlimentosAPT(ArrayList<Object> alimentosAPT) {
        this.alimentosAPT = alimentosAPT;
    }

    public ArrayList<Object> getDesechablesAPT() {
        return desechablesAPT;
    }

    public void setDesechablesAPT(ArrayList<Object> desechablesAPT) {
        this.desechablesAPT = desechablesAPT;
    }



    public float getGanancia() {
        return ganancia;
    }

    public void setGanancia(float ganancia) {
        this.ganancia = ganancia;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(java.sql.Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(java.sql.Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
}
