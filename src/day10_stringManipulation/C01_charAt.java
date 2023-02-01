package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {
        String str= "Java öğrenmek ne güzel";
        System.out.println(str.charAt(0)); //ilk harfi yazdırır "J"

        System.out.println(str.toUpperCase().charAt(7)); // 7. harfi büyük yazdırır "R"

        System.out.println(str.charAt(21)); // son harfi gösterir. "l"

        //System.out.println(str.charAt(22)); // Hata verir!
        // Son harfi bulmak için str'in uznuluğunun 1 eksiğini index olarak gireriz
        //Eğer index olarak uzunluğu veya daha büyük bir sayıyı girersek Java Exception verir.

        // charAt() kullandığımızda sonuç char olacağı için artık manipulation yapmayız.
        // string method'larından kullanmanız gereken bir method varsa charAt()'den önce kullanmalıyız.


        // 0'dan başlar uzunluğun bir eksiğinde biter. 0'dan başladığı için!
        // String'deki boşluklarda karakter olarak sayılır!

    }
}
