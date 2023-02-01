package day22_multiDimensionalArrays;

public class C02_MdaTumElementleriYazdirma {

    public static void main(String[] args) {
        //Verilen bir multi-dimensional array'in tüm elementleri yazdiran bir method oluşturun.

        int[] [] sayilar= {{1,5,6,9}, {2,5}, {3,1,6}};

        elementleriYazdir(sayilar);
    }

    private static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length ; i++) { // i = 0,1,2 degerleri alacak
            for (int j = 0; j <sayilar[i].length ; j++) { // inner arraylerin uzunluguna bagladik
                System.out.print(sayilar[i][j] + " ");  // 1 5 6 9 2 5 3 1 6
            }

        }



    }
}
