public class MainApp {
    public static void main(String[] args) {

        Mobilya mobilya1 = new Masa("Ahşap Masa", 120, 60, 70, false);
        System.out.println(mobilya1);
        System.out.printf("Ahşap Masanın Alanı : %5.2f \n", ((Masa) mobilya1).alanHesapla());
        System.out.printf("Ahşap Masanın Hacmi : %5.2f \n", ((Masa) mobilya1).hacimHesapla());


        Daire daire1 = new YuvarlakSehpa("Beyaz Sehpa", 40, 40, false);
        System.out.println(daire1);
        System.out.printf("Beyaz Sehpanın Alanı : %5.2f \n", daire1.alanHesapla());//Soru: Unboxing gerekli mi ?
        System.out.printf("Beyaz Sehpanın Hacmi : %5.2f \n", daire1.hacimHesapla());//Soru: Unboxing gerekli mi ?
        // Cevap :  Unboxing gerekli değil çünkü, YuvarlakSehpa nesnesi metotlarını
        // Daire Interface inden override ediyor, alanHesapla() ve hacimHesapla() metodunun kaynağı zaten Daire.

        /*
       //Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(),new YuvarlakSehpa()};

       SORU: Doğru çalışıyor mu? Neden?
       Çalışmaz, çünkü refertansı Dortgen[] tipindeki mobilyalar dizisinin öğeleri
       içindeki yuvarlakSehpa() nesnesi arasında implemente ilişkisi yoktur.
       Required type:  Dortgen --->   Provided: YuvarlakSehpa  ---->  Uyarısı veriyor.
         */

    }
}
