public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.

        Mobilya mobilya1=new Masa("Ahşap Masa",120,false,70,60);
        System.out.println(mobilya1);
        System.out.println("Ahşap masanın alanı = "+ ((Masa)mobilya1).alanHesapla());
        System.out.println("Ahşap masanın hacmi = "+ ((Masa)mobilya1).hacimHesapla());
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,false,40);
        System.out.println(daire1);
        System.out.println("Beyaz Sehpanın alanı = "+ daire1.alanHesapla());
        System.out.println("Beyaz Sehpanın hacmi = "+ daire1.hacimHesapla());
        //Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};
        //YuvarlakSehpa Daire interface'inden implement edildiği için Dortgen inteface'inden çağrılamaz!
    }
}