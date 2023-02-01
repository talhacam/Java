package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {

    // Soru 4- Kullanicidan bir array’in boyutunu
    // ve tum elementlerini alarak bir array olusturup,
    // bu array’i bize donduren bir method olusturun

    public static void main(String[] args) {

        int[] sayilar= arrayOlustur();

        System.out.println(Arrays.toString(sayilar));
    }

    private static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç elemanlı bir array oluşturmamı istersiniz?");
        int uzunluk=scan.nextInt();
        int[] olusturulan= new int[uzunluk];

        int sayi=0;

        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i + ". index için sayı giriniz");
            olusturulan[i]= scan.nextInt();
        }

        return olusturulan;
    }
}
