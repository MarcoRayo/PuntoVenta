/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.BD.Conexion;
import Modelo.VentasDao;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author marco
 */
public class VentasVista extends javax.swing.JFrame {

    public VentasVista() {
        initComponents();
        buscarProducto("");
        this.setLocationRelativeTo(null);
        this.desactivarBotonesVenta();
        txtTotalFinal.setEditable(false);
    }

    String[] titulos = {"#", "Nombre", "Cantidad", "Precio", "Código", "Peso", "cantidadTotal", "id"};
    DefaultTableModel model = new DefaultTableModel(null, titulos);

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
        Ventas = new javax.swing.JPanel();
        opciones3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cancelarProductoVenta = new javax.swing.JButton();
        eliminarProductoVenta = new javax.swing.JButton();
        editarProductoVenta = new javax.swing.JButton();
        agregarProductoVenta = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        spinnerCantidad = new javax.swing.JSpinner();
        txtPeso = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        btnCancelarCompraFinal = new javax.swing.JButton();
        btnRealizarCompraFinal = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        buscarProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        opciones4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductosBuscar = new javax.swing.JTable();
        txtTotalFinal = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        fondoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        Ventas.setBackground(new java.awt.Color(255, 255, 255));
        Ventas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opciones3.setBackground(new java.awt.Color(188, 204, 255));
        opciones3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opciones3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(43, 89, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista De Venta");
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        opciones3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 740, 40));

        tablaProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaProductos.setFont(new java.awt.Font("Tahoma", 0, 15));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nombre", "Cantidad", "Precio", "Código", "Peso", "cantidadTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaProductos.setRowHeight(30);
        tablaProductos.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tablaProductos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProductos.getTableHeader().setReorderingAllowed(false);
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
        }

        opciones3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 740, 240));
        opciones3.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 230, -1));
        opciones3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 220, -1));
        opciones3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 90, -1));

        cancelarProductoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        cancelarProductoVenta.setBorder(null);
        cancelarProductoVenta.setBorderPainted(false);
        cancelarProductoVenta.setContentAreaFilled(false);
        cancelarProductoVenta.setFocusPainted(false);
        cancelarProductoVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelarPress.png"))); // NOI18N
        cancelarProductoVenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelarPress.png"))); // NOI18N
        cancelarProductoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarProductoVentaActionPerformed(evt);
            }
        });
        opciones3.add(cancelarProductoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 80, 40));

        eliminarProductoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        eliminarProductoVenta.setBorder(null);
        eliminarProductoVenta.setBorderPainted(false);
        eliminarProductoVenta.setContentAreaFilled(false);
        eliminarProductoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarProductoVenta.setFocusPainted(false);
        eliminarProductoVenta.setPreferredSize(new java.awt.Dimension(71, 23));
        eliminarProductoVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminarPress.png"))); // NOI18N
        eliminarProductoVenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminarPress.png"))); // NOI18N
        eliminarProductoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoVentaActionPerformed(evt);
            }
        });
        opciones3.add(eliminarProductoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 80, 40));

        editarProductoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar.png"))); // NOI18N
        editarProductoVenta.setBorder(null);
        editarProductoVenta.setBorderPainted(false);
        editarProductoVenta.setContentAreaFilled(false);
        editarProductoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarProductoVenta.setFocusPainted(false);
        editarProductoVenta.setPreferredSize(new java.awt.Dimension(71, 23));
        editarProductoVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editarPress.png"))); // NOI18N
        editarProductoVenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editarPress.png"))); // NOI18N
        editarProductoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProductoVentaActionPerformed(evt);
            }
        });
        opciones3.add(editarProductoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 70, 40));

        agregarProductoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        agregarProductoVenta.setBorder(null);
        agregarProductoVenta.setBorderPainted(false);
        agregarProductoVenta.setContentAreaFilled(false);
        agregarProductoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarProductoVenta.setFocusPainted(false);
        agregarProductoVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarPress.png"))); // NOI18N
        agregarProductoVenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarPress.png"))); // NOI18N
        agregarProductoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoVentaActionPerformed(evt);
            }
        });
        opciones3.add(agregarProductoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 40));

        jPanel4.setBackground(new java.awt.Color(43, 89, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Opciones");
        jPanel4.add(jLabel4);

        opciones3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 40));
        opciones3.add(spinnerCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 50, -1));

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        opciones3.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 260, -1));

        labelNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nombre_ (3).png"))); // NOI18N
        opciones3.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        labelCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cantidad_.png"))); // NOI18N
        opciones3.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        labelPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Precio_.png"))); // NOI18N
        opciones3.add(labelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        labelPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Peso_.png"))); // NOI18N
        opciones3.add(labelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, -1));

        labelCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Código_.png"))); // NOI18N
        opciones3.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        Ventas.add(opciones3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 1080, 280));

        btnCancelarCompraFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnCancelarFinalCompra.png"))); // NOI18N
        btnCancelarCompraFinal.setBorderPainted(false);
        btnCancelarCompraFinal.setContentAreaFilled(false);
        btnCancelarCompraFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarCompraFinal.setFocusPainted(false);
        btnCancelarCompraFinal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnCancelarFinalCompraPress.png"))); // NOI18N
        btnCancelarCompraFinal.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnCancelarFinalCompraPress.png"))); // NOI18N
        btnCancelarCompraFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCompraFinalActionPerformed(evt);
            }
        });
        Ventas.add(btnCancelarCompraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 690, 200, 60));

        btnRealizarCompraFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnCompraFinal.png"))); // NOI18N
        btnRealizarCompraFinal.setBorderPainted(false);
        btnRealizarCompraFinal.setContentAreaFilled(false);
        btnRealizarCompraFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRealizarCompraFinal.setFocusPainted(false);
        btnRealizarCompraFinal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnCompraFinalPress.png"))); // NOI18N
        btnRealizarCompraFinal.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnCompraFinalPress.png"))); // NOI18N
        btnRealizarCompraFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCompraFinalActionPerformed(evt);
            }
        });
        Ventas.add(btnRealizarCompraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 690, 200, 60));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnBuscar2Press.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnBuscar2btn.png"))); // NOI18N
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnBuscar2btn.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        Ventas.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, 50, 40));

        buscarProducto.setBorder(null);
        buscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarProductoKeyReleased(evt);
            }
        });
        Ventas.add(buscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 260, 20));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 40)); // NOI18N
        jLabel3.setText("Total:");
        Ventas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 680, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscarlol.png"))); // NOI18N
        Ventas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, -1, 50));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/VentasTitulo.png"))); // NOI18N
        Ventas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloGrande2.png"))); // NOI18N
        Ventas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Ventas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 170, 170));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloGrande2.png"))); // NOI18N
        Ventas.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 680, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Ventas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -50, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Ventas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 390, -1, -1));

        opciones4.setBackground(new java.awt.Color(255, 255, 255));
        opciones4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opciones4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(43, 89, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Buscar Producto");
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        opciones4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 40));

        tablaProductosBuscar = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaProductosBuscar.setFont(new java.awt.Font("Tahoma", 0, 15));
        tablaProductosBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio", "Código", "Tamaño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductosBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaProductosBuscar.setRowHeight(30);
        tablaProductosBuscar.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tablaProductosBuscar.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaProductosBuscar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProductosBuscar.getTableHeader().setReorderingAllowed(false);
        tablaProductosBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosBuscarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProductosBuscar);

        opciones4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1080, 290));

        Ventas.add(opciones4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1080, 330));

        txtTotalFinal.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        txtTotalFinal.setBorder(null);
        txtTotalFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalFinalActionPerformed(evt);
            }
        });
        Ventas.add(txtTotalFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 690, 190, 40));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        Ventas.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 30, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloAzul.png"))); // NOI18N
        Ventas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, -230, -1, -1));
        Ventas.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 690, 20, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Ventas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        getContentPane().add(Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1210, 860));

        titulo.setFont(new java.awt.Font("Lucida Bright", 1, 35)); // NOI18N
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoF.png"))); // NOI18N
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        if (evt.getClickCount() == 1) {
            this.activarBotonesVenta();
            agregarProductoVenta.setEnabled(false);
            JTable receptor = (JTable) evt.getSource();
            txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            spinnerCantidad.setValue(Integer.parseInt(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString()));
            txtPrecio.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txtCodigo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            txtPeso.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());
            txtCantidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 6).toString());
            txtId.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 7).toString());
        }
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tablaProductosBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosBuscarMouseClicked
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();
            txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtPeso.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            spinnerCantidad.setValue(1);
            spinnerCantidad.setEnabled(true);
            txtCantidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtPrecio.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txtCodigo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            txtId.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());
            this.activarBotonesVenta();
            eliminarProductoVenta.setEnabled(false);
            editarProductoVenta.setEnabled(false);
        }
    }//GEN-LAST:event_tablaProductosBuscarMouseClicked

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void buscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarProductoKeyReleased
        String buscar = buscarProducto.getText();
        buscarProducto(buscar);
    }//GEN-LAST:event_buscarProductoKeyReleased

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void agregarProductoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoVentaActionPerformed
        if (Integer.parseInt(txtCantidad.getText()) >= Integer.parseInt(spinnerCantidad.getValue().toString())) {
            boolean validacion = false;
            if (tablaProductos.getRowCount() > 0) {
                for (int i = 0; i < tablaProductos.getRowCount(); i++) {
                    validacion = txtId.getText().equals(tablaProductos.getValueAt(i, 7).toString());
                    if (validacion) {
                        i = tablaProductos.getRowCount() + 1;
                        JOptionPane.showMessageDialog(null, "No puede agregrar productos iguales");
                    }
                }
            }
            if (!validacion) {
                String[] fila = new String[10];
                fila[0] = model.getRowCount() + 1 + "";
                fila[1] = txtNombre.getText();
                fila[2] = spinnerCantidad.getValue().toString();
                fila[3] = txtPrecio.getText();
                fila[4] = txtCodigo.getText();
                fila[5] = txtPeso.getText();
                fila[6] = txtCantidad.getText();
                fila[7] = txtId.getText();
                txtTotalFinal.setText(txtPrecio.getText());
                model.addRow(fila);
                tablaProductos.setModel(model);
                this.limpiarTextField();
                this.desactivarBotonesVenta();
                txtTotalFinal.setText(calcularTotal() + "");
                btnCancelarCompraFinal.setEnabled(true);
                btnRealizarCompraFinal.setEnabled(true);
            }
            this.centrar_datos_compra();
        } else {
            if (Integer.parseInt(txtCantidad.getText()) == 0) {
                JOptionPane.showMessageDialog(null, "No hay productos en existencia");
            } else {
                JOptionPane.showMessageDialog(null, "No hay en existencia suficientes para realizar la compra");
            }
        }
        tablaProductosBuscar.clearSelection();
    }//GEN-LAST:event_agregarProductoVentaActionPerformed

    private void cancelarProductoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarProductoVentaActionPerformed
        this.limpiarTextField();
        spinnerCantidad.setValue(0);
        spinnerCantidad.setEnabled(false);
        this.desactivarBotonesVenta();
        tablaProductosBuscar.clearSelection();
        tablaProductos.clearSelection();
    }//GEN-LAST:event_cancelarProductoVentaActionPerformed

    private void eliminarProductoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoVentaActionPerformed
        DefaultTableModel eliminar = (DefaultTableModel) tablaProductos.getModel();
        eliminar.removeRow(tablaProductos.getSelectedRow());
        if (tablaProductos.getRowCount() > 0) {
            for (int i = 0; i < tablaProductos.getRowCount(); i++) {
                tablaProductos.setValueAt(i + 1, i, 0);
            }
        }
        this.limpiarTextField();
        spinnerCantidad.setValue(0);
        this.desactivarBotonesVenta();
        txtTotalFinal.setText(calcularTotal() + "");
    }//GEN-LAST:event_eliminarProductoVentaActionPerformed

    private void editarProductoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProductoVentaActionPerformed
        tablaProductos.setValueAt(spinnerCantidad.getValue(), tablaProductos.getSelectedRow(), 2);
        this.desactivarBotonesVenta();
        this.limpiarTextField();
        txtTotalFinal.setText(calcularTotal() + "");
        tablaProductos.clearSelection();
    }//GEN-LAST:event_editarProductoVentaActionPerformed

    private void txtTotalFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalFinalActionPerformed

    private void btnCancelarCompraFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCompraFinalActionPerformed
        this.limpiarTextField();
        spinnerCantidad.setValue(0);
        DefaultTableModel mode = new DefaultTableModel(null, titulos);
        model = mode;
        tablaProductos.setModel(model);
        txtTotalFinal.setText("0.0");
        btnCancelarCompraFinal.setEnabled(false);
        btnRealizarCompraFinal.setEnabled(false);
    }//GEN-LAST:event_btnCancelarCompraFinalActionPerformed

    private void btnRealizarCompraFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCompraFinalActionPerformed
        int filas = tablaProductos.getRowCount();
        int productos = 0;
        VentasDao ventasNuevas = new VentasDao();
        boolean ventaResult = true;
        for (int i = 0; i < filas; i++) {
            productos += Integer.parseInt(tablaProductos.getValueAt(i, 2).toString());            
            if (ventaResult) {
                ventaResult =  ventasNuevas.RealizarCompra(Integer.parseInt(tablaProductos.getValueAt(i, 7).toString()), Integer.parseInt(tablaProductos.getValueAt(i, 2).toString()));                
            }            
        }        
        btnCancelarCompraFinal.setEnabled(false);
        btnRealizarCompraFinal.setEnabled(false);
        DefaultTableModel mode = new DefaultTableModel(null, titulos);
        model = mode;
        tablaProductos.setModel(model);        
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = new Date();
        ventasNuevas.RegistrarVenta(dateformat.format(fecha), Double.parseDouble(txtTotalFinal.getText()), productos);
        txtTotalFinal.setText("0.0");
        this.buscarProducto("");
    }//GEN-LAST:event_btnRealizarCompraFinalActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentasVista().setVisible(true);
            }
        });
    }

    public void buscarProducto(String producto) {
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMaximum(100);
        modeloSpinner.setMinimum(1);
        spinnerCantidad.setModel(modeloSpinner);        
        txtCantidad.setVisible(false);
        txtId.setVisible(false);
        btnCancelarCompraFinal.setEnabled(false);
        btnRealizarCompraFinal.setEnabled(false);
        try {
            Connection con;
            PreparedStatement ps;
            ResultSet rs;
            Conexion cn = new Conexion();
            String sql = "";
            String filtro = "" + producto + "_%";
            if (producto.isEmpty()) {
                sql = "SELECT * FROM producto";
            } else {
                if (producto.matches("[+-]?\\d*(\\.\\d+)?")) {
                    sql = "SELECT * FROM producto WHERE codigo LIKE" + '"' + filtro + '"' + "OR codigo=" + producto;
                } else {
                    sql = "SELECT * FROM producto WHERE nombre LIKE" + '"' + filtro + '"';
                }
            }
            String[] titulos = {"Nombre", "Peso", "Cantidad", "Precio", "Código", "id"};
            DefaultTableModel model = new DefaultTableModel(null, titulos);
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            String[] fila = new String[7];
            while (rs.next()) {
                fila[0] = rs.getString("nombre");
                fila[1] = rs.getString("peso") + " " + rs.getString("tamanioLetra");
                fila[2] = rs.getString("cantidad");
                fila[3] = rs.getString("precio");
                fila[4] = rs.getString("codigo");
                fila[5] = rs.getString("idproducto");
                model.addRow(fila);
            }
            tablaProductosBuscar.setModel(model);
            this.centrar_datos_buscar();
            this.centrar_datos_compra();
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        if (tablaProductos.getRowCount() > 0) {
            for (int i = 0; i < tablaProductos.getRowCount(); i++) {
                int cantidad = Integer.parseInt(tablaProductos.getValueAt(i, 2).toString());
                double precio = Double.parseDouble(tablaProductos.getValueAt(i, 3).toString());
                total = total + (cantidad * precio);
            }
        }
        return total;
    }

    public void centrar_datos_buscar() {
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tablaProductosBuscar.getColumnCount(); i++) {
            tablaProductosBuscar.getColumnModel().getColumn(i).setCellRenderer(modelocentrar);
        }
        tablaProductosBuscar.getColumnModel().getColumn(5).setMaxWidth(0);
        tablaProductosBuscar.getColumnModel().getColumn(5).setMinWidth(0);
        tablaProductosBuscar.getColumnModel().getColumn(5).setPreferredWidth(0);
        JTableHeader th = tablaProductosBuscar.getTableHeader();
        Font fuente = new Font("Georgia", 1, 12);
        Color header = new Color(43, 95, 255);
        Color body = new Color(188, 204, 255);
        th.setFont(fuente);
        th.setBackground(header);
        th.setForeground(Color.WHITE);
        tablaProductosBuscar.setBackground(body);
    }

    public void centrar_datos_compra() {
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 1; i < tablaProductos.getColumnCount(); i++) {
            tablaProductos.getColumnModel().getColumn(i).setCellRenderer(modelocentrar);
        }
        JTableHeader th = tablaProductos.getTableHeader();
        Font fuente = new Font("Georgia", 1, 12);
        Color header = new Color(43, 95, 255);
        Color body = new Color(188, 204, 255);
        th.setFont(fuente);
        th.setBackground(header);
        th.setForeground(Color.WHITE);
        tablaProductos.setBackground(body);
        tablaProductos.getColumnModel().getColumn(0).setMaxWidth(20);
        tablaProductos.getColumnModel().getColumn(0).setMinWidth(20);
        tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(20);
        tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(50);
        tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(30);
        tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(30);
        tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(50);
        tablaProductos.getColumnModel().getColumn(5).setPreferredWidth(50);
        tablaProductos.getColumnModel().getColumn(6).setPreferredWidth(50);
        tablaProductos.getColumnModel().getColumn(7).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(7).setMinWidth(0);
        tablaProductos.getColumnModel().getColumn(7).setPreferredWidth(0);
    }

    public void limpiarTextField() {
        txtNombre.setText(null);
        txtCantidad.setText(null);
        txtId.setText(null);
        txtCodigo.setText(null);
        txtPeso.setText(null);
        txtPrecio.setText(null);
    }

    public void desactivarBotonesVenta() {
        spinnerCantidad.setValue(0);
        spinnerCantidad.setEnabled(false);
        cancelarProductoVenta.setEnabled(false);
        eliminarProductoVenta.setEnabled(false);
        editarProductoVenta.setEnabled(false);
        agregarProductoVenta.setEnabled(false);
    }

    public void activarBotonesVenta() {
        spinnerCantidad.setEnabled(true);
        cancelarProductoVenta.setEnabled(true);
        eliminarProductoVenta.setEnabled(true);
        editarProductoVenta.setEnabled(true);
        agregarProductoVenta.setEnabled(true);
    }

    public void desactivarEditar() {
        txtNombre.setEditable(false);
        spinnerCantidad.setEnabled(false);
        txtCodigo.setEditable(false);
        txtPeso.setEditable(false);
        txtPrecio.setEditable(false);
        txtCantidad.setEditable(false);
        txtId.setEditable(false);
        txtTotalFinal.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ventas;
    private javax.swing.JButton agregarProductoVenta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarCompraFinal;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnImporte;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRealizarCompraFinal;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JTextField buscarProducto;
    private javax.swing.JButton cancelarProductoVenta;
    private javax.swing.JButton editarProductoVenta;
    private javax.swing.JButton eliminarProductoVenta;
    private javax.swing.JLabel fondoInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JPanel opciones3;
    private javax.swing.JPanel opciones4;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaProductosBuscar;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotalFinal;
    // End of variables declaration//GEN-END:variables
}
