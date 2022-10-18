
package prakpemro.PRAK202_2110817210001_MuhammadQalby;

import java.text.NumberFormat;
import java.util.Locale;

public class Mobil {
    int harga, kapasitas, pajak;
    String merek, tahun_keluaran, pemilik;
    
    public String getPemilik(){
        return pemilik;
    }
    
    public int getPajak(){
        pajak = harga/50;
        return pajak;
    }
    
    public void setPemilik(String a){
        this.pemilik = a;
    }
    public void info(){
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
        
        System.out.println("Merek Mobil : " + merek);
        System.out.println("Harga : Rp. " + nf.format(harga));
        System.out.println("Tahun Keluaran : " + tahun_keluaran);
        System.out.println("Kapasitas : " + kapasitas + "cc");
    }
}
