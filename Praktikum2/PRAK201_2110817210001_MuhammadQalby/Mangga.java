
package prakpemro.PRAK201_2110817210001_MuhammadQalby;

import java.util.Scanner; 

public class Mangga {
    float berat;
    int harga, jumlah_beli;
    String nama;
    
    public Mangga (String nama, float berat, int harga,int jumlah_beli){
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah_beli = jumlah_beli;
    }
    
    public void output (){
            System.out.println("Nama Mangga : " + nama);
            System.out.println("Berat : " + berat + " Kg");
            System.out.println("Jumlah Beli : " + jumlah_beli);
            System.out.println("Total Berat : " + berat*jumlah_beli + " Kg");
            System.out.println("Total Harga : Rp. " + harga*jumlah_beli);
    }
}
