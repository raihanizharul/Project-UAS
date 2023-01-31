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
public class Delete_Pelanggan extends Exception{
    static String jdbc = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/retail";
    static String username = "root";
    static String password = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    
    public static void Hapus_Pelanggan(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=============== DELETE PEMBELI ==================");
        
        System.out.print("Nama Pelanggan : ");
        String pembeli = sc.nextLine();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            
            String query = "delete FROM pembeli WHERE nama_pembeli=?";
            ps = con.prepareStatement(query);
            ps.setString(1, pembeli);
            
            if(ps.executeUpdate() > 0){
                System.out.println("Proses Delete Berhasil");
            }
            else{
                System.out.println("Data Tidak Ditemukan");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }  
    }
}
