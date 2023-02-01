package AaPractice.day06;

import java.util.Scanner;

public class Q02_WhileLoop {

    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil(tek ise)
        */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= scan.nextInt();

        int count=0;  //Kaç tane tek sayı olduğunu sayacak. şart değil
        while(sayi>0){
            if (sayi%2==1){
                System.out.println(sayi);
                count++;
            }
            sayi--;  //Bunu eklemezsek girilen sayıyı sonsuz döngüyle yazdırır.
        }
        System.out.println("count = " + count);
    }
}
