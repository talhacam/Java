package day32_StringBuilder;

public class C02_append {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java daha ne yapsin");

        sb.append("?"); //soru işareti ekledi.

        System.out.println(sb); // Java daha ne yapsin?

        // append istedigimiz String'i en sona ekler

        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb); // Java her seyi dusunmus, daha ne yapsin?

        // araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz

        sb.insert(22,"valla valla",5,11);
        System.out.println(sb);
    }
}
