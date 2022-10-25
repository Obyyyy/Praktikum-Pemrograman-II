package praktikum3.soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        LinkedList<Negara> negara = new LinkedList<Negara>();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Negara: ");
        int input = keyboard.nextInt();
        
        HashMap<Integer, String> bulan = new HashMap<Integer, String>();
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");
        
        keyboard.nextLine();
        for (int i = 0; i < input; i++) {
            System.out.print("Nama negara: ");
            String nama_negara = keyboard.nextLine();
            System.out.print("Jenis kepemimpinan: ");
            String jenis_kepemimpinan = keyboard.nextLine();
            System.out.print("Nama Pemimpin: ");
            String nama_pemimpin = keyboard.nextLine();
            if (jenis_kepemimpinan.equalsIgnoreCase("Monarki")) {
                negara.add(new Negara(nama_negara, jenis_kepemimpinan, nama_pemimpin));
            } else {
                System.out.print("Tanggal Kemerdekaan: ");
                int tanggal_kemerdekaan = keyboard.nextInt();
                System.out.print("Bulan Kemerdekaan: ");
                int bulan_kemerdekaan = keyboard.nextInt();
                bulan.get(bulan_kemerdekaan);
                System.out.print("Tahun Kemerdekaan: ");
                int tahun_kemerdekaan = keyboard.nextInt();
                keyboard.nextLine();
                negara.add(new Negara(nama_negara, jenis_kepemimpinan, nama_pemimpin, tanggal_kemerdekaan, bulan_kemerdekaan, tahun_kemerdekaan));
            }
        }
        System.out.println("==========================");
        for (int j = 0; j < input; j++) {
            if (negara.get(j).getJenis_kepemimpinan().equalsIgnoreCase("Monarki")) {
                System.out.println("Negara " + negara.get(j).toTitleCase(negara.get(j).getNama())  + " mempunyai " + "Raja" + " bernama " + negara.get(j).toTitleCase(negara.get(j).getNama_pemimpin()));
                System.out.println("");
            } else{
                System.out.println("Negara " + negara.get(j).toTitleCase(negara.get(j).getNama()) + " mempunyai " + negara.get(j).toTitleCase(negara.get(j).getJenis_kepemimpinan()) + " bernama " + negara.get(j).toTitleCase(negara.get(j).getNama_pemimpin()));
                System.out.println("Deklarasi kemerdekaan pada Tanggal " + negara.get(j).getTanggal_kemerdekaan() + " " + bulan.get(negara.get(j).getBulan_kemerdekaan()) + " " + negara.get(j).getTahun_kemerdekaan());
                System.out.println("");
            }
        }
    }
}
