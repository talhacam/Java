package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan ismini soyismini ve yasini alip
        girilen bilgiler = seyfi capar 34 seklinde yazdırın
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.nextLine();

        /*
        String verileri scanner ile alirken
        next(): ilk bosluga kadar olan kismi (1 kelime) alir
        nextLine() : satirin sonuna kadar ne yazarsak alir
        Not: eger ardarda birden fazla String deger alacaksak nextLine() kullanmaliyiz.
         */


        System.out.println("lütfen soyisminizi giriniz");
        String soyisim= scan.nextLine();


        System.out.println("Lütfen yaşınızı giriniz");
        double yas= scan.nextDouble();

        System.out.println("girilen bilgiler = " +isim+", "+soyisim+", "+yas);

    }
}
