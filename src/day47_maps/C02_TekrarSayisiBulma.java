package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {

        // Verilen bir String'deki kullanılan harfleri ve kullanılan harflerin tekrar sayısını yazdırın.
        // örn: H= 20

        String str= "Heeeeellllooooo Woooorrrrllllllddddd.";

        // space'leri saymamasi icin once onlari yok edelim

        str=str.replaceAll("\\W", "");

        String[] harflerArr=str.split("");

        System.out.println(Arrays.toString(harflerArr));
        // [H, e, e, e, e, e, l, l, l, l, o, o, o, o, o,  , W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d, .]

        // harfleri key, kullanım adedini value yaparak bir map olusturalım.

        Map<String, Integer> harfKullanımSayilariMap= new HashMap<>();
        Integer harfKullanımsayisi;

        for (String each: harflerArr
             ) {
            if (!harfKullanımSayilariMap.containsKey(each)){
                harfKullanımSayilariMap.put(each,1);
            }else{
                harfKullanımsayisi=harfKullanımSayilariMap.get(each);

                harfKullanımSayilariMap.put(each,++ harfKullanımsayisi);
            }

        }
        System.out.println(harfKullanımSayilariMap);


    }
}
