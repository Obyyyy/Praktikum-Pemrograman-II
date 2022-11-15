
package praktikum4.soal2;


public class Novel extends Buku {
    private String genre, sinopsis;
    
    public Novel(String j, String p, String t, String g, String s){
        judul = j;
        penulis = p;
        this.tahun = Integer.parseInt(t);
        this.genre = g;
        this.sinopsis = s;
    }
    
    public String getNovelDetail(){
        return "Sebuah novel bergenre " + this.genre 
                + " dengan judul " + judul + ". Novel tersebut ditulis oleh "  
                + penulis + " dan diterbitkan pada tahun " + this.tahun + ". \n"
                + "Sinopsis : " + this.sinopsis.substring(0, 59) + "....";
    }
}
