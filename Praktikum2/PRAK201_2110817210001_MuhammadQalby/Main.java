
package prakpemro.PRAK201_2110817210001_MuhammadQalby;

public class Main {
    public static void main(String[] args) {
        Mangga arumanis = new Mangga("Arumanis", 0.3f, 5000, 13);
        Mangga manalagi = new Mangga("Manalagi", 0.5f, 7500, 17);
        Mangga madu = new Mangga("Madu", 0.375f, 6500, 12);
        
        arumanis.output();
        System.out.println("");
        manalagi.output();
        System.out.println("");
        madu.output();
    }
}
