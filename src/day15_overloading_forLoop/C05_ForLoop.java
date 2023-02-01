package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        //1'den 5'e kadar olna tamsayıları toplayalım
        int toplam=0;

        for (int i = 1; i<=5; i++){
            toplam+=i;
           // System.out.println(toplam); buraya yazarsak her toplamı yazdırır.
        }
        System.out.println("toplam : "+ toplam);

        //10-20 arasındaki sayıları topla.
        toplam=0;
        for (int i = 10; i<=20; i++){
            toplam+=i;
        }
        System.out.println(toplam);

        //30'la 50 arasındaki çift sayıların toplamı.
        toplam=0;
        for (int i =30; i<=50; i+=2){
            toplam+=i;
        }
        System.out.println(toplam);


        //2.yontem
        toplam=0;
        for (int i = 30; i <=50 ; i++) {
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("30-50 arasi cift sayilarin toplam : " + toplam);


        // 1500 ile 1600 (sinirlar dahil) arasinda 7 ile bolunebilen sayilari toplayin

        for (int i= 1500; i <=1600; i++) {
            if (i%7==0){
                toplam+=i;
            }
        }
        System.out.println(toplam);
    }
}
