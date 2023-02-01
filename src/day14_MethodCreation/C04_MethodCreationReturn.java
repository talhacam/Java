package day14_MethodCreation;

public class C04_MethodCreationReturn {
    //Verilen isim ve soyismi ilk harfleri büyük geriye kalanları * olacak şekilde değiştirip
    //bize bu halini döndüren bir method oluşturun.
    //Not: programin ilerleyen kısımlarında isim ve soyismi bu şekilde kullanmak istiyoruz.

    public static void main(String[] args) {
        String isim="Enes";
        String soyisim="Bozkurt";

        String gizliIsim=isimGizle(isim,soyisim);
        System.out.println(isim+" "+soyisim);
        System.out.println(gizliIsim);
    }

    public static String isimGizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");

        soyisim=soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\w","*");

        return isim+" "+soyisim;
    }
}
