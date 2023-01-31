/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retail_minimarket;
import java.util.Scanner;
/**
 *
 * @author Raihan Izharul
 */
public class Login {
    public static void Login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== LOGIN KASIR ==================");
        System.out.print("Username : ");
        String nama_kasir = sc.nextLine();
        
        System.out.print("Password : ");
        String id_kasir= sc.nextLine();
        System.out.println();
        
        try{
            if(id_kasir.equals(Kasir.getPassword(nama_kasir))){
                System.out.println("LOGIN BERHASIL!");
                Menu.MenuUtama();
            }
            else{
                System.out.println("Username Atau Password Salah");
                System.out.println("");
                Login();
            }
        }
        catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}
