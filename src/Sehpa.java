public class Sehpa extends Mobilya implements Dortgen{


    public Sehpa() {
    }

    public Sehpa(String aciklama, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
    }

    @Override
    public void setGenislik(double genislik) {

    }

    @Override
    public double getGenislik() {
        return 0;
    }

    @Override
    public void setDerinlik(double derinlik) {

    }

    @Override
    public double getDerinlik() {
        return 0;
    }

    @Override
    public double alanHesapla() {
        return 0;
    }

    @Override
    public double hacimHesapla() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("[%d*%d*%d]",getGenislik(),getDerinlik(),getYukseklik());
    }
}
