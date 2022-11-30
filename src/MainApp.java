public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.
        Mobilya mobilya1=new Masa("Ahşap Masa",120,false,70,60);
        System.out.println(mobilya1);
        System.out.println("Ahsap masa Alan ="+((Masa)mobilya1).alanHesapla());
        System.out.println("Ahsap masa Hacim ="+((Masa)mobilya1).hacimHesapla());
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,false,40);
        System.out.println(daire1);
        System.out.println("Beyaz sehpa Alan : "+(daire1.alanHesapla()));
        System.out.println("Beyaz sehpa Hacim : "+(daire1.hacimHesapla()));
        /*
        Dogru calismiyor. Cünkü;
        Sehpa ve Masa Dörtgen Interface den implamente edildigi icin Dörtgen Interface referans olabilir ama
        Yuvarlak Sehpa daire sinifindan Implemet edilmis bu yüzden Dörtgen referans olamaz

        Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};
         */


    }
}
