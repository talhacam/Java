package day08_ifStatements;

import java.util.Scanner;

public class C05_NestedIfElse {
    public static void main(String[] args) {
        /*
        Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
 Kullanicidan bir sifre girmesini isteyin
 Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
 Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
 Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
 Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
         */

        // ilk harf büyük mü küçük mü?
        //İlk harf A veya z mi?

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String sifre = scan.nextLine();
        char ilkHarf = sifre.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {   //İlk harfi büyük harf olan kelimeler.
            if (ilkHarf == 'A') {
                System.out.println("Geçerli şifre");
            } else {
                System.out.println("Geçersiz şifre");
            }

        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') { // ilk harf küçük harf
            if (ilkHarf == 'z') {
                System.out.println("Geçerli şifre");
            } else {
                System.out.println("Geçersiz şifre");

            }
        } else {
            System.out.println("Lütfen ilk karakter için sadece harf kullanın");
        }
    }
}