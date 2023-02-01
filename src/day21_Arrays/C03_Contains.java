package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    // Soru 3- Kulanicidan aldiginiz bir ismin,verilen array’de olup olmadigini kontrol edip,
    // bize true veya false sonucu donen bir method olusturun.

    public static void main(String[] args) {

        String[] isimler= {"Basak", "Nurullah","Fatih", "Adem", "Enes"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Aradığınız ismi yazınız");
        String arananIsim=scan.nextLine();

        boolean sonuc= contains(isimler, arananIsim);
        if (sonuc){
            System.out.println("Girilen isim listede var");
        }else {
            System.out.println("Girilen isim listede yok");
        }

   }
   public static boolean contains(String[] isimler,String arananIsim) {
        boolean sonucMethod=false;

        for(int i=0;i<isimler.length;i++){
            if(isimler[i].equalsIgnoreCase(arananIsim)){
                sonucMethod=true;
            }
        }

        return sonucMethod;



   }

}
