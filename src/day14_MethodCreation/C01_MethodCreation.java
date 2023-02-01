package day14_MethodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        //input olarak girilen 4 karakterli bir stringi
        // tersten yazdıran bir method oluşturularım

        terstenYazdir("Okan");
        C04_MethodCreation.topla(6,5);  //11 daha önce oluşturduğumuz method burada da çalışıyor.

    }

    public static void terstenYazdir(String input){
            String tersInput= input.substring(3)+
                    input.substring(2,3)+
                    input.substring(1,2)+
                    input.substring(0,1);

            System.out.println("Verilen kelimenin tersten yazılışı : " + tersInput);
        }
    }

