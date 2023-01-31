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
import java.util.Scanner;


public class Update_Barang extends Exception {
    static String jdbc = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/retail";
    static String username = "root";
    static String password = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    
    public static void Barang_Baru(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== UPDATE BARANG ==================");
        System.out.print("Nama Barang yang dipilih : ");
        String nama_barang_sebelum= sc.next();
        System.out.println("=============== DATA BARU ==================");
        System.out.print("Id Barang : ");
        int id_barang= sc.nextInt();
        System.out.print("Nama Barang : ");
        String nama_barang_sesudah= sc.next();
        System.out.print("Kategori : ");
        String kategori = sc.next();
        System.out.print("Harga : ");
        int harga= sc.nextInt();
        
       
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "update barang set id_barang=?, nama_barang=?, kategori=?, harga=? WHERE nama_barang=?";
            
            ps = con.prepareStatement(query);
            
            ps.setInt(1, id_barang);
            ps.setString(2, nama_barang_sesudah);
            ps.setString(3, kategori);
            ps.setInt(4, harga);
            ps.setString(5, nama_barang_sebelum);
   
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Update Berhasil!");
            }
            else{
                System.out.println("Proses Update Gagal");
            } 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}