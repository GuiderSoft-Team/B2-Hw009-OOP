public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.

    Mobilya mobilya1=new Masa("Ahşap Masa",120,60,70,false);
        System.out.println(mobilya1);
        System.out.printf("Ahşap masanın alanı:   %5.2f\n",((Masa) mobilya1).alanHesapla());
        System.out.printf("Ahşap masanın hacmi: %5.2f\n",((Masa) mobilya1).hacimHesapla());


        Daire daire1=new YuvarlakSehpa("Beyaz sehpa",40,40,false);
        System.out.println(daire1);
        System.out.printf("Beyaz sehpanın alanı: %5.2f\n",daire1.alanHesapla());
        System.out.printf("Beyaz sehpanın hacmi: %5.2f\n",daire1.hacimHesapla());
        //Unboxing gerekli değil çünkü YuvarlakSehpa Daire sınıfından implemente edildiği için alanHesapla ve hacimHesapla metodlarına direkt ulaşabiliriz.

        //Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};
        //Doğru çalışmaz çünkü YuvarlakSehpa: Daire interface i tarafından implemente edildi, Dortgen interface'i tarafından değil.


    }


}
