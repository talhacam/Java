package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {

        /*
        map.contains(key) ==> verdiğimiz key'in map'de olup olmadığını boolean olarak doner
        map.contains(value) ==> bir bütün olarak value'nun map'de olup olmadığını doner.

        Onemli NOT: map.contains(value) value'nun içindeki bir parçayı bulmada ise yaramaz.
        eğer value içindeki bir parçayı aratmak istiyorsak map uzerinde manipulating yapmak lazım

        map.get(key) ==> verilen key'e ait değeri döndürür.
         */

        Map<Integer, String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);

        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); //false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); //true

        System.out.println(sinifListMap.containsValue("JDev")); //false

        //Verilen map'de JDev değerlerini JavaDeveloper olarak değiştirelim.
        //Map'lerde replace tum value'u değiştirmek istersek kullanılabilir. Kısmi değişikliklerde kullanamayız.

       ReusableMethods.tumValueSiraliYazdir(sinifListMap);

       //Map'i guncelleme yapmak için key, yenideger'i map'e eklemeliyiz
        //ornegin key 101 için value Ali,Can,JDev
        //guncelleme icin sinifListMap.put(101,ALi,Can, JavaDeveloper

        //Bunu yapabilmek için herbir key'e ve ona ait value'ye ihtiyacım var.

        Set<Integer> keySeti= sinifListMap.keySet();

        String eachvalue;
        for (Integer each: keySeti
             ) {
            eachvalue = sinifListMap.get(each);
            eachvalue= eachvalue.replace("JDev","JavaDeveloper");
            sinifListMap.put(each,eachvalue);

            /*
            biz key'lerin tamamını aldık
            herbir key'in value'sunu get'irdik
            value uzerinde değişikliği yapıp yeni halini put(key, yeniDeger) ile map'e koyduk.
             */

        }
        System.out.println(sinifListMap);

    }
}
