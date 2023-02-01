package day04_dataCasting;

public class C02_dataCasting {
    public static void main(String[] args) {

        int sayi1= 23;
        int sayi2=5;
        System.out.println(sayi1/sayi2);  //ikisi de int oldugundan sounucu int olarak kabul eder.
        // sonuc 4.6 olmalıyken 4 olarak geliyor.

        System.out.println(25*7/3);  // 58.666 ---> 58

        double sayi3=5;
        System.out.println(sayi1/sayi3); // 4.6
                                         // iki data türünün variable'ı degisik oldugunda
                                         //java daha kapsamlı olan data turu olarak kabul eder.


    }
}
