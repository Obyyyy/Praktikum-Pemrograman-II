 package praktikum4.soal1;

import java.util.Scanner;
        
public class main {
    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Judul: ");
        String judul = keyboard.nextLine();
        System.out.print("Penulis: ");
        String penulis = keyboard.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahun = keyboard.nextInt();
        System.out.println("");
        Buku buku = new Buku(judul, penulis, tahun);
        
        buku.display();
    }
}
