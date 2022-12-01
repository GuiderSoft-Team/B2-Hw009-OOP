public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.
        Mobilya mobilya1 = new Masa("Ahsap Masa",120,60,70,false);
        System.out.println(mobilya1);
        System.out.println(((Masa)mobilya1).alanHesapla()); //unboxing
        System.out.println(((Masa)mobilya1).hacimHesapla());

        Daire daire1 = new YuvarlakSehpa("Beyaz Sehpa",40,40,false);
        System.out.println(daire1);
        System.out.println(daire1.alanHesapla());
        System.out.println(daire1.hacimHesapla());

        //asagidaki kod dogru calismiyor, cünkü new YuvarlakSehpa() nesnesi "Dortgen" tipinde olmadigi icin.
        //Dortgen[] mobilyalar = new Dortgen[]{new Sehpa(),new Masa(),new YuvarlakSehpa()};




    }
}
