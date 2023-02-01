package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //bir önceki soruyu tek seferde kullanıcıdan bütün bilgileri al

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi, soyisminizi ve yaşınızı giriniz \n aralarda enter tuşuna basınız");

        String isim= scan.nextLine();
        scan.nextLine();
        String soyisim= scan.nextLine();
        scan.nextLine();
        int yas= scan.nextInt();

        System.out.println("girilen bilgiler = "+isim+", "+soyisim+", "+yas);


    }
}
