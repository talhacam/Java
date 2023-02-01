package day09_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // kullanıcıdan bir sayi isteyin
        // sayi pozitifse sayiyi yazdırın
        // sayi negatifse, bir sayi daha isteyin ve ikisinin çarpımını yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayi = scan.nextDouble();

        if (sayi > 0) {
            System.out.println(sayi);
        } else {
            System.out.println("Lütfen bir sayi daha giriniz");
            double sayi2 = scan.nextDouble();
            System.out.println(sayi * sayi2);
        }
    }
}

/*
eğer if else içerisinde yeni kodlar varsa
ternary ile yapmanız mümkün olmaz
 */