package APractice.Recap01;

import java.util.Scanner;

public class Q03_BMI {

    /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz(cm)");
        double boy= scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz(kg)");
        double kilo= scan.nextDouble();

        boy= boy/100; //boyun metre olarak değerini alıyoruz.
        //boy/=100 olarak da yazılabilir.

        double vke= kilo/(boy*boy);
        System.out.println("vke ="+ vke);

    }
}
