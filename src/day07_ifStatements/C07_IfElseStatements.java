package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        /*
        bir önceki soruda, kullanıcı negatif deger girerse uyaralim
        Not: birden fazla if-else if birbirine baglamissa son durum önemlidir.
        eger else ile bitiyorsa butun ihtimaller kapsaniyor demektir
        ama else if ile bitiyorsa kapsanmayan durumlar olabilir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();

        if (yas<0){
            System.out.println("Lütfen geçerli bir yaş yazınız");
        } else if (yas<65){
            System.out.println("Emekli olamazsın, "+(65-yas)+" yıl daha çalışmalısınız");
        } else {
            System.out.println("Emekli olabilirsiniz");
        }

    }
}
