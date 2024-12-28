package Modelo;

import Modelo.BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author marco
 */
public class CategoriaDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public Categoria[] OptenerCategorias() {
        String sql = "SELECT * FROM categoria";
        Categoria[] categoriaResult;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int total = 0;
            while (rs.next()) {
                total++;
            }
            Categoria[] categorias = new Categoria[total];
            categoriaResult = categorias;
            rs = ps.executeQuery();
            for (int i = 0; rs.next(); i++) {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("idcategoria"));
                categoria.setNombre(rs.getString("nombre"));
                categorias[i] = categoria;
            }
        } catch (Exception e) {
            categoriaResult = null;
            System.out.println(e.toString());
        }
        return categoriaResult;
    }

    public int RegistrarCategoria(String nombreCategoria) {
        String sql = "INSERT INTO categoria (nombre) VALUES (?)";        
        int respuesta = 0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,nombreCategoria);
            respuesta = ps.executeUpdate();            
        } catch (Exception e) {            
            System.out.println(e.toString());
        }
        return respuesta;
    }
    
    public int BorrarCategoria(int id){
        String sql = "DELETE FROM categoria WHERE idcategoria = ?";   
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
    
    public int EditarCategoria(int id,String nombreCategoria){
        String sql = "UPDATE categoria SET nombre = ? WHERE idcategoria = ?";   
        int respuesta = 0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCategoria);
            ps.setInt(2, id);
            respuesta = ps.executeUpdate();            
        } catch (Exception e) {            
            System.out.println(e.toString());
        }
        return respuesta;
    }
    
    public int buscarCategoria(String nombre){
        String sql = "SELECT idcategoria FROM categoria WHERE nombre = ?";   
        int respuesta = -1;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);            
            rs = ps.executeQuery();              
            for (int i = 0; rs.next(); i++) {
                respuesta = rs.getInt("idcategoria"); 
            }
        } catch (Exception e) {            
            System.out.println(e.toString());
        }
        return respuesta;
    }
    
    public String optenerCategoriaNombre(int id){
        String sql = "SELECT nombre FROM categoria WHERE idcategoria = ?";   
        String respuesta = "";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();              
            for (int i = 0; rs.next(); i++) {
                respuesta = rs.getString("nombre"); 
            }
        } catch (Exception e) {            
            System.out.println(e.toString());
        }
        return respuesta;
    }
}
