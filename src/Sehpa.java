public class Sehpa extends Mobilya implements Dortgen {

    public Sehpa() {
    }

    public Sehpa(String aciklama, double yukseklik, double genislik, double derinlik, boolean kapaliMi) {
        super(aciklama, yukseklik, genislik, derinlik, kapaliMi);
    }

    @Override
    public void setGenislik(double genislik) {
        super.genislik = genislik;
    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
        super.derinlik = derinlik;
    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        if (kapaliMi) {
            return 6 * genislik * derinlik;
        } else {
            return genislik * derinlik;
        }
    }

    @Override
    public double hacimHesapla() {
        return genislik * getYukseklik() * derinlik;
    }

    @Override
    public String toString() {
        return super.toString() + " [ " + getYukseklik() + " x " + genislik + " x " + derinlik + " " + "]";
    }
}
