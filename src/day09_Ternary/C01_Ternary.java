package day09_Ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve sayının mutlak değerini yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        // Mutlak değer
        // |20|--=20
        //|-3|--= -(-3)--=3

        System.out.println("Girdiğiniz sayinin mutlak değeri : "+ (sayi>=0 ? sayi : (-1 * sayi)));
    }
}
