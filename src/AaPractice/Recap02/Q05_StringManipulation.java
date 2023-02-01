package AaPractice.Recap02;

import java.util.Scanner;

public class Q05_StringManipulation {

    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ilk kelimeyi giriniz");
        String str1=scan.nextLine();

        System.out.println("Lütfen ikinci kelimeyi giriniz");
        String str2=scan.nextLine();

        System.out.println(str1.concat(" " + str2));

        String str1_0indextenSonrasi = str1.substring(1);
        String str2_0indextenSonrasi = str2.substring(1);

        System.out.println("Manipulation'dan sonraki hali : "+ str1_0indextenSonrasi + "" + str2_0indextenSonrasi);




    }
}
