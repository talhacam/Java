package AaPractice.Self;

import java.time.LocalDate;
import java.util.Scanner;

public class dogumGunu {
    public static void main(String[] args) {

        LocalDate tarih1= LocalDate.of(1998,6,22);

        LocalDate tarih2= LocalDate.of(1999,4,10);

        if (tarih1.isAfter(tarih2)){
            System.out.println(tarih2 + " tarihinde doğan daha büyük");

        } else if (tarih1.isBefore(tarih2)) {
            System.out.println(tarih1 + " tarihinde doğan daha büyük");
        }else {
            System.out.println(" Her iki kişi de aynı tarihte doğmuş");
        }


    }
}
