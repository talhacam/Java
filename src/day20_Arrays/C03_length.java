package day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {

        // İki şekilde array oluşturabiliriz.

        int sayilar[]={1,2,3};  // direkt değer atanırken süslü parantez

        String harfler []=new String[4];  // uzunluğu belirtirken köşeli parantez

        System.out.println("Sayilar array'inin uzunluğunu : " + sayilar.length); //3

        //String length() method'unda parantez var, array'de yok.

        System.out.println("harfler array'inin uzunluğunu : " + harfler.length); //4
        System.out.println(Arrays.toString(harfler)); //[null, null, null, null]


        //harfler array'inin son elementini yazdıralım.

        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]); //ArrayIndexOutOfBoundsException

    }
}
