public class MainApp {
    public static void main(String[] args) {
        Mobilya mobilya1=new Masa("Ahşap Masa",120,60,70,false);
        System.out.println("Ölçüler : "+mobilya1);
        System.out.printf("Ahşap Masa'nın alanı : %5.2f\n",((Masa)mobilya1).alanHesapla());
        System.out.printf("Ahşap Masa'nın hacmi : %5.2f\n",((Masa)mobilya1).hacimHesapla());
        System.out.println();
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,40,false);
        System.out.println("Ölçüler : "+daire1);
        System.out.printf("Yuvarlak Sepha'nın alanı : %5.2f\n",daire1.alanHesapla());
        System.out.printf("Yuvarlak Sepha'nın hacmi : %5.2f\n",daire1.hacimHesapla());
        //Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(),new YuvarlakSehpa()};--doğru çalışmaz çünkü Yuvarlak
        //masa Dörtgen dizisi içerisinde değildir.
    }
}
