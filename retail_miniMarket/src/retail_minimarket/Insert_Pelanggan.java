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
public class Insert_Pelanggan extends Exception{
    static String jdbc = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/retail";
    static String username = "root";
    static String password = "";
    
    static Connection conn;
    static ResultSet rs;
    static PreparedStatement ps;
    
    public static void Masukan_Pelanggan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== INSERT PELANGGAN ==================");
        System.out.print("id_pembeli : ");
        int id_pembeli= sc.nextInt();
        System.out.print("nama pembeli : ");
        String nama_pembeli = sc.next();
        System.out.print("nomor : ");
        int nomor= sc.nextInt();
        System.out.print("alamat : ");
        String alamat= sc.next();
        
     
        try{
          Class.forName(jdbc);
          conn= DriverManager.getConnection(url,username,password);
          String query= "insert into pembeli values (?,?,?,?)";
          ps= conn.prepareStatement(query);
          ps.setInt(1, id_pembeli);
          ps.setString(2, nama_pembeli);
          ps.setInt(3, nomor);
          ps.setString(4, alamat);
          
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