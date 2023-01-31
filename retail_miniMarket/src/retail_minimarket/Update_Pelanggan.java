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


public class Update_Pelanggan extends Exception {
    static String jdbc = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/retail";
    static String username = "root";
    static String password = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    
    public static void Pelanggan_Baru(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== UPDATE PEMBELI ==================");
        System.out.print("Nama Pembeli yang dipilih : ");
        String nama_pembeli_sebelum= sc.next();
        System.out.println("=============== DATA BARU ==================");
        System.out.print("Id Pembeli : ");
        int id_pembeli= sc.nextInt();
        System.out.print("Nama Pembeli : ");
        String nama_pembeli_sesudah= sc.next();
        System.out.print("Nomor Telepon : ");
        int nomor_telepon = sc.nextInt();
        System.out.print("Alamat : ");
        String alamat= sc.next();
        
       
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "update pembeli set id_pembeli=?, nama_pembeli=?, nomer_telpon=?, alamat=? WHERE nama_pembeli=?";
            
            ps = con.prepareStatement(query);
            
            ps.setInt(1, id_pembeli);
            ps.setString(2, nama_pembeli_sesudah);
            ps.setInt(3, nomor_telepon);
            ps.setString(4, alamat);
            ps.setString(5, nama_pembeli_sebelum);
   
            
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