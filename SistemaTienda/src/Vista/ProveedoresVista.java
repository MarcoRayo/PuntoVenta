package Vista;

import Modelo.Proveedor;
import Modelo.ProveedorDao;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author marco
 */
public class ProveedoresVista extends javax.swing.JFrame {

    ArrayList<Proveedor> listaProveedores = new ArrayList<Proveedor>();
    ProveedorDao dao = new ProveedorDao();

    public ProveedoresVista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mostrarProveedores();
        txtIdProveedor.setEditable(false);
        txtIdProveedor.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Proveedores = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        opciones = new javax.swing.JPanel();
        headOpciones = new javax.swing.JPanel();
        labelOpciones = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        txtTelefonoProveedor = new javax.swing.JTextField();
        labelMarca = new javax.swing.JLabel();
        txtMarcaProveedor = new javax.swing.JTextField();
        eliminarProveedor = new javax.swing.JButton();
        editarProveedor = new javax.swing.JButton();
        agregarProveedor = new javax.swing.JButton();
        cancelarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        circulo = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        circulo2 = new javax.swing.JLabel();
        circulo3 = new javax.swing.JLabel();
        circulo4 = new javax.swing.JLabel();
        circulo5 = new javax.swing.JLabel();
        circulo6 = new javax.swing.JLabel();
        circulo7 = new javax.swing.JLabel();
        btnCategorias = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnImporte = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        barraInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setPreferredSize(new java.awt.Dimension(1400, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Proveedores.setBackground(new java.awt.Color(255, 255, 255));
        Proveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/proveedoresTitulo.png"))); // NOI18N
        Proveedores.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        opciones.setBackground(new java.awt.Color(188, 204, 255));
        opciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headOpciones.setBackground(new java.awt.Color(43, 89, 255));
        headOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelOpciones.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        labelOpciones.setForeground(new java.awt.Color(255, 255, 255));
        labelOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/OpcionesTitulo.png"))); // NOI18N
        headOpciones.add(labelOpciones);

        opciones.add(headOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 40));

        labelNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nombre_ (3).png"))); // NOI18N
        opciones.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 30));

        txtNombreProveedor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombreProveedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProveedorActionPerformed(evt);
            }
        });
        opciones.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 57, 220, 22));

        labelTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Teléfono_ (1).png"))); // NOI18N
        opciones.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 30));

        txtTelefonoProveedor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtTelefonoProveedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtTelefonoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoProveedorActionPerformed(evt);
            }
        });
        txtTelefonoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoProveedorKeyTyped(evt);
            }
        });
        opciones.add(txtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 97, 220, 22));

        labelMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Marca_ (1).png"))); // NOI18N
        opciones.add(labelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 30));

        txtMarcaProveedor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtMarcaProveedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        opciones.add(txtMarcaProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 137, 220, 22));

        eliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        eliminarProveedor.setBorder(null);
        eliminarProveedor.setBorderPainted(false);
        eliminarProveedor.setContentAreaFilled(false);
        eliminarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarProveedor.setFocusPainted(false);
        eliminarProveedor.setPreferredSize(new java.awt.Dimension(71, 23));
        eliminarProveedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminarPress.png"))); // NOI18N
        eliminarProveedor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminarPress.png"))); // NOI18N
        eliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProveedorActionPerformed(evt);
            }
        });
        opciones.add(eliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 80, 40));

        editarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar.png"))); // NOI18N
        editarProveedor.setBorder(null);
        editarProveedor.setBorderPainted(false);
        editarProveedor.setContentAreaFilled(false);
        editarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarProveedor.setFocusPainted(false);
        editarProveedor.setPreferredSize(new java.awt.Dimension(71, 23));
        editarProveedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editarPress.png"))); // NOI18N
        editarProveedor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editarPress.png"))); // NOI18N
        editarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProveedorActionPerformed(evt);
            }
        });
        opciones.add(editarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 70, 40));

        agregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        agregarProveedor.setBorder(null);
        agregarProveedor.setBorderPainted(false);
        agregarProveedor.setContentAreaFilled(false);
        agregarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarProveedor.setFocusPainted(false);
        agregarProveedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarPress.png"))); // NOI18N
        agregarProveedor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarPress.png"))); // NOI18N
        agregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProveedorActionPerformed(evt);
            }
        });
        opciones.add(agregarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 40));

        cancelarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        cancelarProveedor.setBorder(null);
        cancelarProveedor.setBorderPainted(false);
        cancelarProveedor.setContentAreaFilled(false);
        cancelarProveedor.setFocusPainted(false);
        cancelarProveedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelarPress.png"))); // NOI18N
        cancelarProveedor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelarPress.png"))); // NOI18N
        cancelarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarProveedorActionPerformed(evt);
            }
        });
        opciones.add(cancelarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 80, 40));

        Proveedores.add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 340, 230));

        tablaProveedores = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaProveedores.setFont(new java.awt.Font("Georgia", 0, 15));
        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nombre Proveedor", "Telefono", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaProveedores.setRowHeight(30);
        tablaProveedores.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tablaProveedores.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaProveedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProveedores.getTableHeader().setReorderingAllowed(false);
        tablaProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProveedores);

        Proveedores.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 610, 510));

        circulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Proveedores.add(circulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        txtIdProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProveedorActionPerformed(evt);
            }
        });
        Proveedores.add(txtIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 30, -1));

        circulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Proveedores.add(circulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -50, -1, -1));

        circulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Proveedores.add(circulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 390, -1, -1));

        circulo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloGrande2.png"))); // NOI18N
        Proveedores.add(circulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, -1, -1));

        circulo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloAzul.png"))); // NOI18N
        Proveedores.add(circulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, -230, -1, -1));

        circulo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Proveedores.add(circulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 170, 170));

        circulo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloGrande2.png"))); // NOI18N
        Proveedores.add(circulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 680, -1, -1));

        getContentPane().add(Proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1210, 840));

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

        logo.setFont(new java.awt.Font("Lucida Bright", 1, 35)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoF.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        barraInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/MenuFinal.png"))); // NOI18N
        getContentPane().add(barraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 870));

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
        ImportesVista importe = new ImportesVista();
        importe.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnImporteActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        ProductosVista producto = new ProductosVista();
        producto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        ProveedoresVista proveedores = new ProveedoresVista();
        proveedores.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        VentasVista venta = new VentasVista();
        venta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LoginVista login = new LoginVista();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProveedorActionPerformed

    private void txtIdProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProveedorActionPerformed

    private void eliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProveedorActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas eliminar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            if (txtIdProveedor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ocurrio Algun error inesperado al eliminar");
            } else {
                if (dao.BorrarProveedor(Integer.parseInt(txtIdProveedor.getText())) > 0) {
                    JOptionPane.showMessageDialog(null, "Proveedor eliminado correctamente");
                    this.limpiarTextField();
                    this.mostrarProveedores();
                } else {
                    JOptionPane.showMessageDialog(null, "No puede eliminar un proveedor que esta siendo usado");
                }
            }
        }
    }//GEN-LAST:event_eliminarProveedorActionPerformed

    private void editarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProveedorActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas editar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            if (txtIdProveedor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ocurrio Algun error inesperado");
            } else {
                if (dao.EditarProveedor(Integer.parseInt(txtIdProveedor.getText()), txtNombreProveedor.getText(),
                        txtTelefonoProveedor.getText(), txtMarcaProveedor.getText()) > 0) {
                    JOptionPane.showMessageDialog(null, "Proveedor modificado correctamente");
                    this.limpiarTextField();
                    this.mostrarProveedores();
                } else {
                    JOptionPane.showMessageDialog(null, "No pudo modificar el proveedor");
                }
            }
        }
    }//GEN-LAST:event_editarProveedorActionPerformed

    private void agregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProveedorActionPerformed
        if (txtNombreProveedor.getText().isEmpty() || txtTelefonoProveedor.getText().isEmpty() || txtMarcaProveedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes de rellenar todos los campos");
        } else {
            try {
                dao.RegistrarProveedor(txtNombreProveedor.getText(), txtTelefonoProveedor.getText(), txtMarcaProveedor.getText());
                JOptionPane.showMessageDialog(null, "Proveedor agregado correctamente");
                this.limpiarTextField();
                this.mostrarProveedores();
            } catch (Exception e) {
                System.out.println(e.toString());
                JOptionPane.showMessageDialog(null, "Error al agregar proveedor");
            }
        }
    }//GEN-LAST:event_agregarProveedorActionPerformed

    private void cancelarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarProveedorActionPerformed
        this.desactivarBtn();
        agregarProveedor.setEnabled(true);
        this.limpiarTextField();
        while (!listaProveedores.isEmpty()) {
            listaProveedores.remove(0);
        }
        this.mostrarProveedores();
    }//GEN-LAST:event_cancelarProveedorActionPerformed

    private void txtTelefonoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoProveedorActionPerformed
    private void tablaProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresMouseClicked
        if (evt.getClickCount() == 1) {
            this.activarBtn();
            agregarProveedor.setEnabled(false);
            JTable receptor = (JTable) evt.getSource();
            txtIdProveedor.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtNombreProveedor.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtTelefonoProveedor.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txtMarcaProveedor.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tablaProveedoresMouseClicked

    private void txtTelefonoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoProveedorKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProveedoresVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProveedoresVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProveedoresVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProveedoresVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProveedoresVista().setVisible(true);
            }
        });
    }

    public void mostrarProveedores() {
        this.desactivarBtn();
        agregarProveedor.setEnabled(true);
        while (!listaProveedores.isEmpty()) {
            listaProveedores.remove(0);
        }
        try {
            ProveedorDao pro = new ProveedorDao();
            Proveedor[] proveedoresConsulta = pro.OptenerProveedores();
            for (Proveedor proveedor : proveedoresConsulta) {
                listaProveedores.add(proveedor);
            }
        } catch (Exception e) {
            System.out.println("error al mostrar proveedores");
            System.out.println(e.toString());
        }
        String proveedoresTabla[][] = new String[listaProveedores.size()][5];
        for (int i = 0; i < listaProveedores.size(); i++) {
            proveedoresTabla[i][0] = String.valueOf(listaProveedores.get(i).getId());
            int x = i + 1;
            proveedoresTabla[i][1] = x + "";
            proveedoresTabla[i][2] = listaProveedores.get(i).getNombre();
            proveedoresTabla[i][3] = String.valueOf(listaProveedores.get(i).getTelefono());
            proveedoresTabla[i][4] = listaProveedores.get(i).getMarca();
        }
        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
                proveedoresTabla, new String[]{
                    "id", "#", "Nombre Categoria", "Teléfono", "Marca"
                }
        ));
        this.centrar_datos();
    }

    public void centrar_datos() {
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        tablaProveedores.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
        tablaProveedores.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
        tablaProveedores.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
        tablaProveedores.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
        tablaProveedores.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaProveedores.getColumnModel().getColumn(0).setMinWidth(0);
        tablaProveedores.getColumnModel().getColumn(0).setPreferredWidth(0);
        tablaProveedores.getColumnModel().getColumn(1).setMaxWidth(40);
        tablaProveedores.getColumnModel().getColumn(1).setMinWidth(40);
        tablaProveedores.getColumnModel().getColumn(1).setPreferredWidth(40);
        tablaProveedores.getColumnModel().getColumn(2).setMaxWidth(270);
        tablaProveedores.getColumnModel().getColumn(2).setMinWidth(270);
        tablaProveedores.getColumnModel().getColumn(2).setPreferredWidth(270);
        tablaProveedores.getColumnModel().getColumn(3).setMaxWidth(180);
        tablaProveedores.getColumnModel().getColumn(3).setMinWidth(180);
        tablaProveedores.getColumnModel().getColumn(3).setPreferredWidth(180);
        JTableHeader th = tablaProveedores.getTableHeader();
        Font fuente = new Font("Georgia", 1, 14);
        Color header = new Color(43, 95, 255);
        Color body = new Color(188, 204, 255);
        th.setFont(fuente);
        th.setBackground(header);
        th.setForeground(Color.WHITE);
        tablaProveedores.setBackground(body);
    }

    public void limpiarTextField() {
        txtNombreProveedor.setText(null);
        txtIdProveedor.setText(null);
        txtTelefonoProveedor.setText(null);
        txtMarcaProveedor.setText(null);
    }

    public void desactivarBtn() {
        agregarProveedor.setEnabled(false);
        editarProveedor.setEnabled(false);
        eliminarProveedor.setEnabled(false);
        cancelarProveedor.setEnabled(false);
    }

    public void activarBtn() {
        agregarProveedor.setEnabled(true);
        editarProveedor.setEnabled(true);
        eliminarProveedor.setEnabled(true);
        cancelarProveedor.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Proveedores;
    private javax.swing.JButton agregarProveedor;
    private javax.swing.JLabel barraInicio;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnImporte;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton cancelarProveedor;
    private javax.swing.JLabel circulo;
    private javax.swing.JLabel circulo2;
    private javax.swing.JLabel circulo3;
    private javax.swing.JLabel circulo4;
    private javax.swing.JLabel circulo5;
    private javax.swing.JLabel circulo6;
    private javax.swing.JLabel circulo7;
    private javax.swing.JButton editarProveedor;
    private javax.swing.JButton eliminarProveedor;
    private javax.swing.JPanel headOpciones;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelOpciones;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel opciones;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtMarcaProveedor;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
