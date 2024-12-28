/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Categoria;
import Modelo.CategoriaDao;
import Modelo.ProductoDao;
import Modelo.Producto;
import Modelo.ProveedorDao;
import Modelo.Proveedor;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author marco
 */
public class ProductosVista extends javax.swing.JFrame {

    DefaultComboBoxModel modeloCategorias = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloProveedores = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloProveedor = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloCategoria = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloCantidad = new DefaultComboBoxModel();
    ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    ProductoDao dao = new ProductoDao();
    CategoriaDao daoCategoria = new CategoriaDao();
    ProveedorDao daoProveedor = new ProveedorDao();
    String buscar = "Nombre";

    /**
     * Creates new form Productos
     */
    public ProductosVista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.Iniciar();
        this.mostrarCategorias(modeloCategorias);
        this.mostrarProveedores(modeloProveedores);
        txtBuscarPor.setEditable(true);
        ((JSpinner.DefaultEditor) spinnerBuscar.getEditor()).getTextField().setEditable(false);
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
        Productos = new javax.swing.JPanel();
        opciones = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtPesoProducto = new javax.swing.JTextField();
        labelProveedor = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        eliminarProducto = new javax.swing.JButton();
        editarProducto = new javax.swing.JButton();
        agregarProducto = new javax.swing.JButton();
        cancelarProducto = new javax.swing.JButton();
        labelPrecio = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        labelPeso = new javax.swing.JLabel();
        txtCantidadProducto = new javax.swing.JTextField();
        PesoProducto = new javax.swing.JComboBox<>();
        categoriaProducto = new javax.swing.JComboBox<>();
        proveedorProducto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        txtIdProducto = new javax.swing.JTextField();
        labelTitulo = new javax.swing.JLabel();
        circulo = new javax.swing.JLabel();
        circulo2 = new javax.swing.JLabel();
        circulo3 = new javax.swing.JLabel();
        circulo4 = new javax.swing.JLabel();
        circulo6 = new javax.swing.JLabel();
        txtBuscarPor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        boxBuscarPor = new javax.swing.JComboBox<>();
        circulo5 = new javax.swing.JLabel();
        spinnerBuscar = new javax.swing.JSpinner();
        circulo7 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        barraInicio = new javax.swing.JLabel();

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

