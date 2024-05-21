/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Perecederos;
import Modelo.ProductoPerecedero;
import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author marco
 */
public class ModuloProductosPerecederos extends javax.swing.JPanel {

    /**
     * Creates new form ModuloProductosPerecederos
     */
    public ModuloProductosPerecederos() {
        initComponents();
    }

    Perecederos pp = new Perecederos();
    ProductoPerecedero productoP;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jcmbTipoProductoPere = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jtxtMerma = new javax.swing.JTextField();
        jtxtMotivoPerdida = new javax.swing.JTextField();
        jtxtCantidadProductoPere = new javax.swing.JTextField();
        btnInsertarProductoPere = new javax.swing.JButton();
        jtxtClaveProductoPere = new javax.swing.JTextField();
        btnCancelarProductoPere = new javax.swing.JButton();
        jdtFechaPerdida = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblProductosPere = new javax.swing.JTable();
        jcmbFiltroTipoPP = new javax.swing.JComboBox<>();
        jrbFiltroTodosLosProductosP = new javax.swing.JRadioButton();
        jrbFiltroCantidadProductosP = new javax.swing.JRadioButton();
        jrbFiltroPorIdProducto = new javax.swing.JRadioButton();
        jrbFiltroPorCantidadPerdida = new javax.swing.JRadioButton();
        jrbFiltroPorMerma = new javax.swing.JRadioButton();
        jrbFiltroPorFechaPerdida = new javax.swing.JRadioButton();
        jtxtFiltroCantidadProductosPInicial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxtFiltroCantidadProductosPFinal = new javax.swing.JTextField();
        jtxtFiltroPorIdProducto = new javax.swing.JTextField();
        jtxtFiltroPorCantidadPerdidaInicial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtFiltroPorCantidadPerdidaFinal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtFiltroPorMermaInicial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtFiltroPorMermaFinal = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        jdtFiltroPorFechaPerdidaInicial = new com.toedter.calendar.JDateChooser();
        jdtFiltroPorFechaPerdidaFinal = new com.toedter.calendar.JDateChooser();

