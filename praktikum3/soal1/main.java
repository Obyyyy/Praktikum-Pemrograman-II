/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;
import static praktikum3.soal1.Dadu.acakNilai;

public class main {
    public static void main(String[]args){
        int jmlDadu, angkaMuncul, totalAngka = 0;
        
        Scanner inputan = new Scanner(System.in);
        
        LinkedList<Integer> dice = new LinkedList<Integer>();
        
        System.out.print("Jumlah Dadu : ");
        jmlDadu = inputan.nextInt();
        
        for(int i = 1; i<=jmlDadu; i++){
            angkaMuncul = acakNilai();
            dice.add(angkaMuncul);
            System.out.println("Dadu ke-" + i + " bernilai " + angkaMuncul);
            totalAngka += angkaMuncul;
        }
        System.out.println("Total nilai dadu keseluruhan " + totalAngka);
    }
}
