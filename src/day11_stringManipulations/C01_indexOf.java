package day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {
        String str= "Java ogrenmek cok guzel";
        /*
        Verilen bir String'de herhangi bir String veya char'ın
        ilk kullanıldığı index'i bize döndürür.
         */

        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("r")); // 7
        System.out.println(str.indexOf("j")); // -1 (Küçük harfli "j" olmadığı için negatif sayı veriyor.
        System.out.println(str.indexOf("mek")); // heceyi bir blok olarak düşünür ve ilk harfin index'ini verir. //10

        //Eğer istediğimiz index'den sonrasını kontrol etmek istersen
        // o zaman aynı method'u iki parametreli olarak kullanabiliriz.
        System.out.println(str.indexOf("g",6)); // yazılan idex'den başlar //6

        System.out.println(str.indexOf("g",(6+1)));

        // yukarıdaki str'da 2. ve 3. e'nin indexlerini bulun.

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);

        //eğer 2. e varsa 3. e'nin olup olmadığını ve varsa indexini yazdır.

        if (ikincie==-1){
            System.out.println("Verilen str'da 2. e yok");
        }else{
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("Verilen str'da 3. e yok");
            }else{
                System.out.println("Verilen str'daki 3.e'nin indexi : " + ucuncue);
            }
        }
    }
}
