package day11_stringManipulations;

public class C07_startsWith {
    public static void main(String[] args) {
        String input="Java gun gectikce guzellesiyor";
        System.out.println(input.startsWith("J")); // T
        System.out.println(input.startsWith("")); // T

        System.out.println(input.startsWith("gun", 5));
        //5. index ve sonrası gun ile mi başlıyor? cevap= True

    }
}
