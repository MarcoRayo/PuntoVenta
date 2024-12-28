package Modelo;

import Modelo.BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author marco
 */
public class ProveedorDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public Proveedor[] OptenerProveedores() {
        String sql = "SELECT * FROM proveedor";
        Proveedor[] proveedorResult;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int total = 0;
            while (rs.next()) {
                total++;
            }
            Proveedor[] proveedores = new Proveedor[total];
            proveedorResult = proveedores;
            rs = ps.executeQuery();
            for (int i = 0; rs.next(); i++) {
                Proveedor proveedor = new Proveedor();
                proveedor.setId(rs.getInt("idproveedor"));
                proveedor.setNombre(rs.getString("nombre"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setMarca(rs.getString("marca"));
                proveedores[i] = proveedor;
            }
        } catch (Exception e) {
            proveedorResult = null;
            System.out.println(e.toString());
        }
        return proveedorResult;
    }

    public int RegistrarProveedor(String nombreProveedor, String telefono, String marca) {
        String sql = "INSERT INTO proveedor (nombre,telefono,marca) VALUES (?,?,?)";
        int respuesta = 0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreProveedor);
            ps.setString(2, telefono);
            ps.setString(3, marca);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return respuesta;
    }

    public int BorrarProveedor(int id) {
        String sql = "DELETE FROM proveedor WHERE idproveedor = ?";
        int respuesta = 0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return respuesta;
    }

    public int EditarProveedor(int id, String nombreProveedor, String telefonoProveedor, String marcaProveedor) {
        String sql = "UPDATE proveedor SET nombre = ?, telefono = ?, marca = ? WHERE idproveedor = ?";
        int respuesta = 0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreProveedor);
            ps.setString(2, telefonoProveedor);
            ps.setString(3, marcaProveedor);
            ps.setInt(4, id);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return respuesta;
    }

    public int buscarProveedor(String nombre) {
        String sql = "SELECT idproveedor FROM proveedor WHERE marca = ?";
        int respuesta = -1;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();            
            for (int i = 0; rs.next(); i++) {
                respuesta = rs.getInt("idproveedor");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return respuesta;
    }
    
    public String optenerProveedorNombre(int id){
        String sql = "SELECT marca FROM proveedor WHERE idproveedor = ?";   
        String respuesta = "";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();              
            for (int i = 0; rs.next(); i++) {
                respuesta = rs.getString("marca"); 
            }
        } catch (Exception e) {            
            System.out.println(e.toString());
        }
        return respuesta;
    }
}
