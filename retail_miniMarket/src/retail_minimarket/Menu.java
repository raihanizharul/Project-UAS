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
public class Menu {
    public static void MenuUtama(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=============== Menu ==================");
        System.out.println("1. Barang");
        System.out.println("2. Pembeli");
        System.out.println("3. Exit");
        System.out.print("Pilih no : ");
        int noMenu1 = sc.nextInt();
        if(noMenu1==1){
            Menu.MenuBarang();
        }
        else if(noMenu1==2){
            Menu.MenuPembeli();
        }
        else if(noMenu1==3){
            System.out.println("Exit PROGRAM ...");
            System.exit(0);
        }
        else{
            System.out.println("INPUT SESUAI NO MENU!");
            Menu.MenuUtama();
        }
        
                
    }
    public static void MenuBarang(){
        Barang barang =new Barang();
        Scanner sc=new Scanner(System.in);
        System.out.println("\n=============== Menu Barang ==================");
        System.out.println("1. Insert Barang");
        System.out.println("2. Update Barang");
        System.out.println("3. Delete Barang");
        System.out.println("4. Search Barang");
        System.out.println("5. Kembali");
        System.out.print("Pilih no : ");
        int noMenu2=sc.nextInt();
        if(noMenu2==1){
            barang.insertBarang();
            Menu.MenuBarang();
        }
        else if(noMenu2==2){
            barang.updateBarang();
            Menu.MenuBarang();
        }
        else if(noMenu2==3){
            barang.deleteBarang();
            Menu.MenuBarang();
        }
        else if(noMenu2==4){
            barang.searchBarang();
            Menu.MenuBarang();
        }
        else if(noMenu2==5){
            Menu.MenuUtama();
        } 
        else{
            System.out.println("INPUT SESUAI NO MENU!");
            Menu.MenuBarang();
        }
    }
    
    public static void MenuPembeli(){
        Pembeli pembeli=new Pembeli();
        Scanner sc=new Scanner(System.in);
        System.out.println("\n=============== Menu Pembeli ==================");
        System.out.println("1. Insert Pembeli");
        System.out.println("2. Update Pembeli");
        System.out.println("3. Delete Pembeli");
        System.out.println("4. Kembali");
        System.out.print("Pilih no : ");
        int noMenu2=sc.nextInt();
        if(noMenu2==1){
            pembeli.insertPembeli();
            Menu.MenuPembeli();
        }
        else if(noMenu2==2){
            pembeli.updatePembeli();
            Menu.MenuPembeli();
        }
        else if(noMenu2==3){
            pembeli.deletePembeli();
            Menu.MenuPembeli();
        }
        else if(noMenu2==4){
            Menu.MenuUtama();
        }
        else{
            System.out.println("INPUT SESUAI NO MENU!");
            Menu.MenuPembeli();
        }
    }
}
