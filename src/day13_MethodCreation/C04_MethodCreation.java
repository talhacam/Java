package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        //Input olarak verilen 2 integer'ı toplayıp sonucunu yazdırın
        //bir method oluşturun

        int input1=10;
        int input2=20;
        ///Method 4 adımda oluşturulur
        // 1. adım method call
        // 2. adım argument eklemesi gerekiyorsa ekleyelim
        //Eğer methodun retrun type void'den farklı olacaksa bir variable oluşturup, method call'u assign edelim.

        topla(input1, input2);
    }

    public static void topla(int input1, int input2) {

        //3. adım method deklarasyonunun değiştirilmesi gereken bölümleri değiştir (Private-->Public. acces modifier, return type vs..)
        // 4. adım eğer return type void dışında bir şeyse return keyword'u ve dönecek değeri hesaplamalıyız.
        System.out.println("Girilen iki sayının toplamı : "+ (input1+input2));
    }
}
