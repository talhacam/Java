package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {

    public static void main(String[] args) {

        // Soru 2) Verilen bir array’deki tekrar eden elementleri tek bir defa barindiran
        // yeni bir array olarak donduren bir method olusturun


        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};

        int[] uniqueArray=uniqueArrayOlustur(arr);

        System.out.println(Arrays.toString(uniqueArray));  //Son olarak buraya return oluyor ve yazdırıyor.
    }
    public static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]
        //1'in yanındaki 2, 1'i aldık, 2'nin yanındaki 3, 2'yi aldık, 3'ün yanındaki 3, 3'ü almadık.....
        // 3'ün yanındaki 4, 3'ü aldık.....
        // en son dokuz kontrol edilemedi bu sebeple 38.satırdan itibaren 9'u kontrol ettik.

        List<Integer> benzersizList = new ArrayList<>();  // yanindaki elemente esit olmayanlari listeye ekliyor

        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] != arr[i+1]){  //Tekrar etmiyor demek.
                benzersizList.add(arr[i]);
            }
        }

        // son elementi kontrol edip, yoksa listeye ekliyoruz
        if (!benzersizList.contains(arr[arr.length-1])){
            benzersizList.add(arr[arr.length-1]);
        }

        // benzersiz list ==> 1,2,3,4,5,6,9
        // benzersiz listenin "size" bilgisini kullanarak bir array olusturduk

        int[] tekrarsizArr=new int[benzersizList.size()]; // benzersiz listedeki tum elemanlari, yeni array'e atadik

        for (int i = 0; i < tekrarsizArr.length ; i++) {
            tekrarsizArr[i]= benzersizList.get(i);
        }
        // olusturdugumuz yeni array'i main method'a dondurduk
        return tekrarsizArr;
    }


}
