package Homework9;

public class MainApp {
    public static void main(String[] args) {
        Mobilya mobilya1=new Masa("Ahşap Masa",120,false,70,60);
        System.out.println(mobilya1);
        System.out.println("Ahşap Masanın alanı= " +((Masa)mobilya1).alanHesapla());
        System.out.println("Mobilyanın hacmi= " +((Masa)mobilya1).hacimHesapla());
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,false,40);
        System.out.println(daire1);
        System.out.println("Beyaz sehpanın alanı : "+daire1.alanHesapla());
        System.out.println("Beyaz sehpanın hacmi : " + daire1.hacimHesapla());

        // Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};
        // Yuvarlak sehpa Daire sınıfından implement edildiği için Dörtgen sınıfından çağrılamaz.


    }
}
