package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

        /*
        emeklilik kontrolu yapan bir program yazınız
        cinsiyet olarak E veya K degiskenlerini kabul etsin
        farklı bir harf veya sembol girilirse hata mesajı versin

        emeklilik için kadınlarda yaş sınırı 60
        erkeklerde 65
        negatif veya 80'den büyük yaş girilirse hata mesajı versin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz" + "\n kadın için K erkek için E harfi giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();


        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("geçerli bir yaş giriniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsın");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }
        }
        if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("geçerli bir yaş giriniz");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsın");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }
        } else {
            System.out.println("Lütfen geçerli bir tercih giriniz");
        }
    }
}