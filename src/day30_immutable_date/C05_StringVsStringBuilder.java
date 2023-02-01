package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {

        /*
        String mi yoksa StringBuilder mı daha hızlıdır?
        Bunun için bir String oluşturup, 1000kere sonuna "." ekleyelim.
         öncesinde ve sonrasında zamanı alıp aradaki farkı bulalım.

         Aynı işlemi StringBuilder için de uygulayalım
         */

        LocalTime baslangic= LocalTime.now();

        String str= "Ahhhh Java";
        for (int i=0; i<10000; i++) {
            str+=".";
        }

        LocalTime bitis= LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String Zaman : "+ (bitis.getNano()-baslangic.getNano()));


        baslangic=LocalTime.now();

        StringBuilder sb=new StringBuilder("Ahhhh Java");
        for (int i = 0; i <10000 ; i++) {
            sb.append(".");
        }

        bitis=LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);
        System.out.println("String Builder zaman : "+ (bitis.getNano()-baslangic.getNano()));


    }
}
