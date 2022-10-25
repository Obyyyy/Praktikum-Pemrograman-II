
package praktikum3.soal1;

import java.util.Random;

public class Dadu {
        static int acakNilai(){
        Random angkaRandom = new Random();
        return angkaRandom.nextInt(6)+1;
    }  
}
