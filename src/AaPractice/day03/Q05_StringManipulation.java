package AaPractice.day03;

import java.util.Scanner;

public class Q05_StringManipulation {

    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String isim=scan.next();

        System.out.println("Lütfen soyadınızı giriniz");
        String soyad=scan.next();

        if(isim.length()>soyad.length()) {
            System.out.println("İsminiz soyisminizden daha uzun : " +isim);
        } else if (isim.length() < soyad.length()) {
            System.out.println("Soyisminiz isminiziden daha uzun : " +soyad);
        }else {
            System.out.println("İsminiz ve soyisminiz aynı uzunlukta : " +isim+ " "+ soyad);
        }
    }
}
