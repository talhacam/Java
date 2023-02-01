package day16_ForLoop;

public class C03_forLoop {
    public static void main(String[] args) {
        // Soru 2 ) 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin

        int bas=10;
        int son=30;

        for (int i = bas; i<=son; i++){
           // System.out.print(i + ", "); //System.out.println(); (sondaki "ln" silinince yanyana yazdırıyor)
            //Bu şekilde olursa 30'dan sonra da "," koyuyor. Hoş değill

            if (i<son){
                System.out.print(i + ", ");
            }else {
                System.out.print(i);
            }


        }
    }
}
