public class MainApp {
    public static void main(String[] args) {

        Mobilya mobilya1=new Masa("Ahşap Masa",120,false,60,70);
        System.out.println(mobilya1);
        System.out.println("Masanın alanı :"+((Masa)mobilya1).alanHesapla());
        System.out.println("Masanın Hacmi :"+((Masa)mobilya1).hacimHesapla());

        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,false,40);
        System.out.println(daire1);
        System.out.println("Sehpanın Alanı: "+daire1.alanHesapla());
        System.out.println("Sehpanın Hacmi: "+daire1.hacimHesapla());

    }
}
