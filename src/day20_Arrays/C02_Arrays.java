package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar []=new int[3];

        System.out.println(sayilar); // [I@19dfb72

        //non-primitive data türündeki dataları her zaman direkt olarak yazdıramayabiliriz.

        //Array'i yazdırmak istersek java'daki array class'ından yardım isteriz.

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0]


        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(Arrays.toString(sayilar)); // [5, 3, 10]

        String sinifList[]= {"Ali", "Ayşe", "Ahmet"};
        System.out.println(Arrays.toString(sinifList)); //Ali, Ayşe, Hasan

        sinifList[1]="Hasan"; // Birinci index'in yerindeki Ayşe silindi yerine hasan yazıldı
        System.out.println(Arrays.toString(sinifList)); // Ali , Hasan, Ahmet

        System.out.println(sinifList[1]); //Sadece Hasan'ı yazdıralım
        System.out.println(sinifList[0]); // Ali
    }
}
