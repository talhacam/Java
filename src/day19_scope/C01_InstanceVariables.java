package day19_scope;

public class C01_InstanceVariables {
    /*
    class içerisinde heryerden kullanmak istediğiniz variable'ları class level'da
    (Class'ın içinde ama method'ların dışında)
    Genellikle class level variable'lar class'ın başında oluşturulur.(Şart değil)

    Class Level'daki variable'lar için 2 scope vardır.
    1- static variables (Class variables da denir)
    2- instance (Static olmayan) variables (obje variable'ları da denir)
     */

    int instSayi=20; //Static olmayıp Class Level'da olduğu için instance variable'dır.


    public static void main(String[] args) {
        int sayi=10;
        // System.out.println(instSayi);
        /*
        Instance variable static olmadığı için main method'dan direkt kullanamayız.
        Instance variable'ların diğer adı object variable'dır.
        Dolayısıyla obje oluşturursanız instance variable'ları heryerden kullanabilirsiniz.
         */

        C01_InstanceVariables obje1= new C01_InstanceVariables();
        System.out.println("Obje1 değişmeden önce : " +obje1.instSayi); //20
        obje1.instSayi=30;
        System.out.println("Obje1 değiştikten sonra : " +obje1.instSayi); //30

        C01_InstanceVariables obje2= new C01_InstanceVariables();
        System.out.println("Obje2 değişmeden önce : " +obje2.instSayi); //20
        obje2.instSayi=25;
        System.out.println("Obje2 değiştikten sonra : "+obje2.instSayi); //25

        C01_InstanceVariables obje3= new C01_InstanceVariables();
        System.out.println("Obje3 değişmeden önce : " +obje3.instSayi); //20

        /*
        Her obje oluştuğunda instance (obje) variable'ının ilk atanan değerini alır.
         */
        /*
        instSayi=30;
        instance variable'lara main method dışındaki static method'lardan da direkt ulaşamayız.
        obje oluşturursak ulaşırız.
         */



    }
    public static void staticMethod(){
        // System.out.println(sayi);
        /*
        Bir Method'un içerisinde oluşturulan variable sadece o method'un içinden kullanılabilir.
        (Local variables)
         */
        C01_InstanceVariables obje4= new C01_InstanceVariables();
        System.out.println(obje4.instSayi);


    }
    public void staticOlmayanMethod(){
        System.out.println(instSayi);

        /*
        instance variable'lar class içerisindeki static olmayan method'lardan direkt kullanılabilir.
         */

    }
}
