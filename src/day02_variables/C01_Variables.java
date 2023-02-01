package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {
        int            not                  =                       60                    ;
        //data turu    variable ismi       assignment sign        variable degeri        islem bitti isareti

        int not2 =   70;
      //variable      deger
        //java önce degeri hesaplar sonra assigne islemini yapar

        //not2'yi 90 yapalım

        not2=90;

        //yeni bir int variable olusturalım degeri ilk iki variable'ın ortalaması olsun

        int ort= (not+not2)/2;

        System.out.println(ort);

    }
}
