package day08_ifStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        /*
        Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
         Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
          Son rakamı 0 ise ekrana “5’e bölünen  çift sayı” yazdırın.
          Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
           Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayı girin");
        int sayi = scan.nextInt();

        //sayının 5'e bölünüp bölünememesi
        //sayının son basamağının sıfır olup olmaması

        if (sayi < 1000 || sayi > 9999) {
            System.out.println("Lütfen 4 basamaklı sayı girin");
        } else if (sayi % 5 == 0) {  //Sayı 4 basamaklı ve 5'e tam bölünebiliyor.
            if (sayi % 10 == 0) {  //sayının son rakımı 0 olur
                System.out.println("5'e bölünen çift sayı");

                System.out.println("5'e bölünen tek sayı");
            }


            } else { // sayı 4 basamaklı ama 5'e bölünemiyor.
                System.out.println("Tekrar Deneyin");
            }
        }
    }
