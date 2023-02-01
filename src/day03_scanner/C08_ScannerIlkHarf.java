package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        //kullanicidan ismini alip, ilk harfini buyuk harf olarak yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
    char ilkHarf=scan.next().toUpperCase().charAt(0); // O'ıncı index ismin baş harfine denk gelir.
        System.out.println("İsmin ilk harfi : " + ilkHarf);
    }
}
