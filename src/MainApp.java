public class MainApp {
    public static void main(String[] args) {


        Mobilya mobilya1=new Masa("Ahşap Masa",120,60,70,false);
        System.out.println(mobilya1);
        System.out.println("Masanın Alanı: "+((Masa)mobilya1).alanHesapla());
        System.out.println("Masanın Hacmi: "+((Masa)mobilya1).hacimHesapla());

        Daire daire1= new YuvarlakSehba("Beyaz Sehpa",40,40,false);
        System.out.println(daire1);
        System.out.println("Sehpanın Alanı: "+daire1.alanHesapla());
        System.out.println("Sehpanın Hacmi: "+daire1.hacimHesapla());

       // Dortgen[] mobilyalar=new Dortgen[]{new Sehba(),new Masa(),new YuvarlakSehba()};
        // yuvarlaksehba daire içinde interface ettigimiz için burda hata veriyor.



    }
}
