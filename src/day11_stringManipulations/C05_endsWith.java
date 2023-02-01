package day11_stringManipulations;

public class C05_endsWith {
    public static void main(String[] args) {
        String str= "Ah be Java";
        System.out.println(str.endsWith("ava")); // True

        System.out.println(str.endsWith("be Java")); // True

        System.out.println(str.endsWith("Ah be Java")); // True

        System.out.println(str.endsWith("")); // True



    }
}
