/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpemro;

import java.util.Scanner;

public class PRAK104_2110817210001_MUHAMMADQALBY {
    public static void main(String[] args) {
        //Deklarasi variabel
        int andi1, andi2, andi3, budi1, budi2, budi3, totalBudi, totalAndi;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Kartu Andi : ");
        andi1 = keyboard.nextInt();
        andi2 = keyboard.nextInt();
        andi3 = keyboard.nextInt();
        
        System.out.print("Kartu Budi : ");
        budi1 = keyboard.nextInt();
        budi2 = keyboard.nextInt();
        budi3 = keyboard.nextInt();
        
        totalAndi = 0;
        totalBudi = 0;
       
        if ((andi1<=10 && andi1>=2) && (andi2<=10 && andi2>=2) && (andi3<=10 && andi3>=2) && (budi1<=10 && budi1>=2) && (budi2<=10 && budi2>=2) && (budi3<=10 && budi3>=2)){
            if (andi1 > budi1){
                totalAndi ++;
            } else if (andi1 < budi1){
                totalBudi++;
            } 
            if (andi2 > budi2){
                totalAndi ++;
            } else if (andi2 < budi2){
                totalBudi++;
            } 
            if (andi3 > budi3){
                totalAndi ++;
            } else if (andi3 < budi3){
                totalBudi++;
            } 
        
            if (totalAndi > totalBudi) {
                System.out.println("Andi");
            } else if (totalAndi < totalBudi){
                System.out.println("Budi");
            } else {
                System.out.println("Seri");
            }
        }
        else {
            System.out.println("Masukkan input hanya angka 2 s.d 10");
        }
          
    }
}
