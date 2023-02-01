package day09_Ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
       // Kullanicidan bir harf isteyin
        // kucuk harf ise consola “Kucuk Harf” ,
        // buyuk harfse consola “Buyuk Harf”
        // yoksa “girdiginiz karakter harf degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf= scan.next().charAt(0);


        /*
        String sonuc= (harf>='a' && harf<='z') ? ("Kucuk Harf") :
                ("Buyuk Harf veya Geçersiz Karakter")

         */

        String sonuc= (harf>='a' && harf<='z') ? ("Kucuk Harf") :
                ((harf>='A' && harf<='Z') ? "Büyük harf" : "Geçersiz Karakter");

        /*
        String sonuc= harf>='a' && harf<='z' ? "Kucuk Harf" :
        harf>='A' && harf<='Z' ? "Büyük harf" : "Geçersiz Karakter";

        Parantezsiz olarak da Java anlar. Karşımıza böyle çıkabilir.

         */



        System.out.println(sonuc);

    }

}
