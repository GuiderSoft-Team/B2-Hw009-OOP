public class MainApp {
    public static void main(String[] args)  {
        //Lütfen readme.md dosyasını okuyunuz.

        Mobilya mobilya1 = null;
        try {
            mobilya1 = new Masa("Ahsap Masa", 120,60,70,false);
            System.out.println(mobilya1);
            System.out.println("Ahsap Masanin Alani = " + ((Masa) mobilya1).alanHesapla());//unboxing yapildi.
            System.out.println("Ahsap Masanin Hacmi = " + ((Masa) mobilya1).hacimHesapla());//unboxing yapildi.
        } catch (LengthException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        Daire daire1= null;
        try {
            daire1 = new YuvarlakSehpa("Beyaz Sehpa",40,40,false);
            System.out.println(daire1);
            System.out.printf("Beyaz Sehpanin Alani = %5.2f\n",daire1.alanHesapla());
            //unboxing gerekmez. Cünkü daire interface inde alanHesapla metodu var.
            System.out.printf("Beyaz Sehpanin Hacmi = %5.2f\n",daire1.hacimHesapla());
            //unboxing gerekmez. Cünkü daire interface inde hacimHesapla metodu var.
        } catch (LengthException e) {
            System.out.println(e.getMessage());
        }


        //Dortgen[] mobilyalar = new Dortgen[]{new Sehpa(),new Masa(),new YuvarlakMasa()};
        //YuvarlakMasa Dortgen Interface inden implemente edilmedigi icin dogru calismaz.
    }
}
