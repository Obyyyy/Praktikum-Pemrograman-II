/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prakpemro;


//mengimport Scanner ke program
import java.util.Scanner;

public class PRAK101_2110817210001_MUHAMMADQALBY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi variabel
        String nama, tmpt_lahir, bln_lahir2;
        int tgl_lahir, bln_lahir1, thn_lahir, tinggi_bdn;
        float berat_bdn;
        
        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //Tampilkan output ke user
        System.out.print("Masukkan Nama Lengkap : ");
        nama = keyboard.nextLine();
        
        System.out.print("Masukkan Tempat Lahir : ");
        tmpt_lahir = keyboard.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir : ");
        tgl_lahir = keyboard.nextInt();
        
        System.out.print("Masukkan Bulan Lahir : ");
        bln_lahir1 = keyboard.nextInt();
        
        System.out.print("Masukkan Tahun Lahir : ");
        thn_lahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan : ");
        tinggi_bdn = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan : ");
        berat_bdn = keyboard.nextFloat();
        
        bln_lahir2 = "Desember";
                
        if (bln_lahir1 == 1){
            bln_lahir2 = "Januari";
        } else if (bln_lahir1 == 2){
            bln_lahir2 = "Februari";
        } else if (bln_lahir1 == 3){
            bln_lahir2 = "Maret";
        } else if (bln_lahir1 == 4) {
            bln_lahir2 = "April";
        } else if (bln_lahir1 == 5){
            bln_lahir2 = "Mei";
        } else if (bln_lahir1 == 6){
            bln_lahir2 = "Juni";
        } else if (bln_lahir1 == 7){
            bln_lahir2 = "Juli";
        } else if (bln_lahir1 == 8){
            bln_lahir2 = "Agustus";
        } else if (bln_lahir1 == 9){
            bln_lahir2 = "September";
        } else if (bln_lahir1 == 10){
            bln_lahir2 = "Oktober";
        } else if (bln_lahir1 == 11){
            bln_lahir2 = "November";
        } else if (bln_lahir1 == 12) {
            bln_lahir2 = "Desember";
        }
        
        //Menampilkan output hasil inputan dari user
        System.out.println("=======================");
        System.out.println("Data Telah Ditambahkan,");
        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tmpt_lahir + " pada Tanggal " + tgl_lahir + " " + bln_lahir2 + " " + thn_lahir);
        System.out.println("Tinggi Badan " + tinggi_bdn + " cm dan Berat Badan " + berat_bdn + " kilogram");
    }
    
}
