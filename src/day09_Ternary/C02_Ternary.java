package day09_Ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin.
        // Sayi pozitifse “Sayi pozitif” yazdirin,
        // negatifse  sayinin karesini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        // Eğer ternary içindeki sonuçlar farklı data turlerinde ise
        // atama yapamayız, sadece yazdırabiliriz
        //double sonuc= sayi>0 ? "Sayi Pozitif" : (sayi*sayi);

        System.out.println(sayi>0 ? "Sayi Pozitif" : (sayi*sayi));

    }
}
