package praktikum4.soal1;

public class Buku {
    private String judul, penulis;
    private Integer tahun;
    
    public Buku(String j, String p, Integer t){
        judul = j;
        penulis = p;
        tahun = t;
    }

    public void display(){
        System.out.println("Detail Buku:");
        System.out.println("Judul adalah " + judul);
        System.out.println("Penulis adalah " + penulis);
        System.out.println("Tahun Terbit adalah " + tahun);
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }
}