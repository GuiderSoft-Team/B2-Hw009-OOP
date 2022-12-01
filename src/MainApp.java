public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.

        Mobilya mobilya1=new Masa("Ahsap Masa",120,60,70,false);
        System.out.println(mobilya1);
        System.out.println("Ahsap Masanin Alani: "+((Masa)mobilya1).alanHesapla());
        System.out.println("Ahsap Masanin Hacmi: "+((Masa)mobilya1).hacimHesapla());

        System.out.println();

        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,40,false);
        System.out.println(daire1);
        System.out.printf("Beyaz Sehpanin Alani: %5.2f\n",daire1.alanHesapla());
        System.out.printf("Beyaz Sehpanin Hacmi: %5.2f\n",daire1.hacimHesapla());

        System.out.println();

/*        Dortgen[] mobilyalar=new Dortgen[]{
                new Sehpa(), new Masa(), new YuvarlakSehpa()
        };*/
        //Calismaz, cünkü YuvarlakSehpa sinifi Dortgen interface´inden implemente edilmemistir.


    }
}
