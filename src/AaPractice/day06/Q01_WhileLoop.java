package AaPractice.day06;

import java.util.Scanner;

public class Q01_WhileLoop {

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=scan.nextInt();

        System.out.println(basamakToplama(sayi));

        basamakToplama(sayi);

    }

    public static int basamakToplama(int sayi) {
        int toplam=0;
                while(sayi!=0){
                    toplam+=sayi%10;
                    sayi/=10;
                }
                return toplam;
    }
}
