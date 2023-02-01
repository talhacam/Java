package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatement {
    public static void main(String[] args) {

        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
        *** String icin equals method’unu kullanin
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String girilenGun= scan.next().toLowerCase();  // Pazar, pazar, PAZAR, PaZar, PAzar....
                                                       // hepsini pazar yapacak.
        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("Girilen gün HAFTASONU");
        }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("salı") || girilenGun.equals("" +
                "çarşamba") || girilenGun.equals("perşembe") || girilenGun.equals("cuma")){
            System.out.println("Girilen gün HAFTAİÇİ");
        }

        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("salı")
                || girilenGun.equals("çarşamba") || girilenGun.equals("perşembe") || girilenGun.equals("cuma")
                || girilenGun.equals("cumartesi")|| girilenGun.equals("pazar"))){
            System.out.println("Lütfen geçerli bir gün ismi giriniz");
        }
    }
}
