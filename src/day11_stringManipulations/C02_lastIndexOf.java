package day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String cumle = "Java çok kolay, Java çok güzel";
        String kelime = "Java";  //aranan kelimeyi değiştirerek farklı sonuçlar elde edilebilir (kolay, güzel vs...)

        /*
        Verilen kelime için aşağıdaki şartlardan uygun olanı yazan bir program yazınız.
        -Verilen kelime cümlede kullanılmamış.
        -verilen kelime cümlede sadece 1 kere kullanılmış.
        -verilen kelime cümlede birden fazla kullanılmış.
         */

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex == -1) {
            System.out.println("Kelime cümlede kullanılmamıştır");

        } else if (kelimeIlkIndex == kelimeSonIndex) {
            System.out.println("Verilen kelime cümlede sadece 1 kere kullanılmıştır");
        } else {
            System.out.println("Verilen kelime cümlede birden fazla kullanılmıştır");
        }
    }
}