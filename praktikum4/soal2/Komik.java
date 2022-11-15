package praktikum4.soal2;

public class Komik extends Buku{
    private int volume;
    private String sinopsis;
    
    public Komik(String j, String p, String t, String v, String s){
        judul = j;
        penulis = p;
        this.tahun = Integer.parseInt(t);
        this.volume = Integer.parseInt(v);
        this.sinopsis = s;
    }
    
    public String getKomikDetail(){
        return "Sebuah komik dengan judul \""  + judul + "\". Komik tersebut dibuat oleh "
                + penulis + " dan diterbitkan pada tahun " + this.tahun
                + ". Sampai saat ini komik tersebut memilik jumlah volume sebanyak "
                + this.volume + " buah.\n"
                + "Sinopsis : " + this.sinopsis.substring(0, 64) + " ....";
    }
}