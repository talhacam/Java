package APractice.Recap01;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {
    /*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu aliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

    public static void main(String[] args) {
        Scanner scan=   new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();

        System.out.println("Lütfen kilonuzu giriniz");
        int kilo= scan.nextInt();

        if (yas<18){
            System.out.println("18 yaşından küçük olduğunuz için kan bağışında bulunamazsınız");
        } else if (kilo<50) {
            System.out.println("50 kilonun altında olduğunuz için kan bağışı yapamazsınız");

        } else if (yas>=18 && kilo>=50) {
            System.out.println("Kan bağışında bulunabilirsiniz");

        }
    }
}
