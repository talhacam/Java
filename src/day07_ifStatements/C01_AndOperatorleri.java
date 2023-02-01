package day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);  //True

        System.out.println(a<0 && b<20 && c>=b);  //False

        System.out.println(a<0 & b<20 & c>=b);  //False

        /*
        Java and operatoru konusunda bize iki secenek sunar

        && kullanırsak, ilk false bulduğunda sonucun false olacağını bilir ve geriye kalan şartları incelemez.

        & kullanırsak tüm şartları kontrol eder sonra sonucu belirler.
        bu çalışma usulünden dolayı & operatörü && operatörüne göre daha yavaş olabilir.
         */
    }
}
