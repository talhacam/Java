package day48_maps_TheEnd;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.clear();
        System.out.println("Clear'dan sonra Map: " + sinifListMap);

        sinifListMap=ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(104,"Aradığınız key yok"));
        //Derya, Deniz, Devops

        System.out.println(sinifListMap.getOrDefault(110,"Aradığınız key yok"));
        //Aradığınız key yok

        System.out.println(sinifListMap.isEmpty()); // false

        sinifListMap.putIfAbsent(104, "Derya, Okyanus, Developer");
        //104 Absent olmadığı için değiştirmedi.
        sinifListMap.putIfAbsent(108, "Aysu, Can, Devops");
        ReusableMethods.entryYazdir(sinifListMap);


        /*
        SinifListMap'e key olarak 106 yoksa, value "Mevlut, Han, Tester" ekleyin
        106 daha onceden varsa, "Eski değeri değiştirmek istediğinizden emin misiniz?" yazdırın.

        106'nın olduğunu kontrol etmek için containsKey daha mantıklı ama biz yeni öğrendiğimiz methodla yapalım.

        map.putIfAbsent(key, value)==> key varsa ekleme yapmaz, bize o key ile kayıtlı olan value'yu döndürür.
        key daha önceden map'e eklenmemisse eklemeyi yapar ve bize null döndürür.
         */

        System.out.println(sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester"));
        //Taha, Deniz, JDev


        if (sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester")==null){
            System.out.println("Kayıt basarili");
        }else {
            System.out.println("Eski değeri değiştirmek istediğinizden emin misini?");
        }
        System.out.println(sinifListMap.putIfAbsent(109,"Mevlut, Han, Tester"));

        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.remove(106); //106'yı silip bana sildiğini dondurur.
        sinifListMap.remove(107, "Derya, Cem, Tester"); //Silerse True, silmezse false dondurur.

        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.replace(105,"Erdal, Çiftçi, Tester");
        sinifListMap.put(109,"Cavidan, Eken, JDev"); //ikisi de aynı işlemi yapuıyor.
        ReusableMethods.entryYazdir(sinifListMap);

        System.out.println(sinifListMap.size()); //7

    }
}