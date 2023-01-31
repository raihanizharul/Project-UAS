/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retail_minimarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author Raihan Izharul
 */
public class Insert_Barang extends Exception{
    static String jdbc = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/retail";
    static String username = "root";
    static String password = "";
    
    static Connection conn;
    static ResultSet rs;
    static PreparedStatement ps;
    
    public static void Masukan_Barang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== INSERT BARANG ==================");
        System.out.print("id_barang : ");
        int id_barang = sc.nextInt();
        System.out.print("nama barang : ");
        String nama_barang = sc.next();
        System.out.print("kategori : ");
        String kategori = sc.next();
        System.out.print("harga : ");
        String harga= sc.next();
        
     
        try{
          Class.forName(jdbc);
          conn= DriverManager.getConnection(url,username,password);
          String query= "insert into barang values (?,?,?,?)";
          ps= conn.prepareStatement(query);
          ps.setInt(1, id_barang);
          ps.setString(2, nama_barang);
          ps.setString(3, kategori);
          ps.setString(4, harga);
          
          if(ps.executeUpdate()>0){
              System.out.println("Proses tambah data berhasil");   
          
        }
        else{
              System.out.println("Proses gagal");
          }
        }
        catch(Exception ex){
            
        }
    }
}