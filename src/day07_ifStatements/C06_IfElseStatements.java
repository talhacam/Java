package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        //Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
        // 65’e esit veya buyukse “Emekli olabilirsin” yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();

        if (yas<65){
            System.out.println("Emekli olamazsin,"+(65-yas)+" yıl daha çalısmalısın");
        }else{
            System.out.println("Emekli olabilirsin");
        }

    }
}
