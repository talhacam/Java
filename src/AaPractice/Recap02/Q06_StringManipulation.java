package AaPractice.Recap02;

import java.util.Scanner;

public class Q06_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);
        System.out.println("Lütfen isim ve soyisminizi giriniz");
        String isim=scan.nextLine();

        System.out.println(isim.toUpperCase());


        //Hocanın yolu

        /*
        Scanner scan  = new Scanner(System.in);
        System.out.println("lutfen isminizi ve soy isminizi giriniz :");
        String firstName = scan.nextLine(), lastName = scan.nextLine();  //multiple declaration

        String fullName = firstName.concat(" " + lastName).toUpperCase();
        System.out.println("fullName = " + fullName);

         */
    }
}
