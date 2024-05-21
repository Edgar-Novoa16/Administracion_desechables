package Controlador;

import Modelo.SQLReportes;
import Vista.ModuloReportes;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Date;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import Animacion.*;

public class Reportes {


    
    public boolean obtenerInformacion(ModuloReportes mr)
    {
        
        Date f; 
        Date g;
        
        if(mr.getJdtFechaInicial().getDate() == null || mr.getJdtFechaFinal().getDate() == null)
        {

            JOptionPane.showMessageDialog(null, "Por favor, llena los campos");
            return false;
            
        }else
        {
            f = mr.getJdtFechaInicial().getDate();
            long a = f.getTime();
            java.sql.Date fechaI = new java.sql.Date(a);
            JOptionPane.showMessageDialog(null, fechaI);
            mr.getReporte().setFechaInicial(fechaI);
            
            g = mr.getJdtFechaFinal().getDate();
            long b = g.getTime();
            java.sql.Date fechaF = new java.sql.Date(b);
            

            mr.getReporte().setFechaFinal(fechaF);
            JOptionPane.showMessageDialog(null, fechaF);
            
            return true;
            
        }
        
        
    }
    
    
    
    public void obtenerProductosMAV(ModuloReportes mr)
    {
        
        SQLReportes.generarProductosMAV(mr.getReporte());

        //Generamos los datos
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        Object alimentos[][] = mr.getReporte().getAlimentosMAV();
        Object desechables[][] = mr.getReporte().getDesechablesMAV();
        Object primeraNecesidad[][] = mr.getReporte().getPrimeraNecesidadMAV();
        Object segundaNecesidad[][] = mr.getReporte().getSegundaNecesidadMAV();
        
        
        for(int i = 0; i < 3; i++)
        {
            
            data.setValue(Integer.parseInt(alimentos[i][0].toString()), alimentos[i][1].toString(), "Alimentos");
            
        }
        
        for(int i = 0; i < 3; i++)
        {
            
            data.setValue(Integer.parseInt(desechables[i][0].toString()), desechables[i][1].toString(), "Desechables");
            
        }
        
        for(int i = 0; i < 3; i++)
        {
            
            data.setValue(Integer.parseInt(primeraNecesidad[i][0].toString()), primeraNecesidad[i][1].toString(), "Primera Necesidad");
            
        }
        
        
        for(int i = 0; i < 3; i++)
        {
            
            data.setValue(Integer.parseInt(segundaNecesidad[i][0].toString()), segundaNecesidad[i][1].toString(), "Segunda Necesidad");
            
        }
        
        //Generamos y agregamos la gráfica al panel 1
        
        JFreeChart grafica_barrasMAV = ChartFactory.createBarChart3D(
        "Productos más vendidos",            //Nombre  de la gráfica.
        "Categorías de productos",            //Nombre de las barras o columnas.
        "Cantidad vendida",            //Nombre de la numeración.
        data,            //Datos del gráfico.
        PlotOrientation.HORIZONTAL,            //Orientación.
        true,            //Leyenda de barras individuales por columna.
        true,            //Herramientas.
        false            //Url de la gráfica.
        
        ); 
        
        ChartPanel graficaPanelMAV = new ChartPanel(grafica_barrasMAV);
        graficaPanelMAV.setMouseWheelEnabled(true);
        graficaPanelMAV.setPreferredSize(new Dimension(800, 510));

        mr.getJpnlMAV().setLayout(new BorderLayout());
        mr.getJpnlMAV().add(graficaPanelMAV, BorderLayout.NORTH);
        
        mr.getJpnlMAV().validate();
        mr.getJpnlMAV().repaint();
        
        
    }
    
