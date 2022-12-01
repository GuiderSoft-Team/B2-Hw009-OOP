public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.
    Mobilya mobilya1=new Masa("Ahsap Masa",120,60,70,false);
        System.out.println(mobilya1);
        System.out.println("Mobilya1 in alani:"+(mobilya1));
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,40,false);
        System.out.println(daire1.alanHesapla());
        System.out.println(daire1.hacimHesapla());

    }

}
