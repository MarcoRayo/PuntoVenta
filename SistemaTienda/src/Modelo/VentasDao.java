package Modelo;

import Modelo.BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VentasDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public Ventas[] OptenerVentas() {
        String sql = "SELECT * FROM ventas";
        Ventas[] ventasResult;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int total = 0;
            while (rs.next()) {
                total++;                
            }
            Ventas[] ventas = new Ventas[total];
            ventasResult = ventas;
            rs = ps.executeQuery();
            for (int i = 0; rs.next(); i++) {
                Ventas venta = new Ventas();
                venta.setId(rs.getInt("idventas"));
                venta.setFecha(rs.getString("fecha"));
                venta.setTotal(rs.getDouble("total"));
                venta.setProductosVendidos(rs.getInt("productosVendidos"));
                ventas[i] = venta;
            }
        } catch (Exception e) {
            ventasResult = null;
            System.out.println(e.toString());
        }
        return ventasResult;
    }

    public int RegistrarVenta(String fecha, double total, int totalVendidos) {
        String sql = "INSERT INTO ventas(`fecha`, `total`,`productosVendidos`) VALUES (?,?,?)";
        int respuesta = 0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, fecha);
            ps.setDouble(2, total);
            ps.setDouble(3, totalVendidos);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Error al registrar");
        }
        return respuesta;
    }
    
    public boolean RealizarCompra(int id, int cantidad){        
        try {
            con = cn.getConnection();
            PreparedStatement procedimiento = con.prepareStatement("{call realizar_venta(?,?)}");
            procedimiento.setInt(1,id);
            procedimiento.setInt(2,cantidad);                       
            procedimiento.execute();            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
