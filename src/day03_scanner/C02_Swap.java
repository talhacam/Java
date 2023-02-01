package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
       /*
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        Orn  : sayi1=10 ve sayi2=30;
        kod calistiktan sonra
                sayi1=20 ve sayi2=10

        */
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;
        //sayi3 gecici kovamız
        //1.adım sayi2'yi boş kovaya koyalım
        sayi3 = sayi2; // 10  20  20

        //2.adım 1.sayıyı 2.sayıya atayacagız
        sayi2 = sayi1; // 10  10  20

        //her zaman soldaki sayı değişir

        //3.adım boş kovadaki sayıyı sayi1'e atayalım
        sayi1 = sayi3; // 20  10  20

        System.out.println("swap'dan sonra sayi1: " + sayi1); // 20
        System.out.println("swap'dan sonra sayi2 :" + sayi2); //10

    }
}
