public class MainApp {
    public static void main(String[] args) {
        Mobilya mobilya1=new Masa("Ahşap Masa",120,60,70,false);
        System.out.println(mobilya1);
        System.out.println(((Masa)mobilya1).alanHesapla());
        System.out.println(((Masa)mobilya1).hacimHesapla());
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,40,false);
        System.out.println(daire1);
        System.out.println(daire1.alanHesapla());
        System.out.println(daire1.hacimHesapla());
        //Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(),
              // new YuvarlakSehpa()};
// Dortgen dizisinin elemanları arasında sehpa ve yuvarlak sehpa yoktur.
// çünkü biz onları daireye tanımladık.
// bu yüzden çalışmaz.


    }
}
