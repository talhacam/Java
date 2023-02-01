package day04_dataCasting;

public class C01_dataCasting {
    public static void main(String[] args) {
        char harf='a';
                // char yeniHarf= harf+1; // kod bu durumda önce sağdaki işlemi yapar
                                       //char yeniHarf = 97+1 --> 98
                                     // char, bir variable 98 olamayacağı için java hata verir.

        char yeniHarf= (char) (harf+1);  //Java bu durumda ascii değerini göze aldı
        System.out.println(yeniHarf);  //b

        /*
        Bazen bir variable'a olusturdugumuz data turu dısından deger atanabilir
        Bunlardan bazisini Java otomatik olarak kabul eder.
        Bazisi için parantez içinde görmek istediğimiz degeri belirtmemiz gerekir
         */

        int sayi1= (int)7.3; // parantez olmasaydı java hata verecekti. (int, kesirli sayılarda kullanılmaz)
        System.out.println("sayi1 :"+ sayi1);  //7 (küsüratı attı çünkü int'e dönüştürüldü)

        double sayi2=10;
        System.out.println("sayi2 :"+ sayi2);  //10.0 (ondalık gösteriyor çünkü double ile yapıldı)

        int sayi3='c';
        System.out.println("sayi3 :"+ sayi3);  //99

        char harf2=98;
        System.out.println("harf2 :"+ harf2);  //b
    }
}