        Productos.setBackground(new java.awt.Color(255, 255, 255));
        Productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opciones.setBackground(new java.awt.Color(188, 204, 255));
        opciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(43, 89, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/OpcionesTitulo.png"))); // NOI18N
        jPanel4.add(jLabel2);

        opciones.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        labelNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nombre_ (3).png"))); // NOI18N
        opciones.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtNombreProducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombreProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        opciones.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 50, 256, 20));

        txtPesoProducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtPesoProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPesoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoProductoKeyTyped(evt);
            }
        });
        opciones.add(txtPesoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 84, 140, 20));

        labelProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Proveedor_.png"))); // NOI18N
        opciones.add(labelProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txtPrecioProducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtPrecioProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioProductoKeyTyped(evt);
            }
        });
        opciones.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 120, 80, 20));

        eliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        eliminarProducto.setBorder(null);
        eliminarProducto.setBorderPainted(false);
        eliminarProducto.setContentAreaFilled(false);
        eliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarProducto.setFocusPainted(false);
        eliminarProducto.setFocusable(false);
        eliminarProducto.setPreferredSize(new java.awt.Dimension(71, 23));
        eliminarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminarPress.png"))); // NOI18N
        eliminarProducto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminarPress.png"))); // NOI18N
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });
        opciones.add(eliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 80, 40));

        editarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar.png"))); // NOI18N
        editarProducto.setBorder(null);
        editarProducto.setBorderPainted(false);
        editarProducto.setContentAreaFilled(false);
        editarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarProducto.setFocusPainted(false);
        editarProducto.setFocusable(false);
        editarProducto.setPreferredSize(new java.awt.Dimension(71, 23));
        editarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editarPress.png"))); // NOI18N
        editarProducto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editarPress.png"))); // NOI18N
        editarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProductoActionPerformed(evt);
            }
        });
        opciones.add(editarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 70, 40));

        agregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        agregarProducto.setBorder(null);
        agregarProducto.setBorderPainted(false);
        agregarProducto.setContentAreaFilled(false);
        agregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarProducto.setFocusPainted(false);
        agregarProducto.setFocusable(false);
        agregarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarPress.png"))); // NOI18N
        agregarProducto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarPress.png"))); // NOI18N
        agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoActionPerformed(evt);
            }
        });
        opciones.add(agregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 70, 40));

        cancelarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        cancelarProducto.setBorder(null);
        cancelarProducto.setBorderPainted(false);
        cancelarProducto.setContentAreaFilled(false);
        cancelarProducto.setFocusPainted(false);
        cancelarProducto.setFocusable(false);
        cancelarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelarPress.png"))); // NOI18N
        cancelarProducto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelarPress.png"))); // NOI18N
        cancelarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarProductoActionPerformed(evt);
            }
        });
        opciones.add(cancelarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 80, 40));

        labelPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Precio_.png"))); // NOI18N
        opciones.add(labelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        labelCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cantidad_.png"))); // NOI18N
        opciones.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 20));

        labelCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Código_.png"))); // NOI18N
        opciones.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, -1));

        labelCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Categoria_.png"))); // NOI18N
        opciones.add(labelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtCodigoProducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtCodigoProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoProductoKeyTyped(evt);
            }
        });
        opciones.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 160, 264, 20));

        labelPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Peso_.png"))); // NOI18N
        opciones.add(labelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 86, 50, -1));

        txtCantidadProducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtCantidadProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtCantidadProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadProductoKeyTyped(evt);
            }
        });
        opciones.add(txtCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 120, 96, 20));

        PesoProducto.setBackground(new java.awt.Color(149, 173, 254));
        PesoProducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        PesoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogramos", "Litros", "Gramos", "Mililitros", "Paquete", "Pieza" }));
        PesoProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        PesoProducto.setFocusable(false);
        opciones.add(PesoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 140, 27));

        categoriaProducto.setBackground(new java.awt.Color(149, 173, 254));
        categoriaProducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        categoriaProducto.setModel(modeloCategorias);
        categoriaProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        categoriaProducto.setFocusable(false);
        opciones.add(categoriaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 195, 238, 25));

        proveedorProducto.setBackground(new java.awt.Color(149, 173, 254));
        proveedorProducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        proveedorProducto.setModel(modeloProveedores);
        proveedorProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        proveedorProducto.setFocusable(false);
        opciones.add(proveedorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 235, 230, 25));

        Productos.add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, 330));

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
                "#", "Nombre", "Peso", "Precio", "Cantidad", "Código", "Proveedor", "Categoria", "Tamaño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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

        Productos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 740, 580));

        txtIdProducto.setBorder(null);
        txtIdProducto.setFocusable(false);
        Productos.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 30, -1));

        labelTitulo.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ProductosTitulo.png"))); // NOI18N
        Productos.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        circulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Productos.add(circulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        circulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Productos.add(circulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 390, -1, -1));

        circulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloGrande2.png"))); // NOI18N
        Productos.add(circulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, -1, -1));

        circulo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Productos.add(circulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 170, 170));

        circulo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloGrande2.png"))); // NOI18N
        Productos.add(circulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 680, -1, -1));

        txtBuscarPor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPorKeyReleased(evt);
            }
        });
        Productos.add(txtBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Buscar por_.png"))); // NOI18N
        Productos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        Productos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, -1, 30));

        boxBuscarPor.setBackground(new java.awt.Color(188, 204, 255));
        boxBuscarPor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxBuscarPor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boxBuscarPor.setFocusable(false);
        boxBuscarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBuscarPorActionPerformed(evt);
            }
        });
        Productos.add(boxBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 120, 30));

        circulo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloAzul.png"))); // NOI18N
        Productos.add(circulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, -230, -1, -1));

        spinnerBuscar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        spinnerBuscar.setModel(new javax.swing.SpinnerListModel(new String[] {"Nombre", "Código", "Categoria", "Proveedor", "Cantidad"}));
        spinnerBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(188, 204, 255), 2, true));
        spinnerBuscar.setFocusable(false);
        Productos.add(spinnerBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 90, 30));

        circulo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Productos.add(circulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -50, -1, -1));

        getContentPane().add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1230, 840));

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

    private void eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas eliminar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            if (txtIdProducto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ocurrio Algun error inesperado");
            } else {
                if (dao.BorrarProducto(Integer.parseInt(txtIdProducto.getText())) > 0) {
                    JOptionPane.showMessageDialog(null, "Proveedor eliminado correctamente");
                    this.limpiarTextField();
                    this.mostrarProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "No puede eliminar un proveedor que esta siendo usado");
                }
            }
        }
    }//GEN-LAST:event_eliminarProductoActionPerformed

    private void editarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProductoActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas editar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            if (txtIdProducto.getText().isEmpty() || verificarText()) {
                JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos");
            } else {
                if (dao.EditarProducto(Integer.parseInt(txtIdProducto.getText()), txtNombreProducto.getText(),
                        Integer.parseInt(txtPesoProducto.getText()), Double.parseDouble(txtPrecioProducto.getText()), Integer.parseInt(txtCantidadProducto.getText()),
                        Long.parseLong(txtCodigoProducto.getText()), daoProveedor.buscarProveedor(proveedorProducto.getSelectedItem().toString()), daoCategoria.buscarCategoria(categoriaProducto.getSelectedItem().toString()),
                        dao.optenerPesoLetra(PesoProducto.getSelectedIndex())) > 0) {
                    JOptionPane.showMessageDialog(null, "Producto modificado correctamente");
                    this.limpiarTextField();
                    this.mostrarProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "No pudo modificar el producto");
                }
            }
        }
    }//GEN-LAST:event_editarProductoActionPerformed

    private void agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoActionPerformed
        if (verificarText()) {
            JOptionPane.showMessageDialog(null, "Debes de rellenar todos los campos");
        } else {
            try {
                if (daoCategoria.buscarCategoria(categoriaProducto.getSelectedItem().toString()) != -1
                        || daoProveedor.buscarProveedor(proveedorProducto.getSelectedItem().toString()) != -1) {
                    dao.RegistrarProducto(txtNombreProducto.getText(), Integer.parseInt(txtPesoProducto.getText()),
                            Double.parseDouble(txtPrecioProducto.getText()), Integer.parseInt(txtCantidadProducto.getText()),
                            Long.parseLong(txtCodigoProducto.getText()), daoProveedor.buscarProveedor(proveedorProducto.getSelectedItem().toString()),
                            daoCategoria.buscarCategoria(categoriaProducto.getSelectedItem().toString()),
                            dao.optenerPesoLetra(PesoProducto.getSelectedIndex()));
                    JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
                    this.limpiarTextField();
                    this.mostrarProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al agregar producto (Categoria o Proveedor)");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
                JOptionPane.showMessageDialog(null, "Error al agregar producto");
            }
        }
    }//GEN-LAST:event_agregarProductoActionPerformed

    private void cancelarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarProductoActionPerformed
        this.desactivarBtn();
        agregarProducto.setEnabled(true);
        this.limpiarTextField();
        tablaProductos.clearSelection();
    }//GEN-LAST:event_cancelarProductoActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        if (evt.getClickCount() == 1) {
            this.activarBtn();
            txtIdProducto.setVisible(false);
            agregarProducto.setEnabled(false);
            JTable receptor = (JTable) evt.getSource();
            txtIdProducto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtNombreProducto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtPesoProducto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString().replaceAll("\\D+", ""));
            txtPrecioProducto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            txtCantidadProducto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());
            txtCodigoProducto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 6).toString());
            editarPeso(dao.optenerPesoLetraCompleto(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString().replaceAll(" ", "")));
            editarCategoria(receptor.getModel().getValueAt(receptor.getSelectedRow(), 8).toString());
            editarProveedor(receptor.getModel().getValueAt(receptor.getSelectedRow(), 7).toString());
        }
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void txtPesoProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoProductoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPesoProductoKeyTyped

    private void txtCantidadProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadProductoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadProductoKeyTyped

    private void txtCodigoProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProductoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoProductoKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar = spinnerBuscar.getValue().toString();
        if (buscar.equals("Nombre") || buscar.equals("Código")) {
            txtBuscarPor.setEditable(true);
            boxBuscarPor.setEnabled(false);
            boxBuscarPor.setModel(modeloCantidad);
        } else {
            txtBuscarPor.setEditable(false);
            boxBuscarPor.setEnabled(true);
            txtBuscarPor.setText(null);
            switch (buscar) {
                case "Proveedor":
                    this.mostrarProveedores(modeloProveedor);
                    boxBuscarPor.setModel(modeloProveedor);
                    break;
                case "Categoria":
                    this.mostrarCategorias(modeloCategoria);
                    boxBuscarPor.setModel(modeloCategoria);
                    break;
                case "Cantidad":
                    modeloCantidad.addElement("0-20");
                    modeloCantidad.addElement("21-50");
                    modeloCantidad.addElement("51-100");
                    modeloCantidad.addElement("101-150");
                    modeloCantidad.addElement("151-200");
                    modeloCantidad.addElement("201-∞");
                    boxBuscarPor.setModel(modeloCantidad);
                    break;
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarPorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPorKeyReleased
        switch (buscar) {
            case "Nombre":
                tablaProductos.setModel(dao.buscarPor(txtBuscarPor.getText(), "nombre"));
                this.centrar_datos();
                break;
            case "Código":
                tablaProductos.setModel(dao.buscarPor(txtBuscarPor.getText(), "codigo"));
                this.centrar_datos();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_txtBuscarPorKeyReleased

    private void boxBuscarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBuscarPorActionPerformed
        switch (buscar) {
            case "Proveedor":
                tablaProductos.setModel(dao.buscarPorProveedor(boxBuscarPor.getSelectedItem().toString()));
                this.centrar_datos();
                break;
            case "Categoria":
                tablaProductos.setModel(dao.buscarPorCategoria(boxBuscarPor.getSelectedItem().toString()));
                this.centrar_datos();
                break;
            case "Cantidad":                
                int [] numeros = dao.optenerCantidadNumero(boxBuscarPor.getSelectedItem().toString());
                tablaProductos.setModel(dao.buscarPorCantidad(numeros[0], numeros[1]));
                this.centrar_datos();
                break;
            default:
                this.mostrarProductos();
                break;
        }
    }//GEN-LAST:event_boxBuscarPorActionPerformed

    private void txtPrecioProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioProductoKeyTyped
        int caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtPrecioProducto.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioProductoKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductosVista().setVisible(true);
            }
        });
    }

    public void mostrarProductos() {
        this.desactivarBtn();
        agregarProducto.setEnabled(true);
        listaProductos.removeAll(listaProductos);
        try {
            ProductoDao pro = new ProductoDao();
            Producto[] productosConsulta = pro.OptenerProductos();
            for (int i = 0; i < productosConsulta.length; i++) {
                listaProductos.add(productosConsulta[i]);
            }
            String productosTabla[][] = new String[listaProductos.size()][9];
            for (int i = 0; i < listaProductos.size(); i++) {
                productosTabla[i][0] = String.valueOf(listaProductos.get(i).getId());
                int x = i + 1;
                productosTabla[i][1] = x + "";
                productosTabla[i][2] = listaProductos.get(i).getNombre();
                productosTabla[i][3] = String.valueOf(listaProductos.get(i).getPeso()) + " " + listaProductos.get(i).getLetra();
                productosTabla[i][4] = String.valueOf(listaProductos.get(i).getPrecio());
                productosTabla[i][5] = String.valueOf(listaProductos.get(i).getCantidad());
                productosTabla[i][6] = String.valueOf(listaProductos.get(i).getCodigo());
                productosTabla[i][7] = daoProveedor.optenerProveedorNombre(listaProductos.get(i).getProveedor());
                productosTabla[i][8] = daoCategoria.optenerCategoriaNombre(listaProductos.get(i).getCategoria());
            }
            tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
                    productosTabla, new String[]{
                        "id", "#", "Nombre", "Peso", "Precio", "Cantidad", "Código", "Proveedor", "Categoria"
                    }
            ));
            tablaProductos.getColumnModel().getColumn(0).setMaxWidth(0);
            tablaProductos.getColumnModel().getColumn(0).setMinWidth(0);
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablaProductos.getColumnModel().getColumn(1).setMaxWidth(24);
            tablaProductos.getColumnModel().getColumn(1).setMinWidth(24);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(24);
        } catch (Exception e) {
            System.out.println("error mostrar");
        }
        this.centrar_datos();
    }

    public void Iniciar() {
        this.desactivarBtn();
        boxBuscarPor.setEnabled(false);
        agregarProducto.setEnabled(true);
        try {
            ProductoDao pro = new ProductoDao();
            Producto[] productosConsulta = pro.OptenerProductos();
            for (int i = 0; i < productosConsulta.length; i++) {
                listaProductos.add(productosConsulta[i]);
            }
        } catch (Exception e) {
            System.out.println("error mostrar");
        }

        String productosTabla[][] = new String[listaProductos.size()][9];
        for (int i = 0; i < listaProductos.size(); i++) {
            productosTabla[i][0] = String.valueOf(listaProductos.get(i).getId());
            int x = i + 1;
            productosTabla[i][1] = x + "";
            productosTabla[i][2] = listaProductos.get(i).getNombre();
            productosTabla[i][3] = String.valueOf(listaProductos.get(i).getPeso()) + " " + listaProductos.get(i).getLetra();
            productosTabla[i][4] = String.valueOf(listaProductos.get(i).getPrecio());
            productosTabla[i][5] = String.valueOf(listaProductos.get(i).getCantidad());
            productosTabla[i][6] = String.valueOf(listaProductos.get(i).getCodigo());
            productosTabla[i][7] = daoProveedor.optenerProveedorNombre(listaProductos.get(i).getProveedor());
            productosTabla[i][8] = daoCategoria.optenerCategoriaNombre(listaProductos.get(i).getCategoria());
        }
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
                productosTabla, new String[]{
                    "id", "#", "Nombre", "Peso", "Precio", "Cantidad", "Código", "Proveedor", "Categoria"
                }
        ));
        this.centrar_datos();
    }

    public void limpiarTextField() {
        txtNombreProducto.setText(null);
        txtIdProducto.setText(null);
        txtPesoProducto.setText(null);
        txtPrecioProducto.setText(null);
        PesoProducto.setAction(null);
        txtCantidadProducto.setText(null);
        txtCodigoProducto.setText(null);
    }

    public void activarBtn() {
        agregarProducto.setEnabled(true);
        editarProducto.setEnabled(true);
        eliminarProducto.setEnabled(true);
        cancelarProducto.setEnabled(true);
    }

    public void desactivarBtn() {
        agregarProducto.setEnabled(false);
        editarProducto.setEnabled(false);
        eliminarProducto.setEnabled(false);
        cancelarProducto.setEnabled(false);
    }

    public boolean verificarText() {
        boolean respuesta = false;
        if (txtNombreProducto.getText().isEmpty() || txtPesoProducto.getText().isEmpty() || txtPrecioProducto.getText().isEmpty()
                || txtCantidadProducto.getText().isEmpty() || txtCodigoProducto.getText().isEmpty()) {
            respuesta = true;
        }
        return respuesta;
    }

    public void mostrarCategorias(DefaultComboBoxModel model) {
        if (modeloCategoria != null) {
            modeloCategoria.removeAllElements();
            CategoriaDao daoCategorias = new CategoriaDao();
            Categoria[] categoriasConsulta = daoCategorias.OptenerCategorias();
            for (Categoria categoria : categoriasConsulta) {
                model.addElement(categoria.getNombre());
            }
        }
    }

    public void mostrarProveedores(DefaultComboBoxModel model) {
        modeloProveedor.removeAllElements();
        ProveedorDao daoProveedores = new ProveedorDao();
        Proveedor[] proveedoresConsulta = daoProveedores.OptenerProveedores();
        for (Proveedor proveedor : proveedoresConsulta) {
            model.addElement(proveedor.getMarca());
        }
    }

    public void centrar_datos() {
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 1; i < tablaProductos.getColumnCount(); i++) {
            tablaProductos.getColumnModel().getColumn(i).setCellRenderer(modelocentrar);
        }
        tablaProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(0).setMinWidth(0);
        tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
        tablaProductos.getColumnModel().getColumn(1).setMaxWidth(28);
        tablaProductos.getColumnModel().getColumn(1).setMinWidth(28);
        tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(28);
        tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(200);
        tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(55);
        tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(65);
        tablaProductos.getColumnModel().getColumn(5).setPreferredWidth(75);
        tablaProductos.getColumnModel().getColumn(6).setPreferredWidth(150);
        tablaProductos.getColumnModel().getColumn(7).setPreferredWidth(75);
        tablaProductos.getColumnModel().getColumn(8).setPreferredWidth(70);
        JTableHeader th = tablaProductos.getTableHeader();
        Font fuente = new Font("Georgia", 1, 12);
        Color header = new Color(43, 95, 255);
        Color body = new Color(188, 204, 255);
        th.setFont(fuente);
        th.setBackground(header);
        th.setForeground(Color.WHITE);
        tablaProductos.setBackground(body);
    }

    public void limpiarTabla(DefaultTableModel model) {
        try {
            int filas = model.getRowCount();
            for (int i = 0; i <= filas; i++) {
                System.out.println(model.getRowCount());
                model.removeRow(i);
            }
        } catch (Exception e) {
            System.out.println("Esta vacia");
        }
    }

    public void editarPeso(String peso) {
        for (int i = 0; i < PesoProducto.getItemCount(); i++) {
            if (peso.equals(PesoProducto.getItemAt(i))) {
                PesoProducto.setSelectedIndex(i);
                i = PesoProducto.getItemCount() + 1;
            }
        }
    }

    public void editarCategoria(String categoria) {
        for (int i = 0; i < categoriaProducto.getItemCount(); i++) {
            if (categoria.equals(categoriaProducto.getItemAt(i))) {
                categoriaProducto.setSelectedIndex(i);
                i = categoriaProducto.getItemCount() + 1;
            }
        }
    }

    public void editarProveedor(String proveedor) {
        for (int i = 0; i < proveedorProducto.getItemCount(); i++) {
            if (proveedor.equals(proveedorProducto.getItemAt(i))) {
                proveedorProducto.setSelectedIndex(i);
                i = proveedorProducto.getItemCount() + 1;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PesoProducto;
    private javax.swing.JPanel Productos;
    private javax.swing.JButton agregarProducto;
    private javax.swing.JLabel barraInicio;
    private javax.swing.JComboBox<String> boxBuscarPor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnImporte;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton cancelarProducto;
    private javax.swing.JComboBox<String> categoriaProducto;
    private javax.swing.JLabel circulo;
    private javax.swing.JLabel circulo2;
    private javax.swing.JLabel circulo3;
    private javax.swing.JLabel circulo4;
    private javax.swing.JLabel circulo5;
    private javax.swing.JLabel circulo6;
    private javax.swing.JLabel circulo7;
    private javax.swing.JButton editarProducto;
    private javax.swing.JButton eliminarProducto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelProveedor;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel opciones;
    private javax.swing.JComboBox<String> proveedorProducto;
    private javax.swing.JSpinner spinnerBuscar;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtBuscarPor;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPesoProducto;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables
}
