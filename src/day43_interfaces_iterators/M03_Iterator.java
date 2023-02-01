package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {

    public static void main(String[] args) {

        List<Integer> liste= new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); // [10, 20, 30]

        //liste'deki tüm elementleri INDEX Kullanmadan 3 arttırın.

        for (Integer each: liste
        ){
            each+=3;
            System.out.println(each + " ");
        }
        System.out.println("");
        System.out.println(liste);

         /*
         Java index yapisi olmaya collection'lardaki
         elementlere ulasmak veya degistirmek icin
         Iterator interface'ini olusturmustur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degilr
        bunun yerine bize iterator döndüren  liste.iterator() method'unu kullaniyoruz
         */
        System.out.println(liste); // [10, 20, 30]

        Iterator it1= liste.iterator();
        System.out.println(it1.next()); //10
        System.out.println(it1.next()); //20
        System.out.println(it1.next()); //30
        // System.out.println(it1.next()); //30'dan sonra element kalmadığından next() RTE verir.

        //Iterator'da geri donus yok, adım adım sona ulaşdıktan sonra
        //basa gelmek isterseniz yeniden bir iterator olusturmanız gerekir.

        // [10, 20, 30]
        Iterator it2= liste.iterator();

        //yeni it2'yi kullanarak listenin tüm elementlerini silelim.
        it2.next();
        it2.remove(); //10 silindi
        it2.next();
        it2.remove(); // 20 silindi
        it2.next();
        it2.remove(); // 30 silindi
        System.out.println(liste); // iterator ile elementleri gezip, remove yapınca liste kalıcı olarak degisti.


        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste : " + liste);
        Iterator it3= liste.iterator();

        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("Looptan sonra liste : " + liste);


        /*
         Goruldugu gibi Iterator kullanarak yapabildigim
         1- tum collection elementlerini yazdirmak
         2- tum collection elementlerini silmek
         Bu da bize yetmez
         */




    }


}
