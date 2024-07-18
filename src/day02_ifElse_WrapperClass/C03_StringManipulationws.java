package day02_ifElse_WrapperClass;

import java.util.Scanner;

public class C03_StringManipulationws {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz: ");
        String girilenMetin = scan.nextLine();

        // oncelikle kullanici 1 harf mi girmis kontrol edip,
        // bir harften fazla ise uyari yazdirabiliriz

        if (girilenMetin.length() != 1) { // girilen metin tek bir harf degil
            System.out.println("Sizden sadece 1 harf istedim!");

        } else if (Character.isUpperCase(girilenMetin.charAt(0))) { // girilen metin tek bir buyuk harf
            girilenMetin = girilenMetin.toLowerCase();
            System.out.println("Girdiginiz harfin yeni hali: " + girilenMetin);
            
        } else if (Character.isLowerCase(girilenMetin.charAt(0))) { // girilen metin tek bir kucuk harf
            girilenMetin = girilenMetin.toUpperCase();
            System.out.println("Girdiginiz harfin yeni hali: " + girilenMetin);

        } else {
            System.out.println("Harf girmelisiniz!");
        }



    }
}
