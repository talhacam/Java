package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        //Auto Widening dar veri türündeki bir değeri, geniş veri türündeki variable'a otomatik olarak assign eder.

        byte sayi1=23;
        short sayi2=55;

        int sayi3=sayi1+sayi2; // 88

        double sayi4= sayi1*sayi2; // 1265.0

        sayi4= sayi2/sayi1; // 2,391 çıkması gerekir.
                           // ancak javada önce işlem yapıldıgı için int olarak kabul ettigi sayıları böler ve sonuç "2"
                           //daha sonra sola bakar ve double olan sayi4'ü görür ve sonucu 2.0 olarak getirir.
                           // veri kaybını önlemek ve küsüratlı sonucu almak için şu şekilde yazılmalı;
                          // sayi4= (double) sayi2/sayi1;

        System.out.println(sayi4);
    }
}
