package day01_variables_scanner;

import java.util.Scanner;

public class C03_SekerHesabi {
    public static void main(String[] args) {

        /*
        3- Kullaniciya ismini, soyismini gunde kac cay ictigini ve caya kac seker attigini sorun. 1 yilda tukettigi seker miktarini asagidaki sekilde yazdirin.
(Bir seker 4 gr olarak degerlendirilir.)
 Sayin Ali Yilmaz, ictiginiz cay ile birlikte yilda ….. Kg seker tuketiyorsunuz.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Isim: ");
        String isim=scanner.nextLine();
        System.out.print("Soyisim: ");
        String sisim=scanner.nextLine();
        System.out.print("Gunde kac bardak cay iciyorsunuz: ");
        int bcay=scanner.nextInt();
        System.out.print("Bir bardaga kac seker atiyorsunuz: ");
        int scay=scanner.nextInt();

        double birbardaktakiseker=4*scay;
        double gundeseker=birbardaktakiseker*bcay;
        double yildas=gundeseker*365;
        double kgc=yildas/1000;

        System.out.println("Sayin "+isim+ " " + sisim+", ictiginiz cay ile birlikte yilda "+ kgc +"Kg seker tuketiyorsunuz.");

        /*
        4- Yukardaki sorunun ciktisini asagidaki sekilde yapin
           isim : A Yilmaz
           gunluk cay adedi : …
           yillik tuketilen seker miktari : … Kg
         */

        System.out.println(

                "isim : " +  isim.charAt(0) + " " + sisim +
                "\ngunluk cay adedi : " + bcay +
                "\nyillik tuketilen seker miktari : " + kgc + " Kg"


        );













    }
}
