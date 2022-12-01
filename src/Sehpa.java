public class Sehpa extends Mobilya implements Dortgen {
    private double derinlik;
    public Sehpa(){

    }

    public Sehpa(String aciklama, double yukseklik, boolean kapaliMİ, double derinlik) {
        super(aciklama, yukseklik, kapaliMİ);
        this.derinlik = derinlik;
    }

    public Sehpa(double derinlik) {
        this.derinlik = derinlik;
    }

    @Override
    public double getGenislik() {
        return 0;
    }

    @Override
    public void setGenislik(double genislik) {

    }

    @Override
    public void setDerinlik(double derinlik) {

    }

    @Override
    public double getDerinlik() {
        return getDerinlik();
    }

    @Override
    public double alanHesapla() {
        return getGenislik()*derinlik;
    }

    @Override
    public double hacimHesapla() {
        return getYukseklik()*derinlik*getGenislik();
    }

    @Override
    public String toString() {
        return String.format("%5.2f %5.2f %5.2f",getDerinlik()*getYukseklik()*getGenislik());
    }
}