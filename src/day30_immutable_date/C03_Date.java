package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); // 2022-07-26

        System.out.println(tarih.getDayOfYear()); //207 yılın 207.günü

        System.out.println(tarih.getDayOfWeek()); // Tuesday haftanın günü

        System.out.println(tarih.getMonthValue()); // 7 (Temmuz 7.ay)

        System.out.println(tarih.isLeapYear()); // False (Artık yıl mı?)


        LocalDate tarih2= LocalDate.of(2001,5,15);
        System.out.println(tarih2); //

        LocalDate tarih3= LocalDate.of(1998, Month.JUNE,22);
        System.out.println(tarih3); // 1998-06-22

        System.out.println(tarih.plusDays(100)); // 100 gün sonrasının tarihi (2022-11-03)

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));
        // 5 yıl 3 ay 12 gün sonrasının tarihi 2027-11-07

        System.out.println(tarih.minusWeeks(20)); // 20 hafta öncesinin tarihi (2022-03-08)

        System.out.println(tarih.minusDays(100).minusMonths(5));
        // 100 gün 5 ay öncesinin tarihi (2021-11-17)

        System.out.println(tarih.isAfter(tarih2)); //Bizim tarihimiz tarih2'den sonra mı? // TRUE

        //İki farklı doğum günü girildiğinde hangisinde doğanın daha büyük olduğunu bulunuz
        //tarih2 ve tarih3 için yapalım.

        if(tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + " tarihinde doğan daha büyük");

        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2 + " tarihinde doğan daha büyük");

        }else {
            System.out.println("İki tarih birbiri ile aynı");
        }


    }
}
