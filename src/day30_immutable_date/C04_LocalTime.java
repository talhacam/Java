package day30_immutable_date;

import java.time.LocalDate;
import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) throws InterruptedException {

        LocalTime time1= LocalTime.now();
        System.out.println(time1); // 14:49:55.524339100


        /*
        Bizim oluşturduğumuz date ve time canlı saat veya tarih değildir.
        LocalTime.now(); kullandığınız satırda o anki tarih ve saati alıp bizim variable'imiza store eder.
        time1 variable'inin değeri sabittir.
         */

        Thread.sleep(3000); //Kodu bekletiyor. (3000 milisaniye= 3saniye)

        time1=LocalTime.now();
        System.out.println(time1); // 14:49:58.538928100

        System.out.println(time1.getSecond()); // 33

        System.out.println(time1.plusSeconds(10000)); // 17:54:13.134709

        System.out.println(time1.minusMinutes(200)); // 11:47:33.134709 //200 dk çıkardı

        System.out.println(time1.withHour(3)); // saati 3 yapip yazdirdi


    }
}
