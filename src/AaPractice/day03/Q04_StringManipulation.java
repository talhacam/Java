package AaPractice.day03;

import java.util.Scanner;

public class Q04_StringManipulation {

     /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.next();

        char ortancaKrk= str.charAt((str.length()-1)/2);

        if(str.length()>=3 && str.length()%2==1){
            System.out.println(ortancaKrk);
        }else {
            System.out.println("Yapacak bir şey yok");
        }
    }
}
