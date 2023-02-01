package AaPractice.day06;

import java.util.Scanner;

public class Q08_Arrays {
    /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

    public static void main(String[] args) {

        int [] arr= new int[8];
        Scanner scan= new Scanner(System.in);
        int count=0;

        for (int i=0; i<arr.length; i++) {
            System.out.print(i + ".index'teki sayiyi giriniz :");
            arr[i] = scan.nextInt();

            if(arr[i]%3==0){
                System.out.println(arr[i]);
                count++;
            }

        }
        System.out.println("3'e bölünebilen sayi :" + count);



    }
}
