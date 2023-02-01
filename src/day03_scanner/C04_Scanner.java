package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismini isteyin
        //girilen ismi
        //isminiz: .... şeklinde yazdırın

        //insanların dünyasından kodlarımızın bulundugu class'a deger almak için
        //Scanner Class'ını kullanırız

        //1. Scanner objesi olusturalım
        Scanner scan= new Scanner(System.in);

        //2. Kullanıcıya ne istedigimizi soyleyelim
        System.out.println("Lutfen isminizi giriniz");

        //3. Olusturdugumuz Scan objesi ile kullanicinin girdigi degeri alip
        //olusturacagımız uygun bir variable'a atayalım

        String kullaniciIsmi =scan.next();


        System.out.println("İsminiz : "+ kullaniciIsmi);
    }
}
