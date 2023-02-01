package AaPractice.day03;

import java.util.Scanner;

public class Q07_StringManipulation {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 harfli bir kelime girin");
        String str= scan.next();


        if(str.length() == 4){
            char bir= str.charAt(0);
            char iki= str.charAt(1);
            char uc= str.charAt(2);
            char dort= str.charAt(3);
            System.out.println("tersten :" +dort + uc+ iki+ bir);

        }else{
            System.out.println("4 harf dedik");
        }

    }
}
