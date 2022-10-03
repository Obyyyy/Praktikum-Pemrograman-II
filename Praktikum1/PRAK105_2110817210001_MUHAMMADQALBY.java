/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpemro;

import java.util.Scanner;

public class PRAK105_2110817210001_MUHAMMADQALBY {
    public static void main(String[] args) {
        //Deklarasi variabel
        final float PHI = 3.14f;
        float r, t, volume;
            
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Jari-jari : ");
        r = keyboard.nextFloat();
        System.out.print("Masukkan tinggi : ");
        t = keyboard.nextFloat();
        
        volume = PHI * r * r * t;
        
        System.out.printf("volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", r, t, volume);
    }
}
