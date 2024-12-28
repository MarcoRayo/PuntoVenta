package Vista;

import Modelo.Categoria;
import Modelo.CategoriaDao;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class CategoriasVista extends javax.swing.JFrame {

    ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();
    CategoriaDao dao = new CategoriaDao();

    public CategoriasVista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mostrarCategorias();
        txtIdCategoria.setEditable(false);
        txtIdCategoria.setVisible(false);
        txtNombreCategoria.setEditable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCategorias = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnImporte = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        barraInicio = new javax.swing.JLabel();
        Categorias = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        headOpciones = new javax.swing.JPanel();
        labelIOpciones = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        txtNombreCategoria = new javax.swing.JTextField();
        eliminarCategoria = new javax.swing.JButton();
        editarCategoria = new javax.swing.JButton();
        agregarCategoria = new javax.swing.JButton();
        cancelarCategoria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCategorias = new javax.swing.JTable();
        txtIdCategoria = new javax.swing.JTextField();
        circulo = new javax.swing.JLabel();
        circulo2 = new javax.swing.JLabel();
        circulo3 = new javax.swing.JLabel();
        circulo4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        circulo5 = new javax.swing.JLabel();
        circulo6 = new javax.swing.JLabel();
        circulo7 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setPreferredSize(new java.awt.Dimension(1400, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnCategorias.png"))); // NOI18N
        btnCategorias.setBorder(null);
        btnCategorias.setBorderPainted(false);
        btnCategorias.setContentAreaFilled(false);
        btnCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategorias.setFocusPainted(false);
        btnCategorias.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnCategoriasPress.png"))); // NOI18N
        btnCategorias.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnCategoriasPress.png"))); // NOI18N
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 50));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/inicioFinalxd.png"))); // NOI18N
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnInicioPress.png"))); // NOI18N
        btnInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnInicioPress.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 50));

        btnImporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnImporte.png"))); // NOI18N
        btnImporte.setBorder(null);
        btnImporte.setBorderPainted(false);
        btnImporte.setContentAreaFilled(false);
        btnImporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImporte.setFocusPainted(false);
        btnImporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnImportePress.png"))); // NOI18N
        btnImporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnImportePress.png"))); // NOI18N
        btnImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 230, 50));

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnProductos.png"))); // NOI18N
        btnProductos.setBorder(null);
        btnProductos.setBorderPainted(false);
        btnProductos.setContentAreaFilled(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setFocusPainted(false);
        btnProductos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnProductosPress.png"))); // NOI18N
        btnProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnProductosPress.png"))); // NOI18N
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 230, 50));

        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnProveedores.png"))); // NOI18N
        btnProveedores.setBorder(null);
        btnProveedores.setBorderPainted(false);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.setFocusPainted(false);
        btnProveedores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnProveedoresPress.png"))); // NOI18N
        btnProveedores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnProveedoresPress.png"))); // NOI18N
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 50));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnSalir.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnSalirPress.png"))); // NOI18N
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnSalirPress.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 230, 50));

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnVentas.png"))); // NOI18N
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setFocusPainted(false);
        btnVentas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnVentasPress.png"))); // NOI18N
        btnVentas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnVentasPress.png"))); // NOI18N
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, 50));

        barraInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/MenuFinal.png"))); // NOI18N
        getContentPane().add(barraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 870));

        Categorias.setBackground(new java.awt.Color(255, 255, 255));
        Categorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOpciones.setBackground(new java.awt.Color(188, 204, 255));
        panelOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelOpciones.setForeground(new java.awt.Color(188, 204, 255));
        panelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headOpciones.setBackground(new java.awt.Color(43, 89, 255));
        headOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelIOpciones.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        labelIOpciones.setForeground(new java.awt.Color(255, 255, 255));
        labelIOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/OpcionesTitulo.png"))); // NOI18N
        headOpciones.add(labelIOpciones);

        panelOpciones.add(headOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 40));

        labelNombre.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        labelNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nombre_ (3).png"))); // NOI18N
        panelOpciones.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 50, 80, 30));

        txtNombreCategoria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombreCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNombreCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombreCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCategoriaActionPerformed(evt);
            }
        });
        panelOpciones.add(txtNombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 57, 220, 22));

        eliminarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        eliminarCategoria.setBorder(null);
        eliminarCategoria.setBorderPainted(false);
        eliminarCategoria.setContentAreaFilled(false);
        eliminarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarCategoria.setFocusPainted(false);
        eliminarCategoria.setPreferredSize(new java.awt.Dimension(71, 23));
        eliminarCategoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminarPress.png"))); // NOI18N
        eliminarCategoria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminarPress.png"))); // NOI18N
        eliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCategoriaActionPerformed(evt);
            }
        });
        panelOpciones.add(eliminarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 80, 40));

        editarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar.png"))); // NOI18N
        editarCategoria.setBorder(null);
        editarCategoria.setBorderPainted(false);
        editarCategoria.setContentAreaFilled(false);
        editarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarCategoria.setFocusPainted(false);
        editarCategoria.setPreferredSize(new java.awt.Dimension(71, 23));
        editarCategoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editarPress.png"))); // NOI18N
        editarCategoria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editarPress.png"))); // NOI18N
        editarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCategoriaActionPerformed(evt);
            }
        });
        panelOpciones.add(editarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 70, 40));

        agregarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        agregarCategoria.setBorder(null);
        agregarCategoria.setBorderPainted(false);
        agregarCategoria.setContentAreaFilled(false);
        agregarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarCategoria.setFocusPainted(false);
        agregarCategoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarPress.png"))); // NOI18N
        agregarCategoria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarPress.png"))); // NOI18N
        agregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCategoriaActionPerformed(evt);
            }
        });
        panelOpciones.add(agregarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 40));

        cancelarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        cancelarCategoria.setBorder(null);
        cancelarCategoria.setBorderPainted(false);
        cancelarCategoria.setContentAreaFilled(false);
        cancelarCategoria.setFocusPainted(false);
        cancelarCategoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelarPress.png"))); // NOI18N
        cancelarCategoria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelarPress.png"))); // NOI18N
        cancelarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCategoriaActionPerformed(evt);
            }
        });
        panelOpciones.add(cancelarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 80, 40));

        Categorias.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 340, 150));

        tablaCategorias = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nombre Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaCategorias.setRowHeight(30);
        tablaCategorias.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tablaCategorias.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaCategorias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaCategorias.getTableHeader().setReorderingAllowed(false);
        tablaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCategorias);
        if (tablaCategorias.getColumnModel().getColumnCount() > 0) {
            tablaCategorias.getColumnModel().getColumn(0).setPreferredWidth(4);
        }

        Categorias.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 610, 490));

        txtIdCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdCategoria.setBorder(null);
        txtIdCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCategoriaActionPerformed(evt);
            }
        });
        Categorias.add(txtIdCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 30, -1));

        circulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Categorias.add(circulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -50, -1, -1));

        circulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloGrande2.png"))); // NOI18N
        Categorias.add(circulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 680, -1, -1));

        circulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloAzul.png"))); // NOI18N
        Categorias.add(circulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, -230, -1, -1));

        circulo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Categorias.add(circulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 390, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CategoriasLetra.png"))); // NOI18N
        jPanel1.add(jLabel5);

        Categorias.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1170, 50));

        circulo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Categorias.add(circulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        circulo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Categorias.add(circulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 170, 170));

        circulo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloGrande2.png"))); // NOI18N
        Categorias.add(circulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, -1, -1));

        getContentPane().add(Categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1210, 840));

        logo.setFont(new java.awt.Font("Lucida Bright", 1, 35)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoF.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        CategoriasVista categorias = new CategoriasVista();
        categorias.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        InicioVista inicio = new InicioVista();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImporteActionPerformed
        ImportesVista importes = new ImportesVista();
        importes.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnImporteActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        ProductosVista producto = new ProductosVista();
        producto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        ProveedoresVista proveedorer = new ProveedoresVista();
        proveedorer.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LoginVista login = new LoginVista();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        VentasVista ventas = new VentasVista();
        ventas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void agregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCategoriaActionPerformed
        if (txtNombreCategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes de rellenar todos los campos");
        } else {
            if (dao.RegistrarCategoria(txtNombreCategoria.getText()) > 0) {
                JOptionPane.showMessageDialog(null, "Categoria agregada correctamente");
                this.limpiarTxtField();
                this.mostrarCategorias();
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar categoria");
            }
        }
    }//GEN-LAST:event_agregarCategoriaActionPerformed

    private void txtNombreCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCategoriaActionPerformed

    private void editarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCategoriaActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas editar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            if (txtIdCategoria.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ocurrio Algun error inesperado");
            } else {
                if (dao.EditarCategoria(Integer.parseInt(txtIdCategoria.getText()), txtNombreCategoria.getText()) > 0) {
                    JOptionPane.showMessageDialog(null, "Categoria modificada correctamente");
                    this.limpiarTxtField();
                    this.mostrarCategorias();
                } else {
                    JOptionPane.showMessageDialog(null, "No puedo modificar la categoria");
                }
            }
        }
    }//GEN-LAST:event_editarCategoriaActionPerformed

    private void tablaCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCategoriasMouseClicked
        if (evt.getClickCount() == 1) {
            this.activarBtn();
            agregarCategoria.setEnabled(false);
            JTable receptor = (JTable) evt.getSource();
            txtIdCategoria.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtNombreCategoria.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tablaCategoriasMouseClicked

    private void cancelarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCategoriaActionPerformed
        this.desactivarBtn();
        agregarCategoria.setEnabled(true);
        this.limpiarTxtField();
        while (!listaCategorias.isEmpty()) {
            listaCategorias.remove(0);
        }
        this.mostrarCategorias();
    }//GEN-LAST:event_cancelarCategoriaActionPerformed

    private void eliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCategoriaActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas eliminar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            if (txtIdCategoria.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ocurrio Algun error inesperado");
            } else {
                if (dao.BorrarCategoria(Integer.parseInt(txtIdCategoria.getText())) > 0) {
                    JOptionPane.showMessageDialog(null, "Categoria eliminada correctamente");
                    this.limpiarTxtField();
                    this.mostrarCategorias();
                } else {
                    JOptionPane.showMessageDialog(null, "No puede eliminar una categoria que esya siendo usada");
                }
            }
        }
    }//GEN-LAST:event_eliminarCategoriaActionPerformed

    private void txtIdCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCategoriaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriasVista().setVisible(true);
            }
        });
    }

    public void mostrarCategorias() {
        this.desactivarBtn();
        agregarCategoria.setEnabled(true);
        while (!listaCategorias.isEmpty()) {
            listaCategorias.remove(0);
        }
        try {
            CategoriaDao cate = new CategoriaDao();
            Categoria[] categoriasConsulta = cate.OptenerCategorias();
            for (int i = 0; i < categoriasConsulta.length; i++) {
                listaCategorias.add(categoriasConsulta[i]);
            }
        } catch (Exception e) {
            System.out.println("error al consultar categorias");
            System.out.println(e.toString());
        }
        String categoriasTabla[][] = new String[listaCategorias.size()][3];
        for (int i = 0; i < listaCategorias.size(); i++) {
            categoriasTabla[i][0] = listaCategorias.get(i).getId() + "";
            int x = i + 1;
            categoriasTabla[i][1] = x + "";
            categoriasTabla[i][2] = listaCategorias.get(i).getNombre();
        }
        tablaCategorias.setModel(new javax.swing.table.DefaultTableModel(
                categoriasTabla, new String[]{
                    "id", "Número", "Nombre Categoria"
                }
        ));
        this.centrar_datos();

    }

    public void centrar_datos() {
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        tablaCategorias.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
        tablaCategorias.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
        JTableHeader th = tablaCategorias.getTableHeader();
        Font fuente = new Font("Georgia", 1, 16);
        Color header = new Color(43, 95, 255);
        Color body = new Color(188, 204, 255);
        th.setFont(fuente);
        th.setBackground(header);
        th.setForeground(Color.WHITE);
        tablaCategorias.setBackground(body);
        tablaCategorias.setFont(new java.awt.Font("Georgia", 0, 15));
        tablaCategorias.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaCategorias.getColumnModel().getColumn(0).setMinWidth(0);
        tablaCategorias.getColumnModel().getColumn(0).setPreferredWidth(0);
        tablaCategorias.getColumnModel().getColumn(1).setMaxWidth(100);
        tablaCategorias.getColumnModel().getColumn(1).setMinWidth(100);
        tablaCategorias.getColumnModel().getColumn(1).setPreferredWidth(100);
    }

    public void limpiarTxtField() {
        txtIdCategoria.setText(null);
        txtNombreCategoria.setText(null);
    }

    public void activarBtn() {
        agregarCategoria.setEnabled(true);
        editarCategoria.setEnabled(true);
        eliminarCategoria.setEnabled(true);
        cancelarCategoria.setEnabled(true);
    }

    public void desactivarBtn() {
        agregarCategoria.setEnabled(false);
        editarCategoria.setEnabled(false);
        eliminarCategoria.setEnabled(false);
        cancelarCategoria.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Categorias;
    private javax.swing.JButton agregarCategoria;
    private javax.swing.JLabel barraInicio;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnImporte;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton cancelarCategoria;
    private javax.swing.JLabel circulo;
    private javax.swing.JLabel circulo2;
    private javax.swing.JLabel circulo3;
    private javax.swing.JLabel circulo4;
    private javax.swing.JLabel circulo5;
    private javax.swing.JLabel circulo6;
    private javax.swing.JLabel circulo7;
    private javax.swing.JButton editarCategoria;
    private javax.swing.JButton eliminarCategoria;
    private javax.swing.JPanel headOpciones;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIOpciones;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTable tablaCategorias;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtNombreCategoria;
    // End of variables declaration//GEN-END:variables
}
