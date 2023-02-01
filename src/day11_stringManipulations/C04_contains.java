package day11_stringManipulations;

import java.util.Locale;

public class C04_contains {
    public static void main(String[] args) {
        /*Kullanicidan bir cumle isteyin.
            Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
            “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
            iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.

         */
        String cumle="Java buyuk, dunya kucuk";
        cumle=cumle.toLowerCase();
        //requirements'de büyük ve küçük harf hassasiyeti hakkında bir şey söylenmemiş
        // her iki kelimeyi de içerme durumu açıklanmamış
        //Bu durumda görevi veren kişiye bu durumların sorulması gerekir.


        if (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu ?");
        } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        } else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
    }
    }
}
