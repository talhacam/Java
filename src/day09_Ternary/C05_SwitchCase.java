package day09_Ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        /*
        kullanıcıdan gün numarasını aldırıp
        1 ise pazaresi .... 7 ise pazar yazdıralım
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı gün olduğunu giriniz");
        int gunNo=scan.nextInt();

        /*
        Switch yanına yazılan () neye göre case atayacağımızı gösterir.
        Java girilen değere göre case'i bulur ve o satırdan çalıştırmaya başlar.
        Break yazısı görünceye veya switch parantezine kadar devam eder.
         if - else if ...... else yapısında olduğu gibi hiçbir şarta uymayanları default key kullanılır.
         */

        switch (gunNo){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
                break;
            case 4 :
                System.out.println("Perşembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçerli gün numarası giriniz");
        }
    }
}