    public void obtenerProductosMEV(ModuloReportes mr)
    {
        
        SQLReportes.generarProductosMEV(mr.getReporte());
        
        //Generamos los datos
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        Object alimentos[][] = mr.getReporte().getAlimentosMEV();
        Object desechables[][] = mr.getReporte().getDesechablesMEV();
        Object primeraNecesidad[][] = mr.getReporte().getPrimeraNecesidadMEV();
        Object segundaNecesidad[][] = mr.getReporte().getSegundaNecesidadMEV();
        
        
        for(int i = 0; i < 3; i++)
        {
            
            data.setValue(Integer.parseInt(alimentos[i][0].toString()), alimentos[i][1].toString(), "Alimentos");
            
        }
        
        for(int i = 0; i < 3; i++)
        {
            
            data.setValue(Integer.parseInt(desechables[i][0].toString()), desechables[i][1].toString(), "Desechables");
            
        }
        
        for(int i = 0; i < 3; i++)
        {
            
            data.setValue(Integer.parseInt(primeraNecesidad[i][0].toString()), primeraNecesidad[i][1].toString(), "Primera Necesidad");
            
        }
        
        
        for(int i = 0; i < 3; i++)
        {
            
            data.setValue(Integer.parseInt(segundaNecesidad[i][0].toString()), segundaNecesidad[i][1].toString(), "Segunda Necesidad");
            
        }
        
        //Generamos y agregamos la gráfica al panel 1
        
        JFreeChart grafica_barrasMEV = ChartFactory.createBarChart3D(
        "Productos menos vendidos",            //Nombre  de la gráfica.
        "Categorías de productos",            //Nombre de las barras o columnas.
        "Cantidad vendida",            //Nombre de la numeración.
        data,            //Datos del gráfico.
        PlotOrientation.HORIZONTAL,            //Orientación.
        true,            //Leyenda de barras individuales por columna.
        true,            //Herramientas.
        false            //Url de la gráfica.
        
        ); 
        
        ChartPanel graficaPanelMEV = new ChartPanel(grafica_barrasMEV);
        graficaPanelMEV.setMouseWheelEnabled(true);
        graficaPanelMEV.setPreferredSize(new Dimension(820, 510));

        mr.getJpnlMEV().setLayout(new BorderLayout());
        mr.getJpnlMEV().add(graficaPanelMEV, BorderLayout.NORTH);
        
        mr.getJpnlMEV().validate();
        mr.getJpnlMEV().repaint();
        
    }
    
    public void obtenerGastos(ModuloReportes mr)
    {
        
        SQLReportes.generarGastos(mr.getReporte());
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        
        data.setValue(-(mr.getReporte().getPedidos()), "Pedidos", "Pedidos");
        data.setValue(-(mr.getReporte().getPerecederos()), "Perecederos", "Perecederos");
        mr.getReporte().setTotal((- mr.getReporte().getPedidos() - mr.getReporte().getPerecederos()));
        
        data.setValue(mr.getReporte().getTotal(), "Total", "total");
        
        JFreeChart grafica_barrasGST = ChartFactory.createBarChart3D(
        "Gastos",            //Nombre  de la gráfica.
        "Tipos de gastos",            //Nombre de las barras o columnas.
        "Dinero en pérdidas",            //Nombre de la numeración.
        data,            //Datos del gráfico.
        PlotOrientation.HORIZONTAL,            //Orientación.
        true,            //Leyenda de barras individuales por columna.
        true,            //Herramientas.
        false            //Url de la gráfica.
        
        ); 
        
        ChartPanel graficaPanelGST = new ChartPanel(grafica_barrasGST);
        graficaPanelGST.setMouseWheelEnabled(true);
        graficaPanelGST.setPreferredSize(new Dimension(800, 510));

        mr.getJpnlGST().setLayout(new BorderLayout());
        mr.getJpnlGST().add(graficaPanelGST, BorderLayout.NORTH);
        
        mr.getJpnlGST().validate();
        mr.getJpnlGST().repaint();
        
    }
    
    public void obtenerProductosAPT(ModuloReportes mr)
    {
        
        SQLReportes.generarProductosAPT(mr.getReporte());
        
        //Generamos los datos
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        int j;
        
        for(int i = 0; i < mr.getReporte().getAlimentosAPT().size(); i+=2)
        {
            j = (i + 1);
            data.setValue(Float.parseFloat(mr.getReporte().getAlimentosAPT().get(i).toString()), mr.getReporte().getAlimentosAPT().get(j).toString(), "Alimentos");
        }
        
        
        for(int i = 0; i < mr.getReporte().getDesechablesAPT().size(); i+=2)
        {
            
            j = (i + 1);
            data.setValue(Float.parseFloat(mr.getReporte().getDesechablesAPT().get(i).toString()), mr.getReporte().getDesechablesAPT().get((j)).toString(), "Desechables");
            
        }
        
        
        for(int i = 0; i < mr.getReporte().getPrimeraNecesidadAPT().size(); i+=2)
        {
            
            j = (i + 1);
            data.setValue(Float.parseFloat(mr.getReporte().getPrimeraNecesidadAPT().get(i).toString()), mr.getReporte().getPrimeraNecesidadAPT().get(j).toString(), "Primera Necesidad");
            
        }
        
        
        for(int i = 0; i < mr.getReporte().getSegundaNecesidadAPT().size(); i+=2)
        {
  
            j = (i + 1);
            data.setValue(Float.parseFloat(mr.getReporte().getSegundaNecesidadAPT().get(i).toString()), mr.getReporte().getSegundaNecesidadAPT().get(j).toString(), "Segunda Necesidad");
        }
        
        //Generamos y agregamos la gráfica al panel 1
        
        JFreeChart grafica_barrasAPT = ChartFactory.createBarChart3D(
        "Productos cerca de terminar",            //Nombre  de la gráfica.
        "Categorías de productos",            //Nombre de las barras o columnas.
        "Cantidad en el almacén",            //Nombre de la numeración.
        data,            //Datos del gráfico.
        PlotOrientation.HORIZONTAL,            //Orientación.
        true,            //Leyenda de barras individuales por columna.
        true,            //Herramientas.
        false            //Url de la gráfica.
        
        ); 
        
        ChartPanel graficaPanelAPT = new ChartPanel(grafica_barrasAPT);
        graficaPanelAPT.setMouseWheelEnabled(true);
        graficaPanelAPT.setPreferredSize(new Dimension(820, 510));

        mr.getJpnlAPT().setLayout(new BorderLayout());
        mr.getJpnlAPT().add(graficaPanelAPT, BorderLayout.NORTH);
        
        mr.getJpnlAPT().validate();
        mr.getJpnlAPT().repaint();
        
        
        
    }
    
