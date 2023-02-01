package APractice.Recap01;

import java.util.Scanner;

public class Q09_NestedIf {

    /*
    Kullanici dan yas bilgisini alarak
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas=scan.nextInt();

        if (yas<18){
            System.out.println("Oy kullanma hakkınız bulunmamakta");
        } else if (yas>=18 && yas<50) {
            System.out.println("Bir kez oy kullanabilirsiniz");
        } else if (yas>=50 && yas<70) {
            System.out.println("İki kez oy kullanabilirsiniz");
        } else {
            System.out.println("Üç kez oy kullanabilirsiniz");
        }

    }
}
