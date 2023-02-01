package day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";
        System.out.println(str.length()); // str'ın karakter sayısını döndürür "19"
        System.out.println(str.charAt(str.length()-1)); // son karakterin değerini verir.
        System.out.println(str.charAt(str.length()-3)); // sondan 3. karakter yazdırır.

        // index saymaya 0'dan başlar. Length 1'den başlar.


        /*
        Java'da null pointer (işaretleyici) bir değer değil.
        karşısına yazıldığı variable'ın hiçbir dğer almadığının işaretçisidir
         */

        String str2=""; //Str2'ye bir değer atanmıştır
                        // bu değer hiçliktir.
        System.out.println(str2.length()); // 0

        String str3= null; //str3'e değer atanmamıştır
                          //null str3'e değer atanmadığının işaretçisidir.

        System.out.println(str3.length()); //bir değer atanmadığı için uzunluğu yoktur.
                                           //NullPointerException olarak hata verir.


    }
}
