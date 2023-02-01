package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        //Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // 50-59 arasi “C”,
        // 60-79 arasi “B”,
        // 80 ve uzerinde ise “A”
        // geçersiz not girildiğinde uyarı verelim.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 0'dan 100'e kadar bir not değeri giriniz");
        double note= scan.nextDouble();

        if (note<0 || note>100){
            System.out.println("Lütfen geçerli bir not giriniz");
        }
        else if (note<50) {      //bu satırda not 0 ile 100 arasındadır.

            System.out.println("Notunuz : D");
        } else if (note<60) {    //Bu satırda not 50 ile 100 arasındadır. (bir önceki satırda 0 ile 50 arası elendi)
            System.out.println("Notunuz : C");
        }else if (note<80) {  // bu satırda not 60 ile 100 arasındadır.
                System.out.println("Notunuz : B");
            }else {
                    System.out.println("Notunuz: A");
                }
        }


    }
