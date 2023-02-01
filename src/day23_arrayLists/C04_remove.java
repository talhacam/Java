package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Çekirdek");
        urunler.add("Çay");

        /*
         remove method'u iki sekilde kullanilir
         1- objeyi yazip silmesini istersek bize boolean sonuc doner true/false
         2- index girersek o index'deki elemani siler ve bize silinen elemani dondurur
         */

        System.out.println(urunler); // [Nutella, Ikram, Çekirdek, Çay]
        System.out.println(urunler.remove("Ikram")); // True
        System.out.println(urunler); // [Nutella, Çekirdek, Çay]

        System.out.println(urunler.remove("Hobby")); //false
        System.out.println(urunler); // [Nutella, Çekirdek, Çay]


        // İkinci yöntem (index girelim)

        System.out.println(urunler.remove(1)); //index'i bir olanı silecek ve onu yazdıracak //Çekirdek
        System.out.println(urunler); // [Nutella, Çay]

        //Olmayan bir index'i silmeye çalışırsak
        System.out.println(urunler.remove(3)); // run time error //IndexOutOfBoundsException
    }
}
