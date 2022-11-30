package Homework9;

public class Sehpa extends Mobilya implements Dortgen{

    private double genislik;
    private double derinlik;


    public Sehpa() {
    }

    public Sehpa(String aciklama, double yukseklik, boolean kapalimi, double genislik, double derinlik) {
        super(aciklama, yukseklik, kapalimi);
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    @Override
    public void setGenislik(double genislik) {
        if (genislik<=0){
            System.out.println("Genişlik sıfırdan büyük olmalıdır!");
        }else{
            this.genislik=genislik;
        }
    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
        if (derinlik<=0){
            System.out.println("Derinlik sıfırdan büyük olmalıdır!");
        }else{
            this.genislik=derinlik;
        }
    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        if (!isKapalimi()){
            return genislik * derinlik;
        }else{
            return 6*genislik*derinlik;
        }
    }

    @Override
    public double hacimHesapla() {
        return genislik * derinlik * getYukseklik();
    }
    @Override
    public String toString() {
        return super.toString()+ "[" +genislik +"x" + derinlik + "x" +getYukseklik() +"]";
    }
}
