package APractice.Recap01;

import java.util.Scanner;

public class Q05_Scanner {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen a sayısına bir değer atayınız");
        int a= scan.nextInt();

        System.out.println("Lütfen b sayısına bir değer atayınız");
        int b= scan.nextInt();

        System.out.println("Lütfen c sayısına bir değer atayınız");
        int c= scan.nextInt();

        double sonuc= ((a*a)-(b*b)) / (c*3);
        System.out.println(sonuc);

    }
}
