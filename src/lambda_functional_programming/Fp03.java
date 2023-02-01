package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<String>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        buyukHarfleYazdir(liste);
        System.out.println();
        //buyukHarfleYazdir02(liste);

        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizYazdir(liste);
        System.out.println();
        uzunlukVeIlkHarfeGoreSiralaYazdir(liste);
        System.out.println();
        //bestenBuyukleriSil(liste);
        System.out.println();
        //baslangiciAYadaSonuNOlaniSil(liste);
        System.out.println();
        //baslangiciAYadaSonuNOlaniSil02(liste);
        //uzunlugu8ile10arasive0IleBiteniSil(liste);
        System.out.println(uzunlugu12denAzMi(liste));
        System.out.println();
        System.out.println(xIleBaslamiyorMu(liste));
        System.out.println(rIleBitenVarMi(liste));



    }

    //Tüm elemanları büyük harf ile yazdıran bir method oluşturun.

    //1.Yol
    public static void buyukHarfleYazdir(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //2.Yol
    //public static void buyukHarfleYazdir02 (List<String> list){
    //  list.replaceAll(String::toUpperCase);
    //System.out.println(list);


    //Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun

    public static void uzunlugaGoreYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //Elemanları uzunlugaGore ters sıralayıp yaz.
    public static void uzunlugaGoreTersYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::ayniSatirdaBosluklaYazdir);


    }

//Elemanları son karakterlerine göre tekrarsız sıralayıp yaz.

    public static void sonKaraktereGoreTekrarsizYazdir(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //Elemanları önce uzunluklarına göre sonra ilk karakterlerine göre sıralayıp yaz.

    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    /*
    //Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.

    public static void bestenBuyukleriSil (List<String> list) {
        list.removeIf(t->t.length() > 5);
        System.out.println(list);
    }

     */


    /*
    //'A', 'a' ile başlayan yada 'N', 'n' ile biten elemanları silen bir method oluşturun.

    public static void baslangiciAYadaSonuNOlaniSil (List<String> list){

        list.removeIf(t->t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='n' || t.charAt(t.length()-1)=='N');
        System.out.println(list);
    }

     */


    /*
    //2.Yol


    public static void baslangiciAYadaSonuNOlaniSil02 (List<String> list) {

        list.removeIf(t->t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
        System.out.println(list);


    }

     */




    /*
    //Uzunluğu 8 ile 10 arası olan yada "o" ile biten elemanları yazdır.

   //  public static void uzunlugu8ile10arasive0IleBiteniSil (List<String> list) {
      //  list.removeIf(t->t.length()>7 && t.length()<11 || t.endsWith("o"));
        // System.out.println(list);
     }

     */





    //Tüm elemanları uzunlukları 12den az olup olmadığını kontrol eden bir method oluşturun.

    public static boolean uzunlugu12denAzMi (List<String> list) {
        return list.stream().allMatch(t->t.length()<12);
    }





    //Hiçbir elemanın "X" ile başlamadığını kontrol eden bir method oluşturun

    public static boolean xIleBaslamiyorMu(List<String> list){
        return list.stream().noneMatch(t->t.startsWith("X"));
    }



    //Herhangi bir elemanın "r" ile bitip bitmediğini kontrol.

    public static boolean rIleBitenVarMi(List<String> list){
        return list.stream().anyMatch(t->t.endsWith("r"));
    }

}




