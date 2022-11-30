public class MainApp {
    public static void main(String[] args) {


        Mobilya mobilya1=new Masa("Ahşap Masa",120,60,70,false);
        System.out.println(mobilya1);
        System.out.printf("Ahşah Masa [Alanı: %5.2f Hacmi: %5.2f]\n", ((Masa) mobilya1).alanHesapla(), ((Masa) mobilya1).hacimHesapla());
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,40,false);
        System.out.println(daire1); //unboxing gerek yok. İnterface'in alan/hacim hesapla methotları var.
        System.out.printf("Yuvarlak Sehpa Alanı: %5.2f\n", daire1.alanHesapla());
        System.out.printf("Yuvarlak Sehpa Hacmi: %5.2f\n", daire1.hacimHesapla());

        //region
        /*
                Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()}
                ---- Doğru çalışıyor mu? Neden?
                **** Dortgen Interface'i YuvarlakSehpa sınıfından bir nesnesin referansını tutamaz. Oradan implemente edilmemiş.

         */
        //endregion
    }

}
