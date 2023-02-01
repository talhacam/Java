package day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {

    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat); // 2022-07-26T15:10:30.502043300

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));
        // 3 ay 100 saat sonra 2022-10-30T19:11:15.681657100

        System.out.println(tarihSaat.minusDays(100).plusHours(100));
        // 100 gün eksilt 100 saat ekle. 2022-04-21T19:12:09.598665900

        System.out.println(tarihSaat.toLocalDate()); // 2022-07-26


    }
}