        jTextField3.setText("jTextField1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(130, 202, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcmbTipoProductoPere.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jcmbTipoProductoPere.setForeground(new java.awt.Color(153, 153, 153));
        jcmbTipoProductoPere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALIMENTOS", "DESECHABLES", "PRIMERA NECESIDAD", "SEGUNDA NECESIDAD" }));
        jcmbTipoProductoPere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbTipoProductoPereActionPerformed(evt);
            }
        });
        jPanel2.add(jcmbTipoProductoPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("FECHA DE PERDIDA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 29));

        jtxtMerma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtMerma.setForeground(new java.awt.Color(153, 153, 153));
        jtxtMerma.setText("           MERMA");
        jtxtMerma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtMermaMouseClicked(evt);
            }
        });
        jtxtMerma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMermaActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtMerma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 100, 30));

        jtxtMotivoPerdida.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtMotivoPerdida.setForeground(new java.awt.Color(153, 153, 153));
        jtxtMotivoPerdida.setText("                     MOTIVO");
        jtxtMotivoPerdida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtMotivoPerdidaMouseClicked(evt);
            }
        });
        jtxtMotivoPerdida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMotivoPerdidaActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtMotivoPerdida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 180, 30));

        jtxtCantidadProductoPere.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtCantidadProductoPere.setForeground(new java.awt.Color(153, 153, 153));
        jtxtCantidadProductoPere.setText("      CANTIDAD");
        jtxtCantidadProductoPere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtCantidadProductoPereMouseClicked(evt);
            }
        });
        jtxtCantidadProductoPere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCantidadProductoPereActionPerformed(evt);
            }
        });
        jtxtCantidadProductoPere.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCantidadProductoPereKeyReleased(evt);
            }
        });
        jPanel2.add(jtxtCantidadProductoPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 30));

        btnInsertarProductoPere.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        btnInsertarProductoPere.setForeground(new java.awt.Color(51, 51, 51));
        btnInsertarProductoPere.setText("INSERTAR");
        btnInsertarProductoPere.setBorder(null);
        btnInsertarProductoPere.setBorderPainted(false);
        btnInsertarProductoPere.setContentAreaFilled(false);
        btnInsertarProductoPere.setFocusPainted(false);
        btnInsertarProductoPere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarProductoPereMouseClicked(evt);
            }
        });
        jPanel2.add(btnInsertarProductoPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 100, 40));

        jtxtClaveProductoPere.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtClaveProductoPere.setForeground(new java.awt.Color(153, 153, 153));
        jtxtClaveProductoPere.setText("CLAVE PRODUCTO");
        jtxtClaveProductoPere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtClaveProductoPereMouseClicked(evt);
            }
        });
        jtxtClaveProductoPere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtClaveProductoPereActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtClaveProductoPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 20));

        btnCancelarProductoPere.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        btnCancelarProductoPere.setForeground(new java.awt.Color(51, 51, 51));
        btnCancelarProductoPere.setText("CANCELAR");
        btnCancelarProductoPere.setBorder(null);
        btnCancelarProductoPere.setBorderPainted(false);
        btnCancelarProductoPere.setContentAreaFilled(false);
        btnCancelarProductoPere.setFocusPainted(false);
        btnCancelarProductoPere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarProductoPereMouseClicked(evt);
            }
        });
        jPanel2.add(btnCancelarProductoPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 100, 40));

        jdtFechaPerdida.setDateFormatString("yyyy-MM-dd");
        jdtFechaPerdida.setMaxSelectableDate(new java.util.Date(2556169310000L));
        jdtFechaPerdida.setMinSelectableDate(new java.util.Date(1622527310000L));
        jdtFechaPerdida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdtFechaPerdidaMouseClicked(evt);
            }
        });
        jPanel2.add(jdtFechaPerdida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 270, 590));

        jPanel3.setBackground(new java.awt.Color(63, 50, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 590));

        jtblProductosPere.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUCTO PERECEDERO", "CLAVE PRODUCTO", "TIPO PRODUCTO", "CANTIDAD", "FECHA DE PERDIDA", "MOTIVO", "MERMA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblProductosPere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblProductosPereMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblProductosPere);

        jcmbFiltroTipoPP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALIMENTOS", "DESECHABLES", "PRIMERA NECESIDAD", "SEGUNDA NECESIDAD", " " }));
        jcmbFiltroTipoPP.setEnabled(false);

        buttonGroup1.add(jrbFiltroTodosLosProductosP);
        jrbFiltroTodosLosProductosP.setText("Traer todos los productos");
        jrbFiltroTodosLosProductosP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFiltroTodosLosProductosPMouseClicked(evt);
            }
        });

        buttonGroup1.add(jrbFiltroCantidadProductosP);
        jrbFiltroCantidadProductosP.setText("Filtrar una cantidad de productos");
        jrbFiltroCantidadProductosP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFiltroCantidadProductosPMouseClicked(evt);
            }
        });

        buttonGroup1.add(jrbFiltroPorIdProducto);
        jrbFiltroPorIdProducto.setText("Filtrar por id producto");
        jrbFiltroPorIdProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFiltroPorIdProductoMouseClicked(evt);
            }
        });

        buttonGroup1.add(jrbFiltroPorCantidadPerdida);
        jrbFiltroPorCantidadPerdida.setText("Filtrar por cantidad perdida");
        jrbFiltroPorCantidadPerdida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFiltroPorCantidadPerdidaMouseClicked(evt);
            }
        });

        buttonGroup1.add(jrbFiltroPorMerma);
        jrbFiltroPorMerma.setText("Filtrar por merma");
        jrbFiltroPorMerma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFiltroPorMermaMouseClicked(evt);
            }
        });

        buttonGroup1.add(jrbFiltroPorFechaPerdida);
        jrbFiltroPorFechaPerdida.setText("Filtrar por fecha de pérdida");
        jrbFiltroPorFechaPerdida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFiltroPorFechaPerdidaMouseClicked(evt);
            }
        });

        jtxtFiltroCantidadProductosPInicial.setEnabled(false);

        jLabel1.setText("A");

        jtxtFiltroCantidadProductosPFinal.setEnabled(false);

        jtxtFiltroPorIdProducto.setEnabled(false);

        jtxtFiltroPorCantidadPerdidaInicial.setEnabled(false);

        jLabel3.setText("A");

        jtxtFiltroPorCantidadPerdidaFinal.setEnabled(false);

        jLabel4.setText("A");

        jtxtFiltroPorMermaInicial.setEnabled(false);

        jLabel5.setText("A");

        jtxtFiltroPorMermaFinal.setEnabled(false);

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltrarMouseClicked(evt);
            }
        });

        jdtFiltroPorFechaPerdidaInicial.setDateFormatString("yyyy-MM-dd");
        jdtFiltroPorFechaPerdidaInicial.setEnabled(false);
        jdtFiltroPorFechaPerdidaInicial.setMaxSelectableDate(new java.util.Date(2556169310000L));
        jdtFiltroPorFechaPerdidaInicial.setMinSelectableDate(new java.util.Date(1622527310000L));
        jdtFiltroPorFechaPerdidaInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdtFiltroPorFechaPerdidaInicialMouseClicked(evt);
            }
        });

        jdtFiltroPorFechaPerdidaFinal.setDateFormatString("yyyy-MM-dd");
        jdtFiltroPorFechaPerdidaFinal.setEnabled(false);
        jdtFiltroPorFechaPerdidaFinal.setMaxSelectableDate(new java.util.Date(2556169310000L));
        jdtFiltroPorFechaPerdidaFinal.setMinSelectableDate(new java.util.Date(1622527310000L));
        jdtFiltroPorFechaPerdidaFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdtFiltroPorFechaPerdidaFinalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbFiltroTodosLosProductosP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbFiltroCantidadProductosP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtFiltroCantidadProductosPInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addComponent(jtxtFiltroCantidadProductosPFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcmbFiltroTipoPP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbFiltroPorIdProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtFiltroPorIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbFiltroPorMerma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtFiltroPorMermaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jrbFiltroPorCantidadPerdida)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtxtFiltroPorCantidadPerdidaInicial))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jrbFiltroPorFechaPerdida)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jdtFiltroPorFechaPerdidaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(7, 7, 7)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxtFiltroPorCantidadPerdidaFinal)
                                    .addComponent(jdtFiltroPorFechaPerdidaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtFiltroPorMermaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiltrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmbFiltroTipoPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbFiltroTodosLosProductosP)
                    .addComponent(jrbFiltroCantidadProductosP)
                    .addComponent(jtxtFiltroCantidadProductosPInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtFiltroCantidadProductosPFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jrbFiltroPorIdProducto)
                                .addComponent(jrbFiltroPorMerma)
                                .addComponent(jtxtFiltroPorIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxtFiltroPorMermaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtFiltroPorMermaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jrbFiltroPorCantidadPerdida)
                                        .addComponent(jtxtFiltroPorCantidadPerdidaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addComponent(jtxtFiltroPorCantidadPerdidaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jrbFiltroPorFechaPerdida))
                                    .addComponent(jdtFiltroPorFechaPerdidaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdtFiltroPorFechaPerdidaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbTipoProductoPereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbTipoProductoPereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbTipoProductoPereActionPerformed

    private void jtxtMermaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtMermaMouseClicked
        jtxtMerma.setText("");

        if(jtxtMerma.getText().equals("")){
            jtxtMerma.setText("");
        }
        if(jtxtMotivoPerdida.getText().equals("")){

            jtxtMotivoPerdida.setText("              MOTIVO");

        }
        if(jtxtCantidadProductoPere.getText().equals("")){

            jtxtCantidadProductoPere.setText(" CANTIDAD");

        }
        if(jtxtClaveProductoPere.getText().equals("")){

            jtxtClaveProductoPere.setText(" CLAVE PRODUCTO");

        }
    }//GEN-LAST:event_jtxtMermaMouseClicked

    private void jtxtMermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMermaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMermaActionPerformed

    private void jtxtMotivoPerdidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtMotivoPerdidaMouseClicked
        jtxtMotivoPerdida.setText("");
        if(jtxtMotivoPerdida.getText().equals("")){
            jtxtMotivoPerdida.setText("");
        }
        if(jtxtMerma.getText().equals("")){

            jtxtMerma.setText(" MERMA");

        }
        if(jtxtCantidadProductoPere.getText().equals("")){

            jtxtCantidadProductoPere.setText(" CANTIDAD");

        }
        if(jtxtClaveProductoPere.getText().equals("")){

            jtxtClaveProductoPere.setText(" CLAVE PRODUCTO");

        }
    }//GEN-LAST:event_jtxtMotivoPerdidaMouseClicked

    private void jtxtMotivoPerdidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMotivoPerdidaActionPerformed

    }//GEN-LAST:event_jtxtMotivoPerdidaActionPerformed

    private void jtxtCantidadProductoPereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtCantidadProductoPereMouseClicked
        jtxtCantidadProductoPere.setText("");
        if(jtxtCantidadProductoPere.getText().equals("")){
            jtxtCantidadProductoPere.setText("");
        }
        if(jtxtMotivoPerdida.getText().equals("")){

            jtxtMotivoPerdida.setText("              MOTIVO");

        }
        if(jtxtMerma.getText().equals("")){

            jtxtMerma.setText(" MERMA");

        }
        if(jtxtClaveProductoPere.getText().equals("")){

            jtxtClaveProductoPere.setText(" CLAVE PRODUCTO");

        }
    }//GEN-LAST:event_jtxtCantidadProductoPereMouseClicked

    private void jtxtCantidadProductoPereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCantidadProductoPereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCantidadProductoPereActionPerformed

    private void btnInsertarProductoPereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarProductoPereMouseClicked

        boolean estadoCampos;    
        this.productoP = new ProductoPerecedero();
    
        estadoCampos = this.pp.obtenerInformacion(this);
        
        if(estadoCampos != false)
        {
            
            
            this.pp.agregarRegistroProducto(this);
            
        }else
        {
            
            JOptionPane.showMessageDialog(null, "Inserta Información verídica");
            
        }
        
    }//GEN-LAST:event_btnInsertarProductoPereMouseClicked

    private void jtxtClaveProductoPereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtClaveProductoPereMouseClicked
        jtxtClaveProductoPere.setText("");
        if(jtxtClaveProductoPere.getText().equals("")){
            jtxtClaveProductoPere.setText("");
        }
        if(jtxtMotivoPerdida.getText().equals("")){

            jtxtMotivoPerdida.setText("              MOTIVO");

        }
        if(jtxtMerma.getText().equals("")){

            jtxtMerma.setText(" MERMA");

        }
        if(jtxtCantidadProductoPere.getText().equals("")){

            jtxtCantidadProductoPere.setText("CANTIDAD");

        }

    }//GEN-LAST:event_jtxtClaveProductoPereMouseClicked

    private void jtxtClaveProductoPereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtClaveProductoPereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtClaveProductoPereActionPerformed

    private void btnCancelarProductoPereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarProductoPereMouseClicked

       this.pp.cancelarEdicionProductos(this);

    }//GEN-LAST:event_btnCancelarProductoPereMouseClicked

    private void jtblProductosPereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblProductosPereMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtblProductosPereMouseClicked

    private void jtxtCantidadProductoPereKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCantidadProductoPereKeyReleased

       this.pp.establecerPrecioPedido(this);

    }//GEN-LAST:event_jtxtCantidadProductoPereKeyReleased

    private void jdtFechaPerdidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdtFechaPerdidaMouseClicked

    }//GEN-LAST:event_jdtFechaPerdidaMouseClicked

    private void jdtFiltroPorFechaPerdidaInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdtFiltroPorFechaPerdidaInicialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jdtFiltroPorFechaPerdidaInicialMouseClicked

    private void jdtFiltroPorFechaPerdidaFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdtFiltroPorFechaPerdidaFinalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jdtFiltroPorFechaPerdidaFinalMouseClicked

    private void btnFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarMouseClicked

        this.pp.consultar(this);

    }//GEN-LAST:event_btnFiltrarMouseClicked

    private void jrbFiltroTodosLosProductosPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFiltroTodosLosProductosPMouseClicked
        
        this.productoP = new ProductoPerecedero();
        this.jcmbFiltroTipoPP.setEnabled(true);
        this.jtxtFiltroCantidadProductosPFinal.setEnabled(false);
        this.jtxtFiltroCantidadProductosPFinal.setText("");
        this.jtxtFiltroCantidadProductosPInicial.setEnabled(false);
        this.jtxtFiltroCantidadProductosPInicial.setText("");
        this.jtxtFiltroPorCantidadPerdidaFinal.setEnabled(false);
        this.jtxtFiltroPorCantidadPerdidaFinal.setText("");
        this.jtxtFiltroPorCantidadPerdidaInicial.setEnabled(false);
        this.jtxtFiltroPorCantidadPerdidaInicial.setText("");
        this.jtxtFiltroPorIdProducto.setEnabled(false);
        this.jtxtFiltroPorIdProducto.setText("");
        this.jtxtFiltroPorMermaFinal.setEnabled(false);
        this.jtxtFiltroPorMermaFinal.setText("");
        this.jtxtFiltroPorMermaInicial.setEnabled(false);
        this.jtxtFiltroPorMermaInicial.setText("");
        this.jdtFiltroPorFechaPerdidaInicial.setEnabled(false);
        this.jdtFiltroPorFechaPerdidaInicial.setDate(null);
        this.jdtFiltroPorFechaPerdidaFinal.setEnabled(false);
        this.jdtFiltroPorFechaPerdidaFinal.setDate(null);        

    }//GEN-LAST:event_jrbFiltroTodosLosProductosPMouseClicked

    private void jrbFiltroCantidadProductosPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFiltroCantidadProductosPMouseClicked

        this.productoP = new ProductoPerecedero();
        this.jcmbFiltroTipoPP.setEnabled(true);
        this.jtxtFiltroCantidadProductosPFinal.setEnabled(true);
        this.jtxtFiltroCantidadProductosPInicial.setEnabled(true);
        this.jtxtFiltroPorCantidadPerdidaFinal.setEnabled(false);
        this.jtxtFiltroPorCantidadPerdidaFinal.setText("");
        this.jtxtFiltroPorCantidadPerdidaInicial.setEnabled(false);
        this.jtxtFiltroPorCantidadPerdidaInicial.setText("");
        this.jtxtFiltroPorIdProducto.setEnabled(false);
        this.jtxtFiltroPorIdProducto.setText("");
        this.jtxtFiltroPorMermaFinal.setEnabled(false);
        this.jtxtFiltroPorMermaFinal.setText("");
        this.jtxtFiltroPorMermaInicial.setEnabled(false);
        this.jtxtFiltroPorMermaInicial.setText("");
        this.jdtFiltroPorFechaPerdidaInicial.setEnabled(false);
        this.jdtFiltroPorFechaPerdidaInicial.setDate(null);
        this.jdtFiltroPorFechaPerdidaFinal.setEnabled(false);
        this.jdtFiltroPorFechaPerdidaFinal.setDate(null);
        
        
    }//GEN-LAST:event_jrbFiltroCantidadProductosPMouseClicked

    private void jrbFiltroPorIdProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFiltroPorIdProductoMouseClicked

        this.productoP = new ProductoPerecedero();
        this.jcmbFiltroTipoPP.setEnabled(true);
        this.jtxtFiltroCantidadProductosPFinal.setEnabled(false);
        this.jtxtFiltroCantidadProductosPFinal.setText("");
        this.jtxtFiltroCantidadProductosPInicial.setEnabled(false);
        this.jtxtFiltroCantidadProductosPInicial.setText("");
        this.jtxtFiltroPorCantidadPerdidaFinal.setEnabled(false);
        this.jtxtFiltroPorCantidadPerdidaFinal.setText("");
        this.jtxtFiltroPorCantidadPerdidaInicial.setEnabled(false);
        this.jtxtFiltroPorCantidadPerdidaInicial.setText("");
        this.jtxtFiltroPorIdProducto.setEnabled(true);
        this.jtxtFiltroPorMermaFinal.setEnabled(false);
        this.jtxtFiltroPorMermaFinal.setText("");
        this.jtxtFiltroPorMermaInicial.setEnabled(false);
        this.jtxtFiltroPorMermaInicial.setText("");
        this.jdtFiltroPorFechaPerdidaInicial.setEnabled(false);
        this.jdtFiltroPorFechaPerdidaInicial.setDate(null);
        this.jdtFiltroPorFechaPerdidaFinal.setEnabled(false);
        this.jdtFiltroPorFechaPerdidaFinal.setDate(null);       

    }//GEN-LAST:event_jrbFiltroPorIdProductoMouseClicked

    private void jrbFiltroPorMermaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFiltroPorMermaMouseClicked

        this.productoP = new ProductoPerecedero();
        this.jcmbFiltroTipoPP.setEnabled(true);
        this.jtxtFiltroCantidadProductosPFinal.setEnabled(false);
        this.jtxtFiltroCantidadProductosPFinal.setText("");
        this.jtxtFiltroCantidadProductosPInicial.setEnabled(false);
        this.jtxtFiltroCantidadProductosPInicial.setText("");
        this.jtxtFiltroPorCantidadPerdidaFinal.setEnabled(false);
        this.jtxtFiltroPorCantidadPerdidaFinal.setText("");
        this.jtxtFiltroPorCantidadPerdidaInicial.setEnabled(false);
        this.jtxtFiltroPorCantidadPerdidaInicial.setText("");
        this.jtxtFiltroPorIdProducto.setEnabled(false);
        this.jtxtFiltroPorIdProducto.setText("");
        this.jtxtFiltroPorMermaFinal.setEnabled(true);
        this.jtxtFiltroPorMermaInicial.setEnabled(true);
        this.jdtFiltroPorFechaPerdidaInicial.setEnabled(false);
        this.jdtFiltroPorFechaPerdidaInicial.setDate(null);
        this.jdtFiltroPorFechaPerdidaFinal.setEnabled(false);
        this.jdtFiltroPorFechaPerdidaFinal.setDate(null);

    }//GEN-LAST:event_jrbFiltroPorMermaMouseClicked

    private void jrbFiltroPorCantidadPerdidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFiltroPorCantidadPerdidaMouseClicked

        this.productoP = new ProductoPerecedero();
        this.jcmbFiltroTipoPP.setEnabled(true);
        this.jtxtFiltroCantidadProductosPFinal.setEnabled(false);
        this.jtxtFiltroCantidadProductosPFinal.setText("");
        this.jtxtFiltroCantidadProductosPInicial.setEnabled(false);
        this.jtxtFiltroCantidadProductosPInicial.setText("");
        this.jtxtFiltroPorCantidadPerdidaFinal.setEnabled(true);
        this.jtxtFiltroPorCantidadPerdidaInicial.setEnabled(true);
        this.jtxtFiltroPorIdProducto.setEnabled(false);
        this.jtxtFiltroPorIdProducto.setText("");
        this.jtxtFiltroPorMermaFinal.setEnabled(false);
        this.jtxtFiltroPorMermaFinal.setText("");
        this.jtxtFiltroPorMermaInicial.setEnabled(false);
        this.jtxtFiltroPorMermaInicial.setText("");
        this.jdtFiltroPorFechaPerdidaInicial.setEnabled(false);
        this.jdtFiltroPorFechaPerdidaInicial.setDate(null);
        this.jdtFiltroPorFechaPerdidaFinal.setEnabled(false);
        this.jdtFiltroPorFechaPerdidaFinal.setDate(null);

    }//GEN-LAST:event_jrbFiltroPorCantidadPerdidaMouseClicked

    private void jrbFiltroPorFechaPerdidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFiltroPorFechaPerdidaMouseClicked

        this.productoP = new ProductoPerecedero();
        this.jcmbFiltroTipoPP.setEnabled(true);
        this.jtxtFiltroCantidadProductosPFinal.setEnabled(false);
        this.jtxtFiltroCantidadProductosPFinal.setText("");
        this.jtxtFiltroCantidadProductosPInicial.setEnabled(false);
        this.jtxtFiltroCantidadProductosPInicial.setText("");
        this.jtxtFiltroPorCantidadPerdidaFinal.setEnabled(false);
        this.jtxtFiltroPorCantidadPerdidaFinal.setText("");
        this.jtxtFiltroPorCantidadPerdidaInicial.setEnabled(false);
        this.jtxtFiltroPorCantidadPerdidaInicial.setText("");
        this.jtxtFiltroPorIdProducto.setEnabled(false);
        this.jtxtFiltroPorIdProducto.setText("");
        this.jtxtFiltroPorMermaFinal.setEnabled(false);
        this.jtxtFiltroPorMermaFinal.setText("");
        this.jtxtFiltroPorMermaInicial.setEnabled(false);
        this.jtxtFiltroPorMermaInicial.setText("");
        this.jdtFiltroPorFechaPerdidaInicial.setEnabled(true);
        this.jdtFiltroPorFechaPerdidaFinal.setEnabled(true);

    }//GEN-LAST:event_jrbFiltroPorFechaPerdidaMouseClicked

    public JButton getBtnCancelarProductoPere() {
        return btnCancelarProductoPere;
    }

    public void setBtnCancelarProductoPere(JButton btnCancelarProductoPere) {
        this.btnCancelarProductoPere = btnCancelarProductoPere;
    }


    public JButton getBtnInsertarProductoPere() {
        return btnInsertarProductoPere;
    }

    public void setBtnInsertarProductoPere(JButton btnInsertarProductoPere) {
        this.btnInsertarProductoPere = btnInsertarProductoPere;
    }

    public JComboBox<String> getJcmbTipoProductoPere() {
        return jcmbTipoProductoPere;
    }

    public void setJcmbTipoProductoPere(JComboBox<String> jcmbTipoProductoPere) {
        this.jcmbTipoProductoPere = jcmbTipoProductoPere;
    }

    public JDateChooser getJdtFechaPerdida() {
        return jdtFechaPerdida;
    }

    public void setJdtFechaPerdida(JDateChooser jdtFechaPerdida) {
        this.jdtFechaPerdida = jdtFechaPerdida;
    }

    public JTable getJtblProductosPere() {
        return jtblProductosPere;
    }

    public void setJtblProductosPere(JTable jtblProductosPere) {
        this.jtblProductosPere = jtblProductosPere;
    }

    public JTextField getJtxtCantidadProductoPere() {
        return jtxtCantidadProductoPere;
    }

    public void setJtxtCantidadProductoPere(JTextField jtxtCantidadProductoPere) {
        this.jtxtCantidadProductoPere = jtxtCantidadProductoPere;
    }

    public JTextField getJtxtClaveProductoPere() {
        return jtxtClaveProductoPere;
    }

    public void setJtxtClaveProductoPere(JTextField jtxtClaveProductoPere) {
        this.jtxtClaveProductoPere = jtxtClaveProductoPere;
    }

    public JTextField getJtxtMerma() {
        return jtxtMerma;
    }

    public void setJtxtMerma(JTextField jtxtMerma) {
        this.jtxtMerma = jtxtMerma;
    }

    public JTextField getJtxtMotivoPerdida() {
        return jtxtMotivoPerdida;
    }

    public void setJtxtMotivoPerdida(JTextField jtxtMotivoPerdida) {
        this.jtxtMotivoPerdida = jtxtMotivoPerdida;
    }

    public ProductoPerecedero getProductoP() {
        return productoP;
    }

    public void setProductoP(ProductoPerecedero productoP) {
        this.productoP = productoP;
    }

    public JComboBox<String> getJcmbFiltroTipoPP() {
        return jcmbFiltroTipoPP;
    }

    public void setJcmbFiltroTipoPP(JComboBox<String> jcmbFiltroTipoPP) {
        this.jcmbFiltroTipoPP = jcmbFiltroTipoPP;
    }

    public JRadioButton getJrbFiltroCantidadProductosP() {
        return jrbFiltroCantidadProductosP;
    }

    public void setJrbFiltroCantidadProductosP(JRadioButton jrbFiltroCantidadProductosP) {
        this.jrbFiltroCantidadProductosP = jrbFiltroCantidadProductosP;
    }

    public JRadioButton getJrbFiltroPorCantidadPerdida() {
        return jrbFiltroPorCantidadPerdida;
    }

    public void setJrbFiltroPorCantidadPerdida(JRadioButton jrbFiltroPorCantidadPerdida) {
        this.jrbFiltroPorCantidadPerdida = jrbFiltroPorCantidadPerdida;
    }

    public JRadioButton getJrbFiltroPorFechaPerdida() {
        return jrbFiltroPorFechaPerdida;
    }

    public void setJrbFiltroPorFechaPerdida(JRadioButton jrbFiltroPorFechaPerdida) {
        this.jrbFiltroPorFechaPerdida = jrbFiltroPorFechaPerdida;
    }

    public JRadioButton getJrbFiltroPorIdProducto() {
        return jrbFiltroPorIdProducto;
    }

    public void setJrbFiltroPorIdProducto(JRadioButton jrbFiltroPorIdProducto) {
        this.jrbFiltroPorIdProducto = jrbFiltroPorIdProducto;
    }

    public JRadioButton getJrbFiltroPorMerma() {
        return jrbFiltroPorMerma;
    }

    public void setJrbFiltroPorMerma(JRadioButton jrbFiltroPorMerma) {
        this.jrbFiltroPorMerma = jrbFiltroPorMerma;
    }

    public JTextField getJtxtFiltroCantidadProductosPFinal() {
        return jtxtFiltroCantidadProductosPFinal;
    }

    public void setJtxtFiltroCantidadProductosPFinal(JTextField jtxtFiltroCantidadProductosPFinal) {
        this.jtxtFiltroCantidadProductosPFinal = jtxtFiltroCantidadProductosPFinal;
    }

    public JTextField getJtxtFiltroCantidadProductosPInicial() {
        return jtxtFiltroCantidadProductosPInicial;
    }

    public void setJtxtFiltroCantidadProductosPInicial(JTextField jtxtFiltroCantidadProductosPInicial) {
        this.jtxtFiltroCantidadProductosPInicial = jtxtFiltroCantidadProductosPInicial;
    }

    public JTextField getJtxtFiltroPorCantidadPerdidaFinal() {
        return jtxtFiltroPorCantidadPerdidaFinal;
    }

    public void setJtxtFiltroPorCantidadPerdidaFinal(JTextField jtxtFiltroPorCantidadPerdidaFinal) {
        this.jtxtFiltroPorCantidadPerdidaFinal = jtxtFiltroPorCantidadPerdidaFinal;
    }

    public JTextField getJtxtFiltroPorCantidadPerdidaInicial() {
        return jtxtFiltroPorCantidadPerdidaInicial;
    }

    public void setJtxtFiltroPorCantidadPerdidaInicial(JTextField jtxtFiltroPorCantidadPerdidaInicial) {
        this.jtxtFiltroPorCantidadPerdidaInicial = jtxtFiltroPorCantidadPerdidaInicial;
    }

    public JDateChooser getJdtFiltroPorFechaPerdidaFinal() {
        return jdtFiltroPorFechaPerdidaFinal;
    }

    public void setJdtFiltroPorFechaPerdidaFinal(JDateChooser jdtFiltroPorFechaPerdidaFinal) {
        this.jdtFiltroPorFechaPerdidaFinal = jdtFiltroPorFechaPerdidaFinal;
    }

    public JDateChooser getJdtFiltroPorFechaPerdidaInicial() {
        return jdtFiltroPorFechaPerdidaInicial;
    }

    public void setJdtFiltroPorFechaPerdidaInicial(JDateChooser jdtFiltroPorFechaPerdidaInicial) {
        this.jdtFiltroPorFechaPerdidaInicial = jdtFiltroPorFechaPerdidaInicial;
    }

    
    public JTextField getJtxtFiltroPorIdProducto() {
        return jtxtFiltroPorIdProducto;
    }

    public void setJtxtFiltroPorIdProducto(JTextField jtxtFiltroPorIdProducto) {
        this.jtxtFiltroPorIdProducto = jtxtFiltroPorIdProducto;
    }

    public JTextField getJtxtFiltroPorMermaFinal() {
        return jtxtFiltroPorMermaFinal;
    }

    public void setJtxtFiltroPorMermaFinal(JTextField jtxtFiltroPorMermaFinal) {
        this.jtxtFiltroPorMermaFinal = jtxtFiltroPorMermaFinal;
    }

    public JTextField getJtxtFiltroPorMermaInicial() {
        return jtxtFiltroPorMermaInicial;
    }

    public void setJtxtFiltroPorMermaInicial(JTextField jtxtFiltroPorMermaInicial) {
        this.jtxtFiltroPorMermaInicial = jtxtFiltroPorMermaInicial;
    }

    public JRadioButton getJrbFiltroTodosLosProductosP() {
        return jrbFiltroTodosLosProductosP;
    }

    public void setJrbFiltroTodosLosProductosP(JRadioButton jrbFiltroTodosLosProductosP) {
        this.jrbFiltroTodosLosProductosP = jrbFiltroTodosLosProductosP;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarProductoPere;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnInsertarProductoPere;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> jcmbFiltroTipoPP;
    private javax.swing.JComboBox<String> jcmbTipoProductoPere;
    private com.toedter.calendar.JDateChooser jdtFechaPerdida;
    private com.toedter.calendar.JDateChooser jdtFiltroPorFechaPerdidaFinal;
    private com.toedter.calendar.JDateChooser jdtFiltroPorFechaPerdidaInicial;
    private javax.swing.JRadioButton jrbFiltroCantidadProductosP;
    private javax.swing.JRadioButton jrbFiltroPorCantidadPerdida;
    private javax.swing.JRadioButton jrbFiltroPorFechaPerdida;
    private javax.swing.JRadioButton jrbFiltroPorIdProducto;
    private javax.swing.JRadioButton jrbFiltroPorMerma;
    private javax.swing.JRadioButton jrbFiltroTodosLosProductosP;
    private javax.swing.JTable jtblProductosPere;
    private javax.swing.JTextField jtxtCantidadProductoPere;
    private javax.swing.JTextField jtxtClaveProductoPere;
    private javax.swing.JTextField jtxtFiltroCantidadProductosPFinal;
    private javax.swing.JTextField jtxtFiltroCantidadProductosPInicial;
    private javax.swing.JTextField jtxtFiltroPorCantidadPerdidaFinal;
    private javax.swing.JTextField jtxtFiltroPorCantidadPerdidaInicial;
    private javax.swing.JTextField jtxtFiltroPorIdProducto;
    private javax.swing.JTextField jtxtFiltroPorMermaFinal;
    private javax.swing.JTextField jtxtFiltroPorMermaInicial;
    private javax.swing.JTextField jtxtMerma;
    private javax.swing.JTextField jtxtMotivoPerdida;
    // End of variables declaration//GEN-END:variables
}
