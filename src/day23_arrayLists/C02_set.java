package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        /*
          elimizde urunlerin bulundugu bir liste var
          urun listesindeki istenen siradaki urunu
          istegimiz yeni urunle degistirip
           eski urunu, varolan eski urunler listesine ekleyelim
         */

        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Çekirdek");
        urunler.add("Çay");

        List<String> eskiUrunler= new ArrayList<>();
        //İkram yerine biskrem koyalım. İkram'ı da eski ürünler listesine ekleyelim.

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp= urunler.indexOf(silinecekUrun);
        String silinenUrun= urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);
        System.out.println("Liste : "+ urunler);
        System.out.println("Eski ürünler listesi : "+ eskiUrunler);

        yeniUrun="Kahve";
        silinecekUrun="Çay";

        temp= urunler.indexOf(silinecekUrun);
        silinenUrun= urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);
        System.out.println("Liste : "+ urunler);
        System.out.println("Eski ürünler listesi : "+ eskiUrunler);

        yeniUrun="Fındık";
        silinecekUrun="Çekirdek";

        temp= urunler.indexOf(silinecekUrun);
        silinenUrun= urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);
        System.out.println("Liste : "+ urunler);
        System.out.println("Eski ürünler listesi : "+ eskiUrunler);
    }
}
