public class Sehpa extends Mobilya implements Dortgen{

    private double genislik;
    private double derinlik;

    public Sehpa() {
    }

    public Sehpa(String aciklama, double genislik, double derinlik, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        this.genislik = genislik;
        this.derinlik = derinlik;
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
        if (!isKapaliMi()){
            return genislik*derinlik;
        }else {
            return 6*genislik*derinlik;
        }
    }

    @Override
    public double hacimHesapla() {
     return genislik*derinlik*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString() + "["+genislik+"x"+derinlik+"x"+getYukseklik()+"]";
    }
}

