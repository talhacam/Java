package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        //bir tam sayı ve bir char degiskeni olusturun ve bunların toplamını yazdırın
        int sayi=10;
                char harf='a';
                String str="banan";
        System.out.println(sayi+harf); //107
        System.out.println(str+harf); //banana

        // char data turu ısleme gırdıgı degıskenın turune gore farklı davranabilir
        //eger matematiksel isleme girdigi variable sayisal bir degerse sayı gibi davranır.
        // sayi+harf sayi variable'i int oldugundan harf variable'ı asci tablosundan 97 degerini kullanır (a=97)

        char yeniHarf= (char) (harf+2);
        // java önce sağdaki işlemi yapar, sagda int+char gorunce ascii degerini alır sonra atama ıslemını yapmaya calısır
        //char yeniHarf=99;
        //bu atama java acısından kabul edilebilir değildir

         //(str+harf); // banana
        // String cok gucludur, hangi data turu ile işleme girerse girsin diger daya turunu kendine benzetir.

        //peki konsolda 10a görmek istersek nasıl yazdırmalıyız?

                System.out.println(""+sayi+harf);

                char deger='1';
        System.out.println(deger + harf); //'1' + 'a' --> 49 + 97 = 146



    }
}
