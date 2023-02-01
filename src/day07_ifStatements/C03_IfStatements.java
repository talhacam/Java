package day07_ifStatements;

public class C03_IfStatements {
    public static void main(String[] args) {

        /*
        bir if statement'da { kullanılmazsa Java ilk satırı şart ile bağlar
        sonraki satırlar bağımsız olur.
        Eğer birden fazla satir ayni if sartına baglanmıs ise mutlaka { kullanmalıyız.
         */


        int sayi=23;
        if (sayi>0)
            System.out.println("sayi pozitif"); // degere bagli
            System.out.println("pozitif kalacaktır"); //her zaman calisir
            System.out.println("Ucuncu satir"); // her zaman calisir.


        if (sayi%2==0)
            System.out.println("sayi cift");  //degere bagli
            System.out.println("cift kalacaktır"); //her zaman calisir.


        if (sayi%5==0)
            System.out.println("Sayi 5'in tam kati"); //degere bagli


    }
}
