package Modelo.BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author marco
 */
public class Conexion {

    Connection con;    
    public Connection getConnection() {
        try {
            String myDB = "jdbc:mysql://localhost:3306/mydb\",\"root\",\"root";
            //String myDB = "jdbc:mysql://u3iuy8hkcpp3cqrd:DGuAFdHxYDyxtpr1eGr3@bekifh9jcoelmsi5uoh0-mysql.services.clever-cloud.com:3306/bekifh9jcoelmsi5uoh0";
            //con = DriverManager.getConnection(myDB, "u3iuy8hkcpp3cqrd", "DGuAFdHxYDyxtpr1eGr3");
            con = DriverManager.getConnection(myDB, "root", "root");    
            return con;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
