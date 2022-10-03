/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpemro;

import java.util.Scanner;

public class PRAK102_2110817210001_MUHAMMADQALBY {
    public static void main(String[] args) {
        //Deklarasi variabel
        int angka_inputan, angka_pembatas, a;
        
        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //Tampilkan output ke user
        System.out.print("Masukkan Angka : ");
        angka_inputan = keyboard.nextInt();
        
        angka_pembatas = 1;
        
        //Menampilkan output hasil inputan dari user
        System.out.println("=======================");
        while(angka_pembatas <= 7){
            
            a = angka_inputan;
            if (angka_inputan % 2 == 0 && angka_pembatas == 7){
                a = a/2-1;
                System.out.print(a + "\n");
            }
            else if (angka_inputan%2 == 0){
                a = a/2-1;
                System.out.print(a + ", ");
            }
            else if (angka_pembatas == 7){
                System.out.print(angka_inputan + "\n");
            }
            else {
                System.out.print(angka_inputan + ", ");
            }
            angka_inputan++;
            angka_pembatas++;
        }
    }
}
