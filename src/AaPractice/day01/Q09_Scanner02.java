package APractice.day01;

import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.nextLine();


        System.out.println("Lütfen nereli olduğunuzu giriniz");
        String memleket= scan.nextLine();

        System.out.println("Lütfen şu anda nerede yaşadığınızı giriniz");
        String konum= scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();

        System.out.println("Lütfen boyunuzu giriniz");
        double boy= scan.nextDouble();

        System.out.print("yasadiginiz " + konum + " u seviyor musunuz? true/false");
        boolean seviyorMu = scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);


    }
}
