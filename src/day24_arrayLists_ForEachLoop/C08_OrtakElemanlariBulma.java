package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_OrtakElemanlariBulma {

    //İki String array oluşturun ve bu array'lerdeki ortak elemali FOr-Each Loop kullanarak Bulun
    //Sonucu yazdırın. Eğer ortak eleman yoksa"Ortak eleman yok" yazdırın.

    public static void main(String[] args) {


        String[] arr1 = {"Ali", "Veli", "Can", "Ayse"};
        String[] arr2 = {"Ali", "Hasan", "Ayse", "Ense"};

        List<String> ortakIsimler = new ArrayList<>();

        for (String each1 : arr1
        ) {
            for (String each2 : arr2
            ) {
                if (each1.equalsIgnoreCase(each2)) {
                    ortakIsimler.add(each1);
                }
            }
        }
        if (ortakIsimler.isEmpty()) {
            System.out.println("Hiç ortak eleman yok");
        }else {
            System.out.println("Her iki array'deki ortak isimler : " + ortakIsimler);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
