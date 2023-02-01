package APractice.Recap01;

import java.util.Scanner;

public class Q07_BMISiniflama {

    /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz(cm)");
        double boy= scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz(kg)");
        double kilo= scan.nextDouble();

        boy= boy/100; //boyun metre olarak değerini alıyoruz.
        //boy/=100 olarak da yazılabilir.

        double bmi= kilo/(boy*boy);
        System.out.println("bmi ="+ bmi);

        if (bmi<=20){
            System.out.println("Zayıf");
        }else if (bmi>20 && bmi<=25){
            System.out.println("Normal");
        } else if (bmi>25 && bmi<=30) {
            System.out.println("Şişman");
        }else {
            System.out.println("Obez");
        }
    }
}
