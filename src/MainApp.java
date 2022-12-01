public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.

        Mobilya mobilya1 = new Masa("Ahşap Masa", 120, 70, 60, false);
        System.out.println(mobilya1);
        double masaAlanHesapla = ((Masa) mobilya1).alanHesapla();
        double masaHacimHesapla = ((Masa) mobilya1).hacimHesapla();

        System.out.printf("Masa Alan=%5.2f\n", masaAlanHesapla);
        System.out.printf("Masa Hacim=%5.2f\n", masaHacimHesapla);


        Daire daire1 = new YuvarlakSehpa("Beyaz Sehpa", 40, 40, false);
        System.out.println(daire1);
        double yuvarlakSehpaAlan = ((YuvarlakSehpa) daire1).alanHesapla();
        double yuvarlakSehpaHacim = ((YuvarlakSehpa) daire1).hacimHesapla();

        System.out.printf("Yuvarlak Sehpa Alan=%5.2f\n",yuvarlakSehpaAlan);
        System.out.printf("Yuvarlak Sehpa Hacim=%5.2f" ,yuvarlakSehpaHacim);


    }
}


