
package prakpemro.PRAK203_2110817210001_MuhammadQalby;

public class soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Pada baris ini terjadi error karena kurang tanda titik koma (;)
        //p1.nama = "Roi" 
        p1.nama = "Roi"; 
        p1.asal = "Kingdom of Orvel";
        
        //method setJabatan belum ada dibuat pada pegawai.java
        p1.setJabatan("Assasin"); 
        
        //Bukan error, tetapi Nama Pegawai menjadi Nama agar sama dengan hasil output pada perintah soal
        //System.out.println("Nama Pegawai: " + p1.getNama())
        System.out.println("Nama: " + p1.getNama()); 
        
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        
        //bukan error tetapi variabel umur belum diisi dengan nilai apapun sehingga hasil output berupa 0, juga di sini ditambahkan kata Tahun agar hasil output sama dengan perintah soal
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
