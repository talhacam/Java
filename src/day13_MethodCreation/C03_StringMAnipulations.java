package day13_MethodCreation;

public class C03_StringMAnipulations {
    public static void main(String[] args) {
        // String Methodlarını kullanarak
        //"  Java ogrenmek123 Cok guzel@  " Stringini
        //"Java ogrenmek cok guzel" sekline getirin

        String str= "  Java ogrenmek123 Cok guzel@  ";

        str=str.trim();  //Baştaki ve sondaki boşluklardan kurtulduk.

        str=str.replaceAll("\\d", ""); //Java ogrenmek Cok guzel@

        str=str.replace("@",""); //Java ogrenmek Cok guzel  (direkt @işareti yerine "." koyulabilirdi)

        str=str.replace("C","c"); //Java ogrenmek cok guzel

        str=str+"."; //Java ogrenmek cok guzel.

        System.out.println(str);

    }
}
