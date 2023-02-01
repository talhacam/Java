package APractice.day01;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz");
        int num1=scan.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");
        int num2=scan.nextInt();

        System.out.println("Girdiğiniz sayılarının toplamı :"+ (num1+num2));



    }
}
