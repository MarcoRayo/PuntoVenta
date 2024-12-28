package Vista;

import Modelo.Ventas;
import Modelo.VentasDao;
import Vista.CategoriasVista;
import java.awt.Color;
import java.awt.GradientPaint;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class InicioVista extends javax.swing.JFrame {

    public InicioVista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.grafica();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Inicio = new javax.swing.JPanel();
        panelVentas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inciopng = new javax.swing.JLabel();
        inciopng2 = new javax.swing.JLabel();
        categoriapng = new javax.swing.JLabel();
        categoriapng2 = new javax.swing.JLabel();
        btnCategorias = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnImporte = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        fondoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 800));
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setPreferredSize(new java.awt.Dimension(1400, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inicio.setBackground(new java.awt.Color(255, 255, 255));
        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Inicio.add(panelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 910, 600));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/InicioTitulo.png"))); // NOI18N
        Inicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloGrande2.png"))); // NOI18N
        Inicio.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 680, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Inicio.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 170, 170));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloGrande2.png"))); // NOI18N
        Inicio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Inicio.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloAzul.png"))); // NOI18N
        Inicio.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, -230, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Inicio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -50, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloPequeñoAzul.png"))); // NOI18N
        Inicio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 390, -1, -1));

        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 840));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1210, 880));

        inciopng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/homepng.png"))); // NOI18N
        getContentPane().add(inciopng, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 20, 40));

        inciopng2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/homepng.png"))); // NOI18N
        getContentPane().add(inciopng2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 20, 40));

        categoriapng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/categorypng.png"))); // NOI18N
        getContentPane().add(categoriapng, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 20, 40));

        categoriapng2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/categorypng.png"))); // NOI18N
        getContentPane().add(categoriapng2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 20, 40));

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

        titulo.setFont(new java.awt.Font("Lucida Bright", 1, 35)); // NOI18N
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoF.png"))); // NOI18N
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/MenuFinal.png"))); // NOI18N
        getContentPane().add(fondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        ProveedoresVista proveedorer = new ProveedoresVista();
        proveedorer.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        InicioVista inicio = new InicioVista();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        CategoriasVista categorias = new CategoriasVista();
        categorias.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        ProductosVista producto = new ProductosVista();
        producto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        VentasVista ventas = new VentasVista();
        ventas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImporteActionPerformed
        ImportesVista importes = new ImportesVista();
        importes.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnImporteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LoginVista login = new LoginVista();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioVista().setVisible(true);
            }
        });
    }

    public void grafica() {
        VentasDao dao = new VentasDao();
        Double totalVentas = 0.0;
        int productosVendidos = 0;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        try {
            Ventas[] ventasResult = dao.OptenerVentas();
            String[] graficaFecha = new String[7];
            int[] graficaProducto = new int[7];
            graficaFecha[0] = ventasResult[ventasResult.length - 1].getFecha();
            int num = 0;
            for (int i = ventasResult.length - 1; i >= 0; i--) {
                if (ventasResult[i].getFecha().equals(graficaFecha[num])) {
                    graficaProducto[num] += ventasResult[i].getProductosVendidos();
                } else {
                    if (num < graficaFecha.length - 1) {
                        num++;
                        graficaFecha[num] = ventasResult[i].getFecha();
                        i = i + 1;
                    } else {
                        i = -1;
                    }
                }
            }
            for (int i = graficaFecha.length - 1; i >= 0; i--) {
                try {
                    datos.setValue(graficaProducto[i], "Vendidos", graficaFecha[i]);
                } catch (Exception e) {                    
                }                
            }

            for (Ventas venta : ventasResult) {
                totalVentas = totalVentas + venta.getTotal();
                productosVendidos = productosVendidos + venta.getProductosVendidos();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        JFreeChart chart = ChartFactory.createBarChart("Ventas Totales", "Días", "Cantidad", datos, PlotOrientation.VERTICAL, true, false, false);

        chart.setBorderPaint(Color.BLUE);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        GradientPaint gp0 = new GradientPaint(0.0f, 1.0f, Color.black, 0.0f, 0.0f, new Color(188, 204, 255), false);
        renderer.setSeriesPaint(0, gp0);

        ChartPanel panel = new ChartPanel(chart);
        panelVentas.setLayout(new java.awt.BorderLayout());
        panelVentas.add(panel);
        panelVentas.validate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inicio;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnImporte;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel categoriapng;
    private javax.swing.JLabel categoriapng2;
    private javax.swing.JLabel fondoInicio;
    private javax.swing.JLabel inciopng;
    private javax.swing.JLabel inciopng2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
