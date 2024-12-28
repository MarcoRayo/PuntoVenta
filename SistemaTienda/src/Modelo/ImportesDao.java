package Modelo;

import Modelo.BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ImportesDao {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public Importes[] OptenerImportes() {
        String sql = "SELECT * FROM importes";
        Importes[] importesResult;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int total = 0;
            while (rs.next()) {
                total++;                
            }
            Importes[] importes = new Importes[total];
            importesResult = importes;
            rs = ps.executeQuery();
            for (int i = 0; rs.next(); i++) {
                Importes importe = new Importes();
                importe.setId(rs.getInt("idimportes"));
                importe.setNombre(rs.getString("nombre"));
                importe.setFecha(rs.getString("fecha"));
                importe.setCosto(rs.getDouble("costo"));
                importe.setDescripcion(rs.getString("descripcion"));
                importes[i] = importe;
            }
        } catch (Exception e) {
            importesResult = null;
            System.out.println(e.toString());
        }
        return importesResult;
    }

    public int RegistrarImportes(String nombre, String fecha, double costo, String descripcion) {
        String sql = "INSERT INTO importes(`nombre`, `fecha`,`costo`,`descripcion`) VALUES (?,?,?,?)";
        int respuesta = 0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, fecha);
            ps.setDouble(3, costo);
            ps.setString(4, descripcion);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Error al registrar");
        }
        return respuesta;
    }
    
    public int BorrarImporte(int id){
        String sql = "DELETE FROM importes WHERE idimportes = ?";   
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
    
    public int EditarImporte(int id, String nombre, String fecha, double costo, String descripcion){
        String sql = "UPDATE importes SET nombre = ?, fecha = ?, costo = ?, descripcion = ? WHERE idimportes = ?";   
        int respuesta = 0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, fecha);
            ps.setDouble(3, costo);
            ps.setString(4, descripcion);
            ps.setInt(5, id);
            respuesta = ps.executeUpdate();            
        } catch (Exception e) {            
            System.out.println(e.toString());
        }
        return respuesta;
    }
}
