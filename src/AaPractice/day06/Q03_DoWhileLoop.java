package AaPractice.day06;

import java.util.Scanner;

public class Q03_DoWhileLoop {


    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String okunan = "";

        do {
            System.out.println("harf giriniz");
            okunan = scan.next();
            System.out.println("Program çalışıyor");
        } while (!okunan.equalsIgnoreCase("x")); // okunan x' eşit olmadığı sürece

        System.out.println("Program bitti");
    }
    }

