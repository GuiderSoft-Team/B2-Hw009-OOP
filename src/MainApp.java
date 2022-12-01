public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.
        Mobilya mb1=new Masa("Ahşap Masa",70,false,120,60);
        System.out.println(mb1);
        System.out.println(((Masa)mb1).alanHesapla());
        System.out.println(((Masa)mb1).hacimHesapla());
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,false,40);
        System.out.println(daire1);
        System.out.println(daire1.alanHesapla());
        System.out.println(daire1.hacimHesapla());



    }
}
