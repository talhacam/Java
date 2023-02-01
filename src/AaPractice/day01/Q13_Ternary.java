package APractice.day01;

public class Q13_Ternary {

    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */

    public static void main(String[] args) {
        int fiyat=10;

        if (fiyat < 10) {
            System.out.println("Ucuz");
        } else if (fiyat >=10 && fiyat < 20) {
            System.out.println("Normal");
        }else
            System.out.println("Pahalı");


        //2.yol "?" if manasına geliyor ":" değilse manasına geliyor.

        String result= fiyat<10 ? "Ucuz" : fiyat<20 ? "Normal" : "Pahali";
        System.out.println(result);
    }
}
