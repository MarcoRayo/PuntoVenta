package Modelo;

import Modelo.BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marco
 */
public class ProductoDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    String[] titulos = {"id", "#", "Nombre", "Peso", "Precio", "Cantidad", "Código", "Proveedor", "Categoria"};    

    public Producto[] OptenerProductos() {
        String sql = "SELECT * FROM producto";
        Producto[] productoResult;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int total = 0;
            while (rs.next()) {
                total++;
            }
            Producto[] productos = new Producto[total];
            productoResult = productos;
            rs = ps.executeQuery();
            for (int i = 0; rs.next(); i++) {
                Producto producto = new Producto();
                producto.setId(rs.getInt("idproducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPeso(rs.getInt("peso"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setCodigo(rs.getLong("codigo"));
                producto.setProveedor(rs.getInt("idproveedor"));
                producto.setCategoria(rs.getInt("idcategoria"));
                producto.setLetra(rs.getString("tamanioLetra"));
                productos[i] = producto;
            }
        } catch (Exception e) {
            productoResult = null;
            System.out.println(e.toString());
        }
        return productoResult;
    }

    public int RegistrarProducto(String nombreProducto, int peso, double precio,
            int cantidad, long codigo, int proveedor,
            int categoria, String letra) {
        String sql = "INSERT INTO producto(`nombre`, `peso`, `precio`, `cantidad`, `codigo`, `idproveedor`,`idcategoria`, `tamanioLetra`) VALUES (?,?,?,?,?,?,?,?)";
        int respuesta = 0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreProducto);
            ps.setInt(2, peso);
            ps.setDouble(3, precio);
            ps.setInt(4, cantidad);
            ps.setLong(5, codigo);
            ps.setInt(6, proveedor);
            ps.setInt(7, categoria);
            ps.setString(8, letra);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Error al registrar");
        }
        return respuesta;
    }

    public int BorrarProducto(int id) {
        String sql = "DELETE FROM producto WHERE idproducto = ?";
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

    public int EditarProducto(
            int idProducto, String nombreProducto, int peso,
            double precio, int cantidad, long codigo, int proveedor,
            int categoria, String letra) {
        String sql = "UPDATE producto SET nombre = ?, peso = ?, precio = ?,cantidad = ?, codigo = ?, idproveedor = ?,"
                + "idcategoria = ?, tamanioLetra = ? WHERE idproducto = ?";
        int respuesta = 0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreProducto);
            ps.setInt(2, peso);
            ps.setDouble(3, precio);
            ps.setInt(4, cantidad);
            ps.setLong(5, codigo);
            ps.setInt(6, proveedor);
            ps.setInt(7, categoria);
            ps.setString(8, letra);
            ps.setInt(9, idProducto);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        } 
        return respuesta;
    }

    public String optenerPesoLetra(int peso) {
        String resultado = null;
        switch (peso) {
            case 0:
                resultado = "kg";
                break;
            case 1:
                resultado = "l";
                break;
            case 2:
                resultado = "gr";
                break;
            case 3:
                resultado = "ml";
                break;
            case 4:
                resultado = "pkg";
                break;
            case 5:
                resultado = "pza";
                break;
            default:
                System.out.println("Error desconocido");
        }
        return resultado;
    }
    
        public int[] optenerCantidadNumero(String seleccionado) {
        int[] resultado = new int[2];
        switch (seleccionado) {
            case "0-20":
                resultado[0] = 0;
                resultado[1] = 20;
                break;
            case "21-50":
                resultado[0] = 21;
                resultado[1] = 50;
                break;
            case "51-100":
                resultado[0] = 51;
                resultado[1] = 100;
                break;
            case "101-150":
                resultado[0] = 101;
                resultado[1] = 150;
                break;
            case "151-200":
                resultado[0] = 151;
                resultado[1] = 200;
                break;
            case "201-∞":
                resultado[0] = 201;
                resultado[1] = 10000;
                break;
            default:
                System.out.println("Error desconocido");
        }
        return resultado;
    }

    public String optenerPesoLetraCompleto(String peso) {
        char [] cadena_div = peso.toCharArray();        
        String cadena = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (!Character.isDigit(cadena_div[i])) {
                cadena+=cadena_div[i];
            }
        }
        String resultado = null;
        switch (cadena) {
            case "kg":
                resultado = "Kilogramos";
                break;
            case "l":
                resultado = "Litros";
                break;
            case "gr":
                resultado = "Gramos";
                break;
            case "ml":
                resultado = "Mililitros";
                break;
            case "pkg":
                resultado = "Paquete";
                break;
            case "pza":
                resultado = "Pieza";
                break;
            default:
                System.out.println("Error desconocido");
        }        
        return resultado;
    }
    
    public DefaultTableModel buscarPor(String buscar, String por) {
        String[] titulos = {"id", "#", "Nombre", "Peso", "Precio", "Cantidad", "Código", "Proveedor", "Categoria"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        CategoriaDao cate = new CategoriaDao();
        ProveedorDao pro = new ProveedorDao();
        try {
            String sql = "";
            String filtro = "" + buscar + "_%";
            if (buscar.isEmpty()) {
                sql = "SELECT * FROM producto";
            } else {
                sql = "SELECT * FROM producto WHERE " + por + " LIKE" + '"' + filtro + '"' + "OR " + por + "=" + '"' + buscar + '"';
            }            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();            
            String[] fila = new String[10];
            int num = 0;
            while (rs.next()) {
                num++;
                fila[0] = String.valueOf(rs.getInt("idproducto"));
                fila[1] = num + "";
                fila[2] = rs.getString("nombre");
                fila[3] = rs.getInt("peso") + " " + rs.getString("tamanioLetra");
                fila[4] = String.valueOf(rs.getDouble("precio"));
                fila[5] = String.valueOf(rs.getInt("cantidad"));
                fila[6] = String.valueOf(rs.getLong("codigo"));
                fila[7] = pro.optenerProveedorNombre(rs.getInt("idproveedor"));
                fila[8] = cate.optenerCategoriaNombre(rs.getInt("idcategoria"));
                model.addRow(fila);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        return model;
    }

    public DefaultTableModel buscarPorCategoria(String categoria) {
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        try {
            CategoriaDao cate = new CategoriaDao();
            ProveedorDao pro = new ProveedorDao();
            int id = cate.buscarCategoria(categoria);
            String sql = "SELECT * FROM producto WHERE idcategoria = ?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();            
            String[] fila = new String[10];
            int num = 0;
            while (rs.next()) {
                num++;
                fila[0] = String.valueOf(rs.getInt("idproducto"));
                fila[1] = num + "";
                fila[2] = rs.getString("nombre");
                fila[3] = rs.getInt("peso") + " " + rs.getString("tamanioLetra");
                fila[4] = String.valueOf(rs.getDouble("precio"));
                fila[5] = String.valueOf(rs.getInt("cantidad"));
                fila[6] = String.valueOf(rs.getLong("codigo"));
                fila[7] = pro.optenerProveedorNombre(rs.getInt("idproveedor"));
                fila[8] = cate.optenerCategoriaNombre(rs.getInt("idcategoria"));
                model.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return model;
    }
    
    public DefaultTableModel buscarPorProveedor(String proveedor) {
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        try {
            CategoriaDao cate = new CategoriaDao();
            ProveedorDao pro = new ProveedorDao();
            int id = pro.buscarProveedor(proveedor);
            String sql = "SELECT * FROM producto WHERE idproveedor = ?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();            
            String[] fila = new String[10];
            int num = 0;
            while (rs.next()) {
                num++;
                fila[0] = String.valueOf(rs.getInt("idproducto"));
                fila[1] = num + "";
                fila[2] = rs.getString("nombre");
                fila[3] = rs.getInt("peso") + " " + rs.getString("tamanioLetra");
                fila[4] = String.valueOf(rs.getDouble("precio"));
                fila[5] = String.valueOf(rs.getInt("cantidad"));
                fila[6] = String.valueOf(rs.getLong("codigo"));
                fila[7] = pro.optenerProveedorNombre(rs.getInt("idproveedor"));
                fila[8] = cate.optenerCategoriaNombre(rs.getInt("idcategoria"));
                model.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return model;
    }
    
    public DefaultTableModel buscarPorCantidad(int numMin, int numMax) {
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        try {
            con = cn.getConnection();
            CategoriaDao cate = new CategoriaDao();
            ProveedorDao pro = new ProveedorDao();
            PreparedStatement procedimiento = con.prepareStatement("{call busqueda_cantidad(?,?)}");
            procedimiento.setInt(1,numMin);
            procedimiento.setInt(2,numMax);                                              
            rs = procedimiento.executeQuery();
            String[] fila = new String[10];
            int num = 0;
            while (rs.next()) {
                num++;
                fila[0] = String.valueOf(rs.getInt("idproducto"));
                fila[1] = num + "";
                fila[2] = rs.getString("nombre");
                fila[3] = rs.getInt("peso") + " " + rs.getString("tamanioLetra");
                fila[4] = String.valueOf(rs.getDouble("precio"));
                fila[5] = String.valueOf(rs.getInt("cantidad"));
                fila[6] = String.valueOf(rs.getLong("codigo"));
                fila[7] = pro.optenerProveedorNombre(rs.getInt("idproveedor"));
                fila[8] = cate.optenerCategoriaNombre(rs.getInt("idcategoria"));
                model.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return model;
    }
}
