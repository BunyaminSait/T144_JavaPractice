package day05_MethodOlusturma_Overloading;

public class C03_SifreliYazdirma {

    public static void main(String[] args) {

        // Verilen bir cumleyi sifrelememiz isteniyor.
        // Metni sifrelemek icin her harf kucuk harfe cevrilecek
        // ve kendisinden 5 sonraki harfle degistirilecektir (a->f, b->g… gibi),
        // eger 5 harf sayarken z’ye gelindiyse basa a harfine donulecektir. (u->z, w->a, x->b.. gibi),
        // harf disinda sayi, ozel karakter varsa onlar degistirilmeyecektir.

        //Parametre olarak aldigi cumleyi, sifreli olarak yazdiran bir method olusturun.

        String metin = "Java Candir1.";

        sifreliYazdir("uvwxyz"); // zabcde

        sifreliYazdir(metin); // ofaf hfsinw1.



    }


    public static void sifreliYazdir( String metin ){

        // Metni sifrelemek icin her harf kucuk harfe cevrilecek
        metin = metin.toLowerCase();
        String sifreliMetin = "";

        // her bir karakteri alip, sifreleme mantigiyla degistirip,
        // sifreliMetin'e ekleyelim

        for (int i = 0; i <metin.length() ; i++) {

            char karakter = metin.charAt(i);

            if (Character.isLetter(karakter)){ // harf olanlar bu suzgecle yakalanir

                if (karakter <= 'u'){
                    sifreliMetin += (char)(karakter+5) ;
                }else {
                    sifreliMetin += (char)(    karakter+5-26      ) ;
                    // 26 z->122 'den sonra a->97 ye gecmek icin
                }

            } else { // harf olmayanlar bu suzgecle yakalanir

                sifreliMetin += karakter;
            }

        }

        System.out.println(sifreliMetin);

    }


}