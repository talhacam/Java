package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*
        kullanıcıdan iki sayi alip bu sayilarin carpimini yazdirin
         */

        //1.adim
        Scanner scan=new Scanner (System.in);

        //2.adim

        System.out.println("Lütfen ilk sayıyı girin");

        //3.adim
        double sayi1= scan.nextDouble();

        //2.sayi icin 2. ve 3. adimlari tekrarlariz

        System.out.println("Lütfen 2. sayıyı giriniz");
        double sayi2= scan.nextDouble();

        System.out.println("Girilen sayıların çarpımı : "+sayi1*sayi2);
    }
}
