package APractice.day01;

import java.util.Scanner;

public class Q11_IfStatements {

    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen puanınızı girniz");
        int puan = scan.nextInt();

        if (puan <= 100 && puan >= 90) {
            System.out.println("A");
        } else if (puan <= 89 && puan >= 80) {
            System.out.println("B");
        } else if (puan <= 79 && puan >= 70) {
            System.out.println("C");
        } else if (puan <= 69 && puan >= 60) {
            System.out.println("D");
        } else if (puan <= 59 && puan >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Lütfen 0 ve 100 arasında bir not giriniz");

        }
    }
}