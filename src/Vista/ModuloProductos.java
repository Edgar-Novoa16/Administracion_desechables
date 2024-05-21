
package Vista;

import Controlador.Productos;
import Modelo.Producto;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;



public class ModuloProductos extends javax.swing.JPanel {

    /** Creates new form ModuloProductos */
    public ModuloProductos() {
        initComponents();
    }

    Productos productos = new Productos();
    Producto producto;
    boolean activador = false;






    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtxtNombreP = new javax.swing.JTextField();
        jtxtCategoriaP = new javax.swing.JTextField();
        jtxtModeloP = new javax.swing.JTextField();
        jtxtPrecioP = new javax.swing.JTextField();
        btnEliminarP = new javax.swing.JButton();
        jcmbCProducto = new javax.swing.JComboBox<>();
        btnInsertarP = new javax.swing.JButton();
        btnModificarP = new javax.swing.JButton();
        jtxtClaveProveedor = new javax.swing.JTextField();
        jtxtCantidadP = new javax.swing.JTextField();
        jtxtTamañoP = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jrbPedirTodosProductos = new javax.swing.JRadioButton();
        jrbPedirCantidadProducto = new javax.swing.JRadioButton();
        jtxtFiltroCantidadInicialProducto = new javax.swing.JTextField();
        jcmbFiltroTipoProducto = new javax.swing.JComboBox<>();
        jrbNombreProducto = new javax.swing.JRadioButton();
        jtxtFiltroPrecioProductoI = new javax.swing.JTextField();
        jrbIdProducto = new javax.swing.JRadioButton();
        jtxtFiltroCantidadAlmacenI = new javax.swing.JTextField();
        jrbCantidadAlmacen = new javax.swing.JRadioButton();
        jtxtFiltroIdProducto = new javax.swing.JTextField();
        jrbPrecioProducto = new javax.swing.JRadioButton();
        jtxtFiltroNombreProducto = new javax.swing.JTextField();
        jrbCategoriaProducto = new javax.swing.JRadioButton();
        jtxtFiltroCategoriaProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxtCantidadAlmacenF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtFiltroIdProveedor = new javax.swing.JTextField();
        jrbIdProveedor = new javax.swing.JRadioButton();
        jtxtFiltroPrecioF = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtxtFiltroCantidadFinalProducto = new javax.swing.JTextField();

        jtblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUCTO", "CLAVE PROVEEDOR", "TIPO DE PRODUCTO", "NOMBRE", "CATEGORIA", "MODELO", "TAMAÑO", "CANTIDAD-ALMACENl", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblProductos);
        if (jtblProductos.getColumnModel().getColumnCount() > 0) {
            jtblProductos.getColumnModel().getColumn(0).setMinWidth(80);
            jtblProductos.getColumnModel().getColumn(1).setMinWidth(90);
            jtblProductos.getColumnModel().getColumn(7).setMinWidth(100);
        }

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(104, 139, 138));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombreP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtNombreP.setForeground(new java.awt.Color(102, 102, 102));
        jtxtNombreP.setText("                         NOMBRE");
        jtxtNombreP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtNombrePMouseClicked(evt);
            }
        });
        jtxtNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombrePActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 30));

        jtxtCategoriaP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtCategoriaP.setForeground(new java.awt.Color(102, 102, 102));
        jtxtCategoriaP.setText("             CATEGORIA");
        jtxtCategoriaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtCategoriaPMouseClicked(evt);
            }
        });
        jtxtCategoriaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCategoriaPActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtCategoriaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 150, 30));

        jtxtModeloP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtModeloP.setForeground(new java.awt.Color(102, 102, 102));
        jtxtModeloP.setText("      MODELO");
        jtxtModeloP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtModeloPMouseClicked(evt);
            }
        });
        jtxtModeloP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtModeloPActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtModeloP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 30));

        jtxtPrecioP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtPrecioP.setForeground(new java.awt.Color(102, 102, 102));
        jtxtPrecioP.setText("      PRECIO");
        jtxtPrecioP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtPrecioPMouseClicked(evt);
            }
        });
        jtxtPrecioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPrecioPActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtPrecioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 80, 30));

        btnEliminarP.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        btnEliminarP.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarP.setText("ELIMINAR");
        btnEliminarP.setBorder(null);
        btnEliminarP.setBorderPainted(false);
        btnEliminarP.setContentAreaFilled(false);
        btnEliminarP.setFocusPainted(false);
        btnEliminarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarPMouseClicked(evt);
            }
        });
        jPanel2.add(btnEliminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 100, 40));

        jcmbCProducto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jcmbCProducto.setForeground(new java.awt.Color(102, 102, 102));
        jcmbCProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALIMENTOS", "DESECHABLES", "PRIMERA NECESIDAD", "SEGUNDA NECESIDAD", " " }));
        jPanel2.add(jcmbCProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 110, 20));

        btnInsertarP.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        btnInsertarP.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarP.setText("INSERTAR");
        btnInsertarP.setBorder(null);
        btnInsertarP.setBorderPainted(false);
        btnInsertarP.setContentAreaFilled(false);
        btnInsertarP.setFocusPainted(false);
        btnInsertarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarPMouseClicked(evt);
            }
        });
        jPanel2.add(btnInsertarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 100, 40));

        btnModificarP.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        btnModificarP.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarP.setText("MODIFICAR");
        btnModificarP.setBorder(null);
        btnModificarP.setBorderPainted(false);
        btnModificarP.setContentAreaFilled(false);
        btnModificarP.setFocusPainted(false);
        btnModificarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarPMouseClicked(evt);
            }
        });
        jPanel2.add(btnModificarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 100, 40));

        jtxtClaveProveedor.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtClaveProveedor.setForeground(new java.awt.Color(102, 102, 102));
        jtxtClaveProveedor.setText("  CLAVE PROVEEDOR");
        jtxtClaveProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtClaveProveedorMouseClicked(evt);
            }
        });
        jtxtClaveProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtClaveProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtClaveProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 20));

        jtxtCantidadP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtCantidadP.setForeground(new java.awt.Color(102, 102, 102));
        jtxtCantidadP.setText("    CANTIDAD");
        jtxtCantidadP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtCantidadPMouseClicked(evt);
            }
        });
        jtxtCantidadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCantidadPActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtCantidadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 80, 30));

        jtxtTamañoP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtxtTamañoP.setForeground(new java.awt.Color(102, 102, 102));
        jtxtTamañoP.setText("       TAMAÑO");
        jtxtTamañoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtTamañoPMouseClicked(evt);
            }
        });
        jtxtTamañoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTamañoPActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtTamañoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 100, 30));

        btnCancelar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 100, 40));

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

        buttonGroup1.add(jrbPedirTodosProductos);
        jrbPedirTodosProductos.setText("Pedir todos los productos");
        jrbPedirTodosProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbPedirTodosProductosMouseClicked(evt);
            }
        });

        buttonGroup1.add(jrbPedirCantidadProducto);
        jrbPedirCantidadProducto.setText("Pedir una cantidad");
        jrbPedirCantidadProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbPedirCantidadProductoMouseClicked(evt);
            }
        });

        jtxtFiltroCantidadInicialProducto.setEnabled(false);

        jcmbFiltroTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALIMENTOS", "DESECHABLES", "PRIMERA NECESIDAD", "SEGUNDA NECESIDAD" }));
        jcmbFiltroTipoProducto.setEnabled(false);

        buttonGroup1.add(jrbNombreProducto);
        jrbNombreProducto.setText("Nombre de producto");
        jrbNombreProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbNombreProductoMouseClicked(evt);
            }
        });

        jtxtFiltroPrecioProductoI.setEnabled(false);

        buttonGroup1.add(jrbIdProducto);
        jrbIdProducto.setText("Id producto");
        jrbIdProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbIdProductoMouseClicked(evt);
            }
        });

        jtxtFiltroCantidadAlmacenI.setEnabled(false);

        buttonGroup1.add(jrbCantidadAlmacen);
        jrbCantidadAlmacen.setText("Cantidad en el almacén");
        jrbCantidadAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbCantidadAlmacenMouseClicked(evt);
            }
        });

        jtxtFiltroIdProducto.setEnabled(false);

        buttonGroup1.add(jrbPrecioProducto);
        jrbPrecioProducto.setText("Precio");
        jrbPrecioProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbPrecioProductoMouseClicked(evt);
            }
        });

        jtxtFiltroNombreProducto.setEnabled(false);

        buttonGroup1.add(jrbCategoriaProducto);
        jrbCategoriaProducto.setText("Categoría");
        jrbCategoriaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbCategoriaProductoMouseClicked(evt);
            }
        });

        jtxtFiltroCategoriaProducto.setEnabled(false);

        jLabel1.setText("A");

        jtxtCantidadAlmacenF.setEnabled(false);

        jLabel2.setText("A");

        jtxtFiltroIdProveedor.setEnabled(false);

        buttonGroup1.add(jrbIdProveedor);
        jrbIdProveedor.setText("Id proveedor");
        jrbIdProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbIdProveedorMouseClicked(evt);
            }
        });

        jtxtFiltroPrecioF.setEnabled(false);

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltrarMouseClicked(evt);
            }
        });

        jLabel3.setText("A");

        jtxtFiltroCantidadFinalProducto.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbPedirTodosProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbPedirCantidadProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtFiltroCantidadInicialProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtFiltroCantidadFinalProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcmbFiltroTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbNombreProducto)
                                    .addComponent(jrbIdProducto))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxtFiltroNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtFiltroIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jrbPrecioProducto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtFiltroPrecioProductoI, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jrbCategoriaProducto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtxtFiltroCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbCantidadAlmacen)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtFiltroCantidadAlmacenI, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtCantidadAlmacenF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtFiltroPrecioF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbIdProveedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtFiltroIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbPedirTodosProductos)
                    .addComponent(jrbPedirCantidadProducto)
                    .addComponent(jtxtFiltroCantidadInicialProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbFiltroTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtFiltroCantidadFinalProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbNombreProducto)
                    .addComponent(jtxtFiltroPrecioProductoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbPrecioProducto)
                    .addComponent(jtxtFiltroNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtFiltroPrecioF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtFiltroIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbIdProveedor))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbIdProducto)
                            .addComponent(jtxtFiltroIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbCategoriaProducto)
                            .addComponent(jtxtFiltroCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbCantidadAlmacen)
                            .addComponent(jtxtFiltroCantidadAlmacenI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jtxtCantidadAlmacenF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFiltrar)
                        .addGap(28, 28, 28))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtClaveProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtClaveProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtClaveProveedorActionPerformed

    private void jtxtClaveProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtClaveProveedorMouseClicked
        
    if(this.activador == false)
    {
            
        jtxtClaveProveedor.setText("");
        if(jtxtClaveProveedor.getText().equals("")){
            jtxtClaveProveedor.setText("");
        }
        if(jtxtNombreP.getText().equals("")){

            jtxtNombreP.setText("                NOMBRE");

        }
        if(jtxtPrecioP.getText().equals("")){

            jtxtPrecioP.setText("PRECIO ");

        }
        if(jtxtCantidadP.getText().equals("")){

            jtxtCantidadP.setText("  CANTIDAD");

        }
        if(jtxtCategoriaP.getText().equals("")){

            jtxtCategoriaP.setText("              CATEGORIA");

        }
        if(jtxtTamañoP.getText().equals("")){

            jtxtTamañoP.setText("           TAMAÑO");

        }
        if(jtxtModeloP.getText().equals("")){

            jtxtModeloP.setText("        MODELO");

        }
        
    }
    }//GEN-LAST:event_jtxtClaveProveedorMouseClicked

    private void btnModificarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarPMouseClicked

       this.productos.modificarProducto(this);
       if(this.activador == false)
       {
           this.activador = true;
           this.jtxtClaveProveedor.setEnabled(false);
           
       }else
       {
           
           this.activador = false;
           this.jtxtClaveProveedor.setEnabled(true);
           
       }
       
       
    }//GEN-LAST:event_btnModificarPMouseClicked

    private void btnInsertarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarPMouseClicked

        boolean estadoCampos;    
        this.producto = new Producto();
    
        estadoCampos = this.productos.obtenerInformacion(this);
        
        if(estadoCampos == false)
        {
            
          JOptionPane.showMessageDialog(null, "Inserta Información verídica");
            
        }else
        {
        
          this.productos.agregarRegistroProducto(this);
        
        }

    }//GEN-LAST:event_btnInsertarPMouseClicked

    private void btnEliminarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarPMouseClicked

        this.productos.EliminarRegistroProducto(this);
        
    }//GEN-LAST:event_btnEliminarPMouseClicked

    private void jtxtPrecioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPrecioPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPrecioPActionPerformed

    private void jtxtPrecioPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtPrecioPMouseClicked
        jtxtPrecioP.setText("");
        if(jtxtPrecioP.getText().equals("")){
            jtxtPrecioP.setText("");
        }

        if(jtxtNombreP.getText().equals("")){

            jtxtNombreP.setText("                 NOMBRE");

        }
        
        if(jtxtCantidadP.getText().equals("")){

            jtxtCantidadP.setText("                   CANTIDAD");
          
        }
        if(jtxtClaveProveedor.getText().equals("")){

            jtxtClaveProveedor.setText("CLAVE PROVEEDOR");

        }
        if(jtxtCategoriaP.getText().equals("")){

            jtxtCategoriaP.setText("               CATEGORIA");

        }
        if(jtxtTamañoP.getText().equals("")){

            jtxtTamañoP.setText("         TAMAÑO");

        }
        if(jtxtModeloP.getText().equals("")){

            jtxtModeloP.setText("        MODELO");

        }
    }//GEN-LAST:event_jtxtPrecioPMouseClicked

    private void jtxtModeloPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtModeloPActionPerformed

    }//GEN-LAST:event_jtxtModeloPActionPerformed

    private void jtxtModeloPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtModeloPMouseClicked
        jtxtModeloP.setText("");
        if(jtxtModeloP.getText().equals("")){
            jtxtModeloP.setText("");
        }
        if(jtxtNombreP.getText().equals("")){

            jtxtNombreP.setText("                      NOMBRE");

        }
        if(jtxtPrecioP.getText().equals("")){

            jtxtPrecioP.setText("PRECIO ");

        }
       
        if(jtxtClaveProveedor.getText().equals("")){

            jtxtClaveProveedor.setText("CLAVE PROVEEDOR");

        }
        if(jtxtCategoriaP.getText().equals("")){

            jtxtCategoriaP.setText("               CATEGORIA");

        }
        if(jtxtTamañoP.getText().equals("")){

            jtxtTamañoP.setText("           TAMAÑO");

        }
        if(jtxtCantidadP.getText().equals("")){

            jtxtCantidadP.setText("           CANTIDAD");

        }
    }//GEN-LAST:event_jtxtModeloPMouseClicked

    private void jtxtCategoriaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCategoriaPActionPerformed

    }//GEN-LAST:event_jtxtCategoriaPActionPerformed

    private void jtxtCategoriaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtCategoriaPMouseClicked
        jtxtCategoriaP.setText("");
        if(jtxtCategoriaP.getText().equals("")){
            jtxtCategoriaP.setText("");
        }
        if(jtxtNombreP.getText().equals("")){

            jtxtNombreP.setText("                    NOMBRE");

        }
        if(jtxtPrecioP.getText().equals("")){

            jtxtPrecioP.setText("PRECIO ");

        }
        if(jtxtCantidadP.getText().equals("")){

            jtxtCantidadP.setText("                 CANTIDAD");

        }
        if(jtxtClaveProveedor.getText().equals("")){

            jtxtClaveProveedor.setText("CLAVE PROVEEDOR");

        }
       
        if(jtxtTamañoP.getText().equals("")){

            jtxtTamañoP.setText("           TAMAÑO");

        }
        if(jtxtModeloP.getText().equals("")){

            jtxtModeloP.setText("           MODELO");

        }
    }//GEN-LAST:event_jtxtCategoriaPMouseClicked

    private void jtxtNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombrePActionPerformed

    private void jtxtNombrePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtNombrePMouseClicked
        jtxtNombreP.setText("");
        if(jtxtNombreP.getText().equals("")){
            jtxtNombreP.setText("");
        }
        if(jtxtCategoriaP.getText().equals("")){

            jtxtCategoriaP.setText("               CATEGORIA");

        }
        if(jtxtPrecioP.getText().equals("")){

            jtxtPrecioP.setText("PRECIO ");

        }
        if(jtxtModeloP.getText().equals("")){

            jtxtModeloP.setText("                 MODELO");

        }
        if(jtxtClaveProveedor.getText().equals("")){

            jtxtClaveProveedor.setText("CLAVE PROVEEDOR");

        }
        
        if(jtxtTamañoP.getText().equals("")){

            jtxtTamañoP.setText("          TAMAÑO");

        }
        if(jtxtCantidadP.getText().equals("")){

            jtxtCantidadP.setText("           CANTIDAD");

        }
    }//GEN-LAST:event_jtxtNombrePMouseClicked

    private void jtxtCantidadPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtCantidadPMouseClicked
      jtxtCantidadP.setText("");
        if(jtxtCantidadP.getText().equals("")){
            jtxtCantidadP.setText("");
        }
        if(jtxtCategoriaP.getText().equals("")){

            jtxtCategoriaP.setText("                 CATEGORIA");

        }
        if(jtxtPrecioP.getText().equals("")){

            jtxtPrecioP.setText("PRECIO ");

        }
        if(jtxtModeloP.getText().equals("")){

            jtxtModeloP.setText("               MODELO");

        }
        if(jtxtClaveProveedor.getText().equals("")){

            jtxtClaveProveedor.setText("CLAVE PROVEEDOR");

        }
        
        if(jtxtTamañoP.getText().equals("")){

            jtxtTamañoP.setText("           TAMAÑO");

        }
        if(jtxtNombreP.getText().equals("")){

            jtxtNombreP.setText("        NOMBRE");

        }
    }//GEN-LAST:event_jtxtCantidadPMouseClicked

    private void jtxtCantidadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCantidadPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCantidadPActionPerformed

    private void jtxtTamañoPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtTamañoPMouseClicked
        jtxtTamañoP.setText("");
        if(jtxtTamañoP.getText().equals("")){
            jtxtTamañoP.setText("");
        }
        if(jtxtCategoriaP.getText().equals("")){

            jtxtCategoriaP.setText("             CATEGORIA");

        }
        if(jtxtPrecioP.getText().equals("")){

            jtxtPrecioP.setText("PRECIO ");

        }
        if(jtxtModeloP.getText().equals("")){

            jtxtModeloP.setText("             MODELO");

        }
        if(jtxtClaveProveedor.getText().equals("")){

            jtxtClaveProveedor.setText("CLAVE PROVEEDOR");

        }
        
        if(jtxtNombreP.getText().equals("")){

            jtxtNombreP.setText("           NOMBRE");

        }
        if(jtxtCantidadP.getText().equals("")){

            jtxtCantidadP.setText("          CANTIDAD");

        }
    }//GEN-LAST:event_jtxtTamañoPMouseClicked

    private void jtxtTamañoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTamañoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTamañoPActionPerformed

    private void jtblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtblProductosMouseClicked

    private void jrbPedirTodosProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbPedirTodosProductosMouseClicked

        producto = new Producto();
        this.jtxtFiltroCantidadAlmacenI.setEnabled(false);
        this.jtxtCantidadAlmacenF.setEnabled(false);
        this.jtxtFiltroCantidadFinalProducto.setEnabled(false);
        this.jtxtFiltroCantidadInicialProducto.setEnabled(false);
        this.jtxtFiltroCategoriaProducto.setEnabled(false);
        this.jtxtFiltroIdProducto.setEnabled(false);
        this.jtxtFiltroIdProveedor.setEnabled(false);
        this.jtxtFiltroNombreProducto.setEnabled(false);
        this.jtxtFiltroPrecioF.setEnabled(false);
        this.jtxtFiltroPrecioProductoI.setEnabled(false);
        this.jcmbFiltroTipoProducto.setEnabled(true);
        
    }//GEN-LAST:event_jrbPedirTodosProductosMouseClicked

    private void jrbPedirCantidadProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbPedirCantidadProductoMouseClicked

        producto = new Producto();
        this.jtxtFiltroCantidadAlmacenI.setEnabled(false);
        this.jtxtCantidadAlmacenF.setEnabled(false);
        this.jtxtFiltroCantidadFinalProducto.setEnabled(true);
        this.jtxtFiltroCantidadInicialProducto.setEnabled(true);
        this.jtxtFiltroCategoriaProducto.setEnabled(false);
        this.jtxtFiltroIdProducto.setEnabled(false);
        this.jtxtFiltroIdProveedor.setEnabled(false);
        this.jtxtFiltroNombreProducto.setEnabled(false);
        this.jtxtFiltroPrecioF.setEnabled(false);
        this.jtxtFiltroPrecioProductoI.setEnabled(false);   
        this.jcmbFiltroTipoProducto.setEnabled(true);

    }//GEN-LAST:event_jrbPedirCantidadProductoMouseClicked

    private void jrbNombreProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbNombreProductoMouseClicked
        
        producto = new Producto();
        this.jtxtFiltroCantidadAlmacenI.setEnabled(false);
        this.jtxtCantidadAlmacenF.setEnabled(false);
        this.jtxtFiltroCantidadFinalProducto.setEnabled(false);
        this.jtxtFiltroCantidadInicialProducto.setEnabled(false);
        this.jtxtFiltroCategoriaProducto.setEnabled(false);
        this.jtxtFiltroIdProducto.setEnabled(false);
        this.jtxtFiltroIdProveedor.setEnabled(false);
        this.jtxtFiltroNombreProducto.setEnabled(true);
        this.jtxtFiltroPrecioF.setEnabled(false);
        this.jtxtFiltroPrecioProductoI.setEnabled(false);
        this.jcmbFiltroTipoProducto.setEnabled(true);
        
    }//GEN-LAST:event_jrbNombreProductoMouseClicked

    private void jrbIdProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbIdProductoMouseClicked

        producto = new Producto();
        this.jtxtFiltroCantidadAlmacenI.setEnabled(false);
        this.jtxtCantidadAlmacenF.setEnabled(false);
        this.jtxtFiltroCantidadFinalProducto.setEnabled(false);
        this.jtxtFiltroCantidadInicialProducto.setEnabled(false);
        this.jtxtFiltroCategoriaProducto.setEnabled(false);
        this.jtxtFiltroIdProducto.setEnabled(true);
        this.jtxtFiltroIdProveedor.setEnabled(false);
        this.jtxtFiltroNombreProducto.setEnabled(false);
        this.jtxtFiltroPrecioF.setEnabled(false);
        this.jtxtFiltroPrecioProductoI.setEnabled(false);
        this.jcmbFiltroTipoProducto.setEnabled(true);
        
    }//GEN-LAST:event_jrbIdProductoMouseClicked

    private void jrbCantidadAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbCantidadAlmacenMouseClicked

        producto = new Producto();
        this.jtxtFiltroCantidadAlmacenI.setEnabled(true);
        this.jtxtCantidadAlmacenF.setEnabled(true);
        this.jtxtFiltroCantidadFinalProducto.setEnabled(false);
        this.jtxtFiltroCantidadInicialProducto.setEnabled(false);
        this.jtxtFiltroCategoriaProducto.setEnabled(false);
        this.jtxtFiltroIdProducto.setEnabled(false);
        this.jtxtFiltroIdProveedor.setEnabled(false);
        this.jtxtFiltroNombreProducto.setEnabled(false);
        this.jtxtFiltroPrecioF.setEnabled(false);
        this.jtxtFiltroPrecioProductoI.setEnabled(false);
        this.jcmbFiltroTipoProducto.setEnabled(true);
        
    }//GEN-LAST:event_jrbCantidadAlmacenMouseClicked

    private void jrbPrecioProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbPrecioProductoMouseClicked

        producto = new Producto();
        this.jtxtFiltroCantidadAlmacenI.setEnabled(false);
        this.jtxtCantidadAlmacenF.setEnabled(false);
        this.jtxtFiltroCantidadFinalProducto.setEnabled(false);
        this.jtxtFiltroCantidadInicialProducto.setEnabled(false);
        this.jtxtFiltroCategoriaProducto.setEnabled(false);
        this.jtxtFiltroIdProducto.setEnabled(false);
        this.jtxtFiltroIdProveedor.setEnabled(false);
        this.jtxtFiltroNombreProducto.setEnabled(false);
        this.jtxtFiltroPrecioF.setEnabled(true);
        this.jtxtFiltroPrecioProductoI.setEnabled(true);
        this.jcmbFiltroTipoProducto.setEnabled(true);
        
    }//GEN-LAST:event_jrbPrecioProductoMouseClicked

    private void jrbCategoriaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbCategoriaProductoMouseClicked

        producto = new Producto();
        this.jtxtFiltroCantidadAlmacenI.setEnabled(false);
        this.jtxtCantidadAlmacenF.setEnabled(false);
        this.jtxtFiltroCantidadFinalProducto.setEnabled(false);
        this.jtxtFiltroCantidadInicialProducto.setEnabled(false);
        this.jtxtFiltroCategoriaProducto.setEnabled(true);
        this.jtxtFiltroIdProducto.setEnabled(false);
        this.jtxtFiltroIdProveedor.setEnabled(false);
        this.jtxtFiltroNombreProducto.setEnabled(false);
        this.jtxtFiltroPrecioF.setEnabled(false);
        this.jtxtFiltroPrecioProductoI.setEnabled(false);
        this.jcmbFiltroTipoProducto.setEnabled(true);
        
    }//GEN-LAST:event_jrbCategoriaProductoMouseClicked

    private void jrbIdProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbIdProveedorMouseClicked

        producto = new Producto();
        this.jtxtFiltroCantidadAlmacenI.setEnabled(false);
        this.jtxtCantidadAlmacenF.setEnabled(false);
        this.jtxtFiltroCantidadFinalProducto.setEnabled(false);
        this.jtxtFiltroCantidadInicialProducto.setEnabled(false);
        this.jtxtFiltroCategoriaProducto.setEnabled(false);
        this.jtxtFiltroIdProducto.setEnabled(false);
        this.jtxtFiltroIdProveedor.setEnabled(true);
        this.jtxtFiltroNombreProducto.setEnabled(false);
        this.jtxtFiltroPrecioF.setEnabled(false);
        this.jtxtFiltroPrecioProductoI.setEnabled(false);
        this.jcmbFiltroTipoProducto.setEnabled(true);
        
    }//GEN-LAST:event_jrbIdProveedorMouseClicked

    private void btnFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarMouseClicked

        this.productos.consultar(this);

    }//GEN-LAST:event_btnFiltrarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

        this.productos.cancelarEdicionProductos(this);
        this.jtxtClaveProveedor.setEnabled(true);
        this.activador = false;
        
    }//GEN-LAST:event_btnCancelarMouseClicked

    public JButton getBtnEliminarP() {
        return btnEliminarP;
    }

    public void setBtnEliminarP(JButton btnEliminarP) {
        this.btnEliminarP = btnEliminarP;
    }

    public JButton getBtnInsertarP() {
        return btnInsertarP;
    }

    public void setBtnInsertarP(JButton btnInsertarP) {
        this.btnInsertarP = btnInsertarP;
    }

    public JButton getBtnModificarP() {
        return btnModificarP;
    }

    public void setBtnModificarP(JButton btnModificarP) {
        this.btnModificarP = btnModificarP;
    }

    public JComboBox<String> getJcmbCProducto() {
        return jcmbCProducto;
    }

    public void setJcmbCProducto(JComboBox<String> jcmbCProducto) {
        this.jcmbCProducto = jcmbCProducto;
    }

    public JTable getJtblProductos() {
        return jtblProductos;
    }

    public void setJtblProductos(JTable jtblProductos) {
        this.jtblProductos = jtblProductos;
    }

    public JTextField getJtxtCantidadP() {
        return jtxtCantidadP;
    }

    public void setJtxtCantidadP(JTextField jtxtCantidadP) {
        this.jtxtCantidadP = jtxtCantidadP;
    }

    public JTextField getJtxtCategoriaP() {
        return jtxtCategoriaP;
    }

    public void setJtxtCategoriaP(JTextField jtxtCategoriaP) {
        this.jtxtCategoriaP = jtxtCategoriaP;
    }

    public JTextField getJtxtClaveProveedor() {
        return jtxtClaveProveedor;
    }

    public void setJtxtClaveProveedor(JTextField jtxtClaveProveedor) {
        this.jtxtClaveProveedor = jtxtClaveProveedor;
    }

    public JTextField getJtxtModeloP() {
        return jtxtModeloP;
    }

    public void setJtxtModeloP(JTextField jtxtModeloP) {
        this.jtxtModeloP = jtxtModeloP;
    }

    public JTextField getJtxtNombreP() {
        return jtxtNombreP;
    }

    public void setJtxtNombreP(JTextField jtxtNombreP) {
        this.jtxtNombreP = jtxtNombreP;
    }

    public JTextField getJtxtPrecioP() {
        return jtxtPrecioP;
    }

    public void setJtxtPrecioP(JTextField jtxtPrecioP) {
        this.jtxtPrecioP = jtxtPrecioP;
    }

    public JTextField getJtxtTamañoP() {
        return jtxtTamañoP;
    }

    public void setJtxtTamañoP(JTextField jtxtTamañoP) {
        this.jtxtTamañoP = jtxtTamañoP;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public JButton getBtnFiltrar() {
        return btnFiltrar;
    }

    public void setBtnFiltrar(JButton btnFiltrar) {
        this.btnFiltrar = btnFiltrar;
    }

    public JComboBox<String> getJcmbFiltroTipoProducto() {
        return jcmbFiltroTipoProducto;
    }

    public void setJcmbFiltroTipoProducto(JComboBox<String> jcmbFiltroTipoProducto) {
        this.jcmbFiltroTipoProducto = jcmbFiltroTipoProducto;
    }

    public JRadioButton getJrbCantidadAlmacen() {
        return jrbCantidadAlmacen;
    }

    public void setJrbCantidadAlmacen(JRadioButton jrbCantidadAlmacen) {
        this.jrbCantidadAlmacen = jrbCantidadAlmacen;
    }

    public JRadioButton getJrbCategoriaProducto() {
        return jrbCategoriaProducto;
    }

    public void setJrbCategoriaProducto(JRadioButton jrbCategoriaProducto) {
        this.jrbCategoriaProducto = jrbCategoriaProducto;
    }

    public JRadioButton getJrbIdProducto() {
        return jrbIdProducto;
    }

    public void setJrbIdProducto(JRadioButton jrbIdProducto) {
        this.jrbIdProducto = jrbIdProducto;
    }

    public JRadioButton getJrbIdProveedor() {
        return jrbIdProveedor;
    }

    public void setJrbIdProveedor(JRadioButton jrbIdProveedor) {
        this.jrbIdProveedor = jrbIdProveedor;
    }

    public JRadioButton getJrbNombreProducto() {
        return jrbNombreProducto;
    }

    public void setJrbNombreProducto(JRadioButton jrbNombreProducto) {
        this.jrbNombreProducto = jrbNombreProducto;
    }

    public JRadioButton getJrbPedirCantidadProducto() {
        return jrbPedirCantidadProducto;
    }

    public void setJrbPedirCantidadProducto(JRadioButton jrbPedirCantidadProducto) {
        this.jrbPedirCantidadProducto = jrbPedirCantidadProducto;
    }

    public JRadioButton getJrbPedirTodosProductos() {
        return jrbPedirTodosProductos;
    }

    public void setJrbPedirTodosProductos(JRadioButton jrbPedirTodosProductos) {
        this.jrbPedirTodosProductos = jrbPedirTodosProductos;
    }

    public JRadioButton getJrbPrecioProducto() {
        return jrbPrecioProducto;
    }

    public void setJrbPrecioProducto(JRadioButton jrbPrecioProducto) {
        this.jrbPrecioProducto = jrbPrecioProducto;
    }

    public JTextField getJtxtCantidadAlmacenF() {
        return jtxtCantidadAlmacenF;
    }

    public void setJtxtCantidadAlmacenF(JTextField jtxtCantidadAlmacenF) {
        this.jtxtCantidadAlmacenF = jtxtCantidadAlmacenF;
    }

    public JTextField getJtxtFiltroCantidadAlmacenI() {
        return jtxtFiltroCantidadAlmacenI;
    }

    public void setJtxtFiltroCantidadAlmacenI(JTextField jtxtFiltroCantidadAlmacenI) {
        this.jtxtFiltroCantidadAlmacenI = jtxtFiltroCantidadAlmacenI;
    }

    public JTextField getJtxtFiltroCategoriaProducto() {
        return jtxtFiltroCategoriaProducto;
    }

    public void setJtxtFiltroCategoriaProducto(JTextField jtxtFiltroCategoriaProducto) {
        this.jtxtFiltroCategoriaProducto = jtxtFiltroCategoriaProducto;
    }

    public JTextField getJtxtFiltroIdProducto() {
        return jtxtFiltroIdProducto;
    }

    public void setJtxtFiltroIdProducto(JTextField jtxtFiltroIdProducto) {
        this.jtxtFiltroIdProducto = jtxtFiltroIdProducto;
    }

    public JTextField getJtxtFiltroIdProveedor() {
        return jtxtFiltroIdProveedor;
    }

    public void setJtxtFiltroIdProveedor(JTextField jtxtFiltroIdProveedor) {
        this.jtxtFiltroIdProveedor = jtxtFiltroIdProveedor;
    }

    public JTextField getJtxtFiltroNombreProducto() {
        return jtxtFiltroNombreProducto;
    }

    public void setJtxtFiltroNombreProducto(JTextField jtxtFiltroNombreProducto) {
        this.jtxtFiltroNombreProducto = jtxtFiltroNombreProducto;
    }

    public JTextField getJtxtFiltroPrecioF() {
        return jtxtFiltroPrecioF;
    }

    public void setJtxtFiltroPrecioF(JTextField jtxtFiltroPrecioF) {
        this.jtxtFiltroPrecioF = jtxtFiltroPrecioF;
    }

    public JTextField getJtxtFiltroPrecioProductoI() {
        return jtxtFiltroPrecioProductoI;
    }

    public void setJtxtFiltroPrecioProductoI(JTextField jtxtFiltroPrecioProductoI) {
        this.jtxtFiltroPrecioProductoI = jtxtFiltroPrecioProductoI;
    }

    public JTextField getJtxtPedirCantidadProducto() {
        return jtxtFiltroCantidadInicialProducto;
    }

    public void setJtxtPedirCantidadProducto(JTextField jtxtPedirCantidadProducto) {
        this.jtxtFiltroCantidadInicialProducto = jtxtPedirCantidadProducto;
    }

    public JTextField getJtxtFiltroCantidadInicialProducto() {
        return jtxtFiltroCantidadInicialProducto;
    }

    public void setJtxtFiltroCantidadInicialProducto(JTextField jtxtFiltroCantidadInicialProducto) {
        this.jtxtFiltroCantidadInicialProducto = jtxtFiltroCantidadInicialProducto;
    }

    public JTextField getJtxtFiltroCantidadFinalProducto() {
        return jtxtFiltroCantidadFinalProducto;
    }

    public void setJtxtFiltroCantidadFinalProducto(JTextField jtxtFiltroCantidadFinalProducto) {
        this.jtxtFiltroCantidadFinalProducto = jtxtFiltroCantidadFinalProducto;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnInsertarP;
    private javax.swing.JButton btnModificarP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcmbCProducto;
    private javax.swing.JComboBox<String> jcmbFiltroTipoProducto;
    private javax.swing.JRadioButton jrbCantidadAlmacen;
    private javax.swing.JRadioButton jrbCategoriaProducto;
    private javax.swing.JRadioButton jrbIdProducto;
    private javax.swing.JRadioButton jrbIdProveedor;
    private javax.swing.JRadioButton jrbNombreProducto;
    private javax.swing.JRadioButton jrbPedirCantidadProducto;
    private javax.swing.JRadioButton jrbPedirTodosProductos;
    private javax.swing.JRadioButton jrbPrecioProducto;
    private javax.swing.JTable jtblProductos;
    private javax.swing.JTextField jtxtCantidadAlmacenF;
    private javax.swing.JTextField jtxtCantidadP;
    private javax.swing.JTextField jtxtCategoriaP;
    private javax.swing.JTextField jtxtClaveProveedor;
    private javax.swing.JTextField jtxtFiltroCantidadAlmacenI;
    private javax.swing.JTextField jtxtFiltroCantidadFinalProducto;
    private javax.swing.JTextField jtxtFiltroCantidadInicialProducto;
    private javax.swing.JTextField jtxtFiltroCategoriaProducto;
    private javax.swing.JTextField jtxtFiltroIdProducto;
    private javax.swing.JTextField jtxtFiltroIdProveedor;
    private javax.swing.JTextField jtxtFiltroNombreProducto;
    private javax.swing.JTextField jtxtFiltroPrecioF;
    private javax.swing.JTextField jtxtFiltroPrecioProductoI;
    private javax.swing.JTextField jtxtModeloP;
    private javax.swing.JTextField jtxtNombreP;
    private javax.swing.JTextField jtxtPrecioP;
    private javax.swing.JTextField jtxtTamañoP;
    // End of variables declaration//GEN-END:variables

}
