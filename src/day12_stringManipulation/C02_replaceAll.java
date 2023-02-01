package day12_stringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        //str'ı Bugün Java çok güzel haline getirin
        //replaceAll methodundaki all'un amacı aynı özellikteki tüm karakterleri kapsamasıdır
        //Bütün sayıları sil
        //Bütün özel karakterleri sil

        //tüm özel karakterleri silelim dediğimizde space'ler de siliniyor
        // Space'leri korumak için en başta onların yerine cümlede bulunmayan bir string koyalım.
        //"qazwyx"
        str=str.replace(" ", "qazwyx"); //1Bu2gu3nqazwyxJavaqazwyxcokqazwyxg3uzel

        // \\s: bosluk(space)
        // \\S: bosluk dışındaki tüm karakterler
        // \\w: HArfler ve rakamlar (a-z, A-Z, 0-9)
        // \\W: Harfler ve rakamlar dışındaki tüm karakterler
        // \\d: Rakamlar (0-9) (digit)
        // \\D: Rakamların dışındaki tüm karakterler

        str=str.replaceAll("\\W",""); //1Bu2gu3nJavacokg3uzel
        System.out.println(str);

        str=str.replaceAll("\\d","");
        System.out.println(str); //BugunqazwyxJavaqazwyxcokqazwyxguzel

        //İstenmeyen özel karakter ve rakamlardan kurtulduk
        //simdi boşlukları geri getirelim

        str=str.replace("qazwyx"," "); //Bugun Java cok guzel
        System.out.println(str);


    }
}
