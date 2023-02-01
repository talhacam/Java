package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        // İki tarihin arasındaki süreyi bulma

        LocalDate tarih1=LocalDate.of(1998, 6, 22);
        LocalDate bugün = LocalDate.now();

        Period period = Period.between(tarih1, bugün);
        System.out.println(period);  // P-24Y-1M-4D

        System.out.println(period.getYears()); //24

    }
}
