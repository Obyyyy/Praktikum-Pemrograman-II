/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpemro;

import java.util.Scanner;

public class PRAK103_2110817210001_MUHAMMADQALBY {
    public static void main(String[] args) {
        //Deklarasi variabel
        int input, angka_pembatas;
        
        
        angka_pembatas = 1;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        input = keyboard.nextInt();
        
        do{
            if(input % 7 == 0){
                continue;
            } else if (angka_pembatas == 5){
                System.out.print(input + "\n");
            } else {
                System.out.print(input + ", ");
            }
            
            input--;
            angka_pembatas++;
        }while(angka_pembatas <= 5);
        //Menampilkan output hasil inputan dari user
        
    }
}
