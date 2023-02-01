package day14_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
         /*
          Eger bir class'in icerisinde herhangi bir hesaplama yapip
          bunu da kalici olarak saklamak istersek
          kodumuzu sade ve anlasilir tutmak icin
          islemi bir method'da yapip
          sonucunu main method'a dondurebiliriz
          Return type'i void olmayan bir method'un sonucunu
          main method'da bir variable'a atama yaparsak
          programin geri kalaninda bu yeni degeri kullanma sansimiz olur
         */
        // kullanicidan sehir ismini ve dogum tarihini alip
        // bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        // Sehir ismini programimizda buyuk harf olarak,
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir= sehirAl();
        String tarih= tarihal();

        System.out.println("Girdiğiniz şehir :"+ sehir);
        System.out.println("Girdiğiniz tarih :"+ tarih);
    }

    public static String tarihal() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yil = scan.nextInt();
        if (yil > 1900 && yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("yıl için geçerli bir sayı yazmalısınız (1900-2100");
        }
        System.out.println("Kaçıncı ay olduğunu tamsayı olarak yazınız");
        int ay = scan.nextInt();

        if (ay <=0 || ay > 12) {
            System.out.println("Ay no 1-12 arasında olmalıdır");
        } else if (ay<10) {
            tarih=tarih+"0"+ay+"-";

        }else {
            tarih=tarih+ay+"-";
        }
        System.out.println("Lütfen ayın kaçıncı günü olduğunu tamsayı olarak giriniz");
        int gun=scan.nextInt();
        if (gun<=0 || gun>31){
            tarih=tarih+"0"+gun;
        }else {
            tarih=tarih+gun;
        }
        return tarih;
    }

    public static String sehirAl() {
        Scanner scan=new Scanner (System.in);
        System.out.println("Lütfen şehir adı giriniz");
        String sehirAdi=scan.next().toUpperCase();

        return sehirAdi;
    }
}
