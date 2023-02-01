package day12_stringManipulation;

public class C05_substring {
    public static void main(String[] args) {

        // Kullanıcıdan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdırın.

        String input="Veli";

        String tersinput= input.substring(3)+
                input.substring(2,3)+
                        input.substring(1,2)+
                input.substring(0,1);

        System.out.println(tersinput);
    }
}
