package day13_MethodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir şifre girmesini isteyin
        Aşağıdaki şartları sağlıyorsa "Şifre Başarıyla tanımlandı"
        şartları sağlamazzsa "İşlem başarısız. Lütfen yeni bir şifre giriniz." yazdırın
        -Ilk harf büyük olmalı
        -son harf küçük olmalı
        -şifre boşluk içeremez
        -sifre uznulugu en az 8 karakter olmalı.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz");
        String sifre= scan.nextLine();

        int kontrol=0;

        //Ilk harf kontrolu

        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrol++;
        }else{
            System.out.println("Şifre büyük harfle başlamalı");
        }

        //Son harf kontrolü

        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        } else {
            System.out.println("Şifrenin son harfi küçük harf olmalı");
        }

        //Boşluk kontrolü

        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
        } else{
            kontrol++;
        }

        // En az 8 karakter kontrolü

        if (sifre.length()>=8){
            kontrol++;
        }else{
            System.out.println("Şifre en az 8 karakter içermeli");
        }

        if (kontrol>=4) {
            System.out.println("Şifren başarıyla tanımlandı");
        }else {
            System.out.println("İşlem başarısız. Lütfen yeni bir şifre giriniz");
        }


    }
}
