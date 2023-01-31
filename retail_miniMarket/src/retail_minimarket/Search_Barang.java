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
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Search_Barang{
    static final String jdbc = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/retail";
    static String username = "root";
    static String password = "";
    
    static Connection conn;
    static ResultSet rs;
    static Statement state;
    static PreparedStatement ps;
    
    public static void Cari_Barang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== SEARCH BARANG ==================");
        System.out.print("Barang yang di cari: ");
        String cari = sc.next();
                
        try{
           Class.forName(jdbc);
           conn = DriverManager.getConnection(url, username, password);
           
           String query = "select * from barang where nama_barang like?";
           
           ps = conn.prepareStatement(query);
           ps.setString(1,"%" + cari + "%");
           rs = ps.executeQuery();
           
           while(rs.next()){
               System.out.println(" ____________________________________________________");
               System.out.println("| id_barang\t| nama_barang\t| kategori\t| harga\t|");
               System.out.println(" ----------------------------------------------------");
               System.out.print("| "+rs.getString("id_barang")+"\t\t| ");
               System.out.print(rs.getString("nama_barang")+"\t\t| ");
               System.out.print(rs.getString("kategori")+"\t| ");
               System.out.println(rs.getString("harga")+" |");
               System.out.println(" ----------------------------------------------------");
               
               
        
           }
           
        }
        catch(Exception ex){
            ex.printStackTrace();
      }
    }
}