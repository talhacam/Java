package day15_overloading_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {
        C06_StringTerseCevirme.terstenYazdir("Zekeriya");

        //100!deb 1'e kadar 8 ile bölünebilen sayıları yazdırın

        for (int i = 100; i >=1 ; i--) {
            if (i%8==0){
                System.out.print(i+" ");
            }


        }
    }
}
