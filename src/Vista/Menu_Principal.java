/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Menú_Principal;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author marco
 */
public class Menu_Principal extends javax.swing.JFrame {


Menú_Principal menuPrinci = new Menú_Principal();
ModuloCrearUsuario crearU;
ModuloPedidos pedidos;
ModuloProductos productos;
ModuloProductosPerecederos productosPere;
ModuloProveedores proveedores;
ModuloReportes reportes;
ModuloVentas ventas;
ModuloFacturas facturas;
Principal princi;

private boolean errorCancelado = false;
private int contadorC = 0;
private int contadorPedidos = 0;
private int contadorProductos = 0;
private int contadorProductosPere = 0;
private int contadorProveedores = 0;
private int contadorReportes = 0;
private int contadorVentas = 0;
private int contadorFacturas = 0;


    public Menu_Principal(String privilegio) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        princi = new Principal();
        this.tbdPrincipal.addTab("Principal", princi);
        
        if(privilegio.equals("EMPLEADO"))
        {

        JButton btn[] = new JButton[5];
        btn[0] =  (JButton) this.panelMenu.getComponent(0);
        btn[1] =  (JButton) this.panelMenu.getComponent(8);
        btn[2] =  (JButton) this.panelMenu.getComponent(7);
        btn[3] =  (JButton) this.panelMenu.getComponent(9);
        btn[4] =  (JButton) this.panelMenu.getComponent(10);
        
            
            btn[0].setEnabled(false);
            btn[1].setEnabled(false);
            btn[2].setEnabled(false);
            btn[3].setEnabled(false);
            btn[4].setEnabled(false);
            
            JOptionPane.showMessageDialog(null, "Bienvenido krnal. EMPLEADO AAAAAAH!");
            this.errorCancelado = true;
            
        }else
        {
            JOptionPane.showMessageDialog(null, "BIENVENIDO ADMINISTRADOOOOOOR. YEAH!");
        }
        
    }


    public javax.swing.JPanel getPanelMenu(){
        return panelMenu;
    }

    public JButton getBtnFacturas() {
        return btnFacturas;
    }

    public JButton getBtnGastos() {
        return btnGastos;
    }

    public JButton getBtnProductos() {
        return btnProductos;
    }

    public JButton getBtnProveedores() {
        return btnProveedores;
    }

    public JButton getBtnReportes() {
        return btnReportes;
    }

    public JButton getBtnUsuarios() {
        return btnUsuarios;
    }

    public JTabbedPane getTbdPrincipal() {
        return tbdPrincipal;
    }


    
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        btnFacturas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnProveedores = new javax.swing.JButton();
        btnGastos = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVentas = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        btnPedidos = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnPerecederos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        tbdPrincipal = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1078, 578));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1070, 577));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(14, 11, 22));
        panelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(98, 109, 113), 3));
        panelMenu.setForeground(new java.awt.Color(204, 204, 204));
        panelMenu.setPreferredSize(new java.awt.Dimension(220, 580));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFacturas.setBackground(new java.awt.Color(255, 255, 255));
        btnFacturas.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnFacturas.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturas.setText("Facturas");
        btnFacturas.setBorder(null);
        btnFacturas.setContentAreaFilled(false);
        btnFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacturas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia abajo de 45 pixeles.png"))); // NOI18N
        btnFacturas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia la derecha de 45 pixeles diseño 3.png"))); // NOI18N
        btnFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFacturasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFacturasMouseEntered(evt);
            }
        });
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });
        panelMenu.add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 40));

        btnProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnProductos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("Productos");
        btnProductos.setBorder(null);
        btnProductos.setContentAreaFilled(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia abajo de 45 pixeles.png"))); // NOI18N
        btnProductos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia la derecha de 45 pixeles diseño 3.png"))); // NOI18N
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
        });
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        panelMenu.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 40));
        panelMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 150, 30));
        panelMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 30));
        panelMenu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, 30));
        panelMenu.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 150, 30));
        panelMenu.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 30));

        btnProveedores.setBackground(new java.awt.Color(255, 255, 255));
        btnProveedores.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setText("Proveedores");
        btnProveedores.setBorder(null);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia abajo de 45 pixeles.png"))); // NOI18N
        btnProveedores.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia la derecha de 45 pixeles diseño 3.png"))); // NOI18N
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseEntered(evt);
            }
        });
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        panelMenu.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 40));

        btnGastos.setBackground(new java.awt.Color(255, 255, 255));
        btnGastos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnGastos.setForeground(new java.awt.Color(255, 255, 255));
        btnGastos.setText("Gastos");
        btnGastos.setBorder(null);
        btnGastos.setContentAreaFilled(false);
        btnGastos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGastos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia abajo de 45 pixeles.png"))); // NOI18N
        btnGastos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia la derecha de 45 pixeles diseño 3.png"))); // NOI18N
        btnGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGastosMouseEntered(evt);
            }
        });
        btnGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGastosActionPerformed(evt);
            }
        });
        panelMenu.add(btnGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, 40));

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes");
        btnReportes.setBorder(null);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia abajo de 45 pixeles.png"))); // NOI18N
        btnReportes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia la derecha de 45 pixeles diseño 3.png"))); // NOI18N
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
        });
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        panelMenu.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 40));

        btnUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(null);
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia la derecha de 45 pixeles diseño 3.png"))); // NOI18N
        btnUsuarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia abajo de 45 pixeles.png"))); // NOI18N
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        panelMenu.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 110, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        panelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 130, 60));

        btnVentas.setBackground(new java.awt.Color(255, 255, 255));
        btnVentas.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("Ventas");
        btnVentas.setBorder(null);
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia abajo de 45 pixeles.png"))); // NOI18N
        btnVentas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia la derecha de 45 pixeles diseño 3.png"))); // NOI18N
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
        });
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        panelMenu.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 40));
        panelMenu.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 150, 30));

        btnPedidos.setBackground(new java.awt.Color(255, 255, 255));
        btnPedidos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnPedidos.setForeground(new java.awt.Color(255, 255, 255));
        btnPedidos.setText("Pedidos");
        btnPedidos.setBorder(null);
        btnPedidos.setContentAreaFilled(false);
        btnPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia abajo de 45 pixeles.png"))); // NOI18N
        btnPedidos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia la derecha de 45 pixeles diseño 3.png"))); // NOI18N
        btnPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPedidosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPedidosMouseEntered(evt);
            }
        });
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        panelMenu.add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 170, 40));
        panelMenu.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 150, 30));
        panelMenu.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 150, 30));

        btnPerecederos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnPerecederos.setForeground(new java.awt.Color(255, 255, 255));
        btnPerecederos.setText("Perecederos");
        btnPerecederos.setBorder(null);
        btnPerecederos.setBorderPainted(false);
        btnPerecederos.setContentAreaFilled(false);
        btnPerecederos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerecederos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia abajo de 45 pixeles.png"))); // NOI18N
        btnPerecederos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha hacia la derecha de 45 pixeles diseño 3.png"))); // NOI18N
        btnPerecederos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPerecederosMouseClicked(evt);
            }
        });
        panelMenu.add(btnPerecederos, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 380, 150, 30));

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 70, -1, 580));

        jPanel1.setBackground(new java.awt.Color(0, 41, 60));
        jPanel1.setMinimumSize(new java.awt.Dimension(1070, 570));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menú blanco de 50.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menú negro de 50.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menú azul de 50.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono de inicio de 50 pixeles.png"))); // NOI18N
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono de inicio de color negro de 50 pixeles.png"))); // NOI18N
        btnInicio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono de inicio de color azul de 50 pixeles.png"))); // NOI18N
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono de equis color blanco de 50 pixeles.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono de equis de color rojo con blanco de 50 pixeles.png"))); // NOI18N
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono de equis de color completamente rojo de 50 pixeles.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono de minimizar de color blanco de 50 pixeles.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono de minimizar de color blanco con amarillo.png"))); // NOI18N
        btnMinimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono de minimizar de color completamente azul.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 834, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMinimizar)
                    .addComponent(btnSalir)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(514, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 70));

        tbdPrincipal.setEnabled(false);
        getContentPane().add(tbdPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1290, 610));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    menuPrinci.moverPanelDeMenu(this);
    }//GEN-LAST:event_jButton2MouseClicked

    private void btnFacturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturasMouseEntered

    }//GEN-LAST:event_btnFacturasMouseEntered

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosMouseEntered
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosActionPerformed
    
    
    private void btnProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresMouseEntered
    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresActionPerformed
    private void btnGastosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGastosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGastosMouseEntered

    private void btnGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGastosActionPerformed
    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked

        
    if(this.errorCancelado == false)
    {
        if(this.contadorC == 0){
        
        this.crearU = new ModuloCrearUsuario(); 
        menuPrinci.seleccionarCrearUsuario(this, crearU);
        this.validate();
        this.contadorC++;
        
        }else{
        
        this.tbdPrincipal.setSelectedComponent(crearU);
            
        }
    }
    
    }//GEN-LAST:event_btnUsuariosMouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked

        menuPrinci.seleccionarInicio(this, princi);
        this.contadorC = 0;  
        this.crearU = null;
        this.contadorPedidos = 0;
        this.pedidos = null;
        this.contadorProductos = 0;
        this.productos = null;
        this.contadorProductosPere = 0;
        this.productosPere = null;
        this.contadorProveedores = 0;
        this.proveedores = null;
        this.contadorReportes = 0;
        this.reportes = null;
        this.contadorVentas = 0;
        this.ventas = null;
        this.contadorFacturas = 0;
        this.facturas = null;
        
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked

        menuPrinci.seleccionarSalir();

    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        
        if(this.contadorProductos == 0){
            this.productos = new ModuloProductos();
            menuPrinci.seleccionarProductos(this, productos);
            this.contadorProductos++;
            
        }else{
            
            this.tbdPrincipal.setSelectedComponent(productos);
            
        }
        
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseClicked

    if(this.errorCancelado == false){    
        if(this.contadorProveedores == 0){
            
            this.proveedores = new ModuloProveedores();
            menuPrinci.seleccionarProveedores(this, proveedores);
            this.contadorProveedores++;
            
        }else{
            
            this.tbdPrincipal.setSelectedComponent(proveedores);
            
        }
    }    

    }//GEN-LAST:event_btnProveedoresMouseClicked

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked

    if(this.errorCancelado == false)
    {
        if(this.contadorReportes == 0){
            
            this.reportes = new ModuloReportes();
            menuPrinci.seleccionarReportes(this, reportes);
            this.contadorReportes++;
            
        }else{
            
            this.tbdPrincipal.setSelectedComponent(reportes);
            
        }
        
    }   

    }//GEN-LAST:event_btnReportesMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked

        menuPrinci.seleccionarMinimizar(this);

    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPedidosMouseEntered

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidosMouseClicked
        
        if(this.contadorPedidos == 0){
        
          this.pedidos = new ModuloPedidos();  
          menuPrinci.seleccionarPedidos(this, pedidos);
          this.contadorPedidos++;
          
        }else{
        
          this.tbdPrincipal.setSelectedComponent(pedidos);
          
        }
    
    }//GEN-LAST:event_btnPedidosMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked

        
       if(this.contadorVentas == 0){
         
         this.ventas = new ModuloVentas();  
         menuPrinci.seleccionarVentas(this, ventas);
         this.contadorVentas++;
         
       }else{
           
         this.tbdPrincipal.setSelectedComponent(ventas);
           
       }


    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturasMouseClicked

    if(this.errorCancelado == false)
    {
      if(this.contadorFacturas == 0){
          
         this.facturas = new ModuloFacturas(); 
         menuPrinci.seleccionarFacturas(this, this.facturas);
         this.contadorFacturas++;
          
      }else{
          
        this.tbdPrincipal.setSelectedComponent(facturas);
          
      }  
    }  
      
    }//GEN-LAST:event_btnFacturasMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnPerecederosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerecederosMouseClicked
  
       if(this.contadorProductosPere == 0){
          
         this.productosPere = new ModuloProductosPerecederos(); 
         this.menuPrinci.seleccionarProductosPerecederos(this, this.productosPere);
         this.contadorProductosPere++;
        }else{
          
        this.tbdPrincipal.setSelectedComponent(productosPere);
          
        }
        
        
    }//GEN-LAST:event_btnPerecederosMouseClicked


 public int getContadorProductosPere() {
        return contadorProductosPere;
    }

    public void setContadorProductosPere(int contadorProductosPere) {
        this.contadorProductosPere = contadorProductosPere;
    }

    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnGastos;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnPerecederos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JTabbedPane tbdPrincipal;
    // End of variables declaration//GEN-END:variables
}
