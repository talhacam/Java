package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {

        /*
          Java Entry<K,V> map'in ivcerisinde bulunan her bir kaydi
          K=V seklinde tutar
          dolayisiyla herhangi bir Entry'e ulastigimizda
          hem key'e hem de value'ya ulasabilir ve istedigimiz islemleri yapabiliriz

          entry.getKey() bize key'i getirir
          entry.getValue() bize value'yu getirir
          entry.setValue() value'yu istedigimiz deger olarak update eder
         */

        Map<Integer, String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);

        //her bir elemanı alt alta yazdırın.
        Set<Map.Entry<Integer, String>> sinifEntrySet= sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each: sinifEntrySet
             ) {
            System.out.println(each);
        }

        // Map'in tüm elemanlarında varsa Tester kurs ismini QA olarak değiştirelim

        String eachValue;

        for (Map.Entry<Integer,String> each: sinifEntrySet
             ) {
            eachValue= each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);


        }
        System.out.println(sinifListMap);

    }
}
