package APractice.day01;

import java.util.Scanner;

public class Q10_IfStatements {

    /*
     * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Y yada N giriniz");
        char karakter=scan.next().charAt(0);

        if(karakter=='Y' || karakter=='y'){
            System.out.println("YES");
        } else if (karakter=='N' || karakter=='n'){
            System.out.println("NO");
        }else {
            System.out.println("Lütfen geçerli bir karakter giriniz");
        }

    }
}
