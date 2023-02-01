package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {

        System.out.println(get7den100eToplam());
        System.out.println(get7den100eToplam02());
        System.out.println(get2den11eCarpim());
        System.out.println(faktoriyelHesapla(4));
        System.out.println(verilenIkıSayiArasindakiCiftSayilarinToplami(11,5));
        System.out.println(ikiSayiArasindakiTumSayilarinRakamlariToplami(11,13));
    }

//7'den 100e kadar integer değerleri toplamını bulan bir method.

    //1.Yol
        public static int get7den100eToplam() {

           return IntStream.range(7,101).reduce(Math::addExact).getAsInt();
        }

        //2.Yol

    public static int get7den100eToplam02() {

        return IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();
    }




    //2den ve 11e kadar integer değerlerin çarpımını bulan bir method.

    public static int get2den11eCarpim(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }


    //Verilen bir sayının faktoriyelini hesaplayan bir method oluştur.

    public static int faktoriyelHesapla(int x) {
        if (x >= 0) {

            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0'dan büyük bir değer giriniz");

        return 0;
    }




    //Verilen iki sayı arasındaki çift sayıların toplmaını bulan bir method oluşturun.

    public static int verilenIkıSayiArasindakiCiftSayilarinToplami (int x, int y){

        int z=0;
        if(x>y){
            z=x;
            x=y;
            y=z;


        }
        return IntStream.rangeClosed(x, y).filter(Utils::cifElemaniSec).sum();
    }




    //Verilen iki sayı arasındaki tüm sayıların rakamlarını toplayan

    public static int ikiSayiArasindakiTumSayilarinRakamlariToplami(int x, int y){

        return IntStream.rangeClosed(x, y).map(Utils::rakamlarToplaminiAl).sum();
    }

}