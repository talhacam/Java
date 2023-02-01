package AaPractice.Recap02;

public class Q01_SwitchCase {

    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
    */

    public static void main(String[] args) {
        String gun = "Çarşamba";

        switch (gun) {
            case "Pazartesi":
            case "Sali":
                System.out.println("Java dersi");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenyum dersi");
                break;
            case "Çarşamba":
            case "Cumartesi":
                System.out.println("SQL dersi");
                break;

            default:
                System.out.println("İzin Günü");
        }


    }

}
