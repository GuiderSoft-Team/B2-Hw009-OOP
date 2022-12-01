public class Sehpa extends Mobilya implements Dortgen{
    private double genislik;
    private double derinlik;
    public Sehpa() {
    }

    public Sehpa(String aciklama, double yukseklik, double genislik,double derinlik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        setGenislik(genislik);
        setDerinlik(derinlik);

    }

    @Override
    public void setGenislik(double genislik) {

    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {

    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        if(!isKapaliMi()){
            return getGenislik()*getDerinlik();
        }else {
            return 6*getGenislik()*getDerinlik();
        }

    }

    @Override
    public double hacimHesapla() {
        return getGenislik()*getDerinlik()*getYukseklik();
    }

    @Override
    public String toString() {
        return String.format("%s [%f x %f x %f]",getAciklama(),getGenislik(),getDerinlik(),getYukseklik());
    }
}
