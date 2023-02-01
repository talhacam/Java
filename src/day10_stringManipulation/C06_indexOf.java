package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str = "Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); // 6 (istersek char olarak da yazabiliriz)
        System.out.println(str.indexOf("t")); // integer döndürecek -1
        // int'de yok diye bir değer bulunmuyor
        // 0 dersek J'nin index'idir
        // - bir değer dönerse biz aranan String'in str'da olmadığını anlarız.
        // java olmayan karakterleri -1 olarak döndürür.

        String str5 = "dasşkdhlaslkdjakfaafaskldaoaskpk";
        //Str5'de p harfi var mıdır?
        if (str5.indexOf("p") == -1) {
            System.out.println("str5'de istenen karakter kullanılmamış");

        } else {
            System.out.println("str5'de istenen karakter kullanılmış");

        }
    }
}