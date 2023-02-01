package day10_stringManipulation;

public class C03_equals {
    public static void main(String[] args) {
        String str1= "Ali Can";
        String str2= "Ali CAN";
        String str3= "Ali Can" + "";
        String str4= "Ali Can";
        String str5= new String("Ali Can");

        System.out.println(str1 == str2); // False
        System.out.println(str1==str3); // True
        System.out.println(str1.equals(str3)); // True

        System.out.println(str1==str5); // false
        System.out.println(str1.equals(str5)); // True

        System.out.println(str1.equals(str4)); // True

        System.out.println(str3.equals(str5)); // True
        System.out.println(str3==str5); // False

        /*
        String'lerde aynı string olsa bile == her zaman çalışmaz
        emin olmak isterseniz equals() kullanmalısınız
        kesin doğru sonuçlar almak için equals() kullan!
         */
    }
}
