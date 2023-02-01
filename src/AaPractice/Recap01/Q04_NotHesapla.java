package APractice.Recap01;

import java.util.Scanner;

public class Q04_NotHesapla {
    /*
     * Kullanicidan alacaginiz vize1, vize2 ve final notlarini
     * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen vize1 notunuzu giriniz");
        int vize1=scan.nextInt();

        System.out.println("Lütfen vize2 notunuzu giriniz");
        int vize2=scan.nextInt();

        System.out.println("Lütfen final notunuzu giriniz");
        int finalNotu=scan.nextInt();

        double sonuc= ((vize1+vize2)/2)*0.3 + finalNotu*0.7;
        System.out.println("Sonuç = " +sonuc);


        /*
        böyle de olabilirdi
        Scanner scan =new Scanner (System.in);

        int vize1;
        int vize2;
        int finalNot;

        System.out.print("birinci vize :");
        vize1=scan.nextInt();

        System.out.print("ikinci vize :");
        vize2=scan.nextInt();

        System.out.print("final notu :");
        finalNot=scan.nextInt();

        double sonuc = ((vize1+vize2)/2)*0.3  + finalNot*0.7;
        System.out.println("sonuc = " + sonuc);

         */


    }
}
