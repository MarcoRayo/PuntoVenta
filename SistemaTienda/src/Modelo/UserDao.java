package Modelo;

import Modelo.BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author marco
 */
public class UserDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public UserBean log(String user,String password){
        UserBean login = new UserBean();
        String sql = "SELECT * FROM user WHERE nombre = ? AND password = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2,password);
            rs = ps.executeQuery();
            if (rs.next()) {
                login.setId(rs.getInt("iduser"));
                login.setUser(rs.getString("nombre"));
                login.setPassword(rs.getString("password"));
                login.setEmail(rs.getString("correo"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return login;
    }
}
