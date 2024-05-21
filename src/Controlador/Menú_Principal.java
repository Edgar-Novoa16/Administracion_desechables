package Controlador;

import Animacion.*;
import Vista.Menu_Principal;
import static java.awt.Frame.ICONIFIED;


public class Menú_Principal {

//Para lo del botón de menú principal.
    
public void moverPanelDeMenu(Menu_Principal menuP ){
    
    if(menuP.getPanelMenu().getX() > -1){
       Animacion.mover_izquierda(0, -260, 2, 2, menuP.getPanelMenu());
       
    }else{
       Animacion.mover_derecha(-280, 0, 2, 2, menuP.getPanelMenu());
       
    }
}

public void seleccionarCrearUsuario(Menu_Principal menuP, javax.swing.JPanel crearU){
  
  menuP.getTbdPrincipal().addTab("Crear Usuario", crearU);
  menuP.getTbdPrincipal().setSelectedComponent(crearU);
    
}

public void seleccionarInicio(Menu_Principal menuP, javax.swing.JPanel princi){
  
  try{  
  menuP.getTbdPrincipal().removeAll();
  menuP.validate();
  menuP.getTbdPrincipal().addTab("Principal", princi);
  menuP.getTbdPrincipal().setSelectedIndex(0);
  }catch(Exception e){
     
  }  
}

public void seleccionarSalir(){
    
   System.exit(0);
   
}

public void seleccionarPedidos(Menu_Principal menuP, javax.swing.JPanel pedidos){
    
    menuP.getTbdPrincipal().addTab("Pedidos", pedidos);
    menuP.validate();
    menuP.getTbdPrincipal().setSelectedComponent(pedidos);
    
}

public void seleccionarProductos(Menu_Principal menuP, javax.swing.JPanel productos){
    
    menuP.getTbdPrincipal().addTab("Productos", productos);
    menuP.validate();
    menuP.getTbdPrincipal().setSelectedComponent(productos);
    
}


public void seleccionarProductosPerecederos(Menu_Principal menuP, javax.swing.JPanel productosPere){
    
    menuP.getTbdPrincipal().addTab("Productos perecederos", productosPere);
    menuP.validate();
    menuP.getTbdPrincipal().setSelectedComponent(productosPere);
    
}

public void seleccionarProveedores(Menu_Principal menuP, javax.swing.JPanel proveedores){
    
    menuP.getTbdPrincipal().addTab("Pedidos", proveedores);
    menuP.validate();
    menuP.getTbdPrincipal().setSelectedComponent(proveedores);
    
}

public void seleccionarReportes(Menu_Principal menuP, javax.swing.JPanel reportes){
    
    menuP.getTbdPrincipal().addTab("Pedidos", reportes);
    menuP.validate();
    menuP.getTbdPrincipal().setSelectedComponent(reportes);
    
}

public void seleccionarVentas(Menu_Principal menuP, javax.swing.JPanel ventas){
    
    menuP.getTbdPrincipal().addTab("Pedidos", ventas);
    menuP.validate();
    menuP.getTbdPrincipal().setSelectedComponent(ventas);
    
}

public void seleccionarMinimizar(Menu_Principal menuP){
    
    menuP.setExtendedState(ICONIFIED);
    
}

public void seleccionarFacturas(Menu_Principal menuP, javax.swing.JPanel facturas){
    
    menuP.getTbdPrincipal().addTab("Facturas", facturas);
    menuP.validate();
    menuP.getTbdPrincipal().setSelectedComponent(facturas);
    
}



    
}
