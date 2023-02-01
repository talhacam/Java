package AaPractice.day06;

import java.util.Scanner;

public class Q11_Odev {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {

        String pin="mehmet.1234";

        int girisHakki=3;

        Scanner scan = new Scanner(System.in);
        System.out.println("***Hoşgeldiniz***");

        while (true){
            System.out.println("pin kodunuzu giriniz :");
            String girilenPin= scan.nextLine();

            if (pin.equals(girilenPin)){
                System.out.println("Başarıyla giriş yapıldı");
                break;
            }else if (!pin.equals(girilenPin)){
                System.out.println("Yanlış şifre girdiniz. Lütfen tekrar giriniz");
                girisHakki--;
                System.out.println(girisHakki + " giriş hakkınız kaldı");

            } if (girisHakki == 0){
                System.out.println("3 defa hatalı şifre girdiniz. Hesabınız kilitlendi");
                break;
            }

        }

    }
}
