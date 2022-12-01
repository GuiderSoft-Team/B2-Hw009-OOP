public class Sehpa extends Mobilya implements Dortgen{

    private double genislik;
    private double derinlik;

    public Sehpa() {
    }

    public Sehpa(String aciklama, double yukseklik, boolean kapaliMi, double genislik, double derinlik) {
        super(aciklama, yukseklik, kapaliMi);
        setGenislik(genislik);
        setDerinlik(derinlik);
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
        if(!isKapaliMi()){
            return genislik*derinlik;
        }else {
            return 6*derinlik*genislik;
        }
    }

    @Override
    public double hacimHesapla() {
        return genislik*derinlik*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString()+"["+genislik+"x"+derinlik+"x"+getYukseklik()+"]";
    }
}
