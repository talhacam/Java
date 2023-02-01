package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        //kullanıcıdan bir gün ismi alın ve girilen gün isminin ilk üç harfini yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String gun= scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")){
            System.out.println("Paz");
        } else if (gun.equals("salı")){
            System.out.println("Sal");
        }else if (gun.equals("çarşamba")){
            System.out.println("Çar");
        } else if (gun.equals("perşembe")){
            System.out.println("Per");
        } else if (gun.equals("cuma")){
            System.out.println("Cum");
        } else if (gun.equals("cumartesi")){
            System.out.println("Cum");
        } else if (gun.equals("pazar")){
            System.out.println("Paz");
        } else {
            System.out.println("Lütfen geçerli bir gün ismi giriniz");
        }

    }
}
