package Vista;

import Modelo.Importes;
import Modelo.ImportesDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author marco
 */
public class ImportesVista extends javax.swing.JFrame {

    ArrayList<Importes> listaImportes = new ArrayList<Importes>();
    ImportesDao dao = new ImportesDao();

    public ImportesVista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mostrarImportes();
        txtId.setVisible(false); 
        txtFecha.setVisible(false); 
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
        Importes = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        opciones3 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cancelarImporte = new javax.swing.JButton();
        eliminarImporte = new javax.swing.JButton();
        editarImporte = new javax.swing.JButton();
        agregarImporte = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelPrecio1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaImportes = new javax.swing.JTable();
        titulo1 = new javax.swing.JLabel();
        fondoInicio = new javax.swing.JLabel();

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

        Importes.setBackground(new java.awt.Color(255, 255, 255));
        Importes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ImporteTitulo.png"))); // NOI18N
        Importes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Importes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -50, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Importes.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloGrande2.png"))); // NOI18N
        Importes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Importes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 170, 170));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloAzul.png"))); // NOI18N
        Importes.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, -230, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Importes.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 390, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloGrande2.png"))); // NOI18N
        Importes.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 680, -1, -1));

        opciones3.setBackground(new java.awt.Color(188, 204, 255));
        opciones3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opciones3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        opciones3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 60, 110, -1));
        opciones3.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 214, -1));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        opciones3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 60, 70, -1));

        cancelarImporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        cancelarImporte.setBorder(null);
        cancelarImporte.setBorderPainted(false);
        cancelarImporte.setContentAreaFilled(false);
        cancelarImporte.setFocusPainted(false);
        cancelarImporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelarPress.png"))); // NOI18N
        cancelarImporte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelarPress.png"))); // NOI18N
        cancelarImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarImporteActionPerformed(evt);
            }
        });
        opciones3.add(cancelarImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 80, 40));

        eliminarImporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        eliminarImporte.setBorder(null);
        eliminarImporte.setBorderPainted(false);
        eliminarImporte.setContentAreaFilled(false);
        eliminarImporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarImporte.setFocusPainted(false);
        eliminarImporte.setPreferredSize(new java.awt.Dimension(71, 23));
        eliminarImporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminarPress.png"))); // NOI18N
        eliminarImporte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminarPress.png"))); // NOI18N
        eliminarImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarImporteActionPerformed(evt);
            }
        });
        opciones3.add(eliminarImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 80, 40));

        editarImporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar.png"))); // NOI18N
        editarImporte.setBorder(null);
        editarImporte.setBorderPainted(false);
        editarImporte.setContentAreaFilled(false);
        editarImporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarImporte.setFocusPainted(false);
        editarImporte.setPreferredSize(new java.awt.Dimension(71, 23));
        editarImporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editarPress.png"))); // NOI18N
        editarImporte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editarPress.png"))); // NOI18N
        editarImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarImporteActionPerformed(evt);
            }
        });
        opciones3.add(editarImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 70, 40));

        agregarImporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        agregarImporte.setBorder(null);
        agregarImporte.setBorderPainted(false);
        agregarImporte.setContentAreaFilled(false);
        agregarImporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarImporte.setFocusPainted(false);
        agregarImporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarPress.png"))); // NOI18N
        agregarImporte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarPress.png"))); // NOI18N
        agregarImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarImporteActionPerformed(evt);
            }
        });
        opciones3.add(agregarImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 40));

        jPanel4.setBackground(new java.awt.Color(43, 89, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Opciones");
        jPanel4.add(jLabel4);

        opciones3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 40));

        labelNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nombre_ (3).png"))); // NOI18N
        opciones3.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        labelPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Descripción_.png"))); // NOI18N
        opciones3.add(labelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        labelPrecio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Precio_.png"))); // NOI18N
        opciones3.add(labelPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, 20));

        Importes.add(opciones3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 370, 200));

        txtId.setFocusable(false);
        Importes.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 30, -1));

        txtFecha.setFocusable(false);
        Importes.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 70, -1));

        tablaImportes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaImportes.setFont(new java.awt.Font("Georgia", 0, 15));
        tablaImportes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaImportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaImportes.setRowHeight(30);
        tablaImportes.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tablaImportes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaImportes.getTableHeader().setReorderingAllowed(false);
        tablaImportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaImportesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaImportes);

        Importes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 610, 510));

        getContentPane().add(Importes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1210, 840));

        titulo1.setFont(new java.awt.Font("Lucida Bright", 1, 35)); // NOI18N
        titulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoF.png"))); // NOI18N
        getContentPane().add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/MenuFinal.png"))); // NOI18N
        getContentPane().add(fondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 870));

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

    private void cancelarImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarImporteActionPerformed
        this.limpiartxt();
        this.desactivarBotones();
        agregarImporte.setEnabled(true);
    }//GEN-LAST:event_cancelarImporteActionPerformed

    private void eliminarImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarImporteActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas eliminar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            if (txtId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ocurrio Algun error inesperado");
            } else {
                if (dao.BorrarImporte(Integer.parseInt(txtId.getText())) > 0) {
                    JOptionPane.showMessageDialog(null, "Categoria eliminada correctamente");
                    this.limpiartxt();
                    this.mostrarImportes();
                } else {
                    JOptionPane.showMessageDialog(null, "No puede eliminar una categoria que esya siendo usada");
                }
            }
        }
    }//GEN-LAST:event_eliminarImporteActionPerformed

    private void editarImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarImporteActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas editar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            if (txtId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ocurrio Algun error inesperado");
            } else {
                if (dao.EditarImporte(Integer.parseInt(txtId.getText()), txtNombre.getText(), txtFecha.getText(), Double.parseDouble(txtPrecio.getText()), txtDescripcion.getText()) > 0) {
                    JOptionPane.showMessageDialog(null, "Importe modificado correctamente");
                    this.limpiartxt();
                    this.mostrarImportes();
                } else {
                    JOptionPane.showMessageDialog(null, "No pudo modificar el importe");
                }
            }
        }
    }//GEN-LAST:event_editarImporteActionPerformed

    private void agregarImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarImporteActionPerformed
        if (verificarText()) {
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos");
        } else {
            try {
                DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = new Date();
                dao.RegistrarImportes(txtNombre.getText(), dateformat.format(fecha), Double.parseDouble(txtPrecio.getText()), txtDescripcion.getText());
                limpiartxt();
                this.mostrarImportes();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al agregar importe");
            }
        }
    }//GEN-LAST:event_agregarImporteActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        int caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtPrecio.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void tablaImportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaImportesMouseClicked
        if (evt.getClickCount() == 1) {
            this.activarBotones();
            agregarImporte.setEnabled(false);
            JTable receptor = (JTable) evt.getSource();
            txtId.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtFecha.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txtPrecio.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            txtDescripcion.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_tablaImportesMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImportesVista().setVisible(true);
            }
        });
    }

    public void mostrarImportes() {
        this.desactivarBotones();
        txtId.setEditable(false);
        txtFecha.setEditable(false);
        agregarImporte.setEnabled(true);
        while (!listaImportes.isEmpty()) {
            listaImportes.remove(0);
        }
        try {
            Importes[] importesConsulta = dao.OptenerImportes();
            for (int i = 0; i < importesConsulta.length; i++) {
                listaImportes.add(importesConsulta[i]);
            }
        } catch (Exception e) {
            System.out.println("error al consultar categorias");
            System.out.println(e.toString());
        }
        String importesTabla[][] = new String[listaImportes.size()][6];
        for (int i = 0; i < listaImportes.size(); i++) {
            importesTabla[i][0] = listaImportes.get(i).getId() + "";
            int x = i + 1;
            importesTabla[i][1] = x + "";
            importesTabla[i][2] = listaImportes.get(i).getNombre();
            importesTabla[i][3] = listaImportes.get(i).getFecha();
            importesTabla[i][4] = listaImportes.get(i).getCosto() + "";
            importesTabla[i][5] = listaImportes.get(i).getDescripcion();
        }
        tablaImportes.setModel(new javax.swing.table.DefaultTableModel(
                importesTabla, new String[]{
                    "id", "#", "Nombre", "Fecha", "Costo", "Descripción"
                }
        ));
        this.centrar_datos();
    }

    public void desactivarBotones() {
        agregarImporte.setEnabled(false);
        cancelarImporte.setEnabled(false);
        editarImporte.setEnabled(false);
        eliminarImporte.setEnabled(false);
    }

    public void activarBotones() {
        agregarImporte.setEnabled(true);
        cancelarImporte.setEnabled(true);
        editarImporte.setEnabled(true);
        eliminarImporte.setEnabled(true);
    }

    public void limpiartxt() {
        txtNombre.setText(null);
        txtDescripcion.setText(null);
        txtPrecio.setText(null);
        txtId.setText(null);
        txtFecha.setText(null);
    }

    public boolean verificarText() {
        boolean respuesta = false;
        if (txtNombre.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtPrecio.getText().isEmpty()) {
            respuesta = true;
        }
        return respuesta;
    }

    public void centrar_datos() {
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        tablaImportes.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
        tablaImportes.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
        tablaImportes.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
        tablaImportes.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
        tablaImportes.getColumnModel().getColumn(5).setCellRenderer(modelocentrar);
        JTableHeader th = tablaImportes.getTableHeader();
        Font fuente = new Font("Georgia", 1, 12);
        Color header = new Color(43, 95, 255);
        Color body = new Color(188, 204, 255);
        th.setFont(fuente);
        th.setBackground(header);
        th.setForeground(Color.WHITE);
        tablaImportes.setBackground(body);
        tablaImportes.setFont(new java.awt.Font("Georgia", 0, 15));
        tablaImportes.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaImportes.getColumnModel().getColumn(0).setMinWidth(0);
        tablaImportes.getColumnModel().getColumn(0).setPreferredWidth(0);
        tablaImportes.getColumnModel().getColumn(1).setPreferredWidth(1);
        tablaImportes.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablaImportes.getColumnModel().getColumn(3).setPreferredWidth(60);
        tablaImportes.getColumnModel().getColumn(4).setPreferredWidth(40);
        tablaImportes.getColumnModel().getColumn(5).setPreferredWidth(200);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Importes;
    private javax.swing.JButton agregarImporte;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnImporte;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton cancelarImporte;
    private javax.swing.JButton editarImporte;
    private javax.swing.JButton eliminarImporte;
    private javax.swing.JLabel fondoInicio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelPrecio1;
    private javax.swing.JPanel opciones3;
    private javax.swing.JTable tablaImportes;
    private javax.swing.JLabel titulo1;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
