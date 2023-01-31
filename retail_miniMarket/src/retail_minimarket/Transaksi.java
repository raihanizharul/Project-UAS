/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retail_minimarket;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import static retail_minimarket.Kasir.con;
import static retail_minimarket.Kasir.jdbc;
import static retail_minimarket.Kasir.password;
import static retail_minimarket.Kasir.ps;
import static retail_minimarket.Kasir.rs;
import static retail_minimarket.Kasir.url;
import static retail_minimarket.Kasir.username;
import static retail_minimarket.Search_Barang.conn;
import static retail_minimarket.Search_Barang.jdbc;
import static retail_minimarket.Search_Barang.password;
import static retail_minimarket.Search_Barang.ps;
import static retail_minimarket.Search_Barang.rs;
import static retail_minimarket.Search_Barang.url;
import static retail_minimarket.Search_Barang.username;
/**
 *
 * @author Raihan Izharul
 */
public class Transaksi {
    static String jdbc = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/retail";
    static String username = "root";
    static String password = "";
    
    static Connection conn;
    static ResultSet rs;
    static PreparedStatement ps;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== Transaksi ==================");
        System.out.println("Id Transaksi : ");
        int id_transaksi=sc.nextInt();
        System.out.print("Nama Pembeli : ");
        String nama_pembeli = sc.next();
        System.out.print("Barang yang ingin dibeli : ");
        String nama_barang= sc.next();
        System.out.print("Jumlah : ");
        int jumlah= sc.nextInt();
        
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
