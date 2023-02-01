package AaPractice.Recap02;

public class Q04_NestedIfTernary {

    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */

    public static void main(String[] args) {

        //NestedIf

        int sayi = 0;
        String sonuc = "";


        if (sayi >= 0 && sayi <= 9) {
            if (sayi == 9) {
                sonuc = "dokuz";
            } else if (sayi == 8) {
                sonuc = "sekiz";
            } else if (sayi == 7) {
                sonuc = "yedi";
            } else if (sayi == 6) {
                sonuc = "alti";
            } else if (sayi == 5) {
                sonuc = "bes";
            } else if (sayi == 4) {
                sonuc = "dort";
            } else if (sayi == 3) {
                sonuc = "uc";
            } else if (sayi == 2) {
                sonuc = "iki";
            } else if (sayi == 1) {
                sonuc = "bir";
            } else if (sayi == 0) sonuc = "sifir";
        } else sonuc = "gecersiz";
        System.out.println("sonuc: " + sonuc);

        //Ternary

        int n= 4;
        String result = n==9 ? "dokuz" :n==8? "sekiz" :n==7 ? "yedi":n==6 ? "alti"
                :n==5 ? "bes" :n==4 ? "dort" :n==3 ? "uc" : n==2 ? "iki" : n==1 ? "bir"
                :n==0 ? "sifir" :"gecersiz";
        System.out.println("result = " + result);
    }

}