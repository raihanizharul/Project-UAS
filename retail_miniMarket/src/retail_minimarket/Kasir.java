/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retail_minimarket;

/**
 *
 * @author Raihan Izharul
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Kasir {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/retail";
    static final String username = "root";
    static final String password = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    static Statement state;
    
    public static String getPassword(String nama_kasir) throws Exception{
        Class.forName(jdbc);
        con = DriverManager.getConnection(url, username, password);
        
        String query = "SELECT id_kasir FROM kasir WHERE nama_kasir= (?)";
        ps = con.prepareStatement(query);
        ps.setString(1, nama_kasir);
        rs = ps.executeQuery();
        
        if(!rs.next()){
            return null;
        }
        else{
            return rs.getString(1).toString();
        }
    }
}
