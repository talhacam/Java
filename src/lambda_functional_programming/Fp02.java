package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {



    /*
    t-> "Logic" , (t,u) -> "Logic"
    Bu yapıya "Lambda Expression" denir.

    Functional Programming kapsamında "Lambda Expression" kullanılabilir ama önerilmez.
    "Lambda Expression" yerine "Method Reference" tercih edilir.

    "Method Reference" kullanımı "Class Name :: Method Name" şeklinde

    Aynı zamanda kendi Class'larımızı da kullanabiliriz.
    Örn: Bir Animal Class'ımız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"

    */

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        ListElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKüpünüYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarinKareToplami02(liste);
        tekrarsizCiftElemanlarinKareToplami03(liste);
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        getMaxEleman(liste);
        yedidenBuyukCiftMin(liste);
        terSiralamaylaTekrarsizElemanlarinYarisi(liste);

    }

    //Ardışık List elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void ListElemanlariniYazdirFunctional (List<Integer> list) {

        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //Çift sayı olan List elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun

    public static void ciftElemanlariYazdirFunctional (List<Integer> list) {
        list.stream().filter(Utils::cifElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    // Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun
    public static void tekElemanlarinKareleriniYazdir (List<Integer> list){
        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //Ardışık tek list element küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun
  public static void tekrarsizTekElemanlarinKüpünüYazdir (List<Integer> list){
        list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
  }

    // Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami (List<Integer> list){

      Integer toplam=  list.stream().distinct().filter(Utils::cifElemaniSec).map(Utils::karesiniAl).reduce(0, Math::addExact);
        System.out.println(toplam);
    }

    //2.Yol

    public static void tekrarsizCiftElemanlarinKareToplami02 (List<Integer> list) {

        Integer toplam = list.stream().distinct().filter(Utils::cifElemaniSec).map(Utils::karesiniAl).reduce(0, Integer::sum);
        System.out.println(toplam);
    }

    //3.Yol

    public static void tekrarsizCiftElemanlarinKareToplami03 (List<Integer> list) {

        Integer toplam = list.stream().distinct().filter(Utils::cifElemaniSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println(toplam);
    }

    // tekrarsız çift elemanlarının küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list) {
        Integer carpim= list.stream().distinct().filter(Utils::cifElemaniSec).map(Utils::kupunuAl).reduce(1, Math::multiplyExact);
        System.out.println(carpim);

    }

    //List elemanlarını arasında en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman(List<Integer> list) {
      Integer max=list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }

    //List elemanları arasından 7'den büyük, çift en küçük değeri bulan bir method oluşturun

    public static void yedidenBuyukCiftMin (List<Integer> list){
       Integer min= list.stream().distinct().filter(t->t>7).filter(Utils::cifElemaniSec).reduce(Math::min).get();
        System.out.println(min);
    }

    //Ters sıralama ile tekrarsız ve 5^ten büyük elemanların yarı değerlerini bulan bir method oluşturun.

    public static void terSiralamaylaTekrarsizElemanlarinYarisi (List<Integer> list){
     List<Double> sonuc=list.stream().distinct().
             filter(t->t>5).map(Utils::yarisiniAl).
             sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);
    }

}
