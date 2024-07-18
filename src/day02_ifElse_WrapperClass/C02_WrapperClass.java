package day02_ifElse_WrapperClass;

import java.util.Scanner;

public class C02_WrapperClass {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz: ");
        char harf = scan.nextLine().charAt(0);

        // wrapper class'lar priitive data turleri ile
        // hazir method'lar kullanabilmemiz icin
        // Java'nin olusturdugu class'lardir
        // Boolean - Character - Byte - Short - Integer - Long - Float - Double
        // primitive'ler ile wrapper class'lar arasinda direk gecis mumkundur

        if (Character.isLowerCase(harf)) { // girilen harfin kucuk harf olmasini kontrol eder
            Character.toUpperCase(harf);
            System.out.println("Girdiginiz harfin yeni hali: " + harf);

        } else if (Character.isUpperCase(harf)) { // girilen harf buyuk harf mi diye kontrol eder

            harf = Character.toLowerCase(harf);
            System.out.println("Girdiginiz harfin yeni hali: " + harf);


        }else {
            System.out.println("Harf girmelisiniz!");
        }

    }
}









