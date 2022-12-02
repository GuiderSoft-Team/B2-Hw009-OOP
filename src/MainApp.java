public class MainApp {
    public static void main(String[] args) {

    Mobilya mobilya=new Mobilya("Ahsap Masa",120,60,70,);
        System.out.println(mobilya);
        System.out.println("Mobiyanın alanı:"+(mobilya));
        Daire daire=new YuvarlakSehpa("Beyaz Sehpa",40,40,);
        System.out.println(daire.alanHesapla());
        System.out.println(daire.hacimHesapla());





    }
}