package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println("İlk oluşturulan tarih : " + tarihSaat);
        // İlk oluşturulan tarih : 2022-07-26T16:04:39.622797600

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/M/yy   hh:mm"); // M: ay içi mm: dakika için

        System.out.println(dtf.format(tarihSaat)); // 26/7/22   04:08  //12lik saate göre hh -- HH 24 saatlik



        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d/MMM/yyyy   HH:mm"); // 26/Tem/2022   16:09

        System.out.println(dtf2.format(tarihSaat)); // 16:10


    }
}
