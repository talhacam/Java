package APractice.Recap01;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
        char finalNotu= 'B';

        String result = finalNotu== 'A' ? "Çok Başarılı" : finalNotu== 'B' ? "Başarılı" : finalNotu== 'C' ? "Ortalama"
                : "Kötü";
        System.out.println("Sonuç ="+ result);
    }
}
