package AaPractice.day04;

import java.util.Scanner;

public class Q02_MethodCreation {
    /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen km'ye ve m'ye dönüştürmek istediğiniz sayıyı cm olarak yazın");
        double santiMeterValue= scan.nextDouble();

        convertSM(santiMeterValue);



    }

    private static void convertSM(double santiMeterValue) {

        double meter= santiMeterValue/100;
        double kMeter= santiMeterValue/100000;
        System.out.println("Girdiğiniz santimetre değer : " + santiMeterValue +" " + meter + "m'dir" + " " +kMeter + "Km'dir");
    }
}
