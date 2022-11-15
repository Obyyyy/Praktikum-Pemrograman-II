
package praktikum4.soal2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("""
                           Pilih buku yang ingin diinputkan:
                           1 = Novel
                           2 = Komik""");
        System.out.print("Masukkan Pilihan: ");
        int input = keyboard.nextInt();
        
        switch(input){
            case 1:
                keyboard.nextLine();
                System.out.print("Judul: ");
                String judul = keyboard.nextLine();
                System.out.print("Penulis: ");
                String penulis = keyboard.nextLine();
                System.out.print("Tahun Terbit: ");
                String tahun = keyboard.nextLine();
                System.out.print("Genre: ");
                String genre = keyboard.nextLine();
                System.out.print("Sinopsis: ");
                String sinopsis = keyboard.nextLine();
                
                Novel novel = new Novel(judul, penulis, tahun, genre, sinopsis);
                novel.display();
                System.out.println(novel.getNovelDetail());
                break;
                
            case 2:
                keyboard.nextLine();
                System.out.print("Judul : ");
                judul = keyboard.nextLine();
                System.out.print("Penulis : ");
                penulis = keyboard.nextLine();
                System.out.print("Tahun Terbit : ");
                tahun = keyboard.nextLine();
                System.out.print("Volume : ");
                String volume = keyboard.nextLine();
                System.out.print("Sinopsis : ");
                sinopsis = keyboard.nextLine();
                
                Komik komik = new Komik(judul, penulis, tahun, volume, sinopsis);
                komik.display();
                System.out.println(komik.getKomikDetail());
        }
    }
}
