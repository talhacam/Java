package APractice.Recap01;

import java.util.Scanner;

public class Q01_Modulus {

    /*
     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 5 basamakli bir sayi giriniz");
        int num=scan.nextInt();

        int ilkIki=num/1000;
        int sonIki=num%100; //100'e bölümünden kalanı

        int ilkIkiToplami= (ilkIki/10) + (ilkIki%10);
        System.out.println("ilkIkıtoplami: " + ilkIkiToplami);
        int sonIkiToplami= (sonIki/10) + (sonIki%10);
        System.out.println("sonIkiToplami: " + sonIkiToplami);

        System.out.println("Sayıların toplamı: " + (ilkIkiToplami+sonIkiToplami));





    }
}
