public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.

        Mobilya mobilya1=new Masa("Ahşap Masa",120,60,70,false);
        System.out.println(mobilya1);
        System.out.printf("MASA 1 ALANI:   %5.2f\n",((Masa) mobilya1).alanHesapla());
        System.out.printf("MASA 1 HACMİ: %5.2f\n",((Masa) mobilya1).hacimHesapla());
        System.out.println();




        Daire daire1=new YuvarlakSehpa("Beyaz sehpa",40,40,false);
        System.out.println(daire1);
        System.out.printf("SEHAPANIN ALANI: %5.2f\n",daire1.alanHesapla());
        System.out.printf("SEHPANIN HACMİ: %5.2f\n",daire1.hacimHesapla());


        // YuvarlakSehpa Daire sınıfından implemente edildiği için gerekli değil


        /*
         Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};
        Çalışabilir (DIKDORTGEN) new YuvarlakSehapa şeklinde ama doğru olmaz , yuvarlakSEhpa
        implements Daire sınıfından


         */

    }
}
