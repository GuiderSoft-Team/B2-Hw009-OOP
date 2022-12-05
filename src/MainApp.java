public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.

        Mobilya mobilya1=new Masa("Ahşap Masa",120,false,60,70);
        System.out.println(mobilya1);
        System.out.println("Masanın Alanı : "+((Masa)mobilya1).alanHesapla());
        System.out.println("Masanın Hacmi : "+((Masa)mobilya1).hacimHesapla());

        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,false,40);
        System.out.println(daire1);
        System.out.printf("Sehpanın alanı : %5.2f\n",daire1.alanHesapla());
        System.out.printf("Sehpanın hacmi : %5.2f\n",daire1.hacimHesapla());

        //Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(),new YuvarlakSehpa()};
    }
}