    public void ObtenerGanancia(ModuloReportes mr)
    {
        
        SQLReportes.generarGanancia(mr.getReporte());
        double ganancia;
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        
        
        data.setValue(mr.getReporte().getTotal(), "Gastos", "Gastos");
        data.setValue(mr.getReporte().getGanancia(), "Ventas", "Ventas");
        ganancia = (mr.getReporte().getGanancia() + mr.getReporte().getTotal());
        data.setValue(ganancia, "Ganancia", "Ganancia");
        
        JFreeChart grafica_barrasGNS = ChartFactory.createBarChart3D(
        "Ganancias",            //Nombre  de la gráfica.
        "Categorías",            //Nombre de las barras o columnas.
        "Dinero",            //Nombre de la numeración.
        data,            //Datos del gráfico.
        PlotOrientation.HORIZONTAL,            //Orientación.
        true,            //Leyenda de barras individuales por columna.
        true,            //Herramientas.
        false            //Url de la gráfica.
        
        ); 
        
        ChartPanel graficaPanelGNS = new ChartPanel(grafica_barrasGNS);
        graficaPanelGNS.setMouseWheelEnabled(true);
        graficaPanelGNS.setPreferredSize(new Dimension(820, 510));

        mr.getJpnlGNS().setLayout(new BorderLayout());
        mr.getJpnlGNS().add(graficaPanelGNS, BorderLayout.NORTH);
        
        mr.getJpnlGNS().validate();
        mr.getJpnlGNS().repaint();
        
    }

    public void generarReporte(ModuloReportes mr)
    {
        
        this.obtenerProductosMAV(mr);
        this.obtenerProductosMEV(mr);
        this.obtenerProductosAPT(mr);
        this.obtenerGastos(mr);
        this.ObtenerGanancia(mr);

    }

    public void moverPanelMAV(ModuloReportes mr)
    {
        
        if(mr.getJpnlMAV().getX() >= 1600)
        {
            
            Animacion.mover_izquierda(1600, 490, 2, 2, mr.getJpnlMAV());
            
        }else
        {
            
            Animacion.mover_derecha(490, 1600, 2, 2, mr.getJpnlMAV());
            
        }
        
    }

    public void moverPanelMEV(ModuloReportes mr)
    {
        
        if(mr.getJpnlMEV().getX() >= 1600)
        {
            
            Animacion.mover_izquierda(1610, 490, 2, 2, mr.getJpnlMEV());
            
        }else
        {
            
            Animacion.mover_derecha(490, 1610, 2, 2, mr.getJpnlMEV());
            
        }
        
    }

    public void moverPanelAPT(ModuloReportes mr)
    {
        
        if(mr.getJpnlAPT().getX() >= 1600)
        {
            
            Animacion.mover_izquierda(1615, 490, 2, 2, mr.getJpnlAPT());
            
        }else
        {
            
            Animacion.mover_derecha(490, 1615, 2, 2, mr.getJpnlAPT());
            
        }
        
    }

    public void moverPanelGST(ModuloReportes mr)
    {
        
        if(mr.getJpnlGST().getX() >= 1600)
        {
            
            Animacion.mover_izquierda(1620, 490, 2, 2, mr.getJpnlGST());
            
        }else
        {
            
            Animacion.mover_derecha(490, 1620, 2, 2, mr.getJpnlGST());
            
        }
        
    }
    
    public void moverPanelGNS(ModuloReportes mr)
    {
        
        if(mr.getJpnlGNS().getX() >= 1600)
        {
            
            Animacion.mover_izquierda(1625, 490, 2, 2, mr.getJpnlGNS());
            
        }else
        {
            
            Animacion.mover_derecha(490, 1625, 2, 2, mr.getJpnlGNS());
            
        }
        
    }
    
}
