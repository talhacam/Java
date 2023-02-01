package day09_Ternary;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        /*
        kullanıcıdan gün ismini alın
         haftaiçi yada haftasonu olduğunu yazın.
         */

        String input = "Salı";  //Scanner yerine String kullandık buraya girilen güne göre sonuç geliyor.
        input = input.toLowerCase();

        switch (input) {
            case "pazartesi":
                System.out.println("Hafta içi");
                break;
            case "salı":
                System.out.println("Hafta içi");
                break;
            case "çarşamba":
                System.out.println("Hafta içi");
                break;
            case "perşembe":
                System.out.println("Hafta içi");
                break;
            case "cuma":
                System.out.println("Hafta içi");
                break;
            case "cumartesi":
                System.out.println("Haftasonu");
                break;
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Lütfen geçerli bir gün ismi giriniz");
        }

        //2.Yol

        switch (input) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("hafta içi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Lütfen geçerli bir gün ismi giriniz");


        }
    }
}
