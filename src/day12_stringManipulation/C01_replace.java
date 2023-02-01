package day12_stringManipulation;

public class C01_replace {
    public static void main(String[] args) {
        String str= " Bu gün ha va çok guz el";
        System.out.println(str.replace(" ","")); // Bugünhavaçokguzel

        System.out.println(str.replace("h","J").replace(" ",""));
        //BugünJavaçokguzel

        //guz el yerine harika yazalım
        System.out.println(str.replace("guz el","harika"));

        //Cümleyi replace kullanarak Bugün Java çok güzel yapalım
        str= str.replace("Bu gün","Bugün")
                .replace("ha va","Java")
                .replace("guz el","guzel");
        System.out.println(str); //Bugün Java çok güzel
    }
}
